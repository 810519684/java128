package org.project.test;

import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.project.model.User;
import org.project.service.userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:ApplicationContext-mybatis.xml", "classpath:spring-servlet.xml" })
public class userTest {

	@Autowired

	private userservice userservice;

	@Before
	public void Setup() {

	}

	@Test
	@Ignore
	public void TestFindUserList() {

		   List<User> list = userservice.findUserList();

		   for (User user : list) {

			System.out.println(user);

		}

	}

	@Test
//	@Ignore
	public void TestUser() {

		User user = new User();

		user.setUserName("huhaiyi0201");

		System.out.println(user.getUserName());
		
		 User  users=userservice.getUserByuserName(user.getUserName());
		  
		 System.out.println(users); 
		 
		 
		 
		/* for (User user2 : users) {
		  
		 System.out.println(user2); }
		 */

	

	//测试没问题
		//userservice.deleteUserByuserName(user);

	}

}
