package org.team1540.kingbass2;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public static final int RIGHT_AXIS_Y = 5;
    public static final int LEFT_AXIS_Y = 1;
    public static final int RIGHT_AXIS_X = 4;
    public static final int LEFT_AXIS_X = 0;
    public static final int RIGHT_TRIGGER = 3;
    public static final int LEFT_TRIGGER = 2;
    public static final Joystick driver = new Joystick(0);
    public static final JoystickButton buttonA = new JoystickButton(driver, 1);
    public static final JoystickButton buttonB = new JoystickButton(driver, 2);
    public static final JoystickButton buttonX = new JoystickButton(driver, 3);
    public static final JoystickButton buttonY = new JoystickButton(driver, 4);
    public static final JoystickButton leftBumper = new JoystickButton(driver, 5);
    public static final JoystickButton rightBumper = new JoystickButton(driver, 6);
    public static final JoystickButton select = new JoystickButton(driver, 7);
    public static final JoystickButton start = new JoystickButton(driver, 8);
    public static final JoystickButton leftStick = new JoystickButton(driver, 9);
    public static final JoystickButton rightStick = new JoystickButton(driver, 10);
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
}
