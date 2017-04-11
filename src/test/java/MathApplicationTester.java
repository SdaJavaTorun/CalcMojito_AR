import static org.mockito.Mockito.when;

import com.sdajava.mocking.app.MathApplication;
import com.sdajava.mocking.services.CalculatorService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

// @RunWith attaches a runner with the test class to initialize the test data
@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTester {

    @Mock
    CalculatorService calcService;

    @InjectMocks
    MathApplication mathApplication = new MathApplication();

    @Test
    public void testAdd(){
        //add the behavior of calc service to add two numbers
        when(calcService.add(10.0,20.0)).thenReturn(30.00);

        //test the add functionality
        Assert.assertEquals(mathApplication.add(10.0, 20.0),30.0,0);
    }
}
