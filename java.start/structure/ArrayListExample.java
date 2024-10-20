package structure;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        // 요소 추가
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");

        // 요소 출력
        System.out.println("과일 목록: " + fruits);

        // 특정 인덱스의 요소 접근
        System.out.println("첫 번째 과일: " + fruits.get(0));

        // 요소 삭제
        fruits.remove("banana");
        System.out.println("수정된 과일 목록: " + fruits);
    }
}
