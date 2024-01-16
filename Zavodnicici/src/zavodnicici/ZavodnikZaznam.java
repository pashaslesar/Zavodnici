package zavodnicici;

public class ZavodnikZaznam {
    private String jmeno;
    private int prvnicas;
    private int druhycas;

    public ZavodnikZaznam(String jmeno, int prvnicas, int druhycas) {
        this.jmeno = jmeno;
        this.prvnicas = prvnicas;
        this.druhycas = druhycas;
    }

    public String getJmeno() {
        return jmeno;
    }

    public int getPrvnicas() {
        return prvnicas;
    }

    public int getDruhycas() {
        return druhycas;
    }

    @Override
    public String toString() {
        return "ZavodnikZaznam{" + "jmeno=" + jmeno + ", prvnicas=" + prvnicas + ", druhycas=" + druhycas + '}';
    }
    
    public int dejLepsiCas() {
        return prvnicas < druhycas ? prvnicas : druhycas;
    }
}
