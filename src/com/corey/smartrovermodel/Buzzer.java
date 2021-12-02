/**
 * 
 */
package com.corey.smartrovermodel;

/**
 * @author corey
 *
 */
public class Buzzer {

	private String maintenanceStatus;
	private String powerStatus;
	private String sound;
	private String volume;
	private String buzzerPin;

	
	
	public static void getFullSystemCheck() {
		System.out.println( "Buzzer - FullSystemCheck OK");
	}
	public static void getMaintenanceStatus() {
		System.out.println( "Buzzer - Status Updated");
	}		
	public static void playSound() {
		System.out.println( "Buzzer - Playing Sound");
	}	
	public static void changeSound() {
		System.out.println( "Buzzer - Sound Changed");
	}		
	public static void changeVolume() {
		System.out.println( "Buzzer - Volume Changed");
	}	
}
