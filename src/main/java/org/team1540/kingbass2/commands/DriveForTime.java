package org.team1540.kingbass2.commands;

import edu.wpi.first.wpilibj.command.TimedCommand;
import org.team1540.kingbass2.Robot;
import org.team1540.kingbass2.subsystems.DriveTrain;

public class DriveForTime extends TimedCommand{
    private final double driveSpeed;

    public DriveForTime(double timeout, double driveSpeed) {
        super(timeout);
        this.driveSpeed = driveSpeed;
        requires(Robot.driveTrain);

    }

    @Override
    protected void execute() {
        Robot.driveTrain.drive(driveSpeed, driveSpeed);
    }
}
