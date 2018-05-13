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

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/results").setViewName("results");
    }

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("CplxNumberInputForm", new ComplexNumberInputForm());
        return "form_complex";

    }

    @PostMapping("/")
    public String checkComplexNumberInputForm(@Valid @ModelAttribute("CplxNumberInputForm") ComplexNumberInputForm ddd, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "form_complex";
        }

        return "results";
    }
}
