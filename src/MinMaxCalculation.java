import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JTextField;
import javax.swing.text.JTextComponent;


public class MinMaxCalculation{

	//Instance variables
	double minimum;
    double maximum;

	public MinMaxCalculation() {
		this.minimum = Double.POSITIVE_INFINITY;
        this.maximum = -1 * minimum;
	}

	public void update(ArrayList<Double> numbers) {
		this.minimum = min(this.minimum, BasicStats.getArrayDouble(numbers));
        this.maximum = max(this.maximum, BasicStats.getArrayDouble(numbers));
	}
}
