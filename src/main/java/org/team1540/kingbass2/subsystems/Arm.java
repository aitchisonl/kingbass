package org.team1540.kingbass2.subsystems;

import org.team1540.kingbass2.RobotMap;
import org.team1540.kingbass2.commands.ArmControl;

import com.ctre.CANTalon;
import com.ctre.CANTalon.TalonControlMode;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Arm extends Subsystem {
	private CANTalon motor1 = new CANTalon(RobotMap.ARM_1);
	private CANTalon motor2 = new CANTalon(RobotMap.ARM_2);
	

    public void initDefaultCommand() {
        motor2.changeControlMode(TalonControlMode.Follower);
        motor2.set(motor1.getDeviceID());
        setDefaultCommand(new ArmControl());
    }
    public void moveArm(double axis) {
    		motor1.set(axis);
    }
}

