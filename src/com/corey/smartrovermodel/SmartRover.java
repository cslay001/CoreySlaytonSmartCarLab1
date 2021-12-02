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
	public static void move() {
		System.out.println( "SmartRover - Moving");
	}
	public static void avoidObstacle() {
		System.out.println( "SmartRover - Obstacle Avoided");
	}
	public static void beginVideo() {
		System.out.println( "SmartRover - Video Recording Began");
	}	
	public static void stopVideo() {
		System.out.println( "SmartRover - Video Recording Stopped");
	}	
	public static void recordPhoto() {
		System.out.println( "SmartRover - Photo Taken");
	}		
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
