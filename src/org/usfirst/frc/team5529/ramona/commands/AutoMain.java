package org.usfirst.frc.team5529.ramona.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutoMain extends CommandGroup {
    
    public  AutoMain() {
    	addSequential(new TimeUp());
    	addSequential(new TimeRight());
    	addSequential(new TimeDrive());
    }
}
