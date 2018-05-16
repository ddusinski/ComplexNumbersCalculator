package complexNumbersCalculator;

class ComplexNumber {

    int realPart;
    int imaginaryPart;

    ComplexNumber(int realPart, int imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    ComplexNumber() {
        this.realPart = 0;
        this.imaginaryPart = 0;
    }

    public int getRealPart() {
        return realPart;
    }

    public int getImaginaryPart() {
        return imaginaryPart;
    }
}




