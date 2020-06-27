package service;

import dao.PracownikDao;
import model.Pracownik;

import java.util.Scanner;

public class PracownikService {
    Scanner pobierz = new Scanner(System.in);
    PracownikDao dao = new PracownikDao();

    public void dodajPracownika() {
        Pracownik pracownik = pobierzWszystkieDanePracownika();
        pracownik = dao.add(pracownik);
        System.out.println("Dodałem pracownika : " + pracownik);

    }

    public void zmienDanePracownika() {
        System.out.println("Krórego pracownika dane mają być zmienione");
        System.out.println("Podaj imie : ");
        String imie = pobierz.nextLine();
        System.out.println("Podaj nazwisko : ");
        String nazwisko = pobierz.nextLine();
        Pracownik pracownik;
        pracownik = dao.findByImieAndNazwisko(imie, nazwisko).get(0);
        System.out.println("Podaj nowe dane pracownika");
        pracownik = pobierzWszystkieDanePracownika();
        dao.update(pracownik);
        System.out.print("Nowe dane pracownika : " + dao.findByImieAndNazwisko(pracownik.getImie(), pracownik.getNazwisko()));
    }

    private Pracownik pobierzWszystkieDanePracownika() {
        Pracownik pracownik = new Pracownik();
        pracownik = podajImieNazwiskoPracownika();
        System.out.print("Podaj stanowisko : ");
        pracownik.setStanowisko(pobierz.nextLine());
        System.out.print("Podaj zarobki : ");
        pracownik.setPensja(pobierz.nextDouble());
        return pracownik;
    }

    private Pracownik podajImieNazwiskoPracownika() {
        Pracownik pracownik = new Pracownik();
        System.out.print("Podaj imie : ");
        pracownik.setImie(pobierz.nextLine());
        System.out.print("Podaj nazwisko : ");
        pracownik.setNazwisko(pobierz.nextLine());
        return pracownik;
    }

    public void usunPracownika() {
        Pracownik pracownik;
        System.out.println("Podaj dane pracownika do usunięcia");
        pracownik = podajImieNazwiskoPracownika();
        pracownik = dao.findByImieAndNazwisko(pracownik.getImie(), pracownik.getNazwisko()).get(0);
        dao.remove(pracownik);
    }
}
