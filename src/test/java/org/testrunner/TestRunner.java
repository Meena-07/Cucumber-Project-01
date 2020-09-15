package org.testrunner;

import java.io.IOException;

import org.base.BaseClass;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features",glue="org.stepdefinition",tags= {"@Exe2"},
plugin= {"json:target/CucumberTestReport.json","html:target"})
public class TestRunner {
	@AfterClass
	public static void closeBrow() throws IOException
	{
		//JVMReport.generateJVMReport("G:\\eclipse works\\AdactinApp\\src\\test\\resources\\Reports\\output.json");
		BaseClass.quitBrowser();
	}

}
