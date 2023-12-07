/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package drugmacy.Package;

/**
 *
 * @author ASUS
 */
import java.sql.ResultSet;

public class pelanggan {

    private String id;
    private String nama;
    private String alamat;
    private String cp;
    private String status;

    public pelanggan() {
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getCp() {
        return cp;
    }

    public String getStatus() {
        return status;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void insertPelanggan() {
        koneksi kon = new koneksi();
        String s = "insert into pelanggan values ('" + this.id + "', '" + this.nama + "', '" + this.cp + "', '"
                + this.alamat + "')";
        kon.query(s);
    }

    public void updatePelanggan() {
        koneksi kon = new koneksi();
        String s = "update pelanggan set id_pelanggan = '" + this.id + "', nama = '" + this.nama + "', cp = '"
                + this.cp + "', alamat = '" + this.alamat + "' where id_pelanggan = '" + this.id + "'";
        kon.query(s);
    }

    public void deletePelanggan() {
        koneksi kon = new koneksi();
        String s = "delete from pelanggan where id_pelanggan = '" + this.id + "'";
        kon.query(s);
    }

    public ResultSet getPelanggan() {
        ResultSet r = null;
        koneksi kon = new koneksi();
        String s = "insert into pelanggan values ('" + this.id + "', '" + this.nama + "', '" + this.cp + "', '"
                + this.alamat + "')";
        kon.query(s);
        return r;
    }
}

