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

public class Pelanggan {

    private String id;
    private String nama;
    private String alamat;
    private String kontak;
    private Connector conn;

    public Pelanggan() {
        this.id = "";
        this.nama = "";
        this.alamat = "";
        this.kontak = "";
        this.conn = new Connector();
    }   
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKontak() {
        return kontak;
    }

    public void setKontak(String kontak) {
        this.kontak = kontak;
    }       

    public void insertPelanggan() {        
        String s = "insert into pelanggan values ('" + this.id + "', '" + this.nama + "', '" + this.kontak + "', '"
                + this.alamat + "')";
        conn.query(s);
    }

    public void updatePelanggan() {        
        String s = "update pelanggan set nama = '" + this.nama + "', kontak = '"
                + this.kontak + "', alamat = '" + this.alamat + "' where id_pelanggan = '" + this.id + "'";
        conn.query(s);
    }

    public void deletePelanggan() {        
        String s = "delete from pelanggan where id_pelanggan = '" + this.id + "'";
        conn.query(s);
    }

    public ResultSet getPelanggan() {
        ResultSet r = null;        
        String s = "SELECT * FROM pelanggan";
        r = conn.getData(s);
        return r;
    }
    
    public ResultSet searchPelanggan(String id) {
        ResultSet r = null;        
        String s = "SELECT * FROM pelanggan WHERE id = '" + id + "'";
        r = conn.getData(s);
        return r;
    }
}

