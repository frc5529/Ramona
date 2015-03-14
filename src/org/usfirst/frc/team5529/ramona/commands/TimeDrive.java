package org.usfirst.frc.team5529.ramona.commands;

import org.usfirst.frc.team5529.ramona.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class TimeDrive extends Command {

    public TimeDrive() {
    	requires(Robot.drivetrain);
    }

    protected void initialize() {
    }

    protected void execute() {
    	setTimeout(2);
    	while (!isTimedOut()){
    		Robot.drivetrain.arcadeDrive(0.6, 0);
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
