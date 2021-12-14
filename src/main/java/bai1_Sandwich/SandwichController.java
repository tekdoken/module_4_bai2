package bai1_Sandwich;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static java.awt.Color.white;

@Controller
public class SandwichController {
    @GetMapping("/")
    public String show() {
        return "sandwich";
    }

    @PostMapping("/save")
    public String save(Model model, @RequestParam("condiment") String[] condiment) {
        model.addAttribute("condiment", condiment);
        return "sandwichRes";
    }
}
