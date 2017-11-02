package org.team1540.kingbass2.commands;

import org.team1540.kingbass2.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class StopClaw extends Command {

    public StopClaw() {
        requires(Robot.claw);
    }


    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.claw.stop();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }
}
