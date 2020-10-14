public class drivingForward {

    private final Chassis chassis = Chassis.getChassis();

    public drivingForward() {
        requires(chassis);
    }

    private void requires(Chassis chassis) {
    }

    @Override
    protected void initialize() {
        chassis.setPower(0, 0);
    }
}
