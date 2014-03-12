package test.backend.app.views.spree.admin.shared;

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

public class ShowResourceLinksHtmlPage extends AbstractPage {
  public ShowResourceLinksHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_542']")
  private WebElement link_to_Spree_dot_t__delete___object_url___method_____delete___data_______confirm____Spree_dot_t__are_you_sure_you_want_to_delete_this_record____;
  
  public WebElement getElementOfLink_to_Spree_dot_t__delete___object_url___method_____delete___data_______confirm____Spree_dot_t__are_you_sure_you_want_to_delete_this_record____() {
    return link_to_Spree_dot_t__delete___object_url___method_____delete___data_______confirm____Spree_dot_t__are_you_sure_you_want_to_delete_this_record____;
  }
  
  public String getTextOfLink_to_Spree_dot_t__delete___object_url___method_____delete___data_______confirm____Spree_dot_t__are_you_sure_you_want_to_delete_this_record____() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_542") && matcher.group(2).equals("link_to_Spree_dot_t__delete___object_url___method_____delete___data_______confirm____Spree_dot_t__are_you_sure_you_want_to_delete_this_record____")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_542']")
  private WebElement link_to_Spree_dot_t__back___collection_url_;
  
  public WebElement getElementOfLink_to_Spree_dot_t__back___collection_url_() {
    return link_to_Spree_dot_t__back___collection_url_;
  }
  
  public String getTextOfLink_to_Spree_dot_t__back___collection_url_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_542") && matcher.group(2).equals("link_to_Spree_dot_t__back___collection_url_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_542']")
  private WebElement link_to_Spree_dot_t__edit___edit_object_url_;
  
  public WebElement getElementOfLink_to_Spree_dot_t__edit___edit_object_url_() {
    return link_to_Spree_dot_t__edit___edit_object_url_;
  }
  
  public String getTextOfLink_to_Spree_dot_t__edit___edit_object_url_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_542") && matcher.group(2).equals("link_to_Spree_dot_t__edit___edit_object_url_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
