package MavenJavaProject.MavenJava;

import org.testng.annotations.Test;

public class EnterDetailsTest {
	@Test(groups= {"Regression"})
	public void sendName() {
		System.out.println("sendName");
	}
	@Test
	public void sendPassword() {
		System.out.println("sendPassword");
	}
}
