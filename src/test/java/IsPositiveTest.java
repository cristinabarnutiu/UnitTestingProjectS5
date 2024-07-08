import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class IsPositiveTest {


    @Test
    public void testCheckIfNumberIsPositive(){
        IsPositive isPositive = new IsPositive();
        boolean result = isPositive.checkIfNumberIsPositive(6);
        Assertions.assertTrue(result);

    }

    @Disabled
    @Test
    public void testCheckIfNumberIsNegative(){
        IsPositive isPositive = new IsPositive();
        boolean result = isPositive.checkIfNumberIsPositive(-78);
        Assertions.assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(ints = {3,6,90,800,67,63})
    public void testIsPositiveParameterized(int number){
        IsPositive isPositive = new IsPositive();
        boolean result = isPositive.checkIfNumberIsPositive(number);
        Assertions.assertTrue(result);
    }


}
