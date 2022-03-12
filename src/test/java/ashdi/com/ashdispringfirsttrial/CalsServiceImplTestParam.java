package ashdi.com.ashdispringfirsttrial;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;
import static ashdi.com.ashdispringfirsttrial.CalcServiceTestConst.*;

public class CalsServiceImplTestParam {
    private CalcServiceImpl out = new CalcServiceImpl();

    private static Stream<Arguments> provideArgumentsTest(){
        return Stream.of(
                Arguments.of(ONE, TWO),
                Arguments.of(TWO, NEGATIVE_ONE),
                Arguments.of(ZERO, THREE),
                Arguments.of(NEGATIVE_ONE, NEGATIVE_TWO),
                Arguments.of(ZERO, NEGATIVE_THREE)
        );
    }
    @MethodSource("provideArgumentsTest")
    @ParameterizedTest
    public void shouldHaveResultRForSumNum(int num1, int num2) {
        Assert.assertEquals(num1 + num2, out.sumResult(num1, num2));
    }
    @MethodSource("provideArgumentsTest")
    @ParameterizedTest
    public void shouldHaveResultRForMinusNum(int num1, int num2) {
        Assert.assertEquals(num1 - num2, out.minusResult(num1, num2));
    }
   @MethodSource("provideArgumentsTest")
    @ParameterizedTest
    public void shouldHaveResultRForMultiplyNum(int num1, int num2) {
        Assert.assertEquals(num1 * num2, out.multiplyResult(num1, num2));
    }
   @MethodSource("provideArgumentsTest")
    @ParameterizedTest
    public void shouldHaveResultRForDivideNum(int num1, int num2) throws ZeroDivideException {
        Assert.assertEquals(num1 / num2, out.divideResult(num1, num2));
    }


}
