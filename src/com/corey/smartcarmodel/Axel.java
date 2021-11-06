/**
 * 
 */
package com.corey.smartcarmodel;

/**
 * @author corey
 *
 */
public class Axel extends DrivingAssembly {
	private String type;
	private String status;
	
	public static void getSystemCheck() {
		System.out.println( "Axel - Check Ok");
	}
	public static void updateStatus() {
		System.out.println( "Axel - Status Updated");
	}
	public static void turn() {
		System.out.println( "Axel - Turning");
	}
	
	
	
	
}
