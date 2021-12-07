/**
 * 
 */
package com.corey.smartrovermodel;

/**
 * @author corey
 *
 */
public class SmartRover {

	private String model;
	private String location;
	private String powerStatus;
	private String maintenanceStatus;
	private String softwareVersion;
	private String systemCurrent;
	private String systemBackup;
	
	public static void getFullSystemCheck() {
		System.out.println( "SmartRover - FullSystemCheck OK");
	}
	public static void getStatus() {
		System.out.println( "SmartRover - Status Updated");
	}		
	public static void getLocation() {
		System.out.println( "SmartRover - Location Acquired");
	}	
	public static void powerOn() {
		System.out.println( "SmartRover - Power On");
	}	
	public static void powerOff() {
		System.out.println( "SmartRover - Power Off");
	}	
	public static void getModel() {
		System.out.println( "SmartRover - Model XXX");
	}
	public static void getPowerStatus() {
		System.out.println( "SmartRover - Power XXX");
	}
	public static void getSystemCurrent() {
		System.out.println( "SmartRover - SystemCurrent located at XXX");
	}	
	public static void getSystemBackup() {
		System.out.println( "SmartRover - SystemBackup located at XXX");
	}	
	public static void updateLocation() {
		System.out.println( "SmartRover - Location Updated");
	}		
	public static void updatePowerStatus() {
		System.out.println( "SmartRover - PowerStatus Updated");
	}	
	public static void downloadSystemUpdate() {
		System.out.println( "SmartRover - SystemUpdate Downloading from XXX");
	}
	public static void replaceSystemBackup() {
		System.out.println( "SmartRover - SystemBackUp Replaced by SystemCurrent");
	}
	public static void replaceSystemCurrent() {
		System.out.println( "SmartRover - SystemCurrent Replaced by SystemBackup");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
