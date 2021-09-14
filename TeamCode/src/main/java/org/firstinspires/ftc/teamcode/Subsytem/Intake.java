package org.firstinspires.ftc.teamcode.Subsytem;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Intake {

    DcMotor intakeMotor1;
    DcMotor intakeMotor2;

    public void Intake(HardwareMap hardwareMap){

        intakeMotor1 = hardwareMap.dcMotor.get("intake_motor_1");

            intakeMotor2 = hardwareMap.dcMotor.get("intake_motor_2");


    }

    public void initIntake(){

    }//end of function

    public void startIntake(){
    }//end of function

    public void stopIntake(){
    }//end of function

}//end of class
