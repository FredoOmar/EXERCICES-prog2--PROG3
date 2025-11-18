package NOTE_HEI;


import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Etudiants extends Personne{
    private Groupe groupe;
    private Tuteurs tuteurs;

    public Etudiants(int id, String nom, String prenom, LocalDate dateNaissance, String email, String telephone, Groupe groupe, Tuteurs tuteurs) {
        super(id, nom, prenom, dateNaissance, email, telephone);
        this.groupe = groupe;
        this.tuteurs = tuteurs;
    }

    public Groupe getGroupe() {
        return groupe;
    }

    public Tuteurs getTuteurs() {
        return tuteurs;
    }
};
