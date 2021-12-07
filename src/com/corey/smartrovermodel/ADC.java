/**
 * 
 */
package com.corey.smartrovermodel;

/**
 * @author corey
 *
 */
public class ADC {

	private String maintenanceStatus;
	private String powerStatus;

	
	
	public static void getFullSystemCheck() {
		System.out.println( "ADC - FullSystemCheck set to OK");
	}
	public static void getMaintenanceStatus() {
		System.out.println( "ADC - Maintenance Status set to XXX");
	}		
	public static void getPowerStatus() {
		System.out.println( "ADC - Power Status set to XXX");
	}	
	public static void updateMaintenanceStatus() {
		System.out.println( "ADC - Maintenance Status updated to XXX");
	}		
	public static void updatePowerStatus() {
		System.out.println( "ADC - Power Status updated to XXX");
	}	
	public static void powerOn() {
		System.out.println( "ADC - Power On");
	}	
	public static void powerOff() {
		System.out.println( "ADC - Power Off");
	}	
}