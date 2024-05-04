package models;

import javax.persistence.Entity;

@Entity
public class Goldar extends play.db.jpa.Model {
    public String goldar;

    public String toString() {
        return goldar;
    }
}
