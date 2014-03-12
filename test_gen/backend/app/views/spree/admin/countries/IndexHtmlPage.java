package test.backend.app.views.spree.admin.countries;

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

public class IndexHtmlPage extends AbstractPage {
  public IndexHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_31']")
  private WebElement button_link_to_Spree_dot_t__new_country___new_object_url_____icon_____icon_minus_plus____id_____admin_new_country____;
  
  public WebElement getElementOfButton_link_to_Spree_dot_t__new_country___new_object_url_____icon_____icon_minus_plus____id_____admin_new_country____() {
    return button_link_to_Spree_dot_t__new_country___new_object_url_____icon_____icon_minus_plus____id_____admin_new_country____;
  }
  
  public String getTextOfButton_link_to_Spree_dot_t__new_country___new_object_url_____icon_____icon_minus_plus____id_____admin_new_country____() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_31") && matcher.group(2).equals("button_link_to_Spree_dot_t__new_country___new_object_url_____icon_____icon_minus_plus____id_____admin_new_country____")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_32']")
  private WebElement Spree_dot_t__country_name__;
  
  public WebElement getElementOfSpree_dot_t__country_name__() {
    return Spree_dot_t__country_name__;
  }
  
  public String getTextOfSpree_dot_t__country_name__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_32") && matcher.group(2).equals("Spree_dot_t__country_name__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_33']")
  private WebElement Spree_dot_t__iso_name__;
  
  public WebElement getElementOfSpree_dot_t__iso_name__() {
    return Spree_dot_t__iso_name__;
  }
  
  public String getTextOfSpree_dot_t__iso_name__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_33") && matcher.group(2).equals("Spree_dot_t__iso_name__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_34']")
  private WebElement Spree_dot_t__states_required__;
  
  public WebElement getElementOfSpree_dot_t__states_required__() {
    return Spree_dot_t__states_required__;
  }
  
  public String getTextOfSpree_dot_t__states_required__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_34") && matcher.group(2).equals("Spree_dot_t__states_required__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_35']")
  private WebElement country_dot_name_;
  
  public WebElement getElementOfCountry_dot_name_() {
    return country_dot_name_;
  }
  
  public String getTextOfCountry_dot_name_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_35") && matcher.group(2).equals("country_dot_name_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_36']")
  private WebElement country_dot_iso_name_;
  
  public WebElement getElementOfCountry_dot_iso_name_() {
    return country_dot_iso_name_;
  }
  
  public String getTextOfCountry_dot_iso_name_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_36") && matcher.group(2).equals("country_dot_iso_name_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_37']")
  private WebElement country_dot_states_required____Spree_dot_t__say_yes____Spree_dot_t__say_no__;
  
  public WebElement getElementOfCountry_dot_states_required____Spree_dot_t__say_yes____Spree_dot_t__say_no__() {
    return country_dot_states_required____Spree_dot_t__say_yes____Spree_dot_t__say_no__;
  }
  
  public String getTextOfCountry_dot_states_required____Spree_dot_t__say_yes____Spree_dot_t__say_no__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_37") && matcher.group(2).equals("country_dot_states_required____Spree_dot_t__say_yes____Spree_dot_t__say_no__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_38']")
  private WebElement link_to_delete_country___no_text____true_;
  
  public WebElement getElementOfLink_to_delete_country___no_text____true_() {
    return link_to_delete_country___no_text____true_;
  }
  
  public String getTextOfLink_to_delete_country___no_text____true_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_38") && matcher.group(2).equals("link_to_delete_country___no_text____true_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_38']")
  private WebElement link_to_edit_country___no_text____true_;
  
  public WebElement getElementOfLink_to_edit_country___no_text____true_() {
    return link_to_edit_country___no_text____true_;
  }
  
  public String getTextOfLink_to_edit_country___no_text____true_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_38") && matcher.group(2).equals("link_to_edit_country___no_text____true_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='<%= spree_dom_id country %>']")
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
      if (matcher.group(1).equals("<%= spree_dom_id country %>") && matcher.group(2).equals("cycle__odd____even__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='<%= spree_dom_id country %>']")
  private WebElement spree_dom_id_country_;
  
  public WebElement getElementOfSpree_dom_id_country_() {
    return spree_dom_id_country_;
  }
  
  public String getAttributeOfIdOnSpree_dom_id_country_() {
    return spree_dom_id_country_.getAttribute("id");
  }
  
  public String getTextOfSpree_dom_id_country_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("<%= spree_dom_id country %>") && matcher.group(2).equals("spree_dom_id_country_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
