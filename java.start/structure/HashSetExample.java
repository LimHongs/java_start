package structure;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> uniqueFruits = new HashSet<>();

        // 요소 추가
        uniqueFruits.add("apple");
        uniqueFruits.add("banana");
        uniqueFruits.add("apple"); // 중복 요소는 추가되지 않음

        // 요소 출력
        System.out.println("고유 과일 목록: " + uniqueFruits);

        // 요소 존재 여부 확인
        if (uniqueFruits.contains("banana")) {
            System.out.println("banana가 목록에 있습니다.");
        }

        // 요소 삭제
        uniqueFruits.remove("apple");
        System.out.println("수정된 고유 과일 목록: " + uniqueFruits);
    }
}
