class Demo {
    int num = 15;
}
public class Problem18 {
    // Pass by value
    static void changeValue(int x) {
        x = 25;
    }
    // Pass by reference
    static void changeObject(Demo d) {
        d.num = 25;
    }
    public static void main(String[] args) {
        int a = 15;
        Demo obj = new Demo();
        System.out.println("Before change:");
        System.out.println("a = " + a);
        System.out.println("obj.num = " + obj.num);
        changeValue(a);
        changeObject(obj);
        System.out.println("After change:");
        System.out.println("a = " + a);
        System.out.println("obj.num = " + obj.num);
    }
}
