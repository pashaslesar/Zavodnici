package zavodnicici;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Statistiky {
    private ArrayList<ZavodnikZaznam> zavodniZaznamy;

    public Statistiky() {
        this.zavodniZaznamy = new ArrayList<>();
    }
    
    public void pridejZaznam(ZavodnikZaznam id) {
        zavodniZaznamy.add(id);
    }
    
    public void vypisZaznamy() {
        for (ZavodnikZaznam z : zavodniZaznamy) {
            System.out.println(z);
        }
        System.out.println();
    }
    
    public ZavodnikZaznam najdiNejrychlejsihoZavodnika() {
        ZavodnikZaznam nejrychlejsi = zavodniZaznamy.get(0);
        
        for (ZavodnikZaznam z : zavodniZaznamy) {
            if ((z.getPrvnicas() + z.getDruhycas()) > (nejrychlejsi.getDruhycas() + nejrychlejsi.getPrvnicas())) {
                nejrychlejsi = z;
            }
        }
        
        System.out.println("Nejrychlejsi je " + nejrychlejsi.getJmeno() + "!");
        return nejrychlejsi;
    }
    
    public void nactiZaznamyZeSouboruCSV(String soubor) {
        try (BufferedReader writer = new BufferedReader(new FileReader(soubor))) {
            String line;
            while ((line = writer.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void uložZávodníkySLepšímČasemNež(int casovaHranice, String soubor) {
        try (PrintWriter reader = new PrintWriter(new FileWriter(soubor))) {
            String line;
            for (ZavodnikZaznam z : zavodniZaznamy) {
                if (z.dejLepsiCas() < casovaHranice) {
                    reader.println(z.getJmeno() + ": " + z.dejLepsiCas());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
