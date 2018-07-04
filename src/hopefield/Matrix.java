package hopefield;

public class Matrix {

	public static double[][] createMatrix(int rows, int cols) {
		return new double[rows][cols];
	}

	public static double[] innerProduct(double[][] matrix, double[] vector) {
		double[] output = new double[vector.length];
		for (int i = 0; i < matrix.length; ++i) {
			double sum = 0;
			for (int j = 0; j < matrix.length; ++j)
				sum += matrix[i][j] * vector[j];
			output[i] = sum;
		}
		return output;
	}

	public static double[][] outerProduct(double[] v, double[] w) {
		double[][] output = new double[v.length][w.length];
		for (int i = 0; i < v.length; ++i)
			for (int j = 0; j < w.length; ++j)
				output[i][j] = v[i] * w[j];
		return output;
	}

	public static double[][] clearDiagonals(double[][] matrix) {
		for (int i = 0; i < matrix.length; ++i)
			matrix[i][i] = 0;
		return matrix;
	}

	public static double[][] addMatrix(double[][] m, double[][] n) {
		double[][] out = new double[m.length][m.length];
		for (int i = 0; i < m.length; ++i)
			for (int j = 0; j < m.length; ++j)
				out[i][j] = m[i][j] + n[i][j];
		return out;
	}

}
