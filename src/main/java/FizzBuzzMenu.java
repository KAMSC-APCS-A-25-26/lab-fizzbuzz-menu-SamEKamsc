import java.util.Scanner;

// DO NOT CHANGE THE CLASS NAME, IT WILL BREAK THE AUTO GRADER
public class FizzBuzzMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("-----FizzBuzz-----");
            System.out.println("1. Fizz");
            System.out.println("2. Buzz");
            System.out.println("3. FizzBuzz");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    System.out.println("Fizzes");
                    for (int i = 1; i < 101; i++) {
                        if (i%3 == 0) {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Buzzes");
                    for (int i = 1; i < 101; i++) {
                        if (i%5 == 0) {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("FizzBuzz");
                    for (int i = 1; i < 101; i++) {
                        if (i%3 == 0 & i%5==0) {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Goodbye");
                    run = false;
                    break;
            }
        }
    }
}