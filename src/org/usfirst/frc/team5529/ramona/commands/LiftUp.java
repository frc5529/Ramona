package org.usfirst.frc.team5529.ramona.commands;

import org.usfirst.frc.team5529.ramona.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class LiftUp extends Command {

    public LiftUp() {
    	requires(Robot.forklift);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.forklift.up();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
