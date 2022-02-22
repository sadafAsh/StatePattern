# StatePattern
        State Pattern is the behavioural software design pattern that allows an object to 
alter its behaviour when its internal state changes.
         In this project, "State" interface has been created defining transition method and 
display state method."OffState" and "OnState" are the concrete classses which implements the 
interface. "LightBulb" class carries a State.Main class use Lightbulb and state objects to 
change in the state of on and off.


JunitTest:
        There is JUnit Test also present for all State Pattern and test coverage are 100%
  successful by jacoco reports.
       
  SONARQUBE 
  
  gradle command to publish code to sonarqube
gradle sonarqube
           -Dsonar.projectKey=StatePattern
          -Dsonar.host.url=http://localhost:9000
         -Dsonar.login=b9aaf0b840472f4242635c3f29e7a7ea35ba2fab