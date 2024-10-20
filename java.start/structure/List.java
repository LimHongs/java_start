package structure;

public class List {
    public static void main(String[] args) {
    int[] numbers = {10, 20, 30, 40, 50};

        System.out.println(numbers[2]);
        System.out.println(numbers.length);
        System.out.println();


        // 배열 반복문

        int sum = 0;
        int count = 0;

        for(int num : numbers) {
            if (count >= 3) {
                break;
            }
            sum += num;
            count++;
        }
        System.out.println("배열의 합계[3]:" + sum);




    }
}
