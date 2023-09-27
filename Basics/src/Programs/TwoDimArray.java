package Programs;

public class TwoDimArray {
	public static void main(String[] args) {
		String[] ref1 = { "aa", "bb", "cc" };
		String[] ref2 = { "aaa", "bbb", "ccc" };
		String[] ref3 = { "aaaa", "bbbb", "cccc" };
		String[] ref4 = { "aaaaa", "bbbbb", "ccccb" };

		// data type is important

		String[][] ref = { ref1, ref2, ref3, ref4 };
		System.out.println(ref[2][1]);

		String[][] reff = { { "A", "B", "C" }, { "D", "E", "F" }, { "G", "H", "I" } };

		System.out.println(reff[2][1]);
	}
}
