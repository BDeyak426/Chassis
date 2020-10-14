import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import java.util.ArrayList;

public class Chassis {

    private static final Chassis CHASSIS = new Chassis();

    private final ArrayList<CANSparkMax> motors = new ArrayList<CANSparkMax>();

    private final CANSparkMax leftFront = new (RobotMap.LEFT_FRONT, CANSparkMaxLowLevel.MotorType.kBrushless);
    private final CANSparkMax leftBack = new(RobotMap.LEFT_BACK, CANSparkMaxLowLevel.MotorType.kBrushless);
    private final CANSparkMax rightFront = new(RobotMap.RIGHT_FRONT, CANSparkMaxLowLevel.MotorType.kBrushless);
    private final CANSparkMax rightBack = new(RobotMap.RIGHT_BACK, CANSparkMaxLowLevel.MotorType.kBrushless);

}

    public static Chassis getChassis() {
        return CHASSIS;
    }

    public void setPower(double forwardPower, double rotatePower) {
        setLeftAndRightPower(forwardPower - rotatePower, forwardPower + rotatePower);
    }

    public void setLeftAndRightPower(double left, double right) {
        leftFront.set(left);
        rightFront.set(right);
    }

    public ArrayList<CANSparkMax> getInfoForMotors() {
        return motors;
    }

    public void initDefaultCommand() {
        setDefaultCommand(new TeleopDriveCommand());
    }

    private void setDefaultCommand(TeleopDriveCommand teleopDriveCommand) {
    }

    public void setIdleMode(CANSparkMax.IdleMode idle) {
    }
    private Chassis() {
        motors.add(leftFront);
        motors.add(leftBack);
        motors.add(rightFront);
        motors.add(rightBack);

        leftBack.follow(leftFront);
        rightBack.follow(rightBack);
}
}
