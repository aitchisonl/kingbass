package org.team1540.kingbass2.commands;

import edu.wpi.first.wpilibj.command.TimedCommand;
import org.team1540.kingbass2.Robot;

import edu.wpi.first.wpilibj.command.InstantCommand;

/**
 *
 */
public class OpenClawForTime extends TimedCommand {

    public OpenClawForTime(double timeout) {
        super(timeout);
        requires(Robot.claw);
    }

    // Called once when the command executes
    protected void execute() {
        Robot.claw.open();
    }

}
