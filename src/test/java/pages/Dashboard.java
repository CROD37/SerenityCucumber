package pages;

import net.thucydides.core.annotations.Step;

public class Dashboard {
	
	OrangeHRMDashboard dashBoard;

	@Step
	public void verifyAdmin() {
		dashBoard.loginVerified();
	}
}
