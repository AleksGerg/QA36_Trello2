package tests;

import manage.ApplicationManager;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestsBase {
    ApplicationManager app = new ApplicationManager();

    @BeforeSuite
    public void setup(){
        app.init();
    }
    @AfterSuite
    public void stop(){
        app.quit();
    }
}
