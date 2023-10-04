public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Klient osoba =new Klient("Jaś","Fasola","1234567");
        Produkt produkt1 = new Produkt("mleko",3);
        Produkt produkt2 = new Produkt("masło",3.4);
        Produkt produkt3= new Produkt("chleb",4.3);
        Produkt produkt4 = new Produkt("woda",3);
        Zamowienie zamowienie = new Zamowienie();
        zamowienie.dodajProdukt(produkt1);
        zamowienie.dodajProdukt(produkt1);
        zamowienie.dodajProdukt(produkt1);
        zamowienie.dodajProdukt(produkt3);
        Zamowienie zamowienie1 = new Zamowienie();
        zamowienie1.dodajProdukt(produkt2);
        zamowienie1.dodajProdukt(produkt4);
        System.out.println(zamowienie.obliczCeneZamowienia());
        System.out.println(zamowienie1.obliczCeneZamowienia());
        osoba.dodajZamowienie(zamowienie);
        osoba.dodajZamowienie(zamowienie1);
        osoba.wypiszProduktyKupionePrzeKlienta();

    }
}