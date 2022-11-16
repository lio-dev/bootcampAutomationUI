package testSuite.todoly;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import page.todoly.*;
import session.Session;
import util.GetProperties;

public class TestBase {

     LoginSection loginSection = new LoginSection();
     ProjectSection projectSection= new ProjectSection();

     // todo property file
     String user=GetProperties.getInstance().getUser();
     String password =GetProperties.getInstance().getPwd();


     @BeforeEach
     public void openBrowser(){
          // todo create property file
          Session.getInstance().getBrowser().get(GetProperties.getInstance().getHost());
     }

     @AfterEach
     public void closeBrowser(){
          Session.getInstance().closeSession();
     }

}
