import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("For Addition two Numbers use : + ");
        System.out.println("For Subtraction of two Numbers use : - ");
        System.out.println("For Multiplication of two Numbers use : * ");
        System.out.println("For Division of two Numbers use: / ");
        System.out.println("For Power use: ^ ");


        char choice = 'Y';

        while (choice == 'Y') {

            System.out.println("Enter First Number");
            int num1 = sc.nextInt();
            System.out.println("Enter Second Number");
            int num2 = sc.nextInt();

            System.out.println("Select Operation");
            char operation = sc.next().charAt(0);


                if (operation == '+') {
                    System.out.println("The Addition of two Numbers is " + (num1 + num2));
                } else if (operation == '-') {

                    System.out.println("The Subtraction of two Numbers is " + (num1 - num2));
                } else if (operation == '*') {
                    System.out.println("The Multiplication of two Number is " + (num1 * num2));
                } else if (operation == '/') {
                    System.out.println("The division of " + num1 + "/" + num2 + "is" + (num1 / num2));
                } else if (operation == '^') {
                    System.out.println("The power of " + num1 + " raise by " + num2 + " is " + (Math.pow(num1, num2)));
                }
                else {
                    System.out.println("Invalid Sign. Please try again with correct Sign");
                }


                System.out.println("Do you want to continue.(Enter Y/N)");
                choice = sc.next().charAt(0);

            }


        }
    }
