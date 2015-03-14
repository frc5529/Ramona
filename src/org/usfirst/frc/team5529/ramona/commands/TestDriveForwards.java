package org.usfirst.frc.team5529.ramona.commands;

import org.usfirst.frc.team5529.ramona.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class TestDriveForwards extends Command {

    public TestDriveForwards() {
    	requires(Robot.drivetrain);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.drivetrain.arcadeDrive(0.5, 0);
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
