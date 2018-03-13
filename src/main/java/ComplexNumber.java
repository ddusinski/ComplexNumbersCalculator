class ComplexNumber {

    int realPart = 0;
    int imaginaryPart = 0;

    private static int tempRealPart;
    private static int tempImaginaryPart;

     ComplexNumber(int realPart, int imaginaryPart){
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }


    ComplexNumber(){
        this.realPart = 0;
        this.imaginaryPart = 0;
    }

    static ComplexNumber ComplexSum(ComplexNumber firstComplexNumber, ComplexNumber secondComplexNumber)
    {
        return new ComplexNumber(firstComplexNumber.realPart+secondComplexNumber.realPart,
                firstComplexNumber.imaginaryPart+secondComplexNumber.imaginaryPart);
    }

    static ComplexNumber ComplexSubtraction(ComplexNumber A, ComplexNumber B){

        return new ComplexNumber(A.realPart-B.realPart, A.imaginaryPart-B.imaginaryPart);
    }

    static ComplexNumber ComplexMultiplication(ComplexNumber A, ComplexNumber B)
    {
        tempRealPart=A.realPart*B.realPart-A.imaginaryPart*B.imaginaryPart;
        tempImaginaryPart=A.imaginaryPart*B.realPart+A.realPart*B.imaginaryPart;
        return new ComplexNumber(tempRealPart,tempImaginaryPart);
    }


    static ComplexNumber CompletDivision(ComplexNumber A, ComplexNumber B){
        tempRealPart=A.realPart*B.realPart+A.imaginaryPart*B.imaginaryPart/(B.realPart^2+B.imaginaryPart^2);
        tempImaginaryPart=A.imaginaryPart*B.realPart-A.realPart*B.imaginaryPart/(B.realPart^2+B.imaginaryPart^2);
        return new ComplexNumber(tempRealPart,tempImaginaryPart);
    }
}
