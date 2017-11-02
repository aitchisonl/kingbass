package org.team1540.kingbass2.commands;

import org.team1540.kingbass2.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ShiftDown extends Command {

    public ShiftDown() {
        requires(Robot.shifters);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.shifters.setFalse();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }
}
