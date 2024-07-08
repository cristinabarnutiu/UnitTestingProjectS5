import org.junit.jupiter.api.*;

public class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    public void beforeEach(){
        System.out.println("Before Each");
        calculator = new Calculator();
    }

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Before All");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("After Each");
    }
    @AfterAll
    public static void afterAll(){
        System.out.println("After All");
    }



    @Test
    public void addTest(){
        //Calculator calculator = new Calculator();
        int result = calculator.add(3,4);
        Assertions.assertEquals(7,result);
    }

    @Test
    public void diffTest(){
        //Calculator calculator = new Calculator();
        int result = calculator.diff(9,2);
        Assertions.assertEquals(7,result,"rezultatul nu este cel asteptat");

    }
}
