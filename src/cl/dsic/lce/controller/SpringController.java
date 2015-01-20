package cl.dsic.lce.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class SpringController {
 
    @RequestMapping("/lce1")
    public ModelAndView lce() {
 
        String message = "Spring MVC lce";
        return new ModelAndView("lce1", "message", message);
    }
 
}