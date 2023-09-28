// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the
 * name of this class or
 * the package after creating this project, you must also update the
 * build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {

  Joystick testJoystick;
  Joystick secondJoystick;

  /**
   * This function is run when the robot is first started up and should be used
   * for any
   * initialization code.
   */
  @Override
  public void robotInit() {
    testJoystick = new Joystick(0);
    secondJoystick = new Joystick(1);
  }

  /**
   * This function is called every 20 ms, no matter the mode. Use this for items
   * like diagnostics
   * that you want ran during disabled, autonomous, teleoperated and test.
   *
   * <p>
   * This runs after the mode specific periodic functions, but before LiveWindow
   * and
   * SmartDashboard integrated updating.
   */
  @Override
  public void robotPeriodic() {
    //Button A
    boolean aButton = testJoystick.getRawButton(1);
    SmartDashboard.putBoolean("Button Pressed", aButton);
    boolean pressed = testJoystick.getRawButtonPressed(1);
    SmartDashboard.putBoolean("Pressed", pressed);
    boolean released = testJoystick.getRawButtonReleased(1);
    SmartDashboard.putBoolean("Released", released);

    //Button B
    boolean bButton = testJoystick.getRawButton(2);
    SmartDashboard.putBoolean("Button B Pressed", bButton);
    boolean pressedB = testJoystick.getRawButtonPressed(2);
    SmartDashboard.putBoolean("Pressed b", pressedB);
    boolean releasedB = testJoystick.getRawButtonReleased(2);
    SmartDashboard.putBoolean("Released b", releasedB);

    //Button X
    boolean xButton = testJoystick.getRawButton(3);
    SmartDashboard.putBoolean("Button x Pressed", xButton);
    boolean pressedx = testJoystick.getRawButtonPressed(3);
    SmartDashboard.putBoolean("Pressed x", pressedx);
    boolean releasedx = testJoystick.getRawButtonReleased(3);
    SmartDashboard.putBoolean("Released x", releasedx);

    //Button Y
    boolean yButton = testJoystick.getRawButton(4);
    SmartDashboard.putBoolean("Button y Pressed", yButton);
    boolean pressedy = testJoystick.getRawButtonPressed(4);
    SmartDashboard.putBoolean("Pressed y", pressedy);
    boolean releasedy = testJoystick.getRawButtonReleased(4);
    SmartDashboard.putBoolean("Released y", releasedy);

    //Axis 1 (Left & Right)
    double axis0 = testJoystick.getRawAxis(0);
    //testJoystick.....
    SmartDashboard.putNumber("Axis 0", axis0);

    //POV Pad (D Pad)
    int pov = testJoystick.getPOV();
    SmartDashboard.putNumber("POV", pov);

  }
  /** This function is called once when autonomous is enabled. */
  @Override
  public void autonomousInit() {}

  /** This function is called periodically during autonomous. */
  @Override
  public void autonomousPeriodic() {}

  /** This function is called once when teleop is enabled. */
  @Override
  public void teleopInit() {}

  /** This function is called periodically during operator control. */
  @Override
  public void teleopPeriodic() {}

  /** This function is called once when the robot is disabled. */
  @Override
  public void disabledInit() {}

  /** This function is called periodically when disabled. */
  @Override
  public void disabledPeriodic() {}

  /** This function is called once when test mode is enabled. */
  @Override
  public void testInit() {}

  /** This function is called periodically during test mode. */
  @Override
  public void testPeriodic() {}

  /** This function is called once when the robot is first started up. */
  @Override
  public void simulationInit() {}

  /** This function is called periodically whilst in simulation. */
  @Override
  public void simulationPeriodic() {}
}
