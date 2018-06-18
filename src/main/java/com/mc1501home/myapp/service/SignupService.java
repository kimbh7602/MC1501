package com.mc1501home.myapp.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class SignupService {
	public Object getObject(Object dataMap) {
		Map<String, Object> resultObject = new HashMap<String, Object>();
		
		final char SPACE_BAR = ' ';
			
		/* set protocol */
		Map<String, Object> protocol = new HashMap<String, Object>();
		protocol.put("10", "��⵵");
		protocol.put("20", "����");
		protocol.put("30", "���");
		protocol.put("100", "����");
		protocol.put("200", "���ǰ���");
		protocol.put("300", "����");
		/* end set protocol */
		
		
		//1. addr
			//
		String addrName = (String) protocol.get(((Map)dataMap).get("addr"));
		
		//2. hobbies
			//������ ������ ������ hobbies�� �ϳ��� string�� ����.
//		StringBuffer hobbies = new StringBuffer();
//		for(String hobbyKey : (String[]) protocol.get(((Map)dataMap).get("hobbies"))) {
//				//key������ ���޵� hobby�� ���� ��(����, ���ǰ��� ��)���� ����
//			String hobbyName = (String) protocol.get(hobbyKey);
//			hobbies.append(hobbyName);
//			hobbies.append(SPACE_BAR);
//		}
		
		resultObject.put("email", ((Map)dataMap).get("email"));
		resultObject.put("emailCheck", ((Map)dataMap).get("emailCheck"));
		resultObject.put("password", ((Map)dataMap).get("password"));
		resultObject.put("passwordCheck", ((Map)dataMap).get("passwordCheck"));
		resultObject.put("name", ((Map)dataMap).get("name"));
		resultObject.put("birthday", ((Map)dataMap).get("birthday"));
		resultObject.put("telNum", ((Map)dataMap).get("telNum"));
		resultObject.put("addr", addrName);
//		resultObject.put("hobbies", hobbies);
		

		return resultObject;
	}
	
	/*
	 * 
	 * 	

		}
	 */
}
