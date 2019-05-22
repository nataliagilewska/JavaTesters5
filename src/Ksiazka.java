public class Ksiazka {
    int ileStron;
    String tytul;
    String rodzaj;
    Osoba autor;

    public Ksiazka(String tytul, String rodzaj, int ileStron, Osoba autor)
    {
        this.tytul=tytul;
        this.rodzaj=rodzaj;
        this.ileStron=ileStron;
        this.autor=autor;
    }
}
