public class EUR extends Coin{
    final double value = 4.23;
    public double calculate(double value) {
        return value / getValue();
    }
    @Override
    double getValue() {
        return value;
    }
}
