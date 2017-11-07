package org.team1540.kingbass2.commands;

import org.team1540.kingbass2.OI;
import org.team1540.kingbass2.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ArmControl extends Command {

    public ArmControl() {
       requires(Robot.arm);
    }


    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    		Robot.arm.moveArm(OI.driver.getRawAxis(OI.RIGHT_TRIGGER)-OI.driver.getRawAxis(OI.LEFT_TRIGGER));
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

}
