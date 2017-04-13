package com.formation.wikiDao;

import com.formation.wikiModel.Commentaire;

public interface CommentaireDao {
	
	public void addCommentaire(Commentaire c);
	public void updateCommentaire(int id);
	public void deleteCommentaire(Commentaire c);
}
