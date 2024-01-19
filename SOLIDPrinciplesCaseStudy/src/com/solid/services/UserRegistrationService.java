package com.solid.services;

import com.solid.interfaces.UserActions;
//this user registration service can be changed to reset password or update user etc.
public class UserRegistrationService {
	 private UserActions userActions;
	 //dependency inversion
	 public UserRegistrationService(UserActions userActions) {
	     this.userActions = userActions;
	 }

	 public void registerUser() {
	     userActions.register();
	 }
}