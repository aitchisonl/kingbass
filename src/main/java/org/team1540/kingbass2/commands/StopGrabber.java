package org.team1540.kingbass2.commands;

import org.team1540.kingbass2.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class StopGrabber extends Command {

    public StopGrabber() {
        requires(Robot.grabber);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.grabber.stop();
    }
    protected boolean isFinished() {
        return false;
    }
}