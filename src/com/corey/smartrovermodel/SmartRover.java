/**
 * 
 */
package com.corey.smartrovermodel;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author corey
 *
 */
public class SmartRover implements SelfCheckCapable {

	private String name;
	private String model;
	private String location;
	private String powerStatus;
	private String maintenanceStatus;
	private String softwareVersion;
	private String systemCurrent;
	private String systemBackup;
	private ADC myADC;
	private Servo myServo;

	public SmartRover(String name, String model, String location, String powerStatus, String maintenanceStatus, String softwareVersion, String systemCurrent, String systemBackup) {
		this.setName(name);
		this.model = model;
		this.location = location;
		this.powerStatus = powerStatus;
		this.maintenanceStatus = maintenanceStatus;
		this.softwareVersion = softwareVersion;
		this.systemCurrent = systemCurrent;
		this.systemBackup = systemBackup;
	}
	
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
	public static void getModel() {
		System.out.println( "SmartRover - Model XXX");
	}
	public static void getPowerStatus() {
		System.out.println( "SmartRover - Power XXX");
	}
	public static void getSystemCurrent() {
		System.out.println( "SmartRover - SystemCurrent located at XXX");
	}	
	public static void getSystemBackup() {
		System.out.println( "SmartRover - SystemBackup located at XXX");
	}	
	public static void updateLocation() {
		System.out.println( "SmartRover - Location Updated");
	}		
	public static void updatePowerStatus() {
		System.out.println( "SmartRover - PowerStatus Updated");
	}	
	public static void downloadSystemUpdate() {
		System.out.println( "SmartRover - SystemUpdate Downloading from XXX");
	}
	public static void replaceSystemBackup() {
		System.out.println( "SmartRover - SystemBackUp Replaced by SystemCurrent");
	}
	public static void replaceSystemCurrent() {
		System.out.println( "SmartRover - SystemCurrent Replaced by SystemBackup");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartRover mySmartRover = new SmartRover(null, null, null, null, null, null, null, null);
		
		System.out.println("New SmartRover: " + mySmartRover);
		mySmartRover.runSelfCheck();
	}


	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.1);
	}
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "My SmartRover1";
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.checkComponents(this, myADC, myServo);
	}

}

