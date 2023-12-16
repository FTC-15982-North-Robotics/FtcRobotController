package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

public class Teleop1 extends LinearOpMode {
    public DcMotor frontLeft;
    public DcMotor frontRight;
    public DcMotor backLeft;
    public DcMotor backRight;
    public Servo arm;

    @Override
    public void runOpMode() {
        frontLeft = hardwareMap.get(DcMotor.class, "front_left");
        frontRight = hardwareMap.get(DcMotor.class, "front_right");
        backLeft = hardwareMap.get(DcMotor.class, "back_left");
        backRight = hardwareMap.get(DcMotor.class, "back_right");

        arm = hardwareMap.get(Servo.class, "arm1");

        waitForStart();

        while (opModeInInit()) {
//            double speed;
//            speed = 1;
//            backLeft.setPower(((1 * gamepad1.left_stick_y + gamepad1.left_stick_x) - gamepad1.right_stick_x) * speed);
//            backRight.setPower(((-1 * gamepad1.left_stick_y + gamepad1.left_stick_x) - gamepad1.right_stick_x) * speed);
//            frontLeft.setPower(((1 * gamepad1.left_stick_y - gamepad1.left_stick_x) - gamepad1.right_stick_x) * speed);
//            frontRight.setPower(((-1 * gamepad1.left_stick_y - gamepad1.left_stick_x) - gamepad1.right_stick_x) * speed);
//
//            double speed = -gamepad1.left_stick_y;
//            double turn = gamepad1.right_stick_x;
//            double strafe = gamepad1.left_stick_x;
//            frontLeft.setPower(speed + turn + strafe);
//            frontRight.setPower(speed - turn - strafe);
//            backLeft.setPower(speed + turn - strafe);
//            backRight.setPower(speed - turn + strafe);
//
//            double x = gamepad1.left_stick_x;
//            double y = gamepad1.left_stick_y*-1;
//            double turn = gamepad1.right_stick_x;
//            double theta = Math.atan2(y, x);
//            double power = Math.hypot(x, y);
//            double sin = Math.sin(theta - Math.PI/4);
//            double cos = Math.cos(theta - Math.PI/4);
//            double max = Math.max(Math.abs(sin), Math.abs(cos));
//            frontLeft.setPower(power * cos/max + turn);
//            frontRight.setPower(power * sin/max - turn);
//            backLeft.setPower(power * sin/max + turn);
//            backRight.setPower(power * cos/max - turn);
//            if ((power + Math.abs(turn)) > 1) {
//                frontLeft.setPower((frontLeft.getPower()) / power + turn);
//                frontRight.setPower((frontRight.getPower()) / power + turn);
//                backLeft.setPower((backLeft.getPower()) / power + turn);
//                backRight.setPower((backRight.getPower()) / power + turn);
//            }
        }
    }
}
