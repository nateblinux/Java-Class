package org.usfirst.frc.team3461.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team3461.robot.Robot;

/**
 *
 */
public class Drive extends Command {
	public Drive() {
		// Use requires() here to declare subsystem dependencies
		requires(Robot.driveTrain);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		Robot.driveTrain.right(Robot.oi.joy0.getY());
		Robot.driveTrain.left(Robot.oi.joy1.getY());
		Robot.driveTrain.center(Robot.oi.joy1.getX());
	}
	
	
	/**
	 * Create subsystem for Hopper
	 * Add a motor (Talon)
	 * Create a command to run Hopper at .5 speed
	 * Add A button to activate command
	 */
	

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
	}
}
