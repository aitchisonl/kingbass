package org.team1540.kingbass2.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.networktables.NetworkTable;
import org.team1540.kingbass2.Robot;
import org.team1540.kingbass2.RobotMap;

import java.util.Arrays;

public class DriveToObject extends Command {
    NetworkTable table;
    int minDistI;

    public DriveToObject() {
        table = NetworkTable.getTable("GRIP/myBlobsReport");
        double centerX = RobotMap.CAMERA_CENTER_X;
        double centerY = RobotMap.CAMERA_CENTER_Y;
        requires(Robot.driveTrain);

    }

    @Override
    protected void initialize() {

    }

    @Override
    protected void execute() {
        double[] xArray = table.getNumberArray("x", new double[0]);
        double minDist = Double.POSITIVE_INFINITY;
        minDistI = 0;
        if (xArray.length == 0) {
            return;
        }

        for (int i = 0; i < xArray.length; i++) {
            double dist = (Math.abs(xArray[i] - RobotMap.CAMERA_CENTER_X));
            if (dist < minDist) {
                minDistI = i;
                minDist = dist;
            }
        }
        double followX = minDist - RobotMap.CAMERA_CENTER_X;
        Robot.driveTrain.drive(0.5 + (followX / 20), 0.5 - (followX / 20));

    }

    @Override
    protected boolean isFinished() {
        double[] sizeArray = table.getNumberArray("size", new double[0]);
        if (sizeArray[minDistI] > RobotMap.RETURN_THRESHOLD) {
            return true;
        }
        return false;

    }


}
