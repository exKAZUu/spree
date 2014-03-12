package test.backend.app.views.spree.admin.promotions.rules;

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

public class UserHtmlPage extends AbstractPage {
  public UserHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_412']")
  private WebElement Spree_dot_t__user_rule_dot_choose_users___;
  
  public WebElement getElementOfSpree_dot_t__user_rule_dot_choose_users___() {
    return Spree_dot_t__user_rule_dot_choose_users___;
  }
  
  public String getTextOfSpree_dot_t__user_rule_dot_choose_users___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_412") && matcher.group(2).equals("Spree_dot_t__user_rule_dot_choose_users___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_413']")
  private WebElement promotion_rule_dot_user_ids_dot_join______;
  
  public WebElement getElementOfPromotion_rule_dot_user_ids_dot_join______() {
    return promotion_rule_dot_user_ids_dot_join______;
  }
  
  public String getAttributeOfValueOnPromotion_rule_dot_user_ids_dot_join______() {
    return promotion_rule_dot_user_ids_dot_join______.getAttribute("value");
  }
  
  public String getTextOfPromotion_rule_dot_user_ids_dot_join______() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_413") && matcher.group(2).equals("promotion_rule_dot_user_ids_dot_join______")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_413']")
  private WebElement INPUT_____param_prefix____user_ids_string_;
  
  public WebElement getElementOfINPUT_____param_prefix____user_ids_string_() {
    return INPUT_____param_prefix____user_ids_string_;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_413']")
  private WebElement param_prefix_;
  
  public WebElement getElementOfParam_prefix_() {
    return param_prefix_;
  }
  
  public String getAttributeOfNameOnParam_prefix_() {
    return param_prefix_.getAttribute("name");
  }
  
  public String getTextOfParam_prefix_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_413") && matcher.group(2).equals("param_prefix_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
