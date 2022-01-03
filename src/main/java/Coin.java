public abstract class Coin implements ICalcualte {

    @Override
    public double calculate(double value) {
        return ICalcualte.super.calculate(value);
    }

    abstract double getValue();
}
