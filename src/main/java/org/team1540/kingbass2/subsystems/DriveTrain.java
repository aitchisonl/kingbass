package org.team1540.kingbass2.subsystems;

import org.team1540.kingbass2.RobotMap;
import org.team1540.kingbass2.commands.JoystickDrive;

import com.ctre.CANTalon;
import com.ctre.CANTalon.TalonControlMode;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
	private CANTalon left1 = new CANTalon(RobotMap.LEFT_DRIVE_1);
	private CANTalon left2 = new CANTalon(RobotMap.LEFT_DRIVE_2);
	private CANTalon left3 = new CANTalon(RobotMap.LEFT_DRIVE_3);
	private CANTalon right1 = new CANTalon(RobotMap.RIGHT_DRIVE_1);
	private CANTalon right2 = new CANTalon(RobotMap.RIGHT_DRIVE_2);
	private CANTalon right3 = new CANTalon(RobotMap.RIGHT_DRIVE_3);
	

    public DriveTrain() {
    		left2.changeControlMode(TalonControlMode.Follower);
    		left3.changeControlMode(TalonControlMode.Follower);
    		right2.changeControlMode(TalonControlMode.Follower);
    		right3.changeControlMode(TalonControlMode.Follower);
    		left2.set(left1.getDeviceID());
    		left3.set(left1.getDeviceID());
    		right2.set(right1.getDeviceID());
    		right3.set(right1.getDeviceID());
    }

    public void initDefaultCommand() {
        setDefaultCommand(new JoystickDrive());
    }
    public void drive(double left, double right) {
    		left1.set(left);
    		right1.set(-right);
    }
}

