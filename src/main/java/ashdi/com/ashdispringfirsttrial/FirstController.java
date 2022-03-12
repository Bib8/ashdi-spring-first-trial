package ashdi.com.ashdispringfirsttrial;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping("calculator")
    public String calculator() {
        return "Добро пожаловать в калькулятор";
    }
    Arifmetics action = new Arifmetics();
    @GetMapping("plus")
    public String plus(@RequestParam int num1, @RequestParam int num2) {
        String res = num1 + " + " + num2 + " = " + action.sumResult(num1, num2);
        return res;
    }

    @GetMapping("minus")
    public String minus(@RequestParam int num1, @RequestParam int num2) {
        String res = num1 + " - " + num2 + " = " + action.minusResult(num1, num2);
        return res;
    }

    @GetMapping("multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2) {
        String res = num1 + " * " + num2 + " = " + action.multiplyResult(num1, num2);
        return res;
    }

    @GetMapping("divide")
    public String divide(@RequestParam int num1, @RequestParam int num2) {
        if (num2 == 0) {
            return "Делить на 0 нельзя";
        } else {
            String res = num1 + " : " + num2 + " = " + action.divideResult(num1, num2);
            return res;
        }
    }
}

