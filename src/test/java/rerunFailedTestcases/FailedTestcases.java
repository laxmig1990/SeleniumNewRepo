package rerunFailedTestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedTestcases {

    @Test
    //@Test(retryAnalyzer = AnalyserExample.class)
    public void First()
    {
        Assert.assertTrue(false);
        System.out.println("First Testcases");
    }
    @Test
  //  @Test(retryAnalyzer = AnalyserExample.class)
    public void Second()
    {
        System.out.println("Second Testcases");
    }
    @Test
   // @Test(retryAnalyzer = AnalyserExample.class)
    public void Third()
    {
        Assert.assertTrue(false);
        System.out.println("Third Testcases");
    }
    @Test
   // @Test(retryAnalyzer = AnalyserExample.class)
    public void Fouth()
    {
        System.out.println("Fourth Testcases");
    }

}
