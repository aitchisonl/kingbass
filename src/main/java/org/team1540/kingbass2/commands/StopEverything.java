package org.team1540.kingbass2.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.team1540.kingbass2.Robot;

public class StopEverything extends Command {

    public StopEverything() {
        requires(Robot.claw);
        requires(Robot.driveTrain);
        requires(Robot.grabber);
        requires(Robot.shifters);
    }

    @Override
    protected void initialize() {
        Robot.claw.stop();
        Robot.driveTrain.drive(0,0);
        Robot.grabber.stop();
        Robot.shifters.setFalse();
    }

    @Override
    protected boolean isFinished() {
        return true;
    }
}
