/**
 * Αυτή η κλάση αναπαριστά ένα ορθογώνιο.
 * This class represents a rectangle.
 */
public class Rectangle {

    /*
    O κατασκευαστής θα δέχεται δύο παραμέτρους. Η πρώτη
    παράμετρος θα αφορά το πλάτος και η δεύτερη το ύψος του ορθογωνίου.

    The constructor should have 2 parameters. The first parameter
    should be the width of the rectangle and the second one its height.
    */
    double width = 0;
    double height = 0;

    public Rectangle(double width, double height) {
        this.height = height;
        this.width = width;
    }

    /* Μέθοδος που θα επιστρέφει την περίμετρο του ορθογωνίου
     * This method should return the perimeter of the rectangle */

    public double getPerimeter() {
        return this.width * 2 + this.height * 2;
    }

    /* Μέθοδος που θα επιστρέφει τo εμβαδό του ορθογωνίου
     * This method should return the total area of the rectangle */
    public double getArea() {
        return this.width * this.height;
    }

    /* Μέθοδος που αλλάζει το πλάτος του ορθογωνίου
     * This method should change the width of the rectangle */
    public void setWidth(double x) {
        this.width = x;

    }

    /* Μέθοδος που αλλάζει το ύψος του ορθογωνίου
     * This method should change the height of the rectangle */
    public void setHeight(double x) {
        this.height = x;

    }

    /* Μέθοδος που επιστρέφει το πλάτος του ορθογωνίου
     * This method should return the width of the rectangle */
    public double getWidth() {
        return this.width;
    }

    /* Μέθοδος που επιστρέφει το ύψος του ορθογωνίου
     * This method should return the height of the rectangle*/
    public double getHeight() {
        return this.height;

    }

}