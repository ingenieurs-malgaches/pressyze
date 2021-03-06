
/*
 //	Le présent fichier fait partie du projet PRESSYZE, une application se proposant 
 //	d'encourager le journalisme citoyen et permettant d'avoir une vue globale 
 // sur les évènements se déroulant sur le sol tunisien.
 //
 //
 //	Ce projet entre dans le cadre du concours Java Developer Challenge (Edition 2014) 
 // organisé par ESPRIT JAVA USER GROUP qui met le focus sur les dernières technologies du monde Java.
 //
 // Ce projet a été réalisé par l'équipe << ByteCoders >> composée des élèves ingénieurs suivants :
 //
 //		- Mohamed Chehaibi
 //		- Mohamed Ali Ben Lassoued
 //		- Mohamed Melki
 //		- Marwen Chrif
 //		- Nabil Andriantomanga
 //
 //	Les technologies utilisées sont essentiellement :
 //
 //	AngularJS : un framework JavaScript proposé par Google et présente une méthodologie innovante 
 // et adaptée au monde de l'industrie, facilite la réalisation des applications mono-page 
 //	et permet la mise en place de plusieurs patrons de conception dont l'MVC.
 //
 //
 //	Mongo DB : SGBD NoSQL orientée documents répartissable sur un nombre quelconque d'ordinateurs.
 //
 //	REST JAX-RS 2.8 (Jersey Implementation) : Java API for RESTful Web Services est une interface 
 // de programmation Java permettant de créer des services Web avec une architecture REST.
 //
 //	Apache Tomcat 7.0.42 : Serveur d'application Java EE.
 //
 //	Maven 3.1 : système de gestion et d'automatisation de production des projets logiciels 
 // Java en général et Java EE en particulier.
  
 //
 */
package org.bytecoders.pressyze.dao;

import java.util.List;

import org.bytecoders.pressyze.common.Comment;
import org.bytecoders.pressyze.common.User;
import org.bytecoders.pressyze.exceptions.DAOException;

public interface CommentDAO {

	
	/**
	 * Permet d'ajouter un nouveau commentaire
	 * 
	 * @param comment le commentaire a ajouter 
	 * @throws DAOException
	 */
	public void addComment(Comment comment) throws DAOException;
	
	
	/**
	 * Permet de recuperer un commentaire 
	 * 
	 * @param commentId l'identifiant du commentaire a recuperer 
	 * @return le commentaire 
	 * @throws DAOException
	 */
	public Comment findComment(String commentId) throws DAOException;
	
	
	/**
	 * Permet de supprimer un commentaire 
	 * 
	 * @param comment le commentaire a supprimer 
	 * @throws DAOException
	 */
	public void removeComment(Comment comment) throws DAOException;
	
	
	/**
	 * Permet de mettre a jour un commentaire 
	 * 
	 * @param comment le commentaire a mettre a jour
	 * @throws DAOException
	 */
	public void updateComment(Comment comment) throws DAOException;
	
	
	/**
	 * Permet de recuperer tous les commentaires relatifs a un fait
	 * 
	 * @param factId l'identifiant du fait
	 * @return la liste des commentaires du fait
	 * @throws DAOException
	 */
	public List<Comment> findCommentByFactId(String factId) throws DAOException;
	
	
	/**
	 * Permet de recuperer tous les commentaires relatifs a un fait et 
	 * a l'utilisateur specifie
	 * 
	 * @param factId l'identifiant du fait
	 * @param userId l'identifiant de l'utilisateur ayant commente
	 * @return
	 * @throws DAOException
	 */
	public List<Comment> findCommentByFactIdAndUserId(String factId, String userId) throws DAOException;
	
	
	/**
	 * Permet de recuperer l'utilisateur a l'origine de ce commentaire
	 * 
	 * @param commentId identifiant du commentaire
	 * @return l'utilisateur ayant publie ce commentaire
	 * @throws DAOException
	 */
	public User findCommentUser(String commentId) throws DAOException;
}
