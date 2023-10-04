import java.util.ArrayList;

public class Klient extends Osoba {
    private String nrKonta;
    private ArrayList<Zamowienie> zamowienia;

    public Klient(String imie, String nazwisko, String nrKonta) {
        super(imie, nazwisko);
        this.nrKonta = nrKonta;
        zamowienia = new ArrayList<>();
    }

    public void dodajZamowienie(Zamowienie zamowienie){
        zamowienia.add(zamowienie);
    }
    public void wypiszProduktyKupionePrzeKlienta(){
        for (Zamowienie z: zamowienia) {
            System.out.println(z);

        }
    }
}
