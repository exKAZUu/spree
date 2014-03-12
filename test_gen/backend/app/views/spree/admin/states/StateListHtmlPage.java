package test.backend.app.views.spree.admin.states;

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

public class StateListHtmlPage extends AbstractPage {
  public StateListHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_591']")
  private WebElement Spree_dot_t__name__;
  
  public WebElement getElementOfSpree_dot_t__name__() {
    return Spree_dot_t__name__;
  }
  
  public String getTextOfSpree_dot_t__name__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_591") && matcher.group(2).equals("Spree_dot_t__name__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_592']")
  private WebElement Spree_dot_t__abbreviation__;
  
  public WebElement getElementOfSpree_dot_t__abbreviation__() {
    return Spree_dot_t__abbreviation__;
  }
  
  public String getTextOfSpree_dot_t__abbreviation__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_592") && matcher.group(2).equals("Spree_dot_t__abbreviation__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_593']")
  private WebElement state_dot_name_;
  
  public WebElement getElementOfState_dot_name_() {
    return state_dot_name_;
  }
  
  public String getTextOfState_dot_name_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_593") && matcher.group(2).equals("state_dot_name_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_594']")
  private WebElement state_dot_abbr_;
  
  public WebElement getElementOfState_dot_abbr_() {
    return state_dot_abbr_;
  }
  
  public String getTextOfState_dot_abbr_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_594") && matcher.group(2).equals("state_dot_abbr_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_595']")
  private WebElement link_to_delete_state___no_text____true_;
  
  public WebElement getElementOfLink_to_delete_state___no_text____true_() {
    return link_to_delete_state___no_text____true_;
  }
  
  public String getTextOfLink_to_delete_state___no_text____true_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_595") && matcher.group(2).equals("link_to_delete_state___no_text____true_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_595']")
  private WebElement link_to_with_icon__icon_minus_edit___Spree_dot_t__edit___edit_admin_country_state_url__country__state____no_text____true_;
  
  public WebElement getElementOfLink_to_with_icon__icon_minus_edit___Spree_dot_t__edit___edit_admin_country_state_url__country__state____no_text____true_() {
    return link_to_with_icon__icon_minus_edit___Spree_dot_t__edit___edit_admin_country_state_url__country__state____no_text____true_;
  }
  
  public String getTextOfLink_to_with_icon__icon_minus_edit___Spree_dot_t__edit___edit_admin_country_state_url__country__state____no_text____true_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_595") && matcher.group(2).equals("link_to_with_icon__icon_minus_edit___Spree_dot_t__edit___edit_admin_country_state_url__country__state____no_text____true_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='<%= spree_dom_id state %>']")
  private WebElement spree_dom_id_state_;
  
  public WebElement getElementOfSpree_dom_id_state_() {
    return spree_dom_id_state_;
  }
  
  public String getAttributeOfIdOnSpree_dom_id_state_() {
    return spree_dom_id_state_.getAttribute("id");
  }
  
  public String getTextOfSpree_dom_id_state_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("<%= spree_dom_id state %>") && matcher.group(2).equals("spree_dom_id_state_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='<%= spree_dom_id state %>']")
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
      if (matcher.group(1).equals("<%= spree_dom_id state %>") && matcher.group(2).equals("cycle__odd____even__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_596']")
  private WebElement Spree_dot_t__none__;
  
  public WebElement getElementOfSpree_dot_t__none__() {
    return Spree_dot_t__none__;
  }
  
  public String getTextOfSpree_dot_t__none__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_596") && matcher.group(2).equals("Spree_dot_t__none__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
