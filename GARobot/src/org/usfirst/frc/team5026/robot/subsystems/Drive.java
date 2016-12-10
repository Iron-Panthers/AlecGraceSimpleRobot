package org.usfirst.frc.team5026.robot.subsystems;

import org.usfirst.frc.team5026.robot.Hardware;
import org.usfirst.frc.team5026.robot.Robot;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Drive extends Subsystem{
	
	private Hardware hardware;
	
	public Drive() {
		hardware = Robot.hardware;
	}
	
	public void setPower(double power){
		hardware.leftDrive.set(power);
		hardware.rightDrive.set(power);
	}
	
	public void stopMotor(){
		setPower(0);
	}
	
}
