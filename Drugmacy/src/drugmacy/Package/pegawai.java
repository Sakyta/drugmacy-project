/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package drugmacy.Package;
import java.sql.ResultSet;

/**
 *
 * @author ASUS
 */
public class pegawai {

    private String id;
    private String nama;
    private String alamat;
    private String cp;
    private String username;
    private String password;
    private String kode;

    public pegawai() {
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

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getKode() {
        return kode;
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

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public void insertPegawai() {
        koneksi kon = new koneksi();
        String s = "insert into pegawai values ('" + this.id + "', '" + this.nama + "', '" + this.cp + "', '" + this.alamat + "', '" + this.username + "', '" + this.password + "', '" + this.kode + "')";
        kon.query(s);
    }

    public void updatePegawai() {
        koneksi kon = new koneksi();
        String s = "update pegawai set id_pegawai = '" + this.id + "', nama = '" + this.nama + "', cp = '" + this.cp + "', alamat = '" + this.alamat + "', username = '" + this.username + "', password = '" + this.password + "', kode = '" + this.kode + "' where id_pegawai = '" + this.id + "'";
        kon.query(s);
    }

    public void deletePegawai() {
        koneksi kon = new koneksi();
        String s = "delete from pegawai where id_pegawai = '" + this.id + "'";
        kon.query(s);
    }

    public ResultSet getPegawai() {
        ResultSet r = null;
        koneksi kon = new koneksi();
        String s = "insert into pegawai values ('" + this.id + "', '" + this.nama + "', '" + this.cp + "', '" + this.alamat + "', '" + this.username + "', '" + this.password + "', '0')";
        kon.query(s);
        return r;
    }
}
