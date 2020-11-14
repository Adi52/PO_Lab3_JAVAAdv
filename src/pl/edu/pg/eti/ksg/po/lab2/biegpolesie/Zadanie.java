package pl.edu.pg.eti.ksg.po.lab2.biegpolesie;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author TB
 */
public class Zadanie implements ElementTrasy {

    private final DziedzinaZadania dziedzinaZadania;
    private Map<Uczestnik,Double> uczestnicyWTerenie = new HashMap<>();

    public Zadanie(DziedzinaZadania dziedzinaZadania) {
        this.dziedzinaZadania = dziedzinaZadania;
    }

    @Override
    public Iterable<Uczestnik> getUczestnicy() {
        return uczestnicyWTerenie.keySet();
    }

    public DziedzinaZadania getDziedzinaZadania() {
        return dziedzinaZadania;
    }

    public Map<Uczestnik, Double> getUczestnicyWTerenie() {
        return uczestnicyWTerenie;
    }

    @Override
    public void dodajUczestnika(Uczestnik u) {
        uczestnicyWTerenie.put(u, 0.0);
    }

    @Override
    public void usunUczestnika(Uczestnik u) {
        uczestnicyWTerenie.remove(u);
    }

    @Override
    public int getLiczbaUczestnikowNaTrasie() {
        return uczestnicyWTerenie.size();
    }
}
