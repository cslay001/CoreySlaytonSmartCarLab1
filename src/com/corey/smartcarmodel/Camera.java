/**
 * 
 */
package com.corey.smartcarmodel;

/**
 * @author corey
 *
 */
public class Camera extends SmartAssembly {
	private String type;
	private String status;
	
	public static void getSystemCheck() {
		System.out.println( "Camera - Check Ok");
	}
	public static void updateStatus() {
		System.out.println( "Camera - Status Updated");
	}
	public static void recordVideo() {
		System.out.println( "Camera - Video Recording");
	}
	public static void recordPhoto() {
		System.out.println( "Camera - Photo Taken");
	}
}
