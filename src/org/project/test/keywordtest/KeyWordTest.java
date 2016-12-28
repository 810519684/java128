package org.project.test.keywordtest;

import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.project.model.KeyWords;
import org.project.model.User;
import org.project.service.KeyWordsSerivce;
import org.project.service.userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:ApplicationContext-mybatis.xml", "classpath:spring-servlet.xml" })
public class KeyWordTest {

	@Autowired

	private KeyWordsSerivce keyWordsSerivce;



	
	@Test
//	@Ignore
	public void TestUser() {

		 KeyWords keyWords=new KeyWords();
		 
		 keyWords.setAgentName("网易");
		 keyWords.setAgentId(1);
		 keyWords.setCustomName("haiyi");
		 keyWords.setKeywords("方便面");
		 
		 keyWordsSerivce.insertKeyWord(keyWords);
	

	}

}
