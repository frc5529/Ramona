package org.usfirst.frc.team5529.ramona;
public class XBoxMap {
	
	// Constants for xbox controller buttons and axes
	public static final int BUTTON_A = 1,
			BUTTON_B = 2,
			BUTTON_X = 3,
			BUTTON_Y = 4,
			BUTTON_LB = 5,
			BUTTON_RB = 6,
			BUTTON_BACK = 7,
			BUTTON_START = 8,
			BUTTON_LS = 9,
			BUTTON_RS = 10,
			
			AXIS_LX = 0,
			AXIS_LY = 1,
			AXIS_LT = 2,
			AXIS_RT = 3,
			AXIS_RX = 4,
			AXIS_RY = 5,
			AXIS_DPAD = 6;
	
	/**
	 * Sets output to 0 if input is below 0.1
	 * Prevents unwanted movement; control sticks might not always return exactly to 0
	 * @param input
	 * @return if input < 0.1, then output 0; if input >= 0.1, output input
	 */
	public static double deadzone(double input){
		double dead = 0.1;
		
		if (dead > 1) { return 0; }
		if (Math.abs(input) > 1) { return 0; }
		if (Math.abs(input) >= dead) { return input; }
		return 0;
	}

}
