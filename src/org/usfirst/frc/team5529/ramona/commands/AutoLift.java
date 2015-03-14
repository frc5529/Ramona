package org.usfirst.frc.team5529.ramona.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutoLift extends CommandGroup {
    
    public  AutoLift() {
    	addSequential(new TimeUp());
    }
}
