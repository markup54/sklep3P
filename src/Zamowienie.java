import java.util.ArrayList;

public class Zamowienie {
    private ArrayList<Produkt> produkty ;

    public Zamowienie() {
        produkty = new ArrayList<>();
    }
    public void dodajProdukt(Produkt produkt){
        produkty.add(produkt);
    }
    public double obliczCeneZamowienia(){
        double cena =0;
        for (Produkt p :produkty
             ) {
            cena = cena+p.getCena();
        }
    return cena;
    }

    @Override
    public String toString() {
        return "Zamowienie{" +
                "produkty=" + produkty +
                '}';
    }
}
