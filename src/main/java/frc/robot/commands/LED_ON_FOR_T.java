/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot; //added by DK

public class LED_ON_FOR_T extends Command {

  private int delay_time;

  public LED_ON_FOR_T() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.LEDs);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {

    delay_time = 0;
    
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    Robot.LEDs.Red_LED.set(false);
    Robot.LEDs.Yellow_LED.set(false);
    Robot.LEDs.Green_LED.set(false);

    delay_time = delay_time + 20; //increment delay time by 20 ms
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {

    if(delay_time >= 1000) return true;  //if delay time is >1000ms or 1s then quit
    else return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.LEDs.Red_LED.set(true);
    Robot.LEDs.Yellow_LED.set(true);
    Robot.LEDs.Green_LED.set(true);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
