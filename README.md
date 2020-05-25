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
 
### Components  
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
 
 ### Types of DI  
There are three options for how dependencies can be injected into a bean:  

- Through a constructor  
- Through setters or other methods  
- Through reflection, directly into fields  
Guidelines to use which best  
- For mandatory dependencies or when aiming for immutability, use constructor injection   
- For optional or changeable dependencies, use setter injection   
- Avoid field injection in most cases  
Field injection drawbacks  
- You cannot create immutable objects, as you can with constructor injection  
- Your classes have tight coupling with your DI container and cannot be used outside of it  
- Your classes cannot be instantiated (for example in unit tests) without reflection. You need the DI container to instantiate them, which makes your tests more like integration tests  
- Your real dependencies are hidden from the outside and are not reflected in your interface (either constructors or methods)  
- It is really easy to have like ten dependencies. If you were using constructor injection, you would have a constructor with ten arguments, which would signal that something is fishy. But you can add injected fields using field injection indefinitely. Having too many dependencies is a red flag that the class usually does more than one thing, and that it may violate the Single Responsibility Principle.  
**Best Practice is to coding against Interfaces**  


 
 
