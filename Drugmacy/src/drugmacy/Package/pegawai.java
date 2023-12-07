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
public class Pegawai {

    private String id;
    private String nama;
    private String alamat;
    private String contact;
    private String username;
    private String password;
    private String kode;

    public Pegawai() {
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

    public String setContact() {
        return contact;
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

    public void setContact(String contact) {
        this.contact = contact;
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
        Koneksi kon = new Koneksi();
        String s = "insert into pegawai values ('" + this.id + "', '" + this.nama + "', '" + this.contact + "', '" + this.alamat + "', '" + this.username + "', '" + this.password + "', '" + this.kode + "')";
        kon.query(s);
    }

    public void updatePegawai() {
        Koneksi kon = new Koneksi();
        String s = "update pegawai set id_pegawai = '" + this.id + "', nama = '" + this.nama + "', contact = '" + this.contact + "', alamat = '" + this.alamat + "', username = '" + this.username + "', password = '" + this.password + "', kode = '" + this.kode + "' where id_pegawai = '" + this.id + "'";
        kon.query(s);
    }

    public void deletePegawai() {
        Koneksi kon = new Koneksi();
        String s = "delete from pegawai where id_pegawai = '" + this.id + "'";
        kon.query(s);
    }

    public ResultSet getPegawai() {
        ResultSet r = null;
        Koneksi kon = new Koneksi();
        String s = "insert into pegawai values ('" + this.id + "', '" + this.nama + "', '" + this.contact + "', '" + this.alamat + "', '" + this.username + "', '" + this.password + "', '0')";
        kon.query(s);
        return r;
    }
}
