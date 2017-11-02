package org.team1540.kingbass2.commands;



import org.team1540.kingbass2.OI;
import org.team1540.kingbass2.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class JoystickDrive extends Command {

    public JoystickDrive() {
        requires(Robot.driveTrain);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    		Robot.driveTrain.drive(OI.driver.getRawAxis(OI.LEFT_AXIS_Y), OI.driver.getRawAxis(OI.RIGHT_AXIS_Y));
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }
 
}
