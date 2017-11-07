package org.team1540.kingbass2.commands;

import edu.wpi.first.wpilibj.command.TimedCommand;
import org.team1540.kingbass2.Robot;

public class TurnForTime extends TimedCommand {
    private int turnLeftSpeed;
    private int turnRightSpeed;
    public TurnForTime(double timeout, int turnLeftSpeed, int turnRightSpeed) {
        super(timeout);
        this.turnLeftSpeed = turnLeftSpeed;
        this.turnLeftSpeed = turnLeftSpeed;
        requires(Robot.driveTrain);
    }

    protected void execute() {
        Robot.driveTrain.drive(turnLeftSpeed, turnRightSpeed);
    }
}
