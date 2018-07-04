package hopefield;

public class App {

	public static void main(String[] args) {
		HopefieldNetwork hp = new HopefieldNetwork(4);
		hp.train(new double[] { 0, 1, 0, 1 });
		hp.recall(new double[] { 0, 1, 0, 1 });
	}

}
