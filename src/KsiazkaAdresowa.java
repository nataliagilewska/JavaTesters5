public class KsiazkaAdresowa {
    Kontakt[] kontakt; //= new Kontakt[200];
    int rozmiar;

    public KsiazkaAdresowa(int rozmiar)
    {
        this.rozmiar=rozmiar;
        kontakt = new Kontakt [rozmiar];
         //this.kontakt=kontakt;
        //kontakt(kontakt.length)=kontakt;
    }

    void dodajKontakt(int pozycja, Kontakt kontakt2)
    {
        kontakt[pozycja]=kontakt2;
    }

    void pokazKontakty()
    {
        System.out.println("----------------------------");
        System.out.println("Kontakty ksiazki adresowej: ");
        for (int i=0; i<rozmiar; i++)
        {
            kontakt[i].wypisz();
            System.out.println();
        }
        System.out.println("----------------------------");
    }

}
