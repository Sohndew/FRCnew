package org.usfirst.frc.team1599.robot.subsystems;

import org.usfirst.frc.team1599.robot.RobotMap;
import org.usfirst.frc.team1599.robot.commands.TankDrive;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveBase extends Subsystem {
	private CANTALON  leftMotor;
	private Talon rightMotor;
	
	public DriveBase() {
		leftMotor = new Talon(RobotMap.LEFT_MOTOR.value);
		rightMotor = new Talon(RobotMap.RIGHT_MOTOR.value);
	}
	
	public void setRaw(double leftvalue, double rightvalue) {
		leftMotor.set(leftvalue);
		rightMotor.set(rightvalue);
	}
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new TankDrive());
	}

}
