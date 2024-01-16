package zavodnicici;

public class Zavodnici {

    public static void main(String[] args) {
        Statistiky swag = new Statistiky();
        
        ZavodnikZaznam a = new ZavodnikZaznam("Chujesos", 2,3);
        ZavodnikZaznam b = new ZavodnikZaznam("Pizdoliz", 3,2);
        ZavodnikZaznam c = new ZavodnikZaznam("Rak", 2,2);
        ZavodnikZaznam d = new ZavodnikZaznam("Merta", 3,3);
        
        swag.pridejZaznam(a);
        swag.pridejZaznam(b);
        swag.pridejZaznam(c);
        swag.pridejZaznam(d);
        swag.vypisZaznamy();
        swag.najdiNejrychlejsihoZavodnika();
        System.out.println();
        
        swag.nactiZaznamyZeSouboruCSV("zavodnizaznamy.csv");
        swag.uložZávodníkySLepšímČasemNež(3, "zavodnizaznamy.csv");
    }
    
}
