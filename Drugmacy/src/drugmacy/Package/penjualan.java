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

public class Penjualan {
    private String id_penjualan;
    private String tgl_jual;
    private String total;
    private String nama_pegawai;
    private String nama_pelanggan;
    private String nama_obat;
    private int jumlah_beli;

    public Penjualan() {
        this.id_penjualan = "";
        this.tgl_jual = "";
        this.total = "";
        this.nama_pegawai = "";
        this.nama_pelanggan = "";
        this.nama_obat = "";
        this.jumlah_beli = 0;
    }    
    
    public String getId_penjualan() {
        return id_penjualan;
    }

    public void setId_penjualan(String id_penjualan) {
        this.id_penjualan = id_penjualan;
    }

    public String getTgl_jual() {
        return tgl_jual;
    }

    public void setTgl_jual(String tgl_jual) {
        this.tgl_jual = tgl_jual;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getNama_pegawai() {
        return nama_pegawai;
    }

    public void setNama_pegawai(String nama_pegawai) {
        this.nama_pegawai = nama_pegawai;
    }

    public String getNama_pelanggan() {
        return nama_pelanggan;
    }

    public void setNama_pelanggan(String nama_pelanggan) {
        this.nama_pelanggan = nama_pelanggan;
    }

    public String getNama_obat() {
        return nama_obat;
    }

    public void setNama_obat(String nama_obat) {
        this.nama_obat = nama_obat;
    }

    public int getJumlah_beli() {
        return jumlah_beli;
    }

    public void setJumlah_beli(int jumlah_beli) {
        this.jumlah_beli = jumlah_beli;
    }        
    
    // Other methods remain unchanged

    public void insertPenjualan() {
        Connector kon = new Connector();

        String s = "INSERT INTO penjualan VALUES ('" +
                this.id_penjualan + "', '" + this.tgl_jual + "', '" + this.total + "', '" +
                this.nama_pegawai + "', '" + this.nama_pelanggan + "', '" + this.nama_obat + "', " + this.jumlah_beli + ")";

        kon.query(s);
    }
    
    public void updatePenjualan() {
        Connector kon = new Connector();
        String s = "UPDATE penjualan SET tgl_jual = '" + this.tgl_jual +
        "', total = " + this.total +
        ", nama_pegawai = '" + this.nama_pegawai +
        "', nama_obat = '" + this.nama_obat +
        "', nama_pelanggan = '" + this.nama_pelanggan +
        "', jumlah_beli = " + this.jumlah_beli +
        " WHERE id_penjualan = '" + this.id_penjualan + "'";
        kon.query(s);
    }

    public void deletePenjualan() {
        Connector kon = new Connector();
        String s = "DELETE FROM penjualan WHERE id_penjualan = '" + this.id_penjualan + "'";
        kon.query(s);
    }

    public ResultSet getPenjualan() {
        ResultSet r = null;
        Connector kon = new Connector();
        String s = "SELECT * FROM penjualan WHERE id_penjualan = '" + this.id_penjualan + "'";
        r = kon.getData(s);
        return r;
    }
}
