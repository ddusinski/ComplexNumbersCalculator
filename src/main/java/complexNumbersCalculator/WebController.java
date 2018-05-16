package complexNumbersCalculator;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import org.springframework.ui.Model;


@Controller
public class WebController implements WebMvcConfigurer {

   // @Override
   // public void addViewControllers(ViewControllerRegistry registry) {
   //     registry.addViewController("/results").setViewName("results");
   // }

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("CplxNumberInputForm", new ComplexNumberInputForm());
        return "form_complex";

    }

    public ComplexNumber computeResult(ComplexNumber firstComplexNumber, ComplexNumber secondComplexNumber, int option)
    {

        Calculator complexNumberCalculator =new Calculator();
        return complexNumberCalculator.calculate(firstComplexNumber,secondComplexNumber, option);

    }


    @PostMapping("/")
    public String checkComplexNumberInputForm(Model model, @Valid @ModelAttribute("CplxNumberInputForm") ComplexNumberInputForm ddd, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "form_complex";
        }
        ComplexNumber cmplNumberA= new ComplexNumber(ddd.getFirstComplexNumberRealPart(),ddd.getFirstComplexNumberImaginaryPart());
        ComplexNumber cmplNumberB = new ComplexNumber(ddd.getSecondComplexNumberRealPart(),ddd.getSecondComplexNumberImaginaryPart());

        model.addAttribute("results", computeResult(cmplNumberA,cmplNumberB,ddd.getOption()));
        return "results";
    }




}
