package org.usfirst.frc.team3461.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	
	//speed controller example:

	
	Talon talon1 = new Talon(0);
	Talon talon2 = new Talon(1);
	Talon talon3 = new Talon(2);

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
	
	public void right(double speed) {
		talon1.set(speed);
	}
	public void left(double speed) {
		talon2.set(speed);
	}
	public void center(double speed) {
		talon3.set(speed);
	}
}
