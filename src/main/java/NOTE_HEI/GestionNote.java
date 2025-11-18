package NOTE_HEI;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class GestionNote {
    private List<Notes> toutesLesNotes;

    public GestionNote() {
        this.toutesLesNotes = new ArrayList<>();
    }

    public void ajouterNote(Notes note) {
        toutesLesNotes.add(note);
        System.out.println("Note ajoutée: " + note);
    }


    public double getExamGrade(Examen exam, Etudiants student, LocalDateTime t) {
        for (Notes note : toutesLesNotes) {
            if (note.getExamen().equals(exam) && note.getEtudiant().equals(student)) {
                return note.getNoteAtInstant(t);
            }
        }
        return -1; // Retourne -1 si aucune note trouvée (plutôt que 0)
    }


    public double getCourseGrade(Cours course, Etudiants student, LocalDateTime t) {
        List<Double> notesDuCours = new ArrayList<>();

        for (Notes note : toutesLesNotes) {
            if (note.getEtudiant().equals(student) &&
                    note.getExamen().getNomCours().equalsIgnoreCase(course.getNomCours())) {
                double noteAtInstant = note.getNoteAtInstant(t);
                if (noteAtInstant >= 0) {
                    notesDuCours.add(noteAtInstant);
                }
            }
        }

        if (notesDuCours.isEmpty()) {
            return -1; // Aucune note trouvée
        }


        double somme = 0;
        for (Double n : notesDuCours) {
            somme += n;
        }

        return somme / notesDuCours.size();
    }


    public List<Notes> getNotesEtudiant(Etudiants etudiant) {
        List<Notes> resultat = new ArrayList<>();
        for (Notes note : toutesLesNotes) {
            if (note.getEtudiant().equals(etudiant)) {
                resultat.add(note);
            }
        }
        return resultat;
    }

    public List<Notes> getNotesExamen(Examen examen) {
        List<Notes> resultat = new ArrayList<>();
        for (Notes note : toutesLesNotes) {
            if (note.getExamen().equals(examen)) {
                resultat.add(note);
            }
        }
        return resultat;
    }

    public void afficherToutesLesNotes() {
        System.out.println("=== TOUTES LES NOTES ===");
        for (Notes note : toutesLesNotes) {
            System.out.println(note);
        }
        System.out.println("=======================\n");
    }
}