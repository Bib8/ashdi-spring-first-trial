package ashdi.com.ashdispringfirsttrial;

import org.springframework.stereotype.Service;

@Service
public class Arifmetics {
    public final int sumResult (int a,int b){
        return a + b;
    }
    public final int minusResult (int a, int b){
        return a - b;
    }
    public final int multiplyResult (int a, int b){
        return a * b;
    }
    public final int divideResult (int a, int b){
        return a / b;
    }
}
