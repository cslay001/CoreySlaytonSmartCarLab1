/**
 * 
 */
package com.corey.smartrovermodel;

/**
 * @author corey
 *
 */
public class ECU extends ADC {

	private String maintenanceStatus;
	private String powerStatus;

	
	
	public static void getFullSystemCheck() {
		System.out.println( "ECU - FullSystemCheck set to OK");
	}
	public static void getMaintenanceStatus() {
		System.out.println( "ECU - Maintenance Status set to XXX");
	}		
	public static void getPowerStatus() {
		System.out.println( "ECU - Power Status set to XXX");
	}	
	public static void updateMaintenanceStatus() {
		System.out.println( "ECU - Maintenance Status updated to XXX");
	}		
	public static void updatePowerStatus() {
		System.out.println( "ECU - Power Status updated to XXX");
	}	
	public static void powerOn() {
		System.out.println( "ECU - Power On");
	}	
	public static void powerOff() {
		System.out.println( "ECU - Power Off");
	}	
}