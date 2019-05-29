public class Notatka {
    private DAY dzienTygodnia;
    private String wiadomosc;
    private Osoba osoba;

    public Notatka (DAY dzienTygodnia, String wiadomosc, Osoba osoba)
    {
        this.dzienTygodnia=dzienTygodnia;
        this.wiadomosc=wiadomosc;
        this.osoba=osoba;
    }

    public void wypiszNotatke()
    {
        System.out.println("Dzien Tygodnia: "+dzienTygodnia+" Wiadomosc: "+wiadomosc+" Osoba: ");
    }
}
