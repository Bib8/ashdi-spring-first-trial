package ashdi.com.ashdispringfirsttrial;

import org.springframework.stereotype.Service;
@Service
public class CalcServiceImpl implements CalcService{



    @Override
    public int sumResult(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int minusResult(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiplyResult(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divideResult(int num1, int num2) throws ZeroDivideException {
        if (num2 == 0){
                throw new ZeroDivideException("Exception: divide by zero.");
        } else return num1 / num2;
    }




}
