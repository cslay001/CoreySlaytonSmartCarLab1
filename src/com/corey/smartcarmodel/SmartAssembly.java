/**
 * 
 */
package com.corey.smartcarmodel;

/**
 * @author corey
 *
 */
public class SmartAssembly extends SmartCar {
	private String status;
	private String location;
	
	public static void getSystemCheck() {
		System.out.println( "Smart Assembly - Check Ok");
	}	
	public static void updateStatus() {
		System.out.println( "Smart Assembly - Status Updated");
	}	
	public static void getLocation() {
		System.out.println( "Smart Assembly - Location Found");
	}		
	public static void updateLocation() {
		System.out.println( "Smart Assembly - Location Updated");
	}
	
	
	
	
}
