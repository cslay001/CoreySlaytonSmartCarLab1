/**
 * 
 */
package com.corey.smartrovermodel;

/**
 * @author corey
 *
 */
public class User {

	private String username;
	private String password;

	
	
	public static void getUserName() {
		System.out.println( "User - Username set to XXX");
	}
	public static void getPassword() {
		System.out.println( "User - Password set to XXX");
	}		
	public static void updateUserName() {
		System.out.println( "User - Username updated to XXX");
	}	
	public static void updatePassword() {
		System.out.println( "User - Password updated to XXX");
	}		
	public static void logOn() {
		System.out.println( "User - Logged On");
	}	
	public static void logOff() {
		System.out.println( "User - Logged Off");
	}	
}