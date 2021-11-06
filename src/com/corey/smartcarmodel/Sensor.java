/**
 * 
 */
package com.corey.smartcarmodel;

/**
 * @author corey
 *
 */
public class Sensor extends SmartAssembly {
	private String type;
	private String status;
	private String location;
	
	public static void getSystemCheck() {
		System.out.println( "Sensor - Check Ok");
	}
	public static void updateStatus() {
		System.out.println( "Sensor - Status Updated");
	}
	public static void getLocation() {
		System.out.println( "Sensor - Position Located");
	}
	public static void identifyObstacle() {
		System.out.println( "Sensor - Identified Obstacle");
	}
	public static void updateLocation() {
		System.out.println( "Sensor - Position Updated");
	}
}
