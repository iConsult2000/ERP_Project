Dans cet exemple,
Nous avons configuré une méthode ejb Stateless accessible par deux utilisateurs de 
roles différents :
	
	user	password	Role
	manuel	javaman		shopper
	steeve	encrypted		visitor

Le processus d'authentification (username, password) est effectué en base de données mySQL
Le processus d'authorization d'acces EJB (JBoss natif) est effectué avec la bdd mySQL

La configuration du domaine est embarquée dans l'application --META-INF/dynamic-ejb-jboss-beans.xml.

La configuration de la base de données est perfectible --doc/bdd/*.
	Placer dans le rep deploy titan-ds.xml (à renommer)
	
	Se connecter root puis
	1) créer le user : jboss ; pwd : insia
	2) Attribuer les droits d'administration au user
	3) Se logger et mysql> source authDB.txt;

Finalement exporter le projet en <project_name>.jar sous $JBOSS/server/default/deploy
puis lancer le client Sessionclient_v2.java.