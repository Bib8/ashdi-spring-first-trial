package ashdi.com.ashdispringfirsttrial;

public interface CalcService {
    int sumResult (int num1, int num2);
    int minusResult (int num1, int num2);
    int multiplyResult (int num1, int num2);
    int divideResult (int num1, int num2) throws ZeroDivideException;
}
