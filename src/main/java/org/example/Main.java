package NOTE_HEI;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        try {

            Tuteurs tuteur = new Tuteurs(1, "Dupont", "Jean",
                    LocalDate.of(1970, 5, 15), "jean.dupont@email.com", "0123456789", LienTuteurEtudiant.Parents);

            Etudiants etudiant1 = new Etudiants(1, "Martin", "Alice",
                    LocalDate.of(2000, 3, 20), "alice.martin@email.com", "0987654321", Groupe.Ki, tuteur);

            Etudiants etudiant2 = new Etudiants(2, "Bernard", "Bob",
                    LocalDate.of(2001, 7, 12), "bob.bernard@email.com", "0654321987", Groupe.Ki, tuteur);


            Examen examenProg1 = new Examen(1, "Prog1", 3);
            Examen examenProg2 = new Examen(2, "Prog2", 4);
            Examen examenLV1 = new Examen(3, "LV1", 2);


            GestionNote gestionnaire = new GestionNote();


            Notes noteAliceProg1 = new Notes(14.5, "Examen partiel", etudiant1, examenProg1);
            gestionnaire.ajouterNote(noteAliceProg1);
            Notes noteAliceProg2 = new Notes(14, "Examen final", etudiant1, examenProg1);
            gestionnaire.ajouterNote(noteAliceProg2);
            Notes noteAliceLv1 = new Notes(18, "Examen partiel", etudiant2, examenProg2);
            gestionnaire.ajouterNote(noteAliceLv1);
            Notes noteAliceApi = new Notes(16, "Examen  final ", etudiant2, examenProg2);
            gestionnaire.ajouterNote(noteAliceApi);

            Notes noteBobProg1 = new Notes(12.0, "Examen partiel", etudiant2, examenProg1);
            gestionnaire.ajouterNote(noteBobProg1);


            Thread.sleep(100);


            noteAliceProg1.modifierNote(16.0, "Réévaluation après recours");
            noteBobProg1.modifierNote(13.5, "Bonus participation");


            Thread.sleep(100);


            noteAliceProg1.modifierNote(15.0, "Correction erreur de calcul");


            noteAliceProg1.afficherHistorique();
            noteBobProg1.afficherHistorique();


            LocalDateTime instantTest = LocalDateTime.now().minusMonths(150);

            double noteExam = gestionnaire.getExamGrade(examenProg1, etudiant1, instantTest);
            double noteCours = gestionnaire.getCourseGrade(examenProg1, etudiant1, instantTest);

            System.out.println("Résultat getExamGrade à t-150ms: " + noteExam);
            System.out.println("Résultat getCourseGrade à t-150ms: " + noteCours);


            double noteExamMaintenant = gestionnaire.getExamGrade(examenProg1, etudiant1, LocalDateTime.now());
            System.out.println("Résultat getExamGrade maintenant: " + noteExamMaintenant);


            gestionnaire.afficherToutesLesNotes();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}