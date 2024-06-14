public class FactuurPrinter {
    public void printFactuur(Factuur factuur) {

        System.out.println();
        System.out.println("Factuur afgedrukt voor klant: " + factuur.getKlant().getNaam());
    }
}