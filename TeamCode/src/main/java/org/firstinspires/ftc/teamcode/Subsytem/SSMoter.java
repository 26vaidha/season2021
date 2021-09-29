package org.firstinspires.ftc.teamcode.Subsytem;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class SSMoter{


    Telemetry telemetry;

    //Object Declaration
    DcMotor leftMoter;

    //Variable Declaration
    //data_type variable_name = inital_value
    static final int MOTER_TICK_COUNT = 1120;
    double diameter = 5;


    double circumference = diameter* Math.PI;

    public SSMoter(HardwareMap hardwareMap) {

        //connect software name to hardwarename
        leftMoter = hardwareMap.dcMotor.get("left_motor");
    }


    public void runLeftMoter(){
        leftMoter.setMode (DcMotor.RunMode.STOP_AND_RESET_ENCODER);

    }


}//end of Class