package pl.edu.pg.eti.ksg.po.lab2.biegpolesie.ludzie;

import pl.edu.pg.eti.ksg.po.lab2.biegpolesie.DziedzinaZadania;

public class StudentWArch extends StudentPolitechniki {
    DziedzinaZadania kierunekStudiow;

    public StudentWArch(String imie, String nazwisko, Plec plec, DziedzinaZadania kierunekStudiow) {
        super(imie, nazwisko, plec, kierunekStudiow);
    }

    @Override
    public boolean rozwiazZadanie(DziedzinaZadania dziedzinaZadania) {
        return switch (dziedzinaZadania) {
            case FIZYKA -> humorIUwarunkowaniaOsobiste.nextDouble() <= 0.2;
            case SZTUKA -> humorIUwarunkowaniaOsobiste.nextDouble() <= 0.7;
            default -> super.rozwiazZadanie(dziedzinaZadania);
        };
    }
}
