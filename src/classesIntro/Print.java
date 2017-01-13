package classesIntro;

public class Print {

	public static void println(Object obj) {
		System.out.println(obj);
	}

	public static void println() {
		System.out.println();
	}

	public static void print(Object obj) {
		System.out.print(obj);
	}

	public static void printf(String format, Object... args) {
		System.out.printf(format, args);
	}

	public static void printByte(byte printByte) {
		byte byteForPrint = (byte) printByte;
		String byteBinayStr = String.format("%8s",
				Integer.toBinaryString(byteForPrint & 0xFF)).replace(' ', '0');
		byteBinayStr = byteBinayStr.substring(0, 4) + "_"
				+ byteBinayStr.substring(4);
		print(byteBinayStr);
	}

	public static void printlnByte(byte printByte) {
		byte byteForPrint = (byte) printByte;
		String byteBinayStr = String.format("%8s",
				Integer.toBinaryString(byteForPrint & 0xFF)).replace(' ', '0');
		byteBinayStr = byteBinayStr.substring(0, 4) + "_"
				+ byteBinayStr.substring(4);
		println(byteBinayStr);
	}

	public static void printInt(int printInt) {
		String intBinayStr = String.format("%32s",
				Integer.toBinaryString(printInt)).replace(' ', '0');
		intBinayStr = intBinayStr.substring(0, 4) + "_"
				+ intBinayStr.substring(4, 8) + "_"
				+ intBinayStr.substring(8, 12) + "_"
				+ intBinayStr.substring(12, 16) + "_"
				+ intBinayStr.substring(16, 20) + "_"
				+ intBinayStr.substring(20, 24) + "_"
				+ intBinayStr.substring(24, 28) + "_"
				+ intBinayStr.substring(28);
		print(intBinayStr);
	}

	public static void printlnInt(int printInt) {
		String intBinayStr = String.format("%32s",
				Integer.toBinaryString(printInt)).replace(' ', '0');
		intBinayStr = intBinayStr.substring(0, 4) + "_"
				+ intBinayStr.substring(4, 8) + "_"
				+ intBinayStr.substring(8, 12) + "_"
				+ intBinayStr.substring(12, 16) + "_"
				+ intBinayStr.substring(16, 20) + "_"
				+ intBinayStr.substring(20, 24) + "_"
				+ intBinayStr.substring(24, 28) + "_"
				+ intBinayStr.substring(28);
		println(intBinayStr);
	}

	public static void printLine(char lineChar, int q) {
		for (int i = 1; i <= q; ++i)
			print(lineChar);
	}

	public static void printLine(int q) {
		for (int i = 1; i <= q; ++i)
			print('-');
	}

	public static void printLine() {
		for (int i = 1; i <= 10; ++i)
			print('-');
	}

	public static void printLnLineLn() {
		println();
		for (int i = 1; i <= 10; ++i)
			print('-');
		println();
	}
	
	public static void printLnLineLn(char lineChar, int q) {
		println();
		for (int i = 1; i <= q; ++i)
			print(lineChar);
		println();
	}

	public static void printStrInLine(String str, char lineChar, int q) {
		printLine(lineChar, q);
		print(str);
		printLine(lineChar, q);
	}

}
