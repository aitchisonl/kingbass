package org.team1540.kingbass2.commands.autonomous;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.networktables.NetworkTable;
import org.team1540.kingbass2.Robot;
import org.team1540.kingbass2.RobotMap;
import org.team1540.kingbass2.vision.Blob;
import java.util.Arrays;

public class AutoDriveToObject extends Command {
    NetworkTable table;
    int minDistI;
    Blob lastBlob = new Blob(320, 240, 100);
    Blob[] blobs;

    public AutoDriveToObject() {
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
        double[] yArray = table.getNumberArray("y", new double[0]);
        double[] sizeArray = table.getNumberArray("size", new double[0]);
        blobs = new Blob[xArray.length];
        for (int i = 0; i < xArray.length; i++) {
            blobs[i] = new Blob(xArray[i], yArray[i], sizeArray[i]);
        }
        double minDist = Double.POSITIVE_INFINITY;
        minDistI = 0;
        if (blobs.length == 0) {
            Robot.driveTrain.drive(0.5 + (this.lastBlob.xDistFromCenter() / 20), 0.5 - (this.lastBlob.xDistFromCenter() / 20));

        }

        for (int i = 0; i < blobs.length; i++) {
            if (blobs[i].xDistFromCenter() < minDist && blobs[i].yDistFromCenter()<50) {
                minDistI = i;
                minDist = blobs[i].xDistFromCenter();
            }
        }
        this.lastBlob = blobs[minDistI];
        double followX = minDist - RobotMap.CAMERA_CENTER_X;
        Robot.driveTrain.drive(0.5 + (followX / 20), 0.5 - (followX / 20));

    }

    @Override
    protected boolean isFinished() {
        if (blobs[minDistI].size > RobotMap.RETURN_THRESHOLD) {
            return true;
        }
        return false;

    }
}
