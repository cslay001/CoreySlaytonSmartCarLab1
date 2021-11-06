/**
 * 
 */
package com.corey.smartcarmodel;

/**
 * @author corey
 *
 */
public class DrivingAssembly extends SmartCar {
	private String status;
	
	public static void getSystemCheck() {
		System.out.println( "Driving Assembly - Check Ok");
	}	
	public static void move() {
		System.out.println( "Driving Assembly - Move");
	}		
	public static void stop() {
		System.out.println( "Driving Assembly - Stop");
	}		
	public static void idle() {
		System.out.println( "Driving Assembly - Idle");
	}	
	public static void updateStatus() {
		System.out.println( "Driving Assembly - Status Updated");
	}	
	
	
	
}
