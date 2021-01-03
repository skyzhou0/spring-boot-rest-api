# --- Creaating Sprint Boot Application --

# A. Pom.xml set up.

# 1. Place the following code into pom.xml.
  <parent>
	  <groupId>org.springframework.boot</groupId>
	  <artifactId>spring-boot-start-parent</artifactId>
	  <version>1.4.2.RELEASE</version>
  </parent>
  
  # This makes the project to be a child project of the "spring-boot-start-parent" project so that we can
  # inherate what in the parent project.

# 2. Add meta dependencies. 
<dependencies>
	  <dependency>
		  <groupId>org.springframework.boot</groupId>
		  <artifactId>spring-boot-starter-web</artifactId>
	  </dependency>
    </dependencies>

# 3. Add Properties.
   <properties>
   <java.version>1.8</java.version>
   </properties>


# B. Create Spring Boot Application.

# 1. Add a controller. 
	# what url access triggers it?
	# what method maps to the url?

# C. What's happening here? - Bill of materials.

# 1.

# 2. Embedded Tomcat Server.
	# It is convenient
	# Servlet container config is now application config.
	# Standalone application - easy to apply, test and implment.
	# Useful for microservices architecture.

# 3. Spring MVC Controller.
# The controller maps URI (user request interface) via Http protocal to a java method. 

# D. The API 
# 1. Resources.
	# Topics,
		# - Get  /topics 		"Gets all topics"
		# - Get  /topics/id 	"Gets the topic"
		# - Post /topics 		"Creates new topic"
		# - Put  /topics/id 	"Updates the topic"
		# - Delete /topics/id "Deletes the topic"
	# Course,

# 2. # - Post /topics 		"Creates new topic"
	# Go to Body -> raw provide the following json.
		{"id": "Flask",
		 "name": "Python",
		 "description": "A Python Web Framework"}
	# using Postman, go to Headers, and set the Content-Type be "application/json"
	# Testing
		# Get Request: localhost:8080/topicjson
		# Post Request with the above body. localhost:8080/topicjson
		# Rerun Get Request.







