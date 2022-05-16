package com.TDBank.Test.QA;

import org.testng.annotations.Test;

import banktd.test.BaseClass;
import objects.LandingPage;

@SuppressWarnings("unused")
public class LandingPageTest extends BaseClass {

	@Test
	public void signupPage() {
		landingPage.clickSignupButton(commonActions);
		
	}
}

