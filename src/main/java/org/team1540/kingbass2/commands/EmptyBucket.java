package org.team1540.kingbass2.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.team1540.kingbass2.commands.autonomous.OpenClawForTime;

public class EmptyBucket extends CommandGroup {
    public EmptyBucket() {
        addSequential(new AutoMoveArm(2, -1));
        addSequential(new OpenClawForTime(1));
        addSequential(new AutoMoveArm(2, 1));
    }
}
