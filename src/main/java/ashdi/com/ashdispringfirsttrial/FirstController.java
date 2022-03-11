package ashdi.com.ashdispringfirsttrial;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    private final CalcService calcService;

    public FirstController(CalcService calcService) {
        this.calcService = calcService;
    }


    @GetMapping("calculator")
    public String calculator() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("plus")
    public int plus(@RequestParam int num1, @RequestParam int num2) {
        return calcService.sumResult(num1, num2);
    }

    @GetMapping("minus")
    public int minus(@RequestParam int num1, @RequestParam int num2) {
        return calcService.minusResult(num1, num2);
    }

    @GetMapping("multiply")
    public int multiply(@RequestParam int num1, @RequestParam int num2) {
        return calcService.multiplyResult(num1, num2);
    }

    @GetMapping("divide")
    public String divide(@RequestParam int num1, @RequestParam int num2) throws ZeroDivideException {
        return calcService.divideResult(num1, num2);
    }
}

