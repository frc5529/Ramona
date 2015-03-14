package org.usfirst.frc.team5529.ramona.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutoDrive extends CommandGroup {
    
    public  AutoDrive() {
    	addSequential(new TimeDrive());
    }
}
