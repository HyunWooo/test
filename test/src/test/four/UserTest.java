package test.four;

import java.util.ArrayList;

import java.util.List;



/**
* @author need4spd, need4spd@cplanet.co.kr
* @date 2009. 11. 23.
*
*/
public class UserTest {

           public static void main(String[] args) {
                         List<User> userList = new ArrayList<User>();

                         User jys = new User();
                         jys.set나이("31");
                         jys.set이름("장용석");
                         jys.set주민번호("111111-2222222");

                         userList.add(jys);

                         User jys2 = new User();
                         jys2.set나이("31");
                         jys2.set이름("장용석");
                         jys2.set주민번호("111111-2222222");

                         //userList.add(jys2);
                         
                         System.out.println(userList.contains(jys)); //이건?
                         System.out.println(userList.contains(jys2)); //이것은?
           }
}
