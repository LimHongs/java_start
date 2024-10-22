package structure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution4 {
	public static void main(String[] args) {
		//List를 Map형식으로 만들고 List.of 안에 Map 값들을 넣는다
		List<Map<String, String>> list = List.of(
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
		// Map 키값을 통해서 List안에 map을 answer 로 선언한다
		Map<String, List<Map<String, String>>> answer = new HashMap<>();
		// for문을 돌려서 i가 0일때 List안에 길이보다 적을때까지 i를 1씩 증가시킨다
		for(int i = 0; i < list.size(); i++) {
			// i번째 돌고있을때 map 안에 값을 list안에 있는 맵에 값 i 번째를 넣는다
			Map<String, String> map = list.get(i);
			//email을 변수를 사용할때는  i번째 email 값을 불러온다
			String email = map.get("email");
			// 조건을 걸고 answer email 값이 null 이 아닐때
			if (answer.get(email) != null) {
				// map 값을 tmpList로 선언하고 i 번째 email 값을 가져온다
				List<Map<String, String>> tmpList = answer.get(email);
				// Map 안에 값들을 tmpMap이라고 쓰고 HashMap 으로 초기화한다
				Map<String, String> tmpMap = new HashMap<>();
				// tmpMap안에 id 를 넣고 Map안에 id 값을 불러온다
				tmpMap.put("id", map.get("id"));
				tmpMap.put("pw", map.get("pw"));
				// tmpList 안에 tmpMap 에값을 넣고
				tmpList.add(tmpMap);
				// answer 안에 email이랑 tmpList 값을 대입한다
				answer.put(email, tmpList);

			} else {
				// List안에 map 에 값을 넣기위해 tmpList를 선언한다
				List<Map<String, String>> tmpList = new ArrayList<>();
				// map 은 tmpMap으로 선언한다
				Map<String, String> tmpMap = new HashMap<>();
				// tmpMap 객체
				tmpMap.put("id", map.get("id"));
				tmpMap.put("pw", map.get("pw"));

				tmpList.add(tmpMap);
				answer.put(email, tmpList);
			}
		}
		//System.out.println(answer.toString());

		List<Map<String, String>> newAnswer = new ArrayList<>();

		Set<String> set = answer.keySet();
		Iterator<String> it = set.iterator();

		while (it.hasNext()) {
			String email = it.next();
			List<Map<String, String>> newList = answer.get(email);

			for (int i = 0; i < newList.size(); i++) {
				// tmpMap안에 newMap list들을 가져온다
				Map<String, String> newMap = newList.get(i);
				Map<String, String> tmpMap = new HashMap<>();

				tmpMap.put("id", newMap.get("id"));
				tmpMap.put("pw", newMap.get("pw"));
				tmpMap.put("email", email);

				newAnswer.add(newMap);
			}
			System.out.println(newAnswer.toString());
		}



		      // 동일한 이메일인 경우 아이디와 비밀번호를 한 리스트로 관리
		      // 동일한 email을 키로하는 map에
		      // id, pw를 키로하는 map을 가진 list로 변환
	}

}
