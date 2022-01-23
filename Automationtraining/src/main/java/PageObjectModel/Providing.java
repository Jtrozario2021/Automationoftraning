package PageObjectModel;

import org.testng.annotations.Test;

import Common.Utility1;
import org.testng.annotations.DataProvider;

public class Providing extends Utility1 {
  @Test(dataProvider = "provided")
  public void f(String n, String s) throws InterruptedException {
	  HomeOfFacebook home=new HomeOfFacebook(driver);
	  home.emailfieldkeys(n);
	  home.psswdfieldkeys(s);
	  home.buttontoclick();
	  Thread.sleep(6000);
  }

  @DataProvider
  public Object[][] provided() {
    return new Object[][] {
      new Object[] { "peoplentech", "a,sfn" },
      new Object[] { "gugan", "bvsd" },
      new Object[] {"session","jsvsdvsd"},
    };
  }
}
