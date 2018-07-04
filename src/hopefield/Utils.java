package hopefield;

public class Utils {

	public static double[] encode(double[] pattern) {
		for (int i = 0; i < pattern.length; ++i)
			if (pattern[i] == 0)
				pattern[i] = -1;
		return pattern;
	}

	public static double[] decode(double[] pattern) {
		for (int i = 0; i < pattern.length; ++i)
			if (pattern[i] == -1)
				pattern[i] = 0;
		return pattern;
	}

}
