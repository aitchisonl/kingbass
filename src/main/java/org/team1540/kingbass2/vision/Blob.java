package org.team1540.kingbass2.vision;

import org.team1540.kingbass2.RobotMap;

public class Blob {
    public double posX;
    public double posY;
    public double size;
    public Blob(double X, double Y, double size) {
        this.posX = X;
        this.posY = Y;
        this.size = size;
    }
    public double xDistFromCenter() {
        return Math.abs(posX - RobotMap.CAMERA_CENTER_X);
    }
    public double yDistFromCenter() {
        return Math.abs(posY - RobotMap.CAMERA_CENTER_Y);
    }
    public double distFromPoint(double pointX, double pointY) {
        return Math.pow((posX*pointX)+(posY+pointY), .5);
    }

}
