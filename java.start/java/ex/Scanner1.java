package java.ex;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		System.out.println(" 문자열을 입력하세요");
		String str = Scanner.nextLine();
		System.out.println("입력한 문자열: " + str);
	}

}
