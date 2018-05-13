package complexNumbersCalculator;

import javax.validation.constraints.NotNull;

public class ComplexNumberInputForm {

    @NotNull
    private int firstComplexNumberRealPart;
    @NotNull
    private int firstComplexNumberImaginaryPart;
    @NotNull
    private int secondComplexNumberRealPart;
    @NotNull
    private int secondComplexNumberImaginaryPart;
    @NotNull
    private int option;

    private int resultComplexNumberRealPart;
    private int resultComplexNumberImaginaryPart;

    public int getFirstComplexNumberImaginaryPart() {
        return firstComplexNumberImaginaryPart;
    }

    public int getFirstComplexNumberRealPart() {
        return firstComplexNumberRealPart;
    }

    public int getSecondComplexNumberImaginaryPart() {
        return secondComplexNumberImaginaryPart;
    }

    public int getSecondComplexNumberRealPart() {
        return secondComplexNumberRealPart;
    }

    public void setSecondComplexNumberRealPart(int secondComplexNumberRealPart) {
        this.secondComplexNumberRealPart = secondComplexNumberRealPart;
    }

    public void setFirstComplexNumberRealPart(int firstComplexNumberRealPart) {
        this.firstComplexNumberRealPart = firstComplexNumberRealPart;
    }

    public void setSecondComplexNumberImaginaryPart(int secondComplexNumberImaginaryPart) {
        this.secondComplexNumberImaginaryPart = secondComplexNumberImaginaryPart;
    }

    public void setFirstComplexNumberImaginaryPart(int firstComplexNumberImaginaryPart) {
        this.firstComplexNumberImaginaryPart = firstComplexNumberImaginaryPart;
    }

    public void setResultComplexNumberImaginaryPart(int resultComplexNumberImaginaryPart) {
        this.resultComplexNumberImaginaryPart = resultComplexNumberImaginaryPart;
    }

    public void setResultComplexNumberRealPart(int resultComplexNumberRealPart) {
        this.resultComplexNumberRealPart = resultComplexNumberRealPart;
    }

    public int getOption() {
        return option;
    }

    public void setOption(int option) {
        this.option = option;
    }

    public void computeResult()
    {
        ComplexNumber firstComplexNumber =new ComplexNumber(this.firstComplexNumberRealPart,this.firstComplexNumberImaginaryPart);
        ComplexNumber secondComplexNumber =new ComplexNumber(this.secondComplexNumberRealPart,this.secondComplexNumberImaginaryPart);

        Calculator complexNumberCalculator =new Calculator();
        ComplexNumber resultComplexNumber = complexNumberCalculator.calculate(firstComplexNumber,secondComplexNumber, this.option);
        this.resultComplexNumberImaginaryPart=resultComplexNumber.imaginaryPart;
        this.resultComplexNumberRealPart=resultComplexNumber.realPart;

    }

    public int getResultComplexNumberImaginaryPart() {
        computeResult();
        return resultComplexNumberImaginaryPart;
    }

    public int getResultComplexNumberRealPart() {
        computeResult();
        return resultComplexNumberRealPart;
    }
}
