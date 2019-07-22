Microservices patterns with Spring Cloud

Startup guide :

0) Open springmicroservices/configserver/src/main/resources/application.yml and update spring.cloud.config.server.git.uri. 
    You should put a url of your git repo (all message files should be commited).
1) Open new terminal window and make sure that you are in springmicroservices folder. 
    Then execute 'cd eureka && mvn spring-boot:run'
2) Open new terminal window and make sure that you are in springmicroservices folder. 
    Then execute 'cd configserver && mvn spring-boot:run'
3) Open new terminal window and make sure that you are in springmicroservices folder. 
    Then execute 'cd service && mvn spring-boot:run'

Now you can open your browser and navigate to http://localhost:8080/message. You will see the message 'Hello from dev properties'.g
