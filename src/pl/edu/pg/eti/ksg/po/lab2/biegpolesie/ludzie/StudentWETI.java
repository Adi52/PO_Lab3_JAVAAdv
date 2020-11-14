package pl.edu.pg.eti.ksg.po.lab2.biegpolesie.ludzie;

import pl.edu.pg.eti.ksg.po.lab2.biegpolesie.DziedzinaZadania;

public class StudentWETI extends StudentPolitechniki {
    DziedzinaZadania kierunekStudiow;

    public StudentWETI(String imie, String nazwisko, Plec plec, DziedzinaZadania kierunekStudiow) {
        super(imie, nazwisko, plec, kierunekStudiow);
    }

    @Override
    public boolean rozwiazZadanie(DziedzinaZadania dziedzinaZadania) {
        if (dziedzinaZadania == DziedzinaZadania.INFORMATYKA) {
            return humorIUwarunkowaniaOsobiste.nextDouble() <= 0.95;

        }
        return super.rozwiazZadanie(dziedzinaZadania);
    }
}
