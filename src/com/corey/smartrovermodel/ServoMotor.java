/**
 * 
 */
package com.corey.smartrovermodel;

/**
 * @author corey
 *
 */
public class ServoMotor extends Motor {

	private String maintenanceStatus;
	private String powerStatus;
	private String servoPosition;

	
	
	public static void getFullSystemCheck() {
		System.out.println( "ServoMotor - FullSystemCheck set to OK");
	}
	public static void getMaintenanceStatus() {
		System.out.println( "ServoMotor - Maintenance Status set to XXX");
	}		
	public static void getPowerStatus() {
		System.out.println( "ServoMotor - Power Status set to XXX");
	}	
	public static void getServoPosition() {
		System.out.println( "ServoMotor - Servo Position set to XXX");
	}	
	public static void updateMaintenanceStatus() {
		System.out.println( "ServoMotor - Maintenance Status updated to XXX");
	}		
	public static void updatePowerStatus() {
		System.out.println( "ServoMotor - Power Status updated to XXX");
	}	
	public static void updateServoPosition() {
		System.out.println( "ServoMotor - Servo Position updated to XXX");
	}	
	public static void powerOn() {
		System.out.println( "ServoMotor - Power On");
	}	
	public static void powerOff() {
		System.out.println( "ServoMotor - Power Off");
	}	
}