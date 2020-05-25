# hello-world
Getting Started with Spring Boot

## Environment Set up
### Eclipse
- Installation  
Get the latest version, for instance Eclipse IDE 2020‑03 for Java EE.   
Install Spring Tool 4 plug-in.  
Make sure that you have Maven plug-in already available.  

### Maven   
- Installation  
Download maven and extract it  
Add JAVA_HOME and MAVEN_HOME in environment variable  
Add maven path in environment variable  
Verify Maven(mvn −version )  

### Create Project
Choose eclipse Project "Spring Starter Project"  
Choose the dependencies  

### Start the Server  
Do the Maven Update
Do the Maven Build
Add the Boot Dashboard to the eclipse view  
Start the embeded server  
Check the Log to confirm that our Project is running fine.  

### DI vs IoC 
- Inversion of Control is a principle in software engineering by which the control of objects or portions of a program is transferred to a container or framework.  
- Dependency injection is a pattern through which to implement IoC, where the control being inverted is the setting of object's dependencies.  

 - Spring Context  
 Spring contexts are also called Spring IoC containers, which are responsible for instantiating, configuring, and assembling beans by reading configuration metadata from XML, Java annotations, and/or Java code in the configuration files.  
 
 - Components  
 Spring Component annotation is used to denote a class as Component. It means that Spring framework will autodetect these classes for dependency injection when annotation-based configuration and classpath scanning is used.   

 - Specialization of Component  
   - **Service**  
   Denotes that the class provides some services. Our utility classes can be marked as Service classes.  
   - **Repository**  
   usually it’s used with DAO implementations that deal with database tables.
   - **Controller**  
   Mostly used with web applications or REST web services to specify that the class is a front controller and responsible to handle user request and return appropriate response.  
 - Bean  
 In Spring, the objects that form the backbone of your application and that are managed by the Spring IoC container are called beans. A bean is an object that is instantiated, assembled, and otherwise managed by a Spring IoC container.  
 When a class is decorated with Component annotation or it's pecialization annotation, that class get registered in the Spring context, and it can be used by other classes.  
 The default name of the bean will same as class but the first letter in lower case.  
 
 
 
 
