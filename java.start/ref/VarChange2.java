package ref;

public class VarChange2 {
	public static void main(String[] args) {
		Data dataA = new Data();
		dataA.value = 10;
		Data dataB = dataA;

		System.out.println("dataA참조값=" +dataA);
		System.out.println("dataB참조값=" +dataB);
		System.out.println();

		System.out.println("dataA참조값=" +dataA.value);
		System.out.println("dataB참조값=" +dataB.value);
		System.out.println();

		dataA.value = 20;
		System.out.println("변경 dataA.value = 20 ");
		System.out.println("dataA=" +dataA.value);
		System.out.println("dataB=" +dataB.value);
		System.out.println();

		dataB.value = 30;
		System.out.println("변경 datab.value = 30 ");
		System.out.println("dataA=" +dataA.value);
		System.out.println("dataB=" +dataB.value);
	}

}
