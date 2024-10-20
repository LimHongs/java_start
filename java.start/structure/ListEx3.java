package structure;

public class ListEx3 {
    // 주어진 배열의 요소를 모두 2배로 변경하는 프로그램
    public static void main(String[] args) {
        String[] fruits = {"apple","banana", "cherry"};

        // 각 요소를 두배로 변경
        String[] doubledFruits = new String[fruits.length];
        for (int i = 0; i < fruits.length; i++){
            doubledFruits[i] = fruits[i] + fruits[i];
        }

        System.out.println("변경된 과일목록");
        for (String fruit : doubledFruits) {
            System.out.println(fruit);
        }
    }
}
