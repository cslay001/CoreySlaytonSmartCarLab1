/**
 * 
 */
package com.corey.smartrovermodel;

/**
 * @author corey
 *
 */
public class SmartRoverApp extends RaspberryPi {

	private String maintenanceStatus;
	private String powerStatus;

	
	
	public static void getFullSystemCheck() {
		System.out.println( "SmartRoverApp - FullSystemCheck set to OK");
	}
	public static void getMaintenanceStatus() {
		System.out.println( "SmartRoverApp - Maintenance Status set to XXX");
	}		
	public static void getPowerStatus() {
		System.out.println( "SmartRoverApp - Power Status set to XXX");
	}	
	public static void updateMaintenanceStatus() {
		System.out.println( "SmartRoverApp - Maintenance Status updated to XXX");
	}		
	public static void updatePowerStatus() {
		System.out.println( "SmartRoverApp - Power Status updated to XXX");
	}	
	public static void powerOn() {
		System.out.println( "SmartRoverApp - Power On");
	}	
	public static void powerOff() {
		System.out.println( "SmartRoverApp - Power Off");
	}	
}