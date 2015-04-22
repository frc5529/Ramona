package org.usfirst.frc.team5529.ramona.commands;

import org.usfirst.frc.team5529.ramona.Robot;
import org.usfirst.frc.team5529.ramona.XBoxMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class TriggerLift extends Command {

    public TriggerLift() {
    	requires(Robot.forklift);
    }

    protected void initialize() {
    }

    protected void execute() {
    	double triggers = Robot.oi.playstation.getRawAxis(XBoxMap.AXIS_RT) - Robot.oi.playstation.getRawAxis(XBoxMap.AXIS_LT);
    	Robot.forklift.set(triggers);
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
