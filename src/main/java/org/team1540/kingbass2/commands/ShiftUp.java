package org.team1540.kingbass2.commands;

import org.team1540.kingbass2.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ShiftUp extends Command {

    public ShiftUp() {
        requires(Robot.shifters);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    		Robot.shifters.setTrue();
    }

	@Override
	protected boolean isFinished() {
		return false;
	}
   
}
