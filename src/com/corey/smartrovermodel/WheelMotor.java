/**
 * 
 */
package com.corey.smartrovermodel;

/**
 * @author corey
 *
 */
public class WheelMotor {

	private String maintenanceStatus;
	private String powerStatus;
	private String wheelPosition;

	
	
	public static void getFullSystemCheck() {
		System.out.println( "WheelMotor - FullSystemCheck set to OK");
	}
	public static void getMaintenanceStatus() {
		System.out.println( "WheelMotor - Maintenance Status set to XXX");
	}		
	public static void getPowerStatus() {
		System.out.println( "WheelMotor - Power Status set to XXX");
	}	
	public static void getWheelPosition() {
		System.out.println( "WheelMotor - Wheel Position set to XXX");
	}	
	public static void updateMaintenanceStatus() {
		System.out.println( "WheelMotor - Maintenance Status updated to XXX");
	}		
	public static void updatePowerStatus() {
		System.out.println( "WheelMotor - Power Status updated to XXX");
	}	
	public static void updateWheelPosition() {
		System.out.println( "WheelMotor - Wheel Position updated to XXX");
	}	
	public static void powerOn() {
		System.out.println( "WheelMotor - Power On");
	}	
	public static void powerOff() {
		System.out.println( "WheelMotor - Power Off");
	}	
	public static void goForward() {
		System.out.println( "WheelMotor - moved Forward");
	}	
	public static void goBackward() {
		System.out.println( "WheelMotor - moved Backward");
	}	
	public static void goStop() {
		System.out.println( "WheelMotor - Stopped");
	}
}