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
		System.out.println( "Servo - Status Updated");
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
}
