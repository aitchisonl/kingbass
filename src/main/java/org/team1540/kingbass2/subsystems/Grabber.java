package org.team1540.kingbass2.subsystems;

import org.team1540.kingbass2.RobotMap;
import org.team1540.kingbass2.commands.StopGrabber;

import com.ctre.CANTalon;
import com.ctre.CANTalon.TalonControlMode;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Grabber extends Subsystem {
	
	CANTalon grabber1 = new CANTalon(RobotMap.GRABBER_1);
	CANTalon grabber2 = new CANTalon(RobotMap.GRABBER_2);
	
    public void initDefaultCommand() {
        grabber2.changeControlMode(TalonControlMode.Follower);
        grabber2.set(grabber1.getDeviceID());
        setDefaultCommand(new StopGrabber());
    }
    
    public void open() {
    		grabber1.set(1);
    }
    public void close() {
    		grabber1.set(-1);
    }
    public void stop() {
    		grabber1.set(0);
    }
}

