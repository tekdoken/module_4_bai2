package bai2_caculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CaculatorController {
    @GetMapping("/caculator")
    public String ca() {
        return "caculator";
    }

    @PostMapping("/Res")
    public String res(Model model, @RequestParam int a, int b, String pt) {
        int res = 0;
        switch (pt) {
            case "+":
                res = a + b;
                model.addAttribute("res", res);
                return "cacualtorRes";
            case "-":
                res = a - b;
                model.addAttribute("res", res);
                return "cacualtorRes";
            case "*":
                res = a * b;
                model.addAttribute("res", res);
                return "cacualtorRes";
            case "/":
                res = a / b;
                model.addAttribute("res", res);
                return "cacualtorRes";
        }
        return "cacualtorRes";

    }

}

