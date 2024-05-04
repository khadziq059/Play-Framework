package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Peminjaman extends play.db.jpa.Model{
    public String namaPeminjam;
    public String judulBuku;
    public String tanggalPinjam;
    public String tanggalKembali;

    @ManyToOne
    public Mahasiswa mahasiswa;
}
