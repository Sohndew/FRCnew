package org.usfirst.frc.team1599.robot.commands;


import org.usfirst.frc.team1599.robot.*;
import edu.wpi.first.wpilibj.command.Command;

public class TankDrive extends Command {

	public TankDrive() {
		requires(Robot.drivebase);
	}

	protected void initialize() {

	}

	protected void execute() {
		double throttle = (1.0 - Robot.oi.LEFT_JOY.getThrottle()) / -2.0;
		
		Robot.drivebase.setRaw(Robot.oi.getLeftJoyY(),Robot.oi.getRightJoyY());
	}

	protected boolean isFinished() {

		return false;
	}

	protected void interrupted() {
			end();
	}

}
