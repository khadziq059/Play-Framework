package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Mahasiswa extends play.db.jpa.Model{
    public String nama;
    public String password;
    public String nim;
    public String alamat;

    @ManyToOne
    public Goldar goldar;

    public String toString() {
        return nama;
    }
}