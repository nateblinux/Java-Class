package org.usfirst.frc.team3461.robot.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Hopper extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	Talon hopper = new Talon(3);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void setSpeed(double speed) {
    	hopper.set(speed);
    }
    
    
}

