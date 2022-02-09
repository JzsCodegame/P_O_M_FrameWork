package ListenersPack;

import org.testng.IRetryAnalyzer;

import org.testng.ITestResult;

public class RetryFailedTestCases implements IRetryAnalyzer {

	    private int retryCnt = 0;

	    //You can mention maxRetryCnt (Maximium Retry Count) as per your requirement. This example uses 2 which means that for any failed testcases it retires the run twice.

	    private int maxRetryCnt = 2;

	    //This method will be called everytime a test fails. It will return TRUE if a test fails and need to be retried, else it returns FALSE

	    public boolean retry(ITestResult result) {

	        if (retryCnt < maxRetryCnt) {

	            System.out.println("Retryiny" + result.getName() + "again and the count is " + (retryCnt+1));

	            retryCnt++;

	            return true;

	        }

	        return false;

	    }

   }
