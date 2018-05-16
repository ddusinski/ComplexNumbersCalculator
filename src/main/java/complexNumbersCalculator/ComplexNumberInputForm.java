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


    public int getOption() {
        return option;
    }

    public void setOption(int option) {
        this.option = option;
    }



}
