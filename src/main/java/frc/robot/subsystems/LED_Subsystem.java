/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalOutput;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.LED_OFF; //Added by DK
  
/**
 * Add your docs here.
 */
public class LED_Subsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public DigitalOutput Green_LED = new DigitalOutput(RobotMap.GreenLEDPin);
  public DigitalOutput Red_LED = new DigitalOutput(RobotMap.RedLEDPin);
  public DigitalOutput Yellow_LED = new DigitalOutput(RobotMap.YellowLEDPin);

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new LED_OFF());
  }
}
