package org.usfirst.frc.team5529.ramona;

import org.usfirst.frc.team5529.ramona.commands.AutoLift;
import org.usfirst.frc.team5529.ramona.subsystems.Drivetrain;
import org.usfirst.frc.team5529.ramona.subsystems.Forklift;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

public class Robot extends IterativeRobot {

	public static final Drivetrain drivetrain = new Drivetrain();
	public static final Forklift forklift = new Forklift();
	
	public static OI oi;

    Command autonomousCommand;

    public void robotInit() {
		oi = new OI();
        autonomousCommand = new AutoLift();
    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

    public void autonomousInit() {
        if (autonomousCommand != null) autonomousCommand.start();
    }

    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
        if (autonomousCommand != null) autonomousCommand.cancel();
    }

    public void disabledInit(){

    }

    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }
    
    public void testPeriodic() {
        LiveWindow.run();
    }
}
