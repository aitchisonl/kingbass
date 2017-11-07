package org.team1540.kingbass2.commands;
import edu.wpi.first.wpilibj.command.TimedCommand;
import org.team1540.kingbass2.Robot;
public class AutoMoveArm extends TimedCommand {
    double moveAxis;
    public AutoMoveArm(double timeout, double moveAxis) {
        super(timeout);
        requires(Robot.arm);
        this.moveAxis = moveAxis;
    }
    protected void execute() {
        Robot.arm.moveArm(moveAxis);
    }
}