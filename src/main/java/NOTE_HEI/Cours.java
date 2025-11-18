package NOTE_HEI;

import java.util.ArrayList;
import java.util.List;

public class Cours {
    private int idCours;
    private String nomCours;
    private int credit;
    private List<Enseignants> enseignants;

    public Cours(int idCours, String nomCours, int credit) {
        this.idCours = idCours;
        this.nomCours = nomCours;
        this.credit = credit;
        this.enseignants = new ArrayList<>();
    }

    public int getIdCours() {
        return idCours;
    }

    public String getNomCours() {
        return nomCours;
    }

    public int getCredit() {
        return credit;
    }

    public List<Enseignants> getEnseignants() {
        return enseignants;
    }

    public void ajouterEnseignant(Enseignants enseignant) {
        this.enseignants.add(enseignant);
    }

    @Override
    public String toString() {
        return "Cours{" +
                "idCours=" + idCours +
                ", nomCours='" + nomCours + '\'' +
                ", credit=" + credit +
                '}';
    }
}