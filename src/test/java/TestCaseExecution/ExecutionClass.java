package TestCaseExecution;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import BasePack.BaseClass;

public class ExecutionClass extends BaseClass {
	@Test
	public void execute() throws InterruptedException, IOException, AWTException {

		ScriptCoding s = new ScriptCoding();
		
		 s.login();

		 s.perminentRegistrationforoneperson();
	}
}
