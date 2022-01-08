public class EUR extends Coin{
    final double value = 4.23;   ///Euro Value
    public double calculate(double value) {   /// Calculate the Coin Value With The User Enter Value
        return value / getValue();
    }
    @Override
    double getValue() {
        return value;
    }     /// Return The New Value
}
