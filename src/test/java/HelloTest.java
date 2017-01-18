import static org.junit.Assert.*;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(DataProviderRunner.class)
public class HelloTest {

    @Test
    @UseDataProvider("dataProviderGreeting")
    public void greeting(String name, String expected) throws Exception {
        assertTrue(Hello.greeting(name).equals(expected));
    }

    @DataProvider
    public static Object[][] dataProviderGreeting() {
        return new Object[][] {
                { "Test", "Hello, Test!" }
        };
    }
}