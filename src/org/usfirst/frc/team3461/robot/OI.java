package org.usfirst.frc.team3461.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team3461.robot.commands.Drive;
import org.usfirst.frc.team3461.robot.commands.DriveForward;
import org.usfirst.frc.team3461.robot.commands.SpinHopper;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public Joystick joy0 = new Joystick(0);
	public Joystick joy1 = new Joystick(1);
	
	Button driveButton = new JoystickButton(joy0, 1);
	Button hopperButton = new JoystickButton(joy1, 1);
	
	public OI() {
		driveButton.whileHeld(new DriveForward());
		hopperButton.whileHeld(new SpinHopper());
	}
	
	/**
	 * Create subsystem for Hopper
	 * Add a motor (Talon)
	 * Create a command to run Hopper at .5 speed
	 * Add A button to activate command
	 */
	
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
}
