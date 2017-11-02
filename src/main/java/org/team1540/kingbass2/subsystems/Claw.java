package org.team1540.kingbass2.subsystems;

import org.team1540.kingbass2.RobotMap;
import org.team1540.kingbass2.commands.StopClaw;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Claw extends Subsystem {
	private CANTalon motor1 = new CANTalon(9);
	private CANTalon motor2 = new CANTalon(10);
	

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        setDefaultCommand(new StopClaw());
    }
    public void open() {
    		motor1.set(1);
    		motor2.set(1);
    }
    public void close() {
    		motor1.set(-1);
    		motor2.set(-1);
    }
    public void stop() {
    	 motor1.set(0);
    	 motor2.set(0);
    }
}

