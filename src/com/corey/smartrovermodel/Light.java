/**
 * 
 */
package com.corey.smartrovermodel;

/**
 * @author corey
 *
 */
public class Light extends Servo {

	private String maintenanceStatus;
	private String powerStatus;
	private String sequence;
	private String sleepTimer;

	
	
	public static void getFullSystemCheck() {
		System.out.println( "Light - FullSystemCheck OK");
	}
	public static void getMaintenanceStatus() {
		System.out.println( "Light - Status Updated");
	}		
	public static void lightOn() {
		System.out.println( "Light - Playing Sound");
	}	
	public static void lightOff() {
		System.out.println( "Buzzer - Sound Changed");
	}		
}
