# spring-boot-web-security
Spring boot restful web and spring boot security application

TO Run :
Required : JDK 8 and above
clean your project 
1. Go to ../spring-boot-web-security directory where main pom.xml is located and run below command"
	mvn clean:clean
2. convert to eclipse project"
	mvn eclipse:eclipse
3. build without jUnit test
	mvn clean install -Dmaven.test
4. run application
	Run As Java application from class MainApplication.java
5. open browser and run below URL
	http://localhost:8080/login
6. output would be:
	welcome
Note: I am running at port 8080, if you find that 8080 port is already in use, you can change it in application.properties

#user id : user
#Using default security password: <FIND IT FROM CONSOLE>