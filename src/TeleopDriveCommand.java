public class TeleopDriveCommand {

    private final Chassis chassis = Chassis.getChassis();

    private double kP = 0.00;
    private double kV = 0.00;
    public double kI = 0.00;

    public TeleopDriveCommand() {
        requires(chassis);
    }

    private void requires(Chassis chassis) {
    }

    private double desensitize(double value, double power) {
        return Math.pow(Math.abs(value), power -1) * value;
    }
}
