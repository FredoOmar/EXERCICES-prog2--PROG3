package NOTE_HEI;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Notes {
    private double noteActuelle;
    private LocalDateTime dateCreation;
    private String motifInitial;
    private Etudiants etudiant;
    private Examen examen;
    private List<ChangementNote> historique;

    public Notes(double note, String motif, Etudiants etudiant, Examen examen) {
        this.noteActuelle = note;
        this.dateCreation = LocalDateTime.now();
        this.motifInitial = motif;
        this.etudiant = etudiant;
        this.examen = examen;
        this.historique = new ArrayList<>();


        this.historique.add(new ChangementNote(0.0, note, "Création - " + motif));
    }


    public void modifierNote(double nouvelleNote, String motifModification) {
        if (nouvelleNote < 0 || nouvelleNote > 20) {
            throw new IllegalArgumentException("La note doit être entre 0 et 20");
        }

        ChangementNote changement = new ChangementNote(this.noteActuelle, nouvelleNote, motifModification);
        this.historique.add(changement);
        this.noteActuelle = nouvelleNote;
    }


    public double getNoteAtInstant(LocalDateTime instant) {
        double note = 0.0;

        for (ChangementNote changement : historique) {
            // Si le changement s'est produit avant ou à l'instant demandé
            if (!changement.getDateChangement().isAfter(instant)) {
                note = changement.getNouvelleValeur();
            }
        }

        return note;
    }


    public double getNoteActuelle() {
        return noteActuelle;
    }


    public void afficherHistorique() {
        System.out.println("=== Historique des modifications ===");
        System.out.println("Étudiant: " + etudiant.getNom() + " " + etudiant.getPrenom());
        System.out.println("Examen: " + examen.getNomCours());
        System.out.println("Note actuelle: " + noteActuelle);
        System.out.println("\nHistorique des changements:");

        for (int i = 0; i < historique.size(); i++) {
            ChangementNote changement = historique.get(i);
            System.out.println((i + 1) + ". " + changement);
        }
        System.out.println("====================================\n");
    }


    public LocalDateTime getDateCreation() {
        return dateCreation;
    }

    public String getMotifInitial() {
        return motifInitial;
    }

    public Etudiants getEtudiant() {
        return etudiant;
    }

    public Examen getExamen() {
        return examen;
    }

    public List<ChangementNote> getHistorique() {
        return new ArrayList<>(historique); // Retourne une copie pour protéger l'original
    }

    @Override
    public String toString() {
        return String.format("Note[%.2f] - %s %s - %s",
                noteActuelle, etudiant.getPrenom(), etudiant.getNom(), examen.getNomCours());
    }
}