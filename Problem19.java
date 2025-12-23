import java.util.Scanner;
public class Problem19 {
    int h, m, s;
    Problem19(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }
    // Display time
    void display() {
        System.out.println(h + ":" + m + ":" + s);
    }
    // Add two times
    static Problem19 add(Problem19 t1, Problem19 t2) {
        int sec = t1.s + t2.s;
        int min = t1.m + t2.m + sec / 60;
        int hr  = t1.h + t2.h + min / 60;
        sec = sec % 60;
        min = min % 60;
        return new Problem19(hr, min, sec);
    }
    // Subtract two times
    static Problem19 subtract(Problem19 t1, Problem19 t2) {
        int total1 = t1.h * 3600 + t1.m * 60 + t1.s;
        int total2 = t2.h * 3600 + t2.m * 60 + t2.s;
        int diff = total1 - total2;
        if (diff < 0) diff = -diff;
        int hr = diff / 3600;
        int min = (diff % 3600) / 60;
        int sec = diff % 60;
        return new Problem19(hr, min, sec);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice: 1 for Addition, 2 for Subtraction");
        int choice = sc.nextInt();
        // Input first time
        System.out.println("Enter Time 1 (hours minutes seconds):");
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int s1 = sc.nextInt();
        Problem19 t1 = new Problem19(h1, m1, s1);
        // Input second time
        System.out.println("Enter Time 2 (hours minutes seconds):");
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        int s2 = sc.nextInt();
        Problem19 t2 = new Problem19(h2, m2, s2); 
        if (choice == 1) {
            Problem19 result = add(t1, t2);
            System.out.print("Added Time: ");
            result.display();
        } else if (choice == 2) {
            Problem19 result = subtract(t1, t2);
            System.out.print("Subtracted Time: ");
            result.display();
        } else {
            System.out.println("Invalid choice!");
        }
        sc.close();
    }
}
