package pl.edu.pg.eti.ksg.po.lab2.biegpolesie;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author TB
 */
public class Zadanie implements ElementTrasy {

    DziedzinaZadania dziedzinaZadania;
    Map<Uczestnik, Boolean> uczestnicyWZadaniu = new HashMap<>();

    Map<Uczestnik, Boolean> getUczestnicywZadaniu() {
        return uczestnicyWZadaniu;
    }

    public Zadanie(DziedzinaZadania dziedzinaZadania) {
        this.dziedzinaZadania = dziedzinaZadania;
    }

    @Override
    public Iterable<Uczestnik> getUczestnicy() {
        return uczestnicyWZadaniu.keySet();
    }

    public DziedzinaZadania getDziedzinaZadania() {
        return dziedzinaZadania;
    }

    @Override
    public void dodajUczestnika(Uczestnik u) {
        uczestnicyWZadaniu.put(u, false);
    }

    @Override
    public void usunUczestnika(Uczestnik u) {
        uczestnicyWZadaniu.remove(u);
    }

    @Override
    public int getLiczbaUczestnikowNaTrasie() {
        return uczestnicyWZadaniu.size();
    }
}
