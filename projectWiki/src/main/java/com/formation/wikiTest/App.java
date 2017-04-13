package com.formation.wikiTest;
import java.util.Date;

import com.formation.wikiDao.ArticleDao;
import com.formation.wikiImplement.ArticleImpl;
import com.formation.wikiImplement.CommentaireImpl;
import com.formation.wikiImplement.UserDaoImpl;
import com.formation.wikiModel.Article;
import com.formation.wikiModel.Commentaire;
import com.formation.wikiModel.User;
import com.formation.wikiModel.UserAdmin;
import com.formation.wikiModel.UserMod;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//crée un utilisateur 
		/*UserDaoImpl us = new UserDaoImpl();
		UserMod ud = new UserMod("mod", "mod", "okok@ok");
		ud.setStatut(1);
		us.addUser(ud);*/
		
		//modifier une user
		/*UserDaoImpl us = new UserDaoImpl();
		User c = us.getUser(3);
		c.setLogin("hey");
		us.UpdateUser(c);*/
    	
		//crée un article
		/*ArticleImpl us = new ArticleImpl();
		Date date = new Date();
		Article art = new Article() ;
		art.setContenu("okok");
		art.setDate(date);
		art.setDescription("riz");
		art.setImage("efefef");
		art.setTitre("cc");
		us.addArticle(art);*/
		
		//modifier un article
		/*ArticleImpl us = new ArticleImpl();
		Article a = us.getArticleById(28);
		a.setTitre("teuch");
		us.updateArticle(a);*/
		
		//supprimer un article
		/*ArticleImpl us = new ArticleImpl();
		us.deleteArticle(27);*/
		
		//crée un commentaire 
		/*CommentaireImpl us = new CommentaireImpl();
		Commentaire c = new Commentaire();
		c.setContenu("ololol");
		us.addCommentaire(c);*/
	}

	

}
