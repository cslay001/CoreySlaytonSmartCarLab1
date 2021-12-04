/**
 * 
 */
package com.corey.smartrovermodel;

/**
 * @author corey
 *
 */
public class Camera {

	private String maintenanceStatus;
	private String powerStatus;
	
	public static void getFullSystemCheck() {
		System.out.println( "Camera - FullSystemCheck OK");
	}
	public static void getMaintenanceStatus() {
		System.out.println( "Camera - Status Updated");
	}		
	public static void startVideo() {
		System.out.println( "Camera - Video Recording");
	}	
	public static void stopVideo() {
		System.out.println( "Camera - Video Stopped");
	}		
	public static void takePhoto() {
		System.out.println( "Camera - Photo Taken");
	}	
} 
