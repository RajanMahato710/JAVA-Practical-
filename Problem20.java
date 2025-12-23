import java.util.Scanner;
class Distance {
    private int feet;
    private int inches;
    Distance(int f, int i) {
        feet = f;
        inches = i;
        normalize();
    }
    private void normalize() {
        if (inches >= 12) {   // (12 inches = 1 feet)
            feet += inches / 12;
            inches = inches % 12;
        }
    }
    // Add two Distance objects
    Distance addDistance(Distance d) {
        int f = feet + d.feet;
        int i = inches + d.inches;
        return new Distance(f, i);
    }
    // Subtract two Distance objects
    Distance subtractDistance(Distance d) {
        int totalInches1 = feet * 12 + inches;
        int totalInches2 = d.feet * 12 + d.inches;
        int diff = totalInches1 - totalInches2;
        if (diff < 0) diff = -diff;
        int f = diff / 12;
        int i = diff % 12;
        return new Distance(f, i);
    }
    // Display distance
    void displayDistance() {
        System.out.println(feet + " feet " + inches + " inches");
    }
}

public class Problem20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first distance
        System.out.print("Enter first distance (feet inches): ");
        int f1 = sc.nextInt();
        int i1 = sc.nextInt();
        Distance d1 = new Distance(f1, i1);

        // Input second distance
        System.out.print("Enter second distance (feet inches): ");
        int f2 = sc.nextInt();
        int i2 = sc.nextInt();
        Distance d2 = new Distance(f2, i2);

        // Add distances
        Distance sum = d1.addDistance(d2);
        System.out.print("Sum of distances: ");
        sum.displayDistance();

        // Subtract distances
        Distance diff = d1.subtractDistance(d2);
        System.out.print("Difference of distances: ");
        diff.displayDistance();

        sc.close();
    }
}
