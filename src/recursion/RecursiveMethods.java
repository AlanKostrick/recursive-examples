package recursion;

public class RecursiveMethods {

	// example 1
	public int mystery(int n) {
		if (n < 0) {
			return n * 2;
		} else {
			return mystery(n - 1) + mystery(n - 2);
		}
	}

	// example 2
	public int mystery(int n, int a, int b) {
		if (n == 0) {
			return a;
		} else {
			return b * mystery(n - 1, a, b);
		}
	}

	// example 3
	public int recur(int n) {
		if (n <= 10) {
			return n * 2;
		} else {
			return recur(recur(n / 3));
		}
	}

	// example 4
	public int recur(int n, int a, int b) {
		if (n == 1) {
			return a;
		} else {
			return b + recur(n - 1, a, b);
		}
	}

	// example 5
	public int recur(int k, int n) {
		if (n == k) {
			return k;
		} else {
			if (n > k) {
				return recur(k, n - k);
			} else {
				return recur(k - n, n);
			}
		}
	}

	// example 6
	public int result(int n) {
		if (n == 1) {
			return 2;
		} else {
			return 2 * result(n - 1);
		}
	}

}
