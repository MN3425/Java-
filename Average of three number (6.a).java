import java.util.*;

class JavaBasic {

    public static void main(String args[]) {

        System.out.println("Kindly input three numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int d = (a + b + c) / 3;
        System.out.println("The average of the numbers are" + d);
    }
}
