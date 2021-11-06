/**
 * 
 */
package com.corey.smartcarmodel;

/**
 * @author corey
 *
 */
public class Tire extends DrivingAssembly {
	private String type;
	private String status;
	
	public static void getSystemCheck() {
		System.out.println( "Tire - Check Ok");
	}
	public static void updateStatus() {
		System.out.println( "Tire - Status Updated");
	}
	public static void checkAirPressure() {
		System.out.println( "Tire - Status Updated");
	}
	
	
	
}
