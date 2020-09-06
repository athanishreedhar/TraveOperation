package UtilityResources;

public class ExtentReportUtility  {
	
	public void onStart() {
		System.out.println("Execute some code on start");
	}

	public void onTestpass() {
		System.out.println("Test pass code to be written");
	}
	
	public void Testfailure() {
		System.out.println("Test should be failed ");
	}
	public void onSkip() {
		System.out.println("some code on test skip");
	}
}
