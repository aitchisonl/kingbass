package org.team1540.kingbass2.commands;

import edu.wpi.first.wpilibj.command.TimedCommand;
import org.team1540.kingbass2.Robot;

import edu.wpi.first.wpilibj.command.InstantCommand;

/**
 *
 */
public class CloseClaw extends TimedCommand {

    public CloseClaw(double timeout) {
        super(timeout);
        requires(Robot.claw);
    }


    protected void execute() {
        Robot.claw.close();
    }

}