public class Kontakt {
    String imie;
    String nazwisko;
    int numerTelefonu;
    String email;

    public Kontakt (String imie, String nazwisko, int numerTelefonu, String email)
    {
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.numerTelefonu=numerTelefonu;
        this.email=email;

    }

    public void wypisz()
    {
        System.out.println("Imie: "+ imie);
        System.out.println("Nazwisko: "+ nazwisko);
        System.out.println("Telefon: "+ numerTelefonu);
        System.out.println("Email: "+email);
    }
}
