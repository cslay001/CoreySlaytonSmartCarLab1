/**
 * 
 */
package com.corey.smartrovermodel;

/**
 * @author corey
 *
 */
public class RaspberryPi extends ECU {

	private String model;
	private String location;
	private String powerStatus;
	private String maintenanceStatus;
	
	public static void getFullSystemCheck() {
		System.out.println( "Raspberry Pi - FullSystemCheck OK");
	}
	public static void getMaintenanceStatus() {
		System.out.println( "Raspberry Pi - Status Updated");
	}		
	public static void getLocation() {
		System.out.println( "Raspberry Pi - Location Acquired");
	}	
	public static void powerOn() {
		System.out.println( "Raspberry Pi - Power On");
	}	
	public static void powerOff() {
		System.out.println( "Raspberry Pi - Power Off");
	}	
	public static void move() {
		System.out.println( "Raspberry Pi - Moving");
	}
	public static void avoidObstacle() {
		System.out.println( "Raspberry Pi - Obstacle Avoided");
	}
	public static void beginVideo() {
		System.out.println( "Raspberry Pi - Video Recording Began");
	}	
	public static void stopVideo() {
		System.out.println( "Raspberry Pi - Video Recording Stopped");
	}	
	public static void recordPhoto() {
		System.out.println( "Raspberry Pi - Photo Taken");
	}		
}
