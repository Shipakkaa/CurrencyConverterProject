public class ILS extends Coin {
    final double value = 0.28;    ///ILS Value


    @Override
    public double calculate(double value) {   /// Calculate the Coin Value With The User Enter Value
        return value * getValue();
    }

    double getValue() {  /// Return The New Value
        return value;
    }
}
