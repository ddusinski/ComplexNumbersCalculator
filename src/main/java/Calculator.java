import java.util.Scanner;

public class Calculator {

    private Scanner console = new Scanner(System.in);
    private ComplexNumber firstInputComplexNumber;
    private ComplexNumber secondInputComplexNumber;

    public Calculator()

    {
        showWelcome();
        askForData();
        calculatorMenuService();
    }

    private void showWelcome() {
        String msg = "\n #########################################"
                    + "\n Welcome in Complex Number Calculator";
        System.out.println(msg);
    }

    private void askForData() {

        String msg = " #########################################"
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

    private void showMenu() {

        String msg = "\n #########################################"
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

    private void calculatorMenuService()
    {
        int userChoice = 0;
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
                    String msg =   "\n #########################################"
                            + "\n Addition:"
                            + ComplexNumber.toString(ComplexNumberUtils.complexSum(firstInputComplexNumber, secondInputComplexNumber))
                            + "\n #########################################";
                    System.out.println(msg);
                    break; }

                case 3: {

                    String msg =   "\n #########################################"
                            + "\n Subtraction:"
                            + ComplexNumber.toString(ComplexNumberUtils.complexSubtraction(firstInputComplexNumber, secondInputComplexNumber))
                            + "\n #########################################";
                    System.out.println(msg);
                    break; }

                case 4: {
                    String msg =   "\n #########################################"
                            + "\n Multiplication:"
                            + ComplexNumber.toString(ComplexNumberUtils.complexMultiplication(firstInputComplexNumber, secondInputComplexNumber))
                            + "\n #########################################";
                    System.out.println(msg);
                    break; }

                case 5: {
                    String msg =   "\n #########################################"
                            + "\n Division:"
                            + ComplexNumber.toString(ComplexNumberUtils.complexDivision(firstInputComplexNumber, secondInputComplexNumber))
                            + "\n #########################################";
                    System.out.println(msg);
                    break;
                }
                case 6: {
                System.out.println("Good bye!");
                break;
                }

                default:
                {
                    System.out.println("Wrong choice, please type again");
                    break;
                }
            }
        }
    }
}
