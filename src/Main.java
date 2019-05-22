public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello World!");


        //Ksiazka nowyHorror= new Ksiazka(Rodzaj.HORRORY); //tu moge napisac Rodzaj.Horrory i od razu bedzie ok, albo wpisac samo "HORRORY" i alt+enter i wybrac opcje import

        //Autor natalia = new Osoba
        //Moge albo osobno dodac autora, albo od razu w ksiazce przypisac;
        Osoba jan = new Osoba ("Jan", "Kowalski");
        Ksiazka nowaKsiazka = new Ksiazka("Ksiazeczka", Rodzaj.HORRORY, 150, new Osoba("Natalia","Gilewska"));
        Ksiazka nowaKsiazka2= new Ksiazka ("Rozczarowania i dramaty", Rodzaj.DOKUMENTALNE,30, jan);
        System.out.println("Pierwsza ksiazka: Tytul: "+nowaKsiazka.tytul+" Autor: "+nowaKsiazka.autor.imie+" "+nowaKsiazka.autor.nazwisko);
        System.out.println("Druga ksiazka: Tytul: "+nowaKsiazka2.tytul+" Autor: "+nowaKsiazka2.autor.imie+" "+nowaKsiazka2.autor.nazwisko);

    }
}
