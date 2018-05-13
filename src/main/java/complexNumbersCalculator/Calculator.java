package complexNumbersCalculator;


public class Calculator {

    public ComplexNumber calculate(ComplexNumber firstInputComplexNumber, ComplexNumber secondInputComplexNumber, int operation) {
        ComplexNumber resultComplexNumber =new ComplexNumber();
        switch (operation) {
            case 1:
            {
                resultComplexNumber = ComplexNumberUtils.complexSum(firstInputComplexNumber, secondInputComplexNumber);
                break;
            }

            case 2:
            {
                resultComplexNumber= ComplexNumberUtils.complexSubtraction(firstInputComplexNumber, secondInputComplexNumber);
                break;
            }

            case 3:
            {
                resultComplexNumber= ComplexNumberUtils.complexDivision(firstInputComplexNumber, secondInputComplexNumber);
                break;
            }

            case 4:
            {    resultComplexNumber= ComplexNumberUtils.complexMultiplication(firstInputComplexNumber, secondInputComplexNumber);
                break;
            }
        }
        return resultComplexNumber;
    }
}
