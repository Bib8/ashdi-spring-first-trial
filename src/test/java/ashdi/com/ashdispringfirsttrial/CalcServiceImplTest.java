package ashdi.com.ashdispringfirsttrial;

import org.junit.Assert;
import org.junit.Test;

import static ashdi.com.ashdispringfirsttrial.CalcServiceTestConst.*;

public class CalcServiceImplTest {
    private final CalcServiceImpl out = new CalcServiceImpl();


    @Test
    //expected R = 3, of sum num 2,1
    public void shouldCompareExpectedResRFndActualResATestSum(){
        Assert.assertEquals(THREE, out.sumResult(TWO, ONE));
    }
    //expected R = 0, of sum num -1,1
    public void shouldCompareExpectedResRFndActualResATestSumNegative(){
        Assert.assertEquals(ZERO, out.sumResult(NEGATIVE_ONE, ONE));
    }
    //expected R = 0, of sum num 1,1
    public void shouldCompareExpectedResRFndActualResADiff(){
        Assert.assertEquals(ZERO, out.minusResult(ONE, ONE));
    }
    //expected R = -2, of sum num -1,1
    public void shouldCompareExpectedResRFndActualResADiffNegative(){
        Assert.assertEquals(NEGATIVE_TWO, out.minusResult(NEGATIVE_ONE, ONE));
    }
    //expected R = 3, of multiplying, factor 2,1
    public void shouldCompareExpectedResRFndActualResAMultiply(){
        Assert.assertEquals(THREE, out.multiplyResult(TWO, ONE));
    }
    //expected R = 0, of multiplying, factor 2,0
    public void shouldCompareExpectedResRFndActualResAMultiplyZero(){
        Assert.assertEquals(ZERO, out.multiplyResult(TWO, ZERO));
    }
    //expected R = 1, of private, divider 3,3
    public void shouldCompareExpectedResRFndActualResAdivide() throws ZeroDivideException {
        Assert.assertEquals(THREE, out.divideResult(THREE, THREE));
    }
    //expected R = -1, of private, divider 3,-3
    public void shouldCompareExpectedResRFndActualResAdivideNegative() throws ZeroDivideException {
        Assert.assertEquals(THREE, out.divideResult(THREE, NEGATIVE_THREE));
    }
    //expected R = throw Exception private, divider 3,0
   public void shouldCompareExpectedResRFndActualResAdivideZeroException(){
       Assert.assertThrows(ZeroDivideException.class, () -> out.divideResult(THREE, ZERO));
    }


}
