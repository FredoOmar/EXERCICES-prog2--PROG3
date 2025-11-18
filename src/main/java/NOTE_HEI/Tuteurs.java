package NOTE_HEI;

import java.time.LocalDate;


public class Tuteurs extends Personne {
    private LienTuteurEtudiant lienTuteurEtudiant;

    public Tuteurs(int id, String nom, String prenom, LocalDate dateNaissance, String email, String telephone, LienTuteurEtudiant lienTuteurEtudiant) {
        super(id, nom, prenom, dateNaissance, email, telephone);
        this.lienTuteurEtudiant = lienTuteurEtudiant;
    }

    public LienTuteurEtudiant getLienTuteurEtudiant() {
        return lienTuteurEtudiant;
    }
}
