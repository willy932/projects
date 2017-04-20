package com.formation.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.formation.service.ArticleService;

import junit.framework.TestCase;

public class ArticleServiceImplTest extends TestCase{
	
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Application-Context.xml");
	ArticleService service = (ArticleService)context.getBean("articleservice");
	
//	protected void setUp throws Exception {
//		super.setUp();
//	}
	
}
