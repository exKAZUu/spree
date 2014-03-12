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

public class EditResourceLinksHtmlPage extends AbstractPage {
  public EditResourceLinksHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_508']")
  private WebElement Spree_dot_t__or__;
  
  public WebElement getElementOfSpree_dot_t__or__() {
    return Spree_dot_t__or__;
  }
  
  public String getTextOfSpree_dot_t__or__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_508") && matcher.group(2).equals("Spree_dot_t__or__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_507']")
  private WebElement button_link_to_Spree_dot_t__actions_dot_cancel____collection_url___icon_____icon_minus_remove__;
  
  public WebElement getElementOfButton_link_to_Spree_dot_t__actions_dot_cancel____collection_url___icon_____icon_minus_remove__() {
    return button_link_to_Spree_dot_t__actions_dot_cancel____collection_url___icon_____icon_minus_remove__;
  }
  
  public String getTextOfButton_link_to_Spree_dot_t__actions_dot_cancel____collection_url___icon_____icon_minus_remove__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_507") && matcher.group(2).equals("button_link_to_Spree_dot_t__actions_dot_cancel____collection_url___icon_____icon_minus_remove__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_507']")
  private WebElement button_Spree_dot_t__actions_dot_update_____icon_minus_refresh__;
  
  public WebElement getElementOfButton_Spree_dot_t__actions_dot_update_____icon_minus_refresh__() {
    return button_Spree_dot_t__actions_dot_update_____icon_minus_refresh__;
  }
  
  public String getTextOfButton_Spree_dot_t__actions_dot_update_____icon_minus_refresh__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_507") && matcher.group(2).equals("button_Spree_dot_t__actions_dot_update_____icon_minus_refresh__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
