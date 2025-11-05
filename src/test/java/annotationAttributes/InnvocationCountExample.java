package annotationAttributes;

import org.testng.annotations.Test;

public class InnvocationCountExample {

    @Test(invocationCount = 5)
    public void innvocationExample()
    {
        System.out.println("Run the method multiple times");
    }
}
