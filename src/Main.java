import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("enter the number");
        System.out.println(" enter 1 to find largest number among 3 ");
        System.out.println(" enter 2 to find smallest number among 3");
        System.out.println(" enter 3 to find the number is prime or not");
        System.out.println(" enter 4 to find the number is even or not ");
        System.out.println(" enter 5 to reverse a number");
        System.out.println(" enter 6 to exit");
    }

    void largest() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 3 number");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if (x > y && x > z) {
            System.out.println("largest number is" + x);
        }
        if (y > z && y > x) {
            System.out.println("largest number is" + y);
        }
        if (z > y && z > x) {
            System.out.println("largest number is" + y);
        }

    }

    void smallest() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 3 number");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if (x > y && x > z) {
            System.out.println("smallest number is" + x);
        }
        if (y < z && y < x) {
            System.out.println("smallest number is" + y);
        }
        if (z < y && z < x) {
            System.out.println("smallest number is" + y);
        }


    }

    void prime() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int x = sc.nextInt();
        int i;
        int flag = 0;
        if(x==0||x==1)
        {
            System.out.println(x+" is not prime number");
        }
        else {
            for (i = 2; i < x; i++) {
                if (x % i == 0) {
                    System.out.println(x + " is not prime number");
                    flag = 1;
                    break;
                }
            }
        }
        if(flag==0)
        {
            System.out.println(x+" is prime number");
        }

    }

}