package MavenJavaProject.MavenJava;

import org.testng.annotations.Test;

public class LogOutTest {
	@Test(groups= {"Regression"})
	public void logoutUser() {
		System.out.println("logoutUser");
	}
	@Test
	public void signoutUser() {
		System.out.println("signoutUser");
	}
}
