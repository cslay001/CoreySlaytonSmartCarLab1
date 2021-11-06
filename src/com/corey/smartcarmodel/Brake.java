/**
 * 
 */
package com.corey.smartcarmodel;

/**
 * @author corey
 *
 */
public class Brake extends DrivingAssembly {
	private String type;
	private String status;
	
	public static void getSystemCheck() {
		System.out.println( "Brake - Check Ok");
	}
	public static void updateStatus() {
		System.out.println( "Brake - Status Updated");
	}
	public static void stop() {
		System.out.println( "Brake - Stopping");
	}

	}
	
	
}
