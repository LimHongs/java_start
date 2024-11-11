package structure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution5 {
	public static void main(String[] args) {
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
		/**
		 * 1. 이메일 기준으로 키값 만든다
		 * 2. 이메일 기준으로 돌면서 값을 넣는다
		 * 3. 값을 넣고 이메일 키값으로 중복된 값들을 다시 map형식에서 처음형식으로 다시 돌려놓는다
		 */
		Map<String, List<Map<String, String>>> answer = new HashMap<>();
		for (int i = 0; i < list.size(); i++) {
			Map <String, String> map = list.get(i);
			//System.out.println(list.get(i));
			// 값이 돌고있으니까 이메일 변수 선언하고 이메일 키값에 넣을 map을 두개만든다


		}


		List<Map<String, String>> newAnswer = new ArrayList<>();


	}

}
