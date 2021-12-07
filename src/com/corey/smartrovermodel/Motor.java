/**
 * 
 */
package com.corey.smartrovermodel;

/**
 * @author corey
 *
 */
public class Motor {

	private String maintenanceStatus;
	private String powerStatus;

	
	
	public static void getFullSystemCheck() {
		System.out.println( "Motor - FullSystemCheck OK");
	}
	public static void getMaintenanceStatus() {
		System.out.println( "Motor - Status Updated");
	}		
	public static void goForward() {
		System.out.println( "Motor - Moving Forward");
	}	
	public static void goBackward() {
		System.out.println( "Motor - Moving Backward");
	}		
	public static void goLeft() {
		System.out.println( "Motor - Moving Left");
	}	
	public static void goRight() {
		System.out.println( "Motor - Moving Right");
	}
	public static void powerOn() {
		System.out.println( "Motor - Power On");
	}	
	public static void powerOff() {
		System.out.println( "Motor - Power Off");
	}	
}
