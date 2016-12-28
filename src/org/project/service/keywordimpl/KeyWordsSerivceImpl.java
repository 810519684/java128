package org.project.service.keywordimpl;

import org.project.dao.keyWord.KeyWordsMapper;
import org.project.model.KeyWords;
import org.project.service.KeyWordsSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KeyWordsSerivceImpl implements KeyWordsSerivce{
	
	@Autowired
	private KeyWordsMapper KeyWordsMapper;
	
	
	
	

	@Override
	public void insertKeyWord(KeyWords keyWords) {
		// TODO Auto-generated method stub
		
		this.KeyWordsMapper.insertKeyWord(keyWords);
	}
	
	
	
	

}
