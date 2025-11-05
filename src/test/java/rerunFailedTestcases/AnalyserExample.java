package rerunFailedTestcases;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class AnalyserExample implements IRetryAnalyzer {

    int startcount =0;
    int endcount = 5;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if(startcount < endcount)
        {
            startcount++;
            return true;
        }

        return false;
    }


}
