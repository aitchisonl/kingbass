package org.team1540.kingbass2.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.team1540.kingbass2.commands.AutoMoveArm;
import org.team1540.kingbass2.commands.CloseClaw;
import org.team1540.kingbass2.commands.OpenClaw;

public class GrabBucket extends CommandGroup {
    public GrabBucket() {
        addSequential(new OpenClaw(1));
        addSequential(new AutoMoveArm(2, 1));
        addSequential(new CloseClaw(2));
        addSequential(new AutoMoveArm(2, -1));
    }
}
