package org.usfirst.frc.team5529.ramona.commands;

import org.usfirst.frc.team5529.ramona.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class TimeRight extends Command {

    public TimeRight() {
    	requires(Robot.drivetrain);
    }

    protected void initialize() {
    }

    protected void execute() {
    	setTimeout(3);
    	while (!isTimedOut()){
    		Robot.drivetrain.arcadeDrive(0, -0.5);
    	}
    }

    protected boolean isFinished() {
        return isTimedOut();
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
