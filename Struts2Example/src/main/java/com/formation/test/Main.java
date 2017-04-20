package com.formation.test;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.formation.beans.Article;
import com.formation.service.ArticleService;



public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext(new String[]{"Application-context.xml"});

		ArticleService service =(ArticleService) context.getBean("articleservice");
		Article a= new Article("titre", new Date(), "description","image", "content", 1);
		for (Article b :service.getAllArticles())
			System.out.println(b);
			//dao.SaveOrUpdateArticle(a);
		
	}

}
