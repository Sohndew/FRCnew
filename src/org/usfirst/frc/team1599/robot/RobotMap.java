/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team1599.robot;


public enum RobotMap {
	//PWM motor mappings
	LEFT_MOTOR(0), 
	RIGHT_MOTOR(1),
	//control mappings
	LEFT_JOYSTICK(0),
	RIGHT_JOYSTICK(1);
	
	
	
	public final int value;
	RobotMap(int value)
	{
		this.value = value;
	}
}
