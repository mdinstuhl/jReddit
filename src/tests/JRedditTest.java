import static org.junit.Assert.*;

import org.junit.Test;

import com.omrlnr.jreddit.domain.*;
import com.omrlnr.jreddit.*;

public class JRedditTest extends junit.framework.TestCase{

  public void testLogin(){

    User user;

    try{
      user = JReddit.login("test_subject_666", "beef");
      //assertNotNull(user);
      assertTrue(user.getModhash().length() > 0);
    }
    catch(Exception e){
      fail("testLogin - " + e.getMessage());
    }

  }

/*
  public void testWrongLogin(){
    User user;

    try{
      user = JReddit.login("test_subject_666", "be3f");
//      assertNull(user);
      assertTrue(user.getModhash().length() == 0);
    }
    catch(Exception e){
      fail("testWrongLogin - " + e.getMessage());
    }
  }

*/

}
