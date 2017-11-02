package org.team1540.kingbass2.commands;

import org.team1540.kingbass2.Robot;

import edu.wpi.first.wpilibj.command.InstantCommand;

/**
 *
 */
public class OpenClaw extends InstantCommand {

    public OpenClaw() {
        super();
        requires(Robot.claw);
    }

    // Called once when the command executes
    protected void initialize() {
    		Robot.claw.open();
    }

}