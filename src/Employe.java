import java.util.Calendar;

public class Employe {
    private String matricule;
    private String nom;
    private String prenom;
    private DateFormat dateNaissance;
    private DateFormat dateEmbauche;
    private double salaire;

    public Employe(String matricule, String nom, String prenom,
                   DateFormat dateNaissance, DateFormat dateEmbauche, double salaire) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.dateEmbauche = dateEmbauche;
        this.salaire = salaire;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public DateFormat getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(DateFormat dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public DateFormat getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(DateFormat dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public int Age() {
        Calendar currentDate = Calendar.getInstance();
        int anneeActuelle = currentDate.get(Calendar.YEAR);
        int moisActuel = currentDate.get(Calendar.MONTH) + 1;
        int jourActuel = currentDate.get(Calendar.DAY_OF_MONTH);
        int age = anneeActuelle - dateNaissance.getAnnee();
        if (moisActuel < dateNaissance.getMois() ||
                (moisActuel == dateNaissance.getMois() && jourActuel < dateNaissance.getJour())) {
            age--;
        }
        return age;
    }

    public int Anciennete() {
        Calendar currentDate = Calendar.getInstance();
        int anneeActuelle = currentDate.get(Calendar.YEAR);
        int moisActuel = currentDate.get(Calendar.MONTH) + 1;
        int jourActuel = currentDate.get(Calendar.DAY_OF_MONTH);
        int anciennete = anneeActuelle - dateEmbauche.getAnnee();
        if (moisActuel < dateEmbauche.getMois() ||
                (moisActuel == dateEmbauche.getMois() && jourActuel < dateEmbauche.getJour())) {
            anciennete--;
        }
        return anciennete;
    }

    public void AugmentationDuSalaire() {
        int anciennete = Anciennete();
        if (anciennete < 5) {
            salaire = salaire + salaire * 0.02;
        } else if (anciennete < 10) {
            salaire = salaire + salaire * 0.05;
        } else {
            salaire = salaire + salaire * 0.10;
        }
    }

    public void AfficherEmploye() {
        System.out.println("Matricule : " + matricule);
        System.out.println("Nom complet : " + nom.toUpperCase() + " " + prenom);
        System.out.println("Age : " + Age());
        System.out.println("Ancienneté : " + Anciennete());
        System.out.println("Salaire : " + salaire);
        System.out.println("Date de naissance : " + dateNaissance.afficherDate());
        System.out.println("Date d'embauche : " + dateEmbauche.afficherDate());
    }
}