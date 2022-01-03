public class USD extends Coin {
    final double value = 3.52;
    @Override
    public double calculate(double value) {
        return value * getValue();
    }

    @Override
    double getValue() {
        return value;
    }



}