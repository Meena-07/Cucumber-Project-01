package org.stepdefinition;

import java.net.MalformedURLException;

import org.base.BaseClass;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.Before;

public class HooksStepDef extends BaseClass {
	
	@Before
	public void setUp() throws MalformedURLException
	{
		setWebApp();

	}

}
