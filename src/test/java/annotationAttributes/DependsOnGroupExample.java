package annotationAttributes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroupExample {

    @Test(description = "Verify that the method will be failed",groups = "smoke")
    public void First()
    {
        //Assert.assertTrue(false);
        System.out.println("First Example");
    }
    @Test(description = "This method is dependent of above First Method", dependsOnGroups = {"smoke"})
    public void Second()
    {
        System.out.println("2nd Example");
    }
    @Test(enabled = false)
    public void enableExample()
    {
        System.out.println("This will not be executed");
    }


}
