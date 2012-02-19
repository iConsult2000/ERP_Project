<persistence xmlns="http://java.sun.com/xml/ns/persistence"
   xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
   xsi:schemaLocation="http://java.sun.com/xml/ns/persistence http://java.sun.com/xml/ns/persistence/persistence_1_0.xsd"
   version="1.0">
   <persistence-unit name="sample">
      <jta-data-source>java:/DefaultDS</jta-data-source>
      <properties>
         <property name="hibernate.dialect" value="org.hibernate.dialect.HSQLDialect"/>
         <property name="hibernate.hbm2ddl.auto" value="create-drop"/>
      </properties>
   </persistence-unit>
</persistence>

<persistence xmlns="http://java.sun.com/xml/ns/persistence"
             xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
             xsi:schemaLocation="http://java.sun.com/xml/ns/persistence http://java.sun.com/xml/ns/persistence/persistence_2_0.xsd"
             version="2.0">
   <persistence-unit name="manager1" transaction-type="JTA">
      <provider>org.hibernate.ejb.HibernatePersistence</provider>
      <jta-data-source>java:/DefaultDS</jta-data-source>
      <mapping-file>ormap.xml</mapping-file>
      <jar-file>MyApp.jar</jar-file>
      <class>org.acme.Employee</class>
      <class>org.acme.Person</class>
      <class>org.acme.Address</class>
      <shared-cache-mode>ENABLE_SELECTOVE</shared-cache-mode>
      <validation-mode>CALLBACK</validation-mode>
      <properties>
         <property name="hibernate.dialect" value="org.hibernate.dialect.HSQLDialect"/>
         <property name="hibernate.hbm2ddl.auto" value="create-drop"/>
      </properties>
   </persistence-unit>
</persistence>

<?xml version="1.0" encoding="UTF-8"?>
<!-- Persistence deployment descriptor for dev profile -->
<persistence xmlns="http://java.sun.com/xml/ns/persistence"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://java.sun.com/xml/ns/persistence http://java.sun.com/xml/ns/persistence/persistence_1_0.xsd"
	version="1.0">
	<persistence-unit name="BDProduits">
		<provider>org.hibernate.ejb.HibernatePersistence</provider>
		<jta-data-source>java:/TitanDS</jta-data-source>
		<jar-file>./SDR_Titan.jar</jar-file>
		<properties>
			<property name="hibernate.dialect" value="org.hibernate.dialect.MySQLDialect" />
			<!-- Use appropriate dialect here -->
			<property name="hibernate.hbm2ddl.auto" value="validate" />
			<property name="hibernate.show_sql" value="true" />
			<property name="hibernate.format_sql" value="true" />
			<property name="jboss.entity.manager.factory.jndi.name"
				value="java:/myEntityManagerFactory" /> <!-- This is your EntityManagerFactory -->
		</properties>
	</persistence-unit>
	<!-- hibernate.hbm2ddl.auto Automatically validates or exports schema DDL 
		to the database when the SessionFactory is created. With create-drop, the 
		database schema will be dropped when the SessionFactory is closed explicitly. 
		e.g. validate | update | create | create-drop.
		So the list of possible options are, 
		validate: validate the schema, makes no changes to the database. 
		update:	update the schema. create: creates the schema, destroying previous data. 
		create-drop: drop the schema at the end of the session. -->
</persistence> 

<persistence xmlns="http://java.sun.com/xml/ns/persistence"
   xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
   xsi:schemaLocation="http://java.sun.com/xml/ns/persistence http://java.sun.com/xml/ns/persistence/persistence_1_0.xsd"
   version="1.0">
   <persistence-unit name="sample">
      <jta-data-source>java:/DefaultDS</jta-data-source>
      <properties>
         <property name="hibernate.dialect" value="org.hibernate.dialect.HSQLDialect"/>
         <property name="hibernate.hbm2ddl.auto" value="create-drop"/>
      </properties>
   </persistence-unit>
</persistence>

<?xml version="1.0" encoding="UTF-8"?>
<!-- Persistence deployment descriptor for dev profile -->
<persistence xmlns="http://java.sun.com/xml/ns/persistence"
             xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
             xsi:schemaLocation="http://java.sun.com/xml/ns/persistence http://java.sun.com/xml/ns/persistence/persistence_2_0.xsd"
             version="2.0">
   <persistence-unit name="PRODUITS">
   <provider>org.hibernate.ejb.HibernatePersistence</provider>
      <jta-data-source>java:/TitanDS</jta-data-source>
      <class>com.iconsult2k.components.Produit</class>
      <properties>
         <property name="javax.persistence.jdbc.driver" value="com.mysql.jdbc.Driver"/>
         <property name="javax.persistence.jdbc.user" value="jboss"/>
         <property name="javax.persistence.jdbc.password" value="insia"/>
         <property name="javax.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/prodSIGL2InnoDB"/>
         <property name="hibernate.dialect" value="org.hibernate.dialect.MySQLDialect"/>
         <property name="hibernate.max_fetch_depth" value="3"/>
       
         <!-- alternatively to <class> and <property> declarations, you can use a regular hibernate.cfg.xml file -->
         <!-- property name="hibernate.ejb.cfgfile" value="/org/hibernate/ejb/test/hibernate.cfg.xml"/ -->
      </properties>
   </persistence-unit>
   </persistence>
   
   
   Test by RoseIndia
<?xml version='1.0' encoding='utf-8'?>
<!DOCTYPE hibernate-configuration PUBLIC "-//Hibernate/Hibernate Configuration DTD//EN" "http://hibernate.sourceforge.net/hibernate-configuration-3.0.dtd">
<hibernate-configuration>
	<session-factory>
		<property name="hibernate.connection.driver_class">com.mysql.jdbc.Driver</property>
		<property name="hibernate.connection.url">jdbc:mysql://localhost:3306/prodSIGL2InnoDB</property>
		<property name="hibernate.connection.username">jboss</property>
		<property name="hibernate.connection.password">insia</property>
		<property name="hibernate.connection.pool_size">10</property>
		<property name="show_sql">true</property>
		<property name="dialect">org.hibernate.dialect.MySQLDialect</property>
		<property name="hibernate.hbm2ddl.auto">update</property>
		<!-- Mapping files -->
		<mapping resource="produits.hbm.xml" />
	</session-factory>
</hibernate-configuration>

******************************************

<persistence xmlns="http://java.sun.com/xml/ns/persistence" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://java.sun.com/xml/ns/persistence http://java.sun.com/xml/ns/persistence/persistence_1_0.xsd" version="1.0">

   <persistence-unit name="MPService" transaction-type="RESOURCE_LOCAL">
      <provider>org.hibernate.ejb.HibernatePersistence</provider>
      <class>com.mp.persistence.entity.Type</class>
      <properties>
         <property name="hibernate.archive.autodetection" value="class"/>
         <property name="hibernate.show_sql" value="true"/>
         <property name="hibernate.format_sql" value="true"/>
         <property name="hibernate.use_sql_comments" value="true" />

         <property name="hibernate.connection.driver_class" value="com.mysql.jdbc.Driver"/>
         <property name="hibernate.connection.url" value="jdbc:mysql://localhost:3306/mp"/>
         <property name="hibernate.connection.username" value="myuser"/>
         <property name="hibernate.connection.password" value="mypass"/>

         <property name="hibernate.dialect" value="org.hibernate.dialect.MySQLDialect"/>

         <property name="hibernate.hbm2ddl.auto" value="create"/>
      </properties>
   </persistence-unit>

</persistence>

instead of

<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE hibernate-configuration PUBLIC "-//Hibernate/Hibernate Configuration DTD 3.0//EN" "http://hibernate.sourceforge.net/hibernate-configuration-3.0.dtd">
<hibernate-configuration>
	<session-factory>
		<property name="hibernate.connection.driver_class"> com.mysql.jdbc.Driver</property>
		<property name="hibernate.connection.url">jdbc:mysql://localhost:3306/prodSIGL2InnoDB</property>
		<property name="hibernate.connection.username">jboss</property>
		<property name="connection.password">insia</property>
		<property name="connection.pool_size">1</property>
		<property name="hibernate.dialect"> org.hibernate.dialect.MySQLDialect</property>
		<property name="show_sql">true</property>
		<property name="hbm2ddl.auto">validate</property>
		<mapping class="com.iconsult2k.components.Produit" />
	</session-factory>
</hibernate-configuration>

******************************************************

<persistence xmlns="http://java.sun.com/xml/ns/persistence"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://java.sun.com/xml/ns/persistence http://java.sun.com/xml/ns/persistence/persistence_1_0.xsd"
	version="1.0">

	<persistence-unit name="MYPRODUITS" transaction-type="JTA">
		<provider>org.hibernate.ejb.HibernatePersistence</provider>
		<jta-data-source>java:/TitanDS</jta-data-source>
		<class>com.iconsult2k.components.Produit</class>
		<properties>
			<property name="hibernate.archive.autodetection" value="class" />
			<property name="hibernate.show_sql" value="true" />
			<property name="hibernate.format_sql" value="true" />
			<property name="hibernate.use_sql_comments" value="true" />
			<property name="hibernate.listeners.envers.autoRegister"
				value="false" />
			<property name="hibernate.connection.driver_class" value="com.mysql.jdbc.Driver" />
			<property name="hibernate.connection.url" value="jdbc:mysql://localhost:3306/prodSIGL2InnoDB" />
			<property name="hibernate.connection.username" value="jboss" />
			<property name="hibernate.connection.password" value="insia" />

			<property name="hibernate.dialect" value="org.hibernate.dialect.MySQLInnoDBDialect" />

			<property name="hibernate.hbm2ddl.auto" value="validate" />
		</properties>
	</persistence-unit>

</persistence>
********************************************
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE hibernate-configuration PUBLIC "-//Hibernate/Hibernate Configuration DTD 3.0//EN" "http://hibernate.sourceforge.net/hibernate-configuration-3.0.dtd">
<hibernate-configuration>
	<session-factory>
		<property name="hibernate.archive.autodetection">class</property>
		<property name="hibernate.listeners.envers.autoRegister">false</property>
		<property name="hibernate.connection.driver_class">com.mysql.jdbc.Driver</property>
		<property name="hibernate.connection.url">jdbc:mysql://localhost:3306/prodSIGL2InnoDB</property>
		<property name="hibernate.connection.username">jboss</property>
		<property name="hibernate.connection.password">insia</property>
		<property name="connection.pool_size">1</property>
		<property name="hibernate.dialect">org.hibernate.dialect.MySQLInnoDBDialect</property>
		<property name="show_sql">true</property>
		<property name="hibernate.hbm2ddl.auto">validate</property>
		<property name="hibernate.session_factory_name">java:comp/HibernateSessionFactory</property>
		<property name="hibernate.transaction.factory_class">org.hibernate.transaction.JTATransactionFactory</property>
		<!-- <property name="hibernate.transaction.manager_lookup_class">org.hibernate.transaction.WebSphereTransactionManagerLookup</property> -->
		<property name="jta.UserTransaction">java:comp/UserTransaction</property>
		<property name="hibernate.connection.datasource">jdbc/TitanDS</property>
		<mapping class="com.iconsult2k.components.Produit" />
	</session-factory>
</hibernate-configuration>

***********************************************


	<persistence-unit name="MYPRODUITS" transaction-type="JTA">
		<provider>org.hibernate.ejb.HibernatePersistence</provider>
		<jta-data-source>java:/TitanDS</jta-data-source>
		<class>com.iconsult2k.components.Produit</class>
		<properties>
			<property name="hibernate.archive.autodetection" value="class" />
			<property name="hibernate.show_sql" value="true" />
			<property name="hibernate.format_sql" value="true" />
			<property name="hibernate.use_sql_comments" value="true" />
			<property name="hibernate.listeners.envers.autoRegister"
				value="false" />
			<property name="hibernate.connection.driver_class" value="com.mysql.jdbc.Driver" />
			

			<property name="hibernate.dialect" value="org.hibernate.dialect.MySQLInnoDBDialect" />

			<property name="hibernate.hbm2ddl.auto" value="validate" />
		</properties>
	</persistence-unit>

</persistence>

<persistence>