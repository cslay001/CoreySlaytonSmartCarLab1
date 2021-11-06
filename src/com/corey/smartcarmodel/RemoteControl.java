/**
 * 
 */
package com.corey.smartcarmodel;

/**
 * @author corey
 *
 */
public class RemoteControl extends SmartAssembly {
	private String type;
	private String status;
	
	public static void getSystemCheck() {
		System.out.println( "Remote Control - Check Ok");
	}
	public static void updateStatus() {
		System.out.println( "Remote Control - Status Updated");
	}
	public static void controlCar() {
		System.out.println( "Remote Control - Controlling");
	}
}
