/**
 * 
 */
package com.corey.smartrovermodel;

/**
 * @author corey
 *
 */
public class Sound extends Buzzer {

	private String maintenanceStatus;
	private String fileLocation;
	private String fileName;
	private String fileSize;
	private String soundSelected;

	
	
	public static void getFullSystemCheck() {
		System.out.println( "Sound - FullSystemCheck set to OK");
	}
	public static void getMaintenanceStatus() {
		System.out.println( "Sound - Maintenance Status set to XXX");
	}		
	public static void saveSound() {
		System.out.println( "Sound - Sound saved to XXX");
	}	
	public static void deleteSound() {
		System.out.println( "Sound - Sound deleted from XXX");
	}
	public static void selectSound() {
		System.out.println( "Sound - Sound selected from XXX");
	}
	public static void deselectSound() {
		System.out.println( "Sound - Sound deselected from XXX");
	}
	public static void updateMaintenanceStatus() {
		System.out.println( "Sound - Maintenance Status updated to XXX");
	}		
	public static void updatePowerStatus() {
		System.out.println( "Sound - Power Status updated to XXX");
	}	
}