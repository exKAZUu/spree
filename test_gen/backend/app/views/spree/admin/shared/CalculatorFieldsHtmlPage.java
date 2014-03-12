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

public class CalculatorFieldsHtmlPage extends AbstractPage {
  public CalculatorFieldsHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_500']")
  private WebElement Spree_dot_t__calculator__;
  
  public WebElement getElementOfSpree_dot_t__calculator__() {
    return Spree_dot_t__calculator__;
  }
  
  public String getTextOfSpree_dot_t__calculator__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_500") && matcher.group(2).equals("Spree_dot_t__calculator__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_501']")
  private WebElement f_dot_select__calculator_type___calculators_dot_map____c___c_dot_description__c_dot_name___________id_____calc_type____class_____select2_fullwidth____;
  
  public WebElement getElementOfF_dot_select__calculator_type___calculators_dot_map____c___c_dot_description__c_dot_name___________id_____calc_type____class_____select2_fullwidth____() {
    return f_dot_select__calculator_type___calculators_dot_map____c___c_dot_description__c_dot_name___________id_____calc_type____class_____select2_fullwidth____;
  }
  
  public String getTextOfF_dot_select__calculator_type___calculators_dot_map____c___c_dot_description__c_dot_name___________id_____calc_type____class_____select2_fullwidth____() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_501") && matcher.group(2).equals("f_dot_select__calculator_type___calculators_dot_map____c___c_dot_description__c_dot_name___________id_____calc_type____class_____select2_fullwidth____")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_501']")
  private WebElement f_dot_label__calculator_type__Spree_dot_t__calculator____for_____calc_type___;
  
  public WebElement getElementOfF_dot_label__calculator_type__Spree_dot_t__calculator____for_____calc_type___() {
    return f_dot_label__calculator_type__Spree_dot_t__calculator____for_____calc_type___;
  }
  
  public String getTextOfF_dot_label__calculator_type__Spree_dot_t__calculator____for_____calc_type___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_501") && matcher.group(2).equals("f_dot_label__calculator_type__Spree_dot_t__calculator____for_____calc_type___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_502']")
  private WebElement preference_fields__object_dot_calculator__calculator_form__;
  
  public WebElement getElementOfPreference_fields__object_dot_calculator__calculator_form__() {
    return preference_fields__object_dot_calculator__calculator_form__;
  }
  
  public String getTextOfPreference_fields__object_dot_calculator__calculator_form__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_502") && matcher.group(2).equals("preference_fields__object_dot_calculator__calculator_form__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_502']")
  private WebElement f_dot_fields_for__calculator_do__calculator_form__;
  
  public WebElement getElementOfF_dot_fields_for__calculator_do__calculator_form__() {
    return f_dot_fields_for__calculator_do__calculator_form__;
  }
  
  public String getTextOfF_dot_fields_for__calculator_do__calculator_form__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_502") && matcher.group(2).equals("f_dot_fields_for__calculator_do__calculator_form__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_503']")
  private WebElement Spree_dot_t__calculator_settings_warning__;
  
  public WebElement getElementOfSpree_dot_t__calculator_settings_warning__() {
    return Spree_dot_t__calculator_settings_warning__;
  }
  
  public String getTextOfSpree_dot_t__calculator_settings_warning__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_503") && matcher.group(2).equals("Spree_dot_t__calculator_settings_warning__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
