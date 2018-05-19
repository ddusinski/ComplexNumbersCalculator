package complexNumbersCalculator;
import java.lang.Math;

public class ComplexNumberUtils {

    public static ComplexNumber complexSum(ComplexNumber firstComplexNumber, ComplexNumber secondComplexNumber) {
        return new ComplexNumber(firstComplexNumber.realPart + secondComplexNumber.realPart,
                firstComplexNumber.imaginaryPart + secondComplexNumber.imaginaryPart);
    }

    static ComplexNumber complexSubtraction(ComplexNumber A, ComplexNumber B) {

        return new ComplexNumber(A.realPart - B.realPart, A.imaginaryPart - B.imaginaryPart);
    }

    static ComplexNumber complexMultiplication(ComplexNumber A, ComplexNumber B) {
        double tempRealPart = A.realPart * B.realPart - A.imaginaryPart * B.imaginaryPart;
        double tempImaginaryPart = A.imaginaryPart * B.realPart + A.realPart * B.imaginaryPart;
        return new ComplexNumber(tempRealPart, tempImaginaryPart);
    }


    static ComplexNumber complexDivision(ComplexNumber A, ComplexNumber B) {
        double tempRealPart = A.realPart * B.realPart + A.imaginaryPart * B.imaginaryPart / (Math.pow(B.realPart ,2) + Math.pow(B.imaginaryPart , 2));
        double tempImaginaryPart = A.imaginaryPart * B.realPart - A.realPart * B.imaginaryPart / (Math.pow(B.realPart,2) + Math.pow(B.imaginaryPart,2));
        return new ComplexNumber(tempRealPart, tempImaginaryPart);
    }

}
