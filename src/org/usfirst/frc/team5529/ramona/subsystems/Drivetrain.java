package org.usfirst.frc.team5529.ramona.subsystems;

import org.usfirst.frc.team5529.ramona.RobotMap;
import org.usfirst.frc.team5529.ramona.XBoxMap;
import org.usfirst.frc.team5529.ramona.commands.ArcadeDrive;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {
    
    private RobotDrive drive;
    
    public Drivetrain(){
    	super();
    	
    	drive = new RobotDrive(RobotMap.mFL,RobotMap.mBL,RobotMap.mFR,RobotMap.mBR);
    	drive.setSafetyEnabled(true);
    }

	public void initDefaultCommand() {
    	setDefaultCommand(new ArcadeDrive());
    }

    public void arcadeDrive(double moveValue, double rotateValue){
    	drive.arcadeDrive(XBoxMap.deadzone(moveValue), XBoxMap.deadzone(rotateValue));
    }
}
