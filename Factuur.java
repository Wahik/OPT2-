public class Factuur extends Document {
    private int factuurnummer;
    private Klant klant;
    private String reparatiegegevens;
    //private double prijsExclusiefBtw;
    //private double prijsInclusiefBtw;
    private Prijs prijs;
//double prijsExclusiefBtw, double prijsInclusiefBtw) {
    public Factuur(int factuurnummer, Klant klant, String reparatiegegevens, Prijs prijs) {
        super(factuurnummer);
        this.klant = klant;
        this.reparatiegegevens = reparatiegegevens;
        //this.prijsExclusiefBtw = prijsExclusiefBtw;
        //this.prijsInclusiefBtw = prijsInclusiefBtw;
        this.prijs = prijs;
    }

    public int getFactuurnummer() {
        return factuurnummer;
    }

    public void setFactuurnummer(int factuurnummer) {
        this.factuurnummer = factuurnummer;
    }

    public Klant getKlant() {
        return klant;
    }

    public void setKlant(Klant klant) {
        this.klant = klant;
    }

    public String getReparatiegegevens() {
        return reparatiegegevens;
    }

    public void setReparatiegegevens(String reparatiegegevens) {
        this.reparatiegegevens = reparatiegegevens;
    }

    // OUDE CODE HIERONDER
    //public double getPrijsExclusiefBtw() {
     //   return prijsExclusiefBtw;
    //}

    //public void setPrijsExclusiefBtw(double prijsExclusiefBtw) {
      //  this.prijsExclusiefBtw = prijsExclusiefBtw;
    //}

    //public double getPrijsInclusiefBtw() {
     //   return prijsInclusiefBtw;
    //}

    //public void setPrijsInclusiefBtw(double prijsInclusiefBtw) {
     //   this.prijsInclusiefBtw = prijsInclusiefBtw;
    //}
    // tot hier
    public Prijs getPrijs() {
        return prijs;
    }

    public void setPrijs(Prijs prijs) {
        this.prijs = prijs;
    }

    @Override
    public String toString() {
        return "Factuur{" +
                "factuurnummer=" + factuurnummer +
                ", klant=" + klant +
                ", reparatiegegevens='" + reparatiegegevens + '\'' +
                ", prijs" + prijs +
                '}';
    }
}