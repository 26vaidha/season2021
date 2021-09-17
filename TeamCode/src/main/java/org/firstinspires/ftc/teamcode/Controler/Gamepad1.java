package org.firstinspires.ftc.teamcode.Controler;

import com.qualcomm.robotcore.hardware.Gamepad;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class Gamepad1{

    Gamepad gamepad1;
    Telemetry telemetry;


    float x_value_left= 0;
    float x_value_right= 0;
    float y_value_left= 0;
    float y_value_right= 0;


    public Gamepad1 (Gamepad gampad) {

        gamepad1= gamepad1;
    }

    public void gamepadAction() {


        x_value_left = gamepad1.left_stick_x;

    }//end of function gamepadAction

}//end of class