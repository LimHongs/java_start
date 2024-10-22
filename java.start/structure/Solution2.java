package structure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution2 {
	public static void main(String[] args) {
		// List 안에 Map 형식으로 key, value 값을 넣는다
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
					"id", "some_id"
					, "pw", "qwer",
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
		//  Map String 키값에 맞는 데이터값들을 가져온다
		Map<String, List<Map<String, String>>> answer = new HashMap<>();
		//  int i = 0; list.size 길이보다 작을때까지, i를 1씩증가한다
		for (int i = 0; i < list.size(); i++) {
			// Map 만들고 list안에 i번째를 가져온다
			Map<String, String> map = list.get(i);

			String email = map.get("email");

			if (answer.get(email) != null) {
				List<Map<String, String>> tmpList = answer.get(email);
				Map<String, String> tmpMap = new HashMap<>();

				tmpMap.put("id", map.get("id"));
				tmpMap.put("pw", map.get("pw"));

				tmpList.add(tmpMap);
				answer.put(email, tmpList);

			} else {
				List<Map<String, String>> tmpList = new ArrayList<>();
				Map<String, String> tmpMap = new HashMap<>();

				tmpMap.put("id", map.get("id"));
				tmpMap.put("pw", map.get("pw"));

				tmpList.add(tmpMap);
				answer.put(email, tmpList);
			}
		}

		System.out.println(answer.toString());

		List<Map<String, String>> newAnswer = new ArrayList<>();

		Set<String> set = answer.keySet();
		Iterator<String> it = set.iterator();

		while (it.hasNext()) {
			String email = it.next();
			List<Map<String, String>> newList = answer.get(email);

			for (int i = 0; i < newList.size(); i++) {
				Map<String, String> newMap = newList.get(i);
				Map<String, String> tmpMap = new HashMap<>();

				tmpMap.put("id", newMap.get("id"));
				tmpMap.put("pw", newMap.get("pw"));
				tmpMap.put("email", email);

				newAnswer.add(tmpMap);
			}
		}
		System.out.println(newAnswer.toString());

	}
}
