/**
 * 
 */
package com.corey.smartrovermodel;

/**
 * @author corey
 *
 */
public class Buzzer extends Servo {

	private String maintenanceStatus;
	private String powerStatus;
	private String sound;
	private String volume;
	private String buzzerPin;

	
	
	public static void getFullSystemCheck() {
		System.out.println( "Buzzer - FullSystemCheck OK");
	}
	public static void getMaintenanceStatus() {
		System.out.println( "Buzzer - Maintenance Status set to XXX");
	}
	public static void getPowerStatus() {
		System.out.println( "Buzzer - Power Status set to XXX");
	}	
	public static void getSound() {
		System.out.println( "Buzzer - Sound set to XXX");
	}	
	public static void getVolume() {
		System.out.println( "Buzzer - Volume set to XXX");
	}	
	public static void getBuzzerPin() {
		System.out.println( "Buzzer - Buzzer Pin set to XXX");
	}	
	public static void playSound() {
		System.out.println( "Buzzer - Playing Sound XXX");
	}	
	public static void changeSound() {
		System.out.println( "Buzzer - Sound Changed to XXX");
	}		
	public static void changeVolume() {
		System.out.println( "Buzzer - Volume Changed to XXX");
	}	
	public static void updateMaintenanceStatus() {
		System.out.println( "Buzzer - Maintenance Status updated to XXX");
	}
	public static void updatePowerStatus() {
		System.out.println( "Buzzer - Power Status updated to XXX");
	}
	public static void updateBuzzerPin() {
		System.out.println( "Buzzer - BuzzerPin updated to XXX");
	}
	public static void powerOn() {
		System.out.println( "Buzzer - Power On");
	}	
	public static void powerOff() {
		System.out.println( "Buzzer - Power Off");
	}	
}
