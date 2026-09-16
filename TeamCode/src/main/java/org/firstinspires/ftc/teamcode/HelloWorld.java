package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

//@Disabled deshabilita el codigo que creamos para que no se vea en el HUB del robot
@Disabled
@TeleOp
public class HelloWorld extends OpMode {

    @Override
    public void init() {
        telemetry.addData("Hello","mate!");
    }

    @Override
    public void loop() {
    }
    //single line comment (these are only comments)
    /*
    1.Hello: World, change the telemetry data to display "Hello": Mate?"
    2.Run this code in the autonomous section (only substitute @TeleOp by @autonomous)
     */
}
