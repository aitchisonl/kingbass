package org.team1540.kingbass2.subsystems;

import org.team1540.kingbass2.RobotMap;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Shifters extends Subsystem {
	Solenoid leftSolenoid = new Solenoid(RobotMap.LEFT_SOLENOID);
	Solenoid rightSolenoid = new Solenoid(RobotMap.RIGHT_SOLENOID);

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        
    }
    
    public void setTrue() {
    	leftSolenoid.set(true);
    	rightSolenoid.set(true);
    }
    
    public void setFalse() {
    	leftSolenoid.set(false);
    	rightSolenoid.set(false);
    }
}

