/**
 * 
 */
package com.corey.smartrovermodel;

/**
 * @author corey
 *
 */
public class Window {

	private String maintenanceStatus;
	
	public static void getFullSystemCheck() {
		System.out.println( "Window - FullSystemCheck OK");
	}
	public static void getMaintenanceStatus() {
		System.out.println( "Window - Status Updated");
	}		
	public static void openWindow() {
		System.out.println( "Window - Open");
	}	
	public static void closeWindow() {
		System.out.println( "Window - Close");
	}		
}
