package NOTE_HEI;

import java.time.LocalDate;

public class Enseignants  extends Personne{
     private SpeciliteEnseignant speciliteEnseignant;

    public Enseignants(int id, String nom, String prenom, LocalDate dateNaissance, String email, String telephone, SpeciliteEnseignant speciliteEnseignant) {
        super(id, nom, prenom, dateNaissance, email, telephone);
        this.speciliteEnseignant = speciliteEnseignant;
    }

    public SpeciliteEnseignant getSpeciliteEnseignant() {
        return speciliteEnseignant;
    }


}
