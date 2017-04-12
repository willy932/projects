package com.formation.wikiAction;

import java.sql.SQLException;
import java.util.ArrayList;

import com.formation.wikiControle.Article;
import com.formation.wikiDao.ArticleDao;


public class ListArticle {
	
	public ArrayList<Article> lst;
	
	
	public ArrayList<Article> getLst() {
		return lst;
	}

	public void setLst(ArrayList<Article> lst) {
		this.lst = lst;
	}
	
	public String execute() {
		ArticleDao la = new ArticleDao();
		lst=(ArrayList<Article>) la.getArticle();
		System.out.println(lst.size());
		if(lst.isEmpty()){
			return "failed";
		}
		else
			return "bien joué";
	}
}
