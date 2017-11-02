package org.team1540.kingbass2;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;
	public static final int LEFT_DRIVE_1 = 1;
	public static final int LEFT_DRIVE_2 = 2;
	public static final int LEFT_DRIVE_3 = 3;
	public static final int RIGHT_DRIVE_1 = 4;
	public static final int RIGHT_DRIVE_2 = 5;
	public static final int RIGHT_DRIVE_3 = 6;
	public static final int GRABBER_1 = 7;
	public static final int GRABBER_2 = 8;
	public static final int claw1 = 9;
	public static final int claw2 = 10;
	public static final int ARM_1 = 11;
	public static final int ARM_2 = 12;
	public static final int LEFT_SOLENOID = 13;
	public static final int RIGHT_SOLENOID = 14;
	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
}
