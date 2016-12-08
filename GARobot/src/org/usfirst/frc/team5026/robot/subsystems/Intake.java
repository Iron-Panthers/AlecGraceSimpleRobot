package org.usfirst.frc.team5026.robot.subsystems;

import org.usfirst.frc.team5026.robot.Hardware;
import org.usfirst.frc.team5026.robot.Robot;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Intake extends Subsystem {
	
	public Hardware hardware;
	
	public Intake() {
		hardware = Robot.hardware;
	}

	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
	}
	
	
	public void runMotorIntake() {
		hardware.intakeMotor.set(1);
	}

}
