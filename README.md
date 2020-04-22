Spring MVC simple project
Steps for creating Spring MVC Project:
1. Create a new Maven project with archtype webapp of springmvc
2. Add server
  Download the server that you want
   Go to server window -> click on add servers -> select server name -> add the location of server and select the JRE version
   -> Shift you project to configured -> Finish
3. Click on project's folder -> Build path -> Libraries -> Add library -> Server Runtime -> Select the server name
3. Open pom.xml file
  Add "Spring web mvc" dependecy from mvn repository
4. Edit the "web.xml" file
  Add the servlet name that will have the dispatcher servlets name in my case it is "nikita" and servlet base class(controller)
  Add the servlet mappings that will have the servlet name and url mappings(usually / for all the urls)
5. Create dispatcher servlet xml file, in my case its "nikita-servlet.xml" file
  Add a bean tag to specify name spaces
  Add the base class where the controllers are placed
  Specify the annotation configuration
  Add a bean tag to specify view page settings such as prefix, suffix
6. Add the view pages
7. Add the controller classes



