package test.backend.app.views.spree.admin.prototypes;

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

public class PrototypesHtmlPage extends AbstractPage {
  public PrototypesHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_429']")
  private WebElement Spree_dot_t__name__;
  
  public WebElement getElementOfSpree_dot_t__name__() {
    return Spree_dot_t__name__;
  }
  
  public String getTextOfSpree_dot_t__name__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_429") && matcher.group(2).equals("Spree_dot_t__name__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_430']")
  private WebElement prototype_dot_name_;
  
  public WebElement getElementOfPrototype_dot_name_() {
    return prototype_dot_name_;
  }
  
  public String getTextOfPrototype_dot_name_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_430") && matcher.group(2).equals("prototype_dot_name_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_431']")
  private WebElement link_to_Spree_dot_t__select___select_admin_prototype_url_prototype____class_____ajax_button_select_properties_from_prototype_icon_minus_ok__;
  
  public WebElement getElementOfLink_to_Spree_dot_t__select___select_admin_prototype_url_prototype____class_____ajax_button_select_properties_from_prototype_icon_minus_ok__() {
    return link_to_Spree_dot_t__select___select_admin_prototype_url_prototype____class_____ajax_button_select_properties_from_prototype_icon_minus_ok__;
  }
  
  public String getTextOfLink_to_Spree_dot_t__select___select_admin_prototype_url_prototype____class_____ajax_button_select_properties_from_prototype_icon_minus_ok__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_431") && matcher.group(2).equals("link_to_Spree_dot_t__select___select_admin_prototype_url_prototype____class_____ajax_button_select_properties_from_prototype_icon_minus_ok__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='row_<%= prototype.id %>']")
  private WebElement prototype_dot_id_;
  
  public WebElement getElementOfPrototype_dot_id_() {
    return prototype_dot_id_;
  }
  
  public String getAttributeOfIdOnPrototype_dot_id_() {
    return prototype_dot_id_.getAttribute("id");
  }
  
  public String getTextOfPrototype_dot_id_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("row_<%= prototype.id %>") && matcher.group(2).equals("prototype_dot_id_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='row_<%= prototype.id %>']")
  private WebElement cycle__odd____even__;
  
  public WebElement getElementOfCycle__odd____even__() {
    return cycle__odd____even__;
  }
  
  public String getAttributeOfClassOnCycle__odd____even__() {
    return cycle__odd____even__.getAttribute("class");
  }
  
  public String getTextOfCycle__odd____even__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("row_<%= prototype.id %>") && matcher.group(2).equals("cycle__odd____even__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
