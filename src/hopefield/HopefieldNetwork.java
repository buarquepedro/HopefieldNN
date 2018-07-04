package hopefield;

import java.util.Arrays;

public class HopefieldNetwork {

	private double[][] weights;

	public HopefieldNetwork(int dim) {
		this.weights = new double[dim][dim];
	}

	public void train(double[] pattern) {
		double[] bipolar = Utils.encode(pattern);
		double[][] patternMatrix = Matrix.outerProduct(bipolar, bipolar);
		patternMatrix = Matrix.clearDiagonals(patternMatrix);
		this.weights = Matrix.addMatrix(this.weights, patternMatrix);
	}

	public void recall(double[] pattern) {
		double[] bipolar = Utils.encode(pattern);
		double[] output = Matrix.innerProduct(this.weights, bipolar);
		for (int i = 0; i < output.length; ++i)
			output[i] = ActivationFunction.step(output[i]);

		pattern = Utils.decode(pattern);
		output = Utils.decode(output);
		System.out.println(Arrays.toString(pattern) + " -> " + Arrays.toString(output));
	}

}
