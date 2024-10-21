package structure;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> ages = new HashMap<>();

        // 키-값 쌍 추가
        ages.put("Alice", 30);
        ages.put("Bob", 25);
        ages.put("Charlie", 35);


        // 값 출력
        System.out.println("Alice의 나이: " + ages.get("Alice"));

        // 전체 키-값 쌍 출력
        System.out.println("모든 나이 정보: " + ages);

        // 키 삭제
        ages.remove("Bob");
        System.out.println("수정된 나이 정보: " + ages);
    }
}
