package test.eleven;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 
 * @author need4spd, need4spd@cplanet.co.kr
 * 
 * @date 2009. 12. 2.
 * 
 * 
 */

public class Test {

	public static void main(String[] args) {

		User user1 = new User("111");
		User user2 = new User("111");

		System.out.println(user1);
		System.out.println(user2);
		System.out.println(user1==user2);
		System.out.println(user1.equals(user2)); // 결과는? .getClass()는 런타임에 getClass()를 호출한 클래스의 java.lang.Class 타입을 리턴한다. true 

		List<User> userList = new ArrayList<User>();
		userList.add(user1);

		System.out.println(userList.contains(user2)); // 결과는? 원소를 가지고 있는지를 파악하는 Contains메소드. true

		Map<User, Integer> userScoreMap = new HashMap<User, Integer>();
		userScoreMap.put(user1, 100);
		userScoreMap.put(user2, 100);

		System.out.println(userScoreMap.size()); // 결과는? 2

		Map<String, Integer> userNameScoreMap = new HashMap<String, Integer>();
		userNameScoreMap.put("장용석", 100);
		userNameScoreMap.put("장용석", 100);

		System.out.println(userNameScoreMap.size()); // 결과는? key값이 같으므로 size는 1

		// Set<User> userSet = new TreeSet<User>();
		// userSet.add(user1);
		// userSet.add(user2);
		// System.out.println(userSet.size());
	}
}
