package pl.edu.pg.eti.ksg.po.lab2.biegpolesie;

public class FabrykaElementowTrasy {
    public static ElementTrasy utworzElementTrasy(DziedzinaZadania dziedzinaZadania) {
        return new Zadanie(dziedzinaZadania);
    }

    public static ElementTrasy utworzElementTrasy(RodzajTerenu rodzajTerenu) {
        return new Teren(rodzajTerenu);
    }

    public static ElementTrasy utworzElementTrasy(String nazwa) throws BrakTakiegoElementuTrasyException {
        ElementTrasy elementTrasy;
        try {
            elementTrasy = new Zadanie(DziedzinaZadania.valueOf(nazwa));
        } catch (IllegalArgumentException e) {
            try {
                elementTrasy = new Teren(RodzajTerenu.valueOf(nazwa));
            } catch (IllegalArgumentException ee) {

                throw new BrakTakiegoElementuTrasyException("Brak elementu o podanej nazwie.");
            }
        }
        return elementTrasy;
    }
}