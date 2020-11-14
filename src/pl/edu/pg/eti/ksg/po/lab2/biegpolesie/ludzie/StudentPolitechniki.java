package pl.edu.pg.eti.ksg.po.lab2.biegpolesie.ludzie;

import pl.edu.pg.eti.ksg.po.lab2.biegpolesie.DziedzinaZadania;

public class StudentPolitechniki extends Student {
    DziedzinaZadania kierunekStudiow;

    public StudentPolitechniki(String imie, String nazwisko, Plec plec, DziedzinaZadania kierunekStudiow) {
        super(imie, nazwisko, plec, kierunekStudiow);
    }

    @Override
    public void przedstawSie() {
        wypowiedzSie("Cześć! Jestem " + getImie() + " " + getNazwisko() + ". Jestem " + ((getPlec() == Plec.KOBIETA) ?
                "studentka" : "studentem") + " kierunku " + kierunekStudiow + " i lubie imprezowac!");
    }

    @Override
    public boolean rozwiazZadanie(DziedzinaZadania dziedzinaZadania) {
        return switch (dziedzinaZadania) {
            case FIZYKA -> humorIUwarunkowaniaOsobiste.nextDouble() <= 0.5;
            case MATEMATYKA, INFORMATYKA -> humorIUwarunkowaniaOsobiste.nextDouble() <= 0.7;
            default -> humorIUwarunkowaniaOsobiste.nextDouble() <= 0.2;
        };

    }
}
