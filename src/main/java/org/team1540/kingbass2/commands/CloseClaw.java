package org.team1540.kingbass2.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import org.team1540.kingbass2.Robot;

public class CloseClaw extends InstantCommand {
    public CloseClaw() {
        requires(Robot.claw);
    }

    @Override
    protected void initialize() {
        Robot.claw.close();
    }
}
