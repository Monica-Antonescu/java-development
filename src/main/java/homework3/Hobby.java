package src.main.java.homework3;

import java.util.Arrays;
import java.util.List;

public class Hobby {

    private String nume;
    private int frecventa;
    private List<String> adrese;

    public Hobby(String nume, int frecventa, List<String> adrese) {
        this.nume = nume;
        this.frecventa = frecventa;
        this.adrese = adrese;
    }

    public String getNume() {
        return nume;
    }

    public int getFrecventa() {
        return frecventa;
    }

    public List<String> getAdrese() {
        return adrese;
    }

    @Override
    public String toString() {
        return "\nHobby{" +
                "nume='" + getNume() + '\'' +
                "frecventa='" + getFrecventa() + '\'' +
                "adresa" + getAdrese() + "}\n";
    }
}
