package structure;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution3 {
	 public static void main(String[] args) {
	        List<Map<String, Object>> list = List.of(
	            Map.of(
	                "id", "id1",
	                "pw", "qwer",
	                "email", "asd@email.com"
	            ),
	            Map.of(
	                "id", "id2",
	                "pw", "qwer",
	                "email", "asd@email.com"
	            ),
	            Map.of(
	                "id", "some_id",
	                "pw", "qwer",
	                "email", "asds@email.com"
	            ),
	            Map.of(
	                "id", "other_id",
	                "pw", "qwer",
	                "email", "asdq@email.com"
	            ),
	            Map.of(
	                "id", "someId",
	                "pw", "qwer",
	                "email", "asd@email.com"
	            ),
	            Map.of(
	                "id", "otherId",
	                "pw", "qwer",
	                "email", "fasdd@email.com"
	            ),
	            Map.of(
	                "id", "nickname",
	                "pw", "qwer",
	                "email", "acvb@email.com"
	            ),
	            Map.of(
	                "id", "hello",
	                "pw", "qwer",
	                "email", "fasdd@email.com"
	            )
	        );

	        // 중복 확인용 Set과 중복된 이메일을 담을 리스트 선언
	        Set<String> uniqueEmails = new HashSet<>();
	        List<Map<String, Object>> duplicateEmails = new ArrayList<>();

	        // List의 각 Map을 순회하며 email 값을 체크
	        for (int i = 0; i < list.size(); i++) {
	            Map<String, Object> map = list.get(i);

	            // email 값을 가져오기
	            String email = (String) map.get("email");

	            // email이 이미 uniqueEmails에 있다면 중복으로 판단하고, 리스트에 추가
	            if (uniqueEmails.contains(email)) {
	                duplicateEmails.add(map);
	            } else {
	                // uniqueEmails에 email을 추가하여 중복 체크에 대비
	                uniqueEmails.add(email);
	            }
	        }

	        // 중복된 이메일을 가진 항목들 출력
	        System.out.println("중복된 이메일을 가진 항목들: ");
	        for (Map<String, Object> duplicate : duplicateEmails) {
	            System.out.println(duplicate);
	        }
	    }
	}