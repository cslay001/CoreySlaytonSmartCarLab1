/**
 * 
 */
package com.corey.smartrovermodel;

/**
 * @author corey
 *
 */
public class Sensor {

	private String maintenanceStatus;
	private String powerStatus;
	
	
	public static void getFullSystemCheck() {
		System.out.println( "Sensor - FullSystemCheck OK");
	}
	public static void getMaintenanceStatus() {
		System.out.println( "Sensor - Status Updated");
	}		
}
