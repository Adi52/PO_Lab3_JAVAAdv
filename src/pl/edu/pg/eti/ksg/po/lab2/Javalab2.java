package pl.edu.pg.eti.ksg.po.lab2;

import java.io.PrintStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import pl.edu.pg.eti.ksg.po.lab2.biegpolesie.*;
import pl.edu.pg.eti.ksg.po.lab2.biegpolesie.ludzie.BagiennyBiegacz;
import pl.edu.pg.eti.ksg.po.lab2.biegpolesie.ludzie.StudentPolitechniki;
import pl.edu.pg.eti.ksg.po.lab2.biegpolesie.ludzie.StudentWETI;
import pl.edu.pg.eti.ksg.po.lab2.biegpolesie.roboty.RobotMobilny;
import pl.edu.pg.eti.ksg.po.lab2.biegpolesie.roboty.TerminatorL;


/**
 *
 * @author TB
 */
public class Javalab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Set<Uczestnik> uczestnicy = new HashSet<>();
        uczestnicy.add(new BagiennyBiegacz("Krzysztof", "Kowalski", Czlowiek.Plec.MEZCZYZNA));
        uczestnicy.add(new RobotMobilny(1));
        uczestnicy.add(new TerminatorL("", 2));

        uczestnicy.add(new StudentWETI("Adrian", "Bielinski", Czlowiek.Plec.MEZCZYZNA, DziedzinaZadania.INFORMATYKA));
        uczestnicy.add(new StudentPolitechniki("Anna", "Nowak", Czlowiek.Plec.KOBIETA, DziedzinaZadania.NAUKI_LESNE));


        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Witaj w aplikacji Bieg po Lesie. Wybierz bieg: ");
        System.out.println("1. Górki");
        System.out.println("2. Na przełaj z Matematyką");
        System.out.println("3. Bagienny miks naukowy");
        System.out.println("4. Stworz swoj bieg");

        int wybor = scanner.nextInt();
        
        BiegPoLesie bieg;
        
        switch(wybor)
        {
            default:
                System.out.println("Niezany wybór. Wybieranie opcji nr 1.");
            case 1:
                bieg = gorki(System.out, System.out);
                break;
            case 2:
                bieg = naPrzelajZMatematyka(System.out, System.out);
                break;
            case 3:
                bieg = bagiennyMiks(System.out, System.out);
                break;
            case 4:
                bieg = stworzBieg(System.out, System.out);
                break;

        }
        
        for(Uczestnik u : uczestnicy)
        {
            bieg.dodajUczestnika(u);
        }
        
        bieg.przeprowadzImpreze();
    }
    
    private static BiegPoLesie gorki(PrintStream mikrofon, PrintStream przestrzenWLesie)
    {
        BiegPoLesie gorki_ = new BiegPoLesie("Górki",mikrofon,przestrzenWLesie);

        gorki_.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(RodzajTerenu.DROGA));
        gorki_.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(RodzajTerenu.SCIEZKA));
        gorki_.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(RodzajTerenu.SCIEZKA));
        gorki_.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(RodzajTerenu.NISKI_LAS));
        gorki_.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(RodzajTerenu.BAGNO));
        gorki_.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(DziedzinaZadania.FIZYKA));
        gorki_.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(DziedzinaZadania.MATEMATYKA));
        gorki_.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(DziedzinaZadania.NAUKI_LESNE));
        gorki_.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(RodzajTerenu.WYSOKI_LAS));
        
        return gorki_;
    }

    private static BiegPoLesie naPrzelajZMatematyka(PrintStream mikrofon, PrintStream przestrzenWLesie) {
        BiegPoLesie naPrzelaj = new BiegPoLesie("Na przełaj z matematyką",mikrofon,przestrzenWLesie);

        naPrzelaj.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(RodzajTerenu.DROGA));
        naPrzelaj.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(RodzajTerenu.SCIEZKA));
        naPrzelaj.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(RodzajTerenu.NISKI_LAS));
        naPrzelaj.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(DziedzinaZadania.MATEMATYKA));
        naPrzelaj.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(RodzajTerenu.NISKI_LAS));
        naPrzelaj.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(DziedzinaZadania.MATEMATYKA));
        naPrzelaj.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(RodzajTerenu.NISKI_LAS));
        naPrzelaj.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(DziedzinaZadania.MATEMATYKA));
        naPrzelaj.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(RodzajTerenu.WYSOKI_LAS));

        return naPrzelaj;
    }

    private static BiegPoLesie bagiennyMiks(PrintStream mikrofon, PrintStream przestrzenWLesie) {
        BiegPoLesie miks = new BiegPoLesie("Bagienny miks naukowy",mikrofon,przestrzenWLesie);

        miks.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(RodzajTerenu.DROGA));
        miks.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(RodzajTerenu.SCIEZKA));
        miks.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(RodzajTerenu.BAGNO));
        miks.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(DziedzinaZadania.MATEMATYKA));
        miks.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(RodzajTerenu.BAGNO));
        miks.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(DziedzinaZadania.FIZYKA));
        miks.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(RodzajTerenu.BAGNO));
        miks.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(DziedzinaZadania.INFORMATYKA));
        miks.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(RodzajTerenu.BAGNO));
        miks.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(DziedzinaZadania.SZTUKA));
        miks.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(RodzajTerenu.BAGNO));
        miks.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(DziedzinaZadania.NAUKI_LESNE));
        miks.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(RodzajTerenu.WYSOKI_LAS));

        return miks;
    }

    private static BiegPoLesie stworzBieg(PrintStream mikrofon, PrintStream przestrzenWLesie) {
        BiegPoLesie wlasnyBieg = new BiegPoLesie("Wlasny bieg", mikrofon, przestrzenWLesie);

        System.out.println("Tworzenie wlasnego biegu");
        System.out.println("________________________");
        System.out.println("Rodzaje terenu do wybrania:");
        System.out.println("- DROGA");
        System.out.println("- SCIEZKA");
        System.out.println("- WYSOKI_LAS");
        System.out.println("- NISKI_LAS");
        System.out.println("- BAGNO");
        System.out.println("________________________");
        System.out.println("- MATEMATYKA");
        System.out.println("- FIZYKA");
        System.out.println("- SZTUKA");
        System.out.println("- NAUKI_LESNE");
        System.out.println("________________________");
        System.out.println("Wpisz 'start' aby zacząć bieg");
        Scanner scanner = new Scanner(System.in);
        String nazwa;
        while (true) {
            try {
                nazwa = scanner.next();
                if (nazwa.equals("start")) break;
                wlasnyBieg.dodajElementTrasy(FabrykaElementowTrasy.utworzElementTrasy(nazwa));
                System.out.println("Dodano obiekt " + nazwa);
            } catch (BrakTakiegoElementuTrasyException e) {
                System.out.println("Nie ma takiego obiektu");
            }
        }
        return wlasnyBieg;
    }
    
}
