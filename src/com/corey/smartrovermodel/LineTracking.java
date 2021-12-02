/**
 * 
 */
package com.corey.smartrovermodel;

/**
 * @author corey
 *
 */
public class LineTracking {

	private String maintenanceStatus;
	private String powerStatus;
	private String linePosition;

	
	public static void getFullSystemCheck() {
		System.out.println( "LineTracking - FullSystemCheck OK");
	}
	public static void getMaintenanceStatus() {
		System.out.println( "LineTracking - Status Updated");
	}		
	public static void getLinePosition() {
		System.out.println( "LineTracking - Line Position Detected");
	}		
}
