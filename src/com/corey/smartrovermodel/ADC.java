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
public class ADC implements SelfCheckCapable {

	
	private String maintenanceStatus;
	private String powerStatus;

	public ADC() {
		maintenanceStatus = new String();
		powerStatus = new String();
	}
	
	public static void getFullSystemCheck() {
		System.out.println( "ADC - FullSystemCheck set to OK");
	}
	public static void getMaintenanceStatus() {
		System.out.println( "ADC - Maintenance Status set to XXX");
	}		
	public static void getPowerStatus() {
		System.out.println( "ADC - Power Status set to XXX");
	}	
	public static void updateMaintenanceStatus() {
		System.out.println( "ADC - Maintenance Status updated to XXX");
	}		
	public static void updatePowerStatus() {
		System.out.println( "ADC - Power Status updated to XXX");
	}	
	public static void powerOn() {
		System.out.println( "ADC - Power On");
	}	
	public static void powerOff() {
		System.out.println( "ADC - Power Off");
	}	
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "My ADC1";
	}
	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.1);
	}
	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return false;
	}
	
}