package pl.edu.pg.eti.ksg.po.lab2.biegpolesie.ludzie;

import pl.edu.pg.eti.ksg.po.lab2.biegpolesie.Czlowiek;
import pl.edu.pg.eti.ksg.po.lab2.biegpolesie.DziedzinaZadania;


public class Student extends Czlowiek{
    DziedzinaZadania kierunekStudiow;

    public Student(String imie, String nazwisko, Plec plec, DziedzinaZadania kierunekStudiow) {
        super(imie, nazwisko, plec);
        this.kierunekStudiow = kierunekStudiow;
    }

    @Override
    public void przedstawSie() {
        wypowiedzSie("Cześć! Jestem " + getImie() + " " + getNazwisko() + ". Jestem " + ((getPlec() == Plec.KOBIETA) ?
                "studentka" : "studentem") + " kierunku " + kierunekStudiow);
    }

    @Override
    public boolean rozwiazZadanie(DziedzinaZadania dziedzinaZadania) {
        return humorIUwarunkowaniaOsobiste.nextDouble() <= 0.2;
    }
}
