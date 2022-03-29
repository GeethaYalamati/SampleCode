package MavenJavaProject.MavenJava;

import org.testng.annotations.Test;

public class LogInTest {
	@Test(groups= {"Regression"})
	public void userName() {
		System.out.println("userName");
	}
	@Test
	public void password() {
		System.out.println("password");
	}
}
