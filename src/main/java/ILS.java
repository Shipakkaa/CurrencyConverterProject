public class ILS extends Coin {
    final double value = 0.28;


    @Override
    public double calculate(double value) {
        return value * getValue();
    }

    double getValue() {
        return value;
    }
}
