package learnTestNG;

import org.testng.annotations.Test;

public class AnnotationsAndArguments {
	@Test
	public void login() {
			System.out.println("login");
			
		}
	@Test(priority = 2, invocationCount = 4)
	public void logout() {
		System.out.println("logout");

		}

	@Test(priority = 3, enabled = false)
	public void home() {
		System.out.println("home");

	}

	public void product() {
		System.out.println("product");

	}

	public void addToCart() {
		System.out.println("addToCart");

	}

	public void payment() {
		System.out.println("payment");

	}

	}



