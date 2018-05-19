package complexNumbersCalculator;

class ComplexNumber {

    double realPart;
    double imaginaryPart;

    ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    ComplexNumber() {
        this.realPart = 0;
        this.imaginaryPart = 0;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }
}




