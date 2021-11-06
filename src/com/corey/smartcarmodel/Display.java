/**
 * 
 */
package com.corey.smartcarmodel;

/**
 * @author corey
 *
 */
public class Display {
	private String type;
	private String status;
	
	public static void getSystemCheck() {
		System.out.println( "Display - Check Ok");
	}
	public static void updateStatus() {
		System.out.println( "Display - StatusUpdated");
	}
}
