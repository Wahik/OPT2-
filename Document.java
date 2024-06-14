abstract class Document {
    private int documentnummer;

    public Document(int documentnummer) {
        this.documentnummer = documentnummer;
    }

    public int getDocumentnummer() {
        return documentnummer;
    }

    public void setDocumentnummer(int documentnummer) {
        this.documentnummer = documentnummer;
    }
}
