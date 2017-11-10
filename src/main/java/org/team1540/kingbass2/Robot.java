
package org.team1540.kingbass2;

import org.team1540.kingbass2.commands.*;
import org.team1540.kingbass2.commands.autonomous.AutoDriveToObject;
import org.team1540.kingbass2.commands.autonomous.DoNothing;
import org.team1540.kingbass2.commands.DriveToObject;
import org.team1540.kingbass2.commands.autonomous.OpenClawForTime;
import org.team1540.kingbass2.subsystems.Arm;
import org.team1540.kingbass2.subsystems.Claw;
import org.team1540.kingbass2.subsystems.DriveTrain;
import org.team1540.kingbass2.subsystems.ExampleSubsystem;
import org.team1540.kingbass2.subsystems.Grabber;
import org.team1540.kingbass2.subsystems.Shifters;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

    public static final ExampleSubsystem exampleSubsystem = new ExampleSubsystem();
    public static OI oi;
    public static DriveTrain driveTrain = new DriveTrain();
    public static Claw claw = new Claw();
    public static Arm arm = new Arm();
    public static Grabber grabber = new Grabber();
    public static Shifters shifters = new Shifters();
    public static boolean isGrabberOpen = false;
    Command openClaw;
    Command stop;

    Command autonomousCommand;
    SendableChooser<Command> chooser = new SendableChooser<>();


    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    @Override
    public void robotInit() {
        openClaw = new OpenClawForTime(1);
        stop = new StopEverything();
        oi = new OI();
        chooser = new SendableChooser<Command>();
        chooser.addDefault("Do Nothing", new DoNothing());
        chooser.addObject("Drive to bucket", new AutoDriveToObject());
        chooser.addObject("Pick up bucket", new GrabBucket());
        SmartDashboard.putData("Autonomous Mode Chooser", chooser);

        OI.driverLeftStick.whileHeld(new DriveToObject());
        OI.driverLeftBumper.whenPressed(new ShiftDown());
        OI.driverRightBumper.whenPressed(new ShiftUp());

        OI.coLeftStick.whenPressed(new OpenCloseGrabber());
        OI.coLeftBumper.whenPressed(new EmptyBucket());
        OI.coRightBumper.whenPressed(new GrabBucket());
        OI.coButtonA.whileHeld(new OpenClaw());
        OI.coButtonB.whileHeld(new CloseClaw());


    }

    /**
     * This function is called once each time the robot enters Disabled mode.
     * You can use it to reset any subsystem information you want to clear when
     * the robot is disabled.
     */
    @Override
    public void disabledInit() {
        stop.start();
    }

    @Override
    public void disabledPeriodic() {
        Scheduler.getInstance().run();
    }

    /**
     * This autonomous (along with the chooser code above) shows how to select
     * between different autonomous modes using the dashboard. The sendable
     * chooser code works with the Java SmartDashboard. If you prefer the
     * LabVIEW Dashboard, remove all of the chooser code and uncomment the
     * getString code to get the auto name from the text box below the Gyro
     * <p>
     * You can add additional auto modes by adding additional commands to the
     * chooser code above (like the commented example) or additional comparisons
     * to the switch structure below with additional strings & commands.
     */
    @Override
    public void autonomousInit() {
        autonomousCommand = chooser.getSelected();
        new OpenClawForTime(1).start();

        if (autonomousCommand != null)
            autonomousCommand.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    @Override
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    @Override
    public void teleopInit() {
        // This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (autonomousCommand != null)
            autonomousCommand.cancel();
        stop.start();
        openClaw.start();

    }

    /**
     * This function is called periodically during operator control
     */
    @Override
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }

    /**
     * This function is called periodically during test mode
     */
    @Override
    public void testPeriodic() {
        LiveWindow.run();
    }
}
