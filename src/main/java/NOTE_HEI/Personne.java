package NOTE_HEI;

import java.time.LocalDate;
 public  class Personne {
        protected int id;
        protected String nom;
        protected String prenom;
        protected LocalDate dateNaissance;
        protected String email;
        protected String telephone;

        public Personne(int id, String nom, String prenom, LocalDate dateNaissance,
                      String email, String telephone) {
            this.id = id;
            this.nom = nom;
            this.prenom = prenom;
            this.dateNaissance = dateNaissance;
            this.email = email;
            this.telephone = telephone;
        }

        public int getId() { return id; }
        public void setId(int id) { this.id = id; }

        public String getNom() { return nom; }
        public void setNom(String nom) { this.nom = nom; }

        public String getPrenom() { return prenom; }
        public void setPrenom(String prenom) { this.prenom = prenom; }

        public LocalDate getDateNaissance() { return dateNaissance; }
        public void setDateNaissance(LocalDate dateNaissance) { this.dateNaissance = dateNaissance; }

        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }

        public String getTelephone() { return telephone; }
        public void setTelephone(String telephone) { this.telephone = telephone; }



 }
