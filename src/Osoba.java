public class Osoba {
    String imie;
    String nazwisko;

    public Osoba(String imie, String nazwisko)
    {
        this.imie = imie;
        this.nazwisko=nazwisko;
    }

    public void przedstawSie()
    {
        System.out.println(imie+" "+nazwisko);
    }
}
