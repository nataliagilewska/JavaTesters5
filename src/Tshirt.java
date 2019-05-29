public class Tshirt {
    private Kolor kolor;
    //Rozmiar rozmiar
    private Rozmiar rozmiar;
    private double cena;

    public Tshirt (Kolor kolor, Rozmiar rozmiar, double cena)
    {
        this.kolor=kolor;
        this.rozmiar=rozmiar;
        this.cena=cena;
    }

    public void koszulkaWypisz()
    {
        System.out.println("Kolor "+kolor+" Rozmiar "+rozmiar+" Cena "+cena);
    }

}
