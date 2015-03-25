package org.usfirst.frc.team5529.ramona;

import org.usfirst.frc.team5529.ramona.commands.TestDriveForwards;
import org.usfirst.frc.team5529.ramona.commands.TestTurnRight;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI {
	
	public Joystick xbox = new Joystick(RobotMap.xbx);
	public Joystick playstation = new Joystick(RobotMap.ps);
	
//	private JoystickButton b = new JoystickButton(playstation, XBoxMap.BUTTON_B);
//	private JoystickButton x = new JoystickButton(playstation, XBoxMap.BUTTON_X);
	
	private JoystickButton bb = new JoystickButton(xbox, XBoxMap.BUTTON_B);
	private JoystickButton a = new JoystickButton(xbox, XBoxMap.BUTTON_A);
	
	public OI(){
//		b.whileHeld(new LiftUp());
//		x.whileHeld(new LiftDown());
		
		bb.whileHeld(new TestTurnRight());// B
		a.whileHeld(new TestDriveForwards());// A
	}
}

