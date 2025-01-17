/**
 * 
 */
package com.corey.smartrovermodel;

/**
 * @author corey
 *
 */
public class Ultrasonic extends Sensor {

	private String maintenanceStatus;
	private String powerStatus;
	private String safeDistance;

	
	public static void getFullSystemCheck() {
		System.out.println( "Ultrasonic - FullSystemCheck OK");
	}
	public static void getMaintenanceStatus() {
		System.out.println( "Ultrasonic - Status Updated");
	}		
	public static void getObstacleDistance() {
		System.out.println( "Ultrasonic - Obstacle Detected");
	}		
	public static void powerOn() {
		System.out.println( "Ultrasonic - Power On");
	}	
	public static void powerOff() {
		System.out.println( "Ultrasonic - Power Off");
	}	
}
