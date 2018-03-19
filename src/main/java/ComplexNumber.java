class ComplexNumber {

    final int realPart;
    final int imaginaryPart;

     ComplexNumber(int realPart, int imaginaryPart){
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    ComplexNumber(){
        this.realPart = 0;
        this.imaginaryPart = 0;
    }

    static String toString(ComplexNumber resultNumber)
    {
        return "( " + resultNumber.realPart + " . " + resultNumber.imaginaryPart + " )";
    }
}





