package org.firstinspires.ftc.teamcode.Subsytem;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class SSMotor{

    Telemetry telemetry;

    //Object Declaration
    DcMotor leftMotor;
    DcMotor rightMotor;

    //Variable Declaration
    //data_type variable_name = initial_value
    static final int MOTOR_TICK_COUNT = 1120;
    double diameter = 5;
    //double distance = 200;
    int drivingTarget;


    double circumference = diameter* Math.PI;

    public SSMotor(HardwareMap hardwareMap) {

        //connect software name to hardwarename
        leftMotor = hardwareMap.dcMotor.get("left_motor");
        rightMotor = hardwareMap.dcMotor.get("right_motor");
    }


    public void resetMotor(){

        leftMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        rightMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    }


    public int calculateTargetPosition (double distance){

        double circumference ;
        double rotations;
        double encoderDrivingTarget;

        circumference = diameter * Math.PI;
        rotations =  distance/ circumference;
        encoderDrivingTarget =  5 * rotations * MOTOR_TICK_COUNT;

        int drivingTarget = (int) encoderDrivingTarget;
        return drivingTarget;
    }//end of function

    public void moveToTargetPosition(double distance){

        int target = 0;
        double distanceToBeMoved = 0;

        distanceToBeMoved = calculateTargetPosition(distance);
        target = calculateTargetPosition(distanceToBeMoved);


        leftMotor.setTargetPosition(0);
        rightMotor.setTargetPosition(0);

        while (leftMotor.isBusy() || rightMotor.isBusy()){
          telemetry.addLine ("Still driving");
          telemetry.update();
    }//end of function

    public void stopMotors(){
            leftMotor.setPower (0);
            rightMotor.setPower (0);
        }//end of function










}//end of Class