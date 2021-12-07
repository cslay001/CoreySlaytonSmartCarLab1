/**
 * 
 */
package com.corey.smartrovermodel;

/**
 * @author corey
 *
 */
public class Servo {

	private String maintenanceStatus;
	private String powerStatus;
	private String current_position;
	private String home_position;

	
	public static void getFullSystemCheck() {
		System.out.println( "Servo - FullSystemCheck OK");
	}
	public static void getMaintenanceStatus() {
		System.out.println( "Servo - Maintenance Status OK");
	}		
	public static void getHome_Position() {
		System.out.println( "Servo - Home Position set at XXX");
	}		
	public static void getCurrent_Position() {
		System.out.println( "Servo - Current Position set at XXX");
	}	
	public static void lookUp() {
		System.out.println( "Servo - Looking Up");
	}		
	public static void lookDown() {
		System.out.println( "Servo - Looking Down");
	}		
	public static void lookLeft() {
		System.out.println( "Servo - Looking Left");
	}		
	public static void lookRight() {
		System.out.println( "Servo - Looking Right");
	}		
	public static void powerOn() {
		System.out.println( "Servo - Power On");
	}		
	public static void powerOff() {
		System.out.println( "Servo - Power Off");
	}		
	public static void updateMaintenanceStatus() {
		System.out.println( "Servo - Maintenance Status updated to XXX");
	}
	public static void updatePowerStatus() {
		System.out.println( "Servo - Power Status updated to XXX");
	}
	public static void updateHomePosition() {
		System.out.println( "Servo - Home Position updated to XXX");
	}
	public static void updateCurrentPosition() {
		System.out.println( "Servo - Current Position updated to XXX");
	}
}
