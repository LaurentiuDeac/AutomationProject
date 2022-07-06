package base;

import org.junit.After;
import org.junit.Before;
import propertyFile.PropertyFile;

import java.util.HashMap;

public class Hooks extends BaseTest {
    public HashMap<String, String> testData;

    @Before
    public void setUp(){
        initiateDriver();
        String className = this.getClass().getSimpleName();
        PropertyFile propertyFile = new PropertyFile("LogIn");  // classname ( de ce am folosit classname) fisierul noustru se numeste LoghInData )
        testData = propertyFile.getAllValues();

    }

    @After
    public void clearEnv(){

    }
}
