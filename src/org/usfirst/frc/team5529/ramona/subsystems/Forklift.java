package org.usfirst.frc.team5529.ramona.subsystems;

import org.usfirst.frc.team5529.ramona.RobotMap;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Forklift extends Subsystem {
    
    private Talon left;
    private Talon right;
	private DigitalInput topLimit;
	
    public Forklift(){
    	super();
    	
    	left = new Talon(RobotMap.mL);
    	right = new Talon(RobotMap.mR);
    	topLimit = new DigitalInput(RobotMap.tL);
    	left.setSafetyEnabled(true);
    	right.setSafetyEnabled(true);
    }

    public void initDefaultCommand() {
//    	setDefaultCommand(new TriggerLift());
    }
    
    public void up(){
    	if (topLimit.get()){
    		left.set(0);
    		right.set(0);
    	} else{
    		left.set(1);
    		right.set(1);
    	}
    }
    
    public void down(){
    	left.set(-1);
    	right.set(-1);
    }
    
    public void stop(){
    	left.set(0);
    	right.set(0);
    }
    
    public void set(double speed){
    	if (topLimit.get() && speed > 0){
    		left.set(0);
    		right.set(0);
    	} else{
        	left.set(speed);
        	right.set(speed);
    	}
    }
}
