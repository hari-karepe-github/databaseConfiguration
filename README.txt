

############################

please update following in db2.properties

		######## DB2 Database details ########

		serverName		=	serverName
		port			=	port
		databaseName		=	databaseName
		
		###  userName and password for DB2 ###
		username		=	username
		password		=	password
		
############################

Please Install 'TestNG for Eclipse' from Eclipse marketPlace.
Run scripts as TestNG Suites or run tesng.xml as 'TestNG Suite'.

############################

If you are using Maven, you can run it from the cmd line really easy, 
cd into the directory with the testng.xml (or whatever yours is called, the xml that has all the classes that will run) 
and run this cmd: mvn clean test -DsuiteXmlFile=testng.xml
