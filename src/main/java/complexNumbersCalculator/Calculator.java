package complexNumbersCalculator;


public class Calculator {

    public ComplexNumber calculate(ComplexNumber firstInputComplexNumber, ComplexNumber secondInputComplexNumber, int operation) {
        switch (operation) {
            case 1: {
                return ComplexNumberUtils.complexSum(firstInputComplexNumber, secondInputComplexNumber);
            }

            case 2: {
                return ComplexNumberUtils.complexSubtraction(firstInputComplexNumber, secondInputComplexNumber);
            }

            case 3: {
                return ComplexNumberUtils.complexDivision(firstInputComplexNumber, secondInputComplexNumber);
            }

            case 4: {
                return ComplexNumberUtils.complexMultiplication(firstInputComplexNumber, secondInputComplexNumber);
            }
            default: {
                return new ComplexNumber();
            }
        }

    }
}
