package com.formation.wikiDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.formation.wikiDao.Connexion;
import com.formation.wikiControle.Article;
import com.formation.wikiControle.ArticleInterface;

public class ArticleDao implements ArticleInterface{

	@Override
	public List<Article> getArticle() {
		// TODO Auto-generated method stub
		
		try {
			Connection conn = Connexion.getConnection();
			PreparedStatement st;
			st = conn.prepareStatement("select * from article ");
			//st.setString(1, "'%"+strNom+"%'");
			ResultSet rs = st.executeQuery();
			ArrayList<Article> array = new ArrayList<Article>();
			while(rs.next())
			{
				Article l = new Article(rs.getInt(1),rs.getDate(3),rs.getString(2),  rs.getString(4), rs.getString(5), rs.getString(5));
				array.add(l);
			}
			return array;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return null;
		
	}

	@Override
	public boolean AjouterArticle(Article a)  {
		// TODO Auto-generated method stub
String strQuery = "insert into article(titre, date, image, description, contenu) values(?,now(),?,?,?)";
		
		
		try {
			Connection conn = Connexion.getConnection();
			PreparedStatement st = conn.prepareStatement(strQuery);
			st.setString(1, a.titre);
			st.setString(2, a.image);
			st.setString(3, a.description);
			st.setString(4, a.contenu);
			
			st.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
		
	}

	@Override
	public boolean SupprimerArticle(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean ModifierArticle(Article l) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Article> RechercherArticle(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
