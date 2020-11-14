package pl.edu.pg.eti.ksg.po.lab2.biegpolesie.roboty;


import pl.edu.pg.eti.ksg.po.lab2.biegpolesie.DziedzinaZadania;
import pl.edu.pg.eti.ksg.po.lab2.biegpolesie.RodzajTerenu;

public class TerminatorL extends Terminator {

    public TerminatorL(String model, int numerSeryjny) {
        super("T-101L", numerSeryjny);
    }

    @Override
    public double predkoscPoruszaniaSie(RodzajTerenu rodzajTerenu) {
        switch (rodzajTerenu) {
            case NISKI_LAS -> {
                komunikuj("Wykryto teren: " + rodzajTerenu + ". Rozwijanie maksymalnej prędkości.");
                return czynnikiLosowe.nextDouble() * 0.3 + 1.5;
            }
            default -> {
                return super.predkoscPoruszaniaSie(rodzajTerenu);
            }
        }
    }

    @Override
    public boolean rozwiazZadanie(DziedzinaZadania dziedzinaZadania) {
        return switch (dziedzinaZadania) {
            case NAUKI_LESNE -> czynnikiLosowe.nextDouble() <= 0.6;
            default -> super.rozwiazZadanie(dziedzinaZadania);
        };
    }
}
