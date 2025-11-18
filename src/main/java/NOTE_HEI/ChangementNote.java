package NOTE_HEI;

import java.time.LocalDateTime;

public class ChangementNote {
    private double ancienneValeur;
    private double nouvelleValeur;
    private LocalDateTime dateChangement;
    private String motif;

    public ChangementNote(double ancienneValeur, double nouvelleValeur, String motif) {
        this.ancienneValeur = ancienneValeur;
        this.nouvelleValeur = nouvelleValeur;
        this.dateChangement = LocalDateTime.now();
        this.motif = motif;
    }


    public double getAncienneValeur() {
        return ancienneValeur;
    }

    public double getNouvelleValeur() {
        return nouvelleValeur;
    }

    public LocalDateTime getDateChangement() {
        return dateChangement;
    }

    public String getMotif() {
        return motif;
    }

    @Override
    public String toString() {
        return String.format("Changement[%.2f -> %.2f] le %s - %s",
                ancienneValeur, nouvelleValeur, dateChangement, motif);
    }
}