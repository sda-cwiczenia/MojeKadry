import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import service.PracownikService;

import java.util.Scanner;

public class Kadry {
    static PracownikService service = new PracownikService();
    public static void main(String[] args) {
        System.out.println("PROGRAM KADRY");
//        System.out.println("--------------");
//        System.out.println("1. Dodawanie pracownika");
//        service.dodajPracownika();
//        System.out.println("2. Zmień dane pracownika");
//        service.zmienDanePracownika();
//        System.out.println("3. Usuwanie pracownika");
//        service.usunPracownika();
boolean koniec = false;
        do {
            int wybor;
            //wywołanie metody menu
            wybor = menu();

        } while (koniec = false);
    }

    private static int menu() {
        Scanner pobierz = new Scanner(System.in);
        System.out.println("PROGRAM KADRY");
        System.out.println("1. Dodanie pracownika");
        System.out.println("2. Zmiana danych pracownika");
        System.out.println("3. Usuwanie pracownika");
        System.out.println("4. Wyjście z programu");
        System.out.println("------------------------");
        System.out.print("Podaj wartość (1- 4) : ");
        return pobierz.nextInt();
    }
}
