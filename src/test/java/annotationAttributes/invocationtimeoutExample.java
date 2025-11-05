package annotationAttributes;

import org.testng.annotations.Test;

public class invocationtimeoutExample {

    @Test(invocationCount = 100, invocationTimeOut =100)
    public void timeout()
    {
        System.out.println("Repeating the method");
    }
}
