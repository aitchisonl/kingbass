package org.team1540.kingbass2.commands;

import org.team1540.kingbass2.Robot;

import edu.wpi.first.wpilibj.command.TimedCommand;

/**
 *
 */
public class OpenCloseGrabber extends TimedCommand {
	private boolean openingGrabber;

    public OpenCloseGrabber() {
        super(1);
        requires(Robot.grabber);
        if (Robot.isGrabberOpen) {
        		openingGrabber = false;
        } else {
        		openingGrabber = true;
        }
        	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    		if (openingGrabber) {
    			Robot.grabber.open();
    			Robot.isGrabberOpen = true;
    		} else {
    			Robot.grabber.close();
    			Robot.isGrabberOpen = false;
    		}
    }
}
