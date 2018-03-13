import java.util.Scanner;

public class Calculator {

    private Scanner console = new Scanner(System.in);
    private String msg;
    private ComplexNumber firstInputComplexNumber;
    private ComplexNumber secondInputComplexNumber;
    private int userChoice;

    public Calculator()

    {

        showWelcome();
        askForData();
        CalculatorMenuService();

    }


    private void showWelcome() {
        String msg = "\n #########################################"
                    + "\n Welcome in Complex Number Calculator";
        System.out.println(msg);
    }

    private void askForData() {
        msg = " #########################################"
                + "\n Give Input Data"
                + "\n #########################################"
                + "\n First Number is:";
        System.out.println(msg);
        firstInputComplexNumber = readComplexNumber();

        msg = "#########################################"
                + "\n Second Number is:";
        System.out.println(msg);
        secondInputComplexNumber = readComplexNumber();
        msg = "#########################################";
        System.out.println(msg);
    }

    private ComplexNumber readComplexNumber() {
        System.out.println("Give Real Part:");
        int realPart = console.nextInt();
        System.out.println("Give Imaginary Part:");
        int imaginaryPart = console.nextInt();

        return new ComplexNumber(realPart, imaginaryPart);
    }


    private String showResult(ComplexNumber reasultComplexNumber) {
        return "( " + reasultComplexNumber.realPart + " . " + reasultComplexNumber.imaginaryPart + " )";

    }


    private void showMenu() {

        msg = "\n #########################################"
                + "\n Choose the Operation:"
                + "\n #########################################"
                + "\n 1 - Change input data"
                + "\n 2 - Sum"
                + "\n 3 - Subtraction"
                + "\n 4 - Multiplication"
                + "\n 5 - Division"
                + "\n 6 - EXIT"
                + "\n #########################################";

        System.out.println(msg);

    }

    private void CalculatorMenuService()
    {


        while (userChoice != 6)
        {
            showMenu();
            userChoice = console.nextInt();

            switch (userChoice) {
                case 1: {
                    askForData();
                    break;
                }

                case 2: {
                    msg =   "\n #########################################"
                            + "\n Addition:"
                            + showResult(ComplexNumber.ComplexSum(firstInputComplexNumber, secondInputComplexNumber))
                            + "\n #########################################";
                    System.out.println(msg);
                    break; }

                case 3: {

                    msg =   "\n #########################################"
                            + "\n Subtraction:"
                            + showResult(ComplexNumber.ComplexSubtraction(firstInputComplexNumber, secondInputComplexNumber))
                            + "\n #########################################";
                    System.out.println(msg);
                    break; }

                case 4: {
                    msg =   "\n #########################################"
                            + "\n Multiplication:"
                            + showResult(ComplexNumber.ComplexMultiplication(firstInputComplexNumber, secondInputComplexNumber))
                            + "\n #########################################";
                    System.out.println(msg);
                    break; }

                case 5: {
                    msg =   "\n #########################################"
                            + "\n Division:"
                            + showResult(ComplexNumber.CompletDivision(firstInputComplexNumber, secondInputComplexNumber))
                            + "\n #########################################";
                    System.out.println(msg);
                    break;
                }
            }

        }

    }

}