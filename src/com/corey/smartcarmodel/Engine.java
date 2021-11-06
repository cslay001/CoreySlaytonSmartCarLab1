/**
 * 
 */
package com.corey.smartcarmodel;

/**
 * @author corey
 *
 */
public class Engine extends DrivingAssembly {
	private String type;
	private String status;
	
	public static void getSystemCheck() {
		System.out.println( "Engine - Check Ok");
	}
	public static void updateStatus() {
		System.out.println( "Engine - Status Updated");
	}
	public static void startEngine() {
		System.out.println( "Engine - Started");
	}
	public static void stopEngine() {
		System.out.println( "Engine - Stopped");
	}
	public static void accelerate() {
		System.out.println( "Engine - Accelerating");
	}
	
}
