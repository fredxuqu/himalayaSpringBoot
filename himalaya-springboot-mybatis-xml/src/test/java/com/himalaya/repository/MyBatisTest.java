package com.himalaya.repository;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.himalaya.domain.NewsDO;

import junit.framework.TestCase;

/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2019年4月15日 下午5:13:59
* Description
*/
public class MyBatisTest extends TestCase {
	
	private static SqlSessionFactory sqlSessionFactory; 
	
	@Before 
	public void setUp() { 
		try { 
			Reader reader = Resources.getResourceAsReader("mybatis-config2.xml") ; 
			sqlSessionFactory =new SqlSessionFactoryBuilder().build(reader); 
			reader.close();
		} catch (IOException ignore){
			ignore.printStackTrace();
		}
	}
	
	@Test 
	public void testSelectAll() {
		System.out.println(sqlSessionFactory.hashCode());
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			List<NewsDO> selectList = sqlSession.selectList("com.himalaya.repository.HimalayaNewsDao.getAll");
			for (NewsDO newsDO : selectList) {
				System.out.println(newsDO);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


