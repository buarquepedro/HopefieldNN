package hopefield;

public class ActivationFunction {

	public static double step(double output) {
		return (output >= 0.0) ? 1.0 : -1.0;
	}

}
