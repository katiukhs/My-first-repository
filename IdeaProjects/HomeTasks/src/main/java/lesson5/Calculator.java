package lesson5;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Calculate calculate = new Calculate();

        System.out.print("First Variable: ");
        calculate.setFirstVariable(input.nextDouble());

        System.out.print(": ");
        calculate.setOperation(input.next());

        System.out.print("Second Variable: ");
        calculate.setSecondVariable(input.nextDouble());

        if ("+".equals(calculate.getOperation())) {
            System.out.println(calculate.getFirstVariable() + calculate.getSecondVariable());
        } else if ("-".equals(calculate.getOperation())) {
            System.out.println(calculate.getFirstVariable() - calculate.getSecondVariable());
        } else if ("*".equals(calculate.getOperation())) {
            System.out.println(calculate.getFirstVariable() * calculate.getSecondVariable());
        } else if ("/".equals(calculate.getOperation())) {
            if (calculate.getSecondVariable() != 0) {
                System.out.println(calculate.getFirstVariable() / calculate.getSecondVariable());
            } else System.out.println("Cannot divide to 0");
        } else System.out.println("Invalid operation was selected");


        input.close();

    }
}

