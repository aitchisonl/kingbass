package org.team1540.kingbass2.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class GrabBucket extends CommandGroup {
    public GrabBucket() {
        addSequential(new CloseClawForTime(2));
        addSequential(new AutoMoveArm(.5, -1));
    }
}
