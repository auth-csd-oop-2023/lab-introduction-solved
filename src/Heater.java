/**
 * Η κλάση αυτή αφορά σε ένα θερμαντικό σώμα, το οποίο θα ξεκινάει στους 15
 * βαθμούς κελσίου. Η θερμοκρασία του θα μπορεί να αυξηθεί ή να μειωθεί κατά
 * ένα βήμα, το οποίο αρχικά θα είναι 5 βαθμοί κελσίου. Η ρύθμιση της
 * θερμοκρασίας δεν θα πρέπει να βγαίνει εκτός ενός κατώτερου και ενός ανώτερου
 * ορίου.
 * <p>
 * This class represents a heater/radiator which has a starting temperature of 15
 * degrees. Its temperature should be able to be increased or decreased using a step.
 * Initially, this step is set to 5 degrees. The temperature should not exceed an upper
 * and a lower limit.
 */
public class Heater {
    /* 
    O κατασκευαστής θα δέχεται δύο παραμέτρους. Η πρώτη 
    παράμετρος θα αφορά στην ελάχιστη και η δεύτερη στην μέγιστη θερμοκρασία 
    στην οποία επιτρέπεται να ρυθμιστεί το θερμαντικό σώμα.

    The constructor should have two parameters. The first is the minimum temperature
    and the second parameter is the maximum temperature which the heater can be set to.
    */
    double min = 0;
    double max = 0;
    double currentTemperature = 15;
    double step = 5;

    public Heater(double min, double max) {
        this.min = min;
        this.max = max;

    }


    // Η μέθοδος αυτή θα αυξάνει την θερμοκρασία σύμφωνα με το βήμα
    // This method increases the temperature using the step
    public void warmer() {
        double temporaryTemp = this.currentTemperature + this.step;
        if (temporaryTemp <= this.max) {
            this.currentTemperature = temporaryTemp;
        }
    }

    // Η μέθοδος αυτή θα μειώνει την θερμοκρασία σύμφωνα με το βήμα
    // This method decreases the temperature using the step
    public void colder() {
        double temporaryTemp = this.currentTemperature - this.step;
        if (temporaryTemp >= this.min) {
            this.currentTemperature = temporaryTemp;
        }
    }

    //Η μέθοδος αυτή θα αλλάζει το βήμα
    // This method changes the step
    public void setIncrement(double step) {
        this.step = Math.abs(step);
    }

    // η μέθοδος αυτή θα επιστρέφει την ρύθμιση της θερμοκρασίας
    // This method should return the current temperature of the heater
    public double getTemperature() {
        return this.currentTemperature;
    }
}