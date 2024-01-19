package com.solid.interfaces;

public interface UserActions {
	public default void register() {
		System.out.println("User registered");
	}
}
