package structure;
import java.util.List;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ListToMapExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "orange");

        // 인덱스를 키로 사용하여 Map으로 변환
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            map.put(i, list.get(i));  // 인덱스를 키로, 리스트의 값을 맵의 값으로 저장
        }

        // 결과 출력
        System.out.println(map);
    }
}
