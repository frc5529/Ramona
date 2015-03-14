package org.usfirst.frc.team5529.ramona.commands;

import org.usfirst.frc.team5529.ramona.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class TimeUp extends Command {

    public TimeUp() {
    	requires(Robot.forklift);
    }

    protected void initialize() {
    }

    protected void execute() {
    	setTimeout(8);
    	while (!isTimedOut()){
    		Robot.forklift.up();
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
