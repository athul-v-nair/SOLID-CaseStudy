package com.solid.services;
import com.solid.entity.Admin;
import com.solid.interfaces.*;

public class AdminAccountServices {
	public static void adminAccountServices() {
		UserActions userActions = new Admin();
		UserRegistrationService userRegistrationService = new UserRegistrationService(userActions);
		userRegistrationService.registerUser();
	}
}
