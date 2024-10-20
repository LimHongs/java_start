package structure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionExamples {
/*
* ArrayList:

특징: 동적 배열, 중복 허용, 인덱스를 사용하여 접근
사용법: add(), get(), remove() 메서드 사용
HashMap:

특징: 키-값 쌍으로 저장, 키 중복 불가, 값 중복 허용
사용법: put(), get(), remove() 메서드 사용
HashSet:

특징: 중복되지 않는 요소 집합, 순서 없음
사용법: add(), remove(), contains() 메서드 사용
*
*
* */
    public static void main(String[] args) {
        // ArrayList 예제
        List<String> fruits = new ArrayList<>(); // 동적 배열, 중복 허용
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("apple"); // 중복 추가 가능
        System.out.println("ArrayList (과일 목록): " + fruits);

        // HashMap 예제
        Map<String, Integer> ages = new HashMap<>(); // 키-값 쌍 저장, 키 중복 불가
        ages.put("Alice", 30);
        ages.put("Bob", 25);
        ages.put("Charlie", 35);
        System.out.println("HashMap (이름과 나이): " + ages);

        // HashSet 예제
        Set<String> uniqueFruits = new HashSet<>(); // 중복되지 않는 요소 집합
        uniqueFruits.add("apple");
        uniqueFruits.add("banana");
        uniqueFruits.add("apple"); // 중복은 추가되지 않음
        System.out.println("HashSet (고유 과일 목록): " + uniqueFruits);

        // 추가적인 예제
        // ArrayList의 특정 인덱스 요소 접근
        System.out.println("첫 번째 과일: " + fruits.get(0));

        // HashMap에서 특정 키의 값 접근
        System.out.println("Alice의 나이: " + ages.get("Alice"));

        // HashSet에서 요소 존재 여부 확인
        if (uniqueFruits.contains("banana")) {
            System.out.println("banana가 고유 과일 목록에 있습니다.");
        }
    }
}
