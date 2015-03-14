package org.usfirst.frc.team5529.ramona.commands;

import org.usfirst.frc.team5529.ramona.Robot;
import org.usfirst.frc.team5529.ramona.XBoxMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ArcadeDrive extends Command {

	private final double throttle = 0.7;
	
    public ArcadeDrive() {
    	requires(Robot.drivetrain);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.drivetrain.arcadeDrive(-XBoxMap.deadzone(Robot.oi.xbox.getRawAxis(XBoxMap.AXIS_LY))*throttle, -XBoxMap.deadzone(Robot.oi.xbox.getRawAxis(XBoxMap.AXIS_RX))*throttle);
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
