/**
 * Αυτή η κλάση αναπαριστά ένα ανθρώπινο σώμα.
 * This class represents a human body.
 */
public class Human {

    /*
    Ο κατασκευαστής θα δέχεται δύο παραμέτρους. Η πρώτη
    παράμετρος θα αφορά το βάρος και η δεύτερη το ύψος του ανθρώπου.

    The constructor should have 2 parameters. The first parameter
    should be the weight of the human and the second one its height.
    */
    double weight = 0;
    double height = 0;

    public Human(double weight, double height) {
        this.height = height;
        this.weight = weight;
    }

    /*
    * Μέθοδος που θα επιστρέφει τον Δείκτη Μάζας Σώματος (ΔΜΣ) του ανρθώπου
    * ΔΜΣ = βάρος / ύψος υψωμένο στο τετράγωνο
    * This method should return the Body Mass Index (BMI) of the human
    * BMI = weight / height squared
    * */

    public double getBMI() {
        return this.weight / (this.height * this.height) ; // Or use Math.pow(this.height, 2)
    }

    /* Μέθοδος που αλλάζει το βάρος του ανρθώπου
     * This method should change the weight of the human */
    public void setWeight(double x) {
        this.weight = x;

    }

    /* Μέθοδος που αλλάζει το ύψος του ανρθώπου
     * This method should change the height of the human */
    public void setHeight(double x) {
        this.height = x;

    }

    /* Μέθοδος που επιστρέφει το ύψος του ανρθώπου
     * This method should return the weight of the human */
    public double getHeight() {
        return this.height;

    }

    /* Μέθοδος που επιστρέφει το βάρος του ανρθώπου
     * This method should return the weight of the human */
    public double getWeight() {
        return this.weight;
    }
}