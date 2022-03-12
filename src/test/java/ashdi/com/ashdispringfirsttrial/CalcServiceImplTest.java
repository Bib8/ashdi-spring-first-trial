package ashdi.com.ashdispringfirsttrial;

import org.junit.Assert;
import org.junit.Test;

import static ashdi.com.ashdispringfirsttrial.CalcServiceTestConst.*;

public class CalcServiceImplTest {
    private final CalcServiceImpl out = new CalcServiceImpl();


    @Test
    //expected R = 3, of sum num 2,1
    public void shouldСompareExpectedResRFndActualResATestSum(){
        Assert.assertEquals(THREE, out.sumResult(TWO, ONE));
    }
    //expected R = 0, of sum num -1,1
    public void shouldСompareExpectedResRFndActualResATestSumNegative(){
        Assert.assertEquals(ZERO, out.sumResult(NEGATIVE_ONE, ONE));
    }
    //expected R = 0, of sum num 1,1
    public void shouldСompareExpectedResRFndActualResADiff(){
        Assert.assertEquals(ZERO, out.minusResult(ONE, ONE));
    }
    //expected R = -2, of sum num -1,1
    public void shouldСompareExpectedResRFndActualResADiffNegative(){
        Assert.assertEquals(NEGATIVE_TWO, out.minusResult(NEGATIVE_ONE, ONE));
    }
    //expected R = 3, of multiplying, factor 2,1
    public void shouldСompareExpectedResRFndActualResAMultiply(){
        Assert.assertEquals(THREE, out.multiplyResult(TWO, THREE));
    }
    //expected R = 0, of multiplying, factor 2,0
    public void shouldСompareExpectedResRFndActualResAMultiplyZero(){
        Assert.assertEquals(ZERO, out.multiplyResult(TWO, ZERO));
    }
    //expected R = 1, of private, divider 3,3
    public void shouldСompareExpectedResRFndActualResAdivide() throws ZeroDivideException {
        Assert.assertEquals(THREE, out.divideResult(THREE, THREE));
    }
    //expected R = -1, of private, divider 3,-3
    public void shouldСompareExpectedResRFndActualResAdivideNegative() throws ZeroDivideException {
        Assert.assertEquals(THREE, out.divideResult(THREE, NEGATIVE_THREE));
    }
    //expected R = throw Exception private, divider 3,0
   public void shouldСompareExpectedResRFndActualResAdivideZeroException(){
       Assert.assertThrows(ZeroDivideException.class, () -> out.divideResult(THREE, ZERO));
    }


}
