package NOTE_HEI;


public class Examen extends Cours {
    public Examen(int idCours, String nomCours, int credit) {
        super(idCours, nomCours, credit);
    }

    public void nomExamen() {
        if (getNomCours().equalsIgnoreCase("prog1")) {
            System.out.println("=====EXAMEN PROG1=====");
        } else if (getNomCours().equalsIgnoreCase("prog2")) {
            System.out.println("=====EXAMEN PROG2=====");
        } else if (getNomCours().equalsIgnoreCase("lv1")) {
            System.out.println("=====EXAMEN LV1=====");
        } else if (getNomCours().equalsIgnoreCase("api")) {
            System.out.println("=====EXAMEN API=====");
        } else if (getNomCours().equalsIgnoreCase("sys1")) {
            System.out.println("=====EXAMEN SYS1=====");
        } else if (getNomCours().equalsIgnoreCase("sys2")) {
            System.out.println("=====EXAMEN SYS2=====");
        } else if (getNomCours().equalsIgnoreCase("donner1")) {
            System.out.println("=====EXAMEN DONNER1=====");
        } else {
            System.out.println("=====EXAMEN " + getNomCours().toUpperCase() + "=====");
        }
    }

    @Override
    public String toString() {
        return "Examen{" +
                "idCours=" + getIdCours() +
                ", nomCours='" + getNomCours() + '\'' +
                ", credit=" + getCredit() +
                '}';
    }
}