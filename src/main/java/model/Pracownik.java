package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pracownik {
    @Id
    @GeneratedValue
    private long Id;
    private String imie;
    private String nazwisko;
    private String stanowisko;
    private double pensja;

    // poniżej dodać konstruktor pusty, konstruktor z parametrami, getery, settery i toString


    public Pracownik() {
    }

    public Pracownik(String imie, String nazwisko, String stanowisko, double pensja) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stanowisko = stanowisko;
        this.pensja = pensja;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "Id=" + Id +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", stanowisko='" + stanowisko + '\'' +
                ", pensja=" + pensja +
                '}';
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    public double getPensja() {
        return pensja;
    }

    public void setPensja(double pensja) {
        this.pensja = pensja;
    }
}
