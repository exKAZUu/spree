package test.backend.app.assets.javascripts.spree.backend;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdminJsPage extends AbstractPage {
  public AdminJsPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_6']")
  private WebElement A_____plus__Spree_dot_translations_dot_more__plus___;
  
  public WebElement getElementOfA_____plus__Spree_dot_translations_dot_more__plus___() {
    return A_____plus__Spree_dot_translations_dot_more__plus___;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
