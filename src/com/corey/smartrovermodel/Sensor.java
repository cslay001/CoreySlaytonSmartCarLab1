/**
 * 
 */
package com.corey.smartrovermodel;

/**
 * @author corey
 *
 */
public class Sensor extends Servo {

	private String maintenanceStatus;
	private String powerStatus;
	
	
	public static void getFullSystemCheck() {
		System.out.println( "Sensor - FullSystemCheck OK");
	}
	public static void getMaintenanceStatus() {
		System.out.println( "Sensor - Status Updated");
	}		
	public static void powerOn() {
		System.out.println( "Sensor - Power On");
	}	
	public static void powerOff() {
		System.out.println( "Sensor - Power Off");
	}	
}
