public class Prijs {
    private double prijsExclusiefBtw;
    private double prijsInclusiefBtw;

    public Prijs(double prijsExclusiefBtw, double prijsInclusiefBtw) {
        this.prijsExclusiefBtw = prijsExclusiefBtw;
        this.prijsInclusiefBtw = prijsInclusiefBtw;
    }
    public double getPrijsExclusiefBtw() {
       return prijsExclusiefBtw;
    }

    public void setPrijsExclusiefBtw(double prijsExclusiefBtw) {
      this.prijsExclusiefBtw = prijsExclusiefBtw;
    }

    public double getPrijsInclusiefBtw() {
       return prijsInclusiefBtw;
    }

    public void setPrijsInclusiefBtw(double prijsInclusiefBtw) {
       this.prijsInclusiefBtw = prijsInclusiefBtw;
    }
}
