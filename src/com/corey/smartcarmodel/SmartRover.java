/**
 * 
 */
package com.corey.smartcarmodel;

/**
 * @author corey
 *
 */
public class SmartCar {

	private String make;
	private String model;
	private String status;
	private String location;
	
	public static void getFullSystemCheck() {
		System.out.println( "SmartCar - FullSystemCheck OK");
	}
	public static void updateStatus() {
		System.out.println( "SmartCar - Status Updated");
	}		
	public static void getLocation() {
		System.out.println( "SmartCar - Location Acquired");
	}	

	public static void updateLocation() {
		System.out.println( "SmartCar - Location Updated");
	}	
	public static void move() {
		System.out.println( "SmartCar - Moving");
	}
	public static void avoidObstacle() {
		System.out.println( "SmartCar - Obstacle Avoided");
	}
	public static void beginVideo() {
		System.out.println( "SmartCar - Video Recording Began");
	}	
	public static void stopVideo() {
		System.out.println( "SmartCar - Video Recording Stopped");
	}	
	public static void recordPhoto() {
		System.out.println( "SmartCar - Photo Taken");
	}		
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
