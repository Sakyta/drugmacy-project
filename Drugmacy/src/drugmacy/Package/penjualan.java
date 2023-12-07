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
    private long total;
    private String id_pegawai;
    private String id_obat;
    private String id_pelanggan;

    public Penjualan() {}

    // Getter and setter methods for each attribute

    public void setIdPenjualan(String id_penjualan) {
        this.id_penjualan = id_penjualan;
    }

    public void setTglJual(String tgl_jual) {
        this.tgl_jual = tgl_jual;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public void setIdPegawai(String id_pegawai) {
        this.id_pegawai = id_pegawai;
    }

    public void setIdObat(String id_obat) {
        this.id_obat = id_obat;
    }

    public void setIdPelanggan(String id_pelanggan) {
        this.id_pelanggan = id_pelanggan;
    }

    // Other methods remain unchanged

    public void insertPenjualan() {
        Koneksi kon = new Koneksi();

        String s = "INSERT INTO penjualan (id_penjualan, tgl_jual, total, id_pegawai, id_obat, id_pelanggan) VALUES ('" +
                this.id_penjualan + "', '" + this.tgl_jual + "', " + this.total + ", '" +
                this.id_pegawai + "', '" + this.id_obat + "', '" + this.id_pelanggan + "')";

        kon.query(s);
    }
    
public void updatePenjualan() {
        Koneksi kon = new Koneksi();
        String s = "UPDATE penjualan SET tgl_jual = '" + this.tgl_jual +
                "', total = " + this.total +
                ", id_pegawai = '" + this.id_pegawai +
                "', id_obat = '" + this.id_obat +
                "', id_pelanggan = '" + this.id_pelanggan +
                "' WHERE id_penjualan = '" + this.id_penjualan + "'";
        kon.query(s);
    }

    public void deletePenjualan() {
        Koneksi kon = new Koneksi();
        String s = "DELETE FROM penjualan WHERE id_penjualan = '" + this.id_penjualan + "'";
        kon.query(s);
    }

    public ResultSet getPenjualan() {
        ResultSet r = null;
        Koneksi kon = new Koneksi();
        String s = "SELECT * FROM penjualan WHERE id_penjualan = '" + this.id_penjualan + "'";
        r = kon.getData(s);
        return r;
    }
}
