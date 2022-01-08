public class USD extends Coin {
    final double value = 3.52;   ////USD Value
    @Override
    public double calculate(double value) {  /// Calculate the Coin Value With The User Enter Value
        return value * getValue();
    }

    @Override
    double getValue() {
        return value;
    }    /// Return The New Value



}