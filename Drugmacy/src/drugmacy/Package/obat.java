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
public class obat {

    private String id;
    private String nama;
    private String harga;
    private String stok;

    public obat() {
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getHarga() {
        return harga;
    }

    public String getStok() {
        return stok;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public void setStok(String stok) {
        this.stok = stok;
    }

    public void insertObat() {
        koneksi kon = new koneksi();
        String s = "insert into obat values ('" + this.id + "', '" + this.nama + "', '" + this.harga + "', '" + this.stok + "')";
        kon.query(s);
    }

    public void updateObat() {
        koneksi kon = new koneksi();
        String s = "update obat set id_obat = '" + this.id + "', nama = '" + this.nama + "', harga = '" + this.harga + "', stok = '" + this.stok + "' where id_obat = '" + this.id + "'";
        kon.query(s);
    }

    public void deleteObat() {
        koneksi kon = new koneksi();
        String s = "delete from obat where id_obat = '" + this.id + "'";
        kon.query(s);
    }

    public ResultSet getObat() {
        ResultSet r = null;
        koneksi kon = new koneksi();
        String s = "insert into obat values ('" + this.id + "', '" + this.nama + "', '" + this.harga + "', '" + this.stok + "')";
        kon.query(s);
        return r;
    }
}
