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

public class AddressHtmlPage extends AbstractPage {
  public AddressHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_488']")
  private WebElement _____address_dot_city_____address_dot_state_text_____address_dot_zipcode_____address_dot_country_dot_name___;
  
  public WebElement getElementOf_____address_dot_city_____address_dot_state_text_____address_dot_zipcode_____address_dot_country_dot_name___() {
    return _____address_dot_city_____address_dot_state_text_____address_dot_zipcode_____address_dot_country_dot_name___;
  }
  
  public String getTextOf_____address_dot_city_____address_dot_state_text_____address_dot_zipcode_____address_dot_country_dot_name___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_488") && matcher.group(2).equals("_____address_dot_city_____address_dot_state_text_____address_dot_zipcode_____address_dot_country_dot_name___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_488']")
  private WebElement ___address_dot_firstname____address_dot_lastname___;
  
  public WebElement getElementOf___address_dot_firstname____address_dot_lastname___() {
    return ___address_dot_firstname____address_dot_lastname___;
  }
  
  public String getTextOf___address_dot_firstname____address_dot_lastname___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_488") && matcher.group(2).equals("___address_dot_firstname____address_dot_lastname___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_488']")
  private WebElement _____address_dot_address2___unless_address_dot_address2_dot_blank__;
  
  public WebElement getElementOf_____address_dot_address2___unless_address_dot_address2_dot_blank__() {
    return _____address_dot_address2___unless_address_dot_address2_dot_blank__;
  }
  
  public String getTextOf_____address_dot_address2___unless_address_dot_address2_dot_blank__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_488") && matcher.group(2).equals("_____address_dot_address2___unless_address_dot_address2_dot_blank__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_488']")
  private WebElement address_dot_company_unless_address_dot_company_dot_blank__;
  
  public WebElement getElementOfAddress_dot_company_unless_address_dot_company_dot_blank__() {
    return address_dot_company_unless_address_dot_company_dot_blank__;
  }
  
  public String getTextOfAddress_dot_company_unless_address_dot_company_dot_blank__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_488") && matcher.group(2).equals("address_dot_company_unless_address_dot_company_dot_blank__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_488']")
  private WebElement address_dot_alternative_phone_unless_address_dot_alternative_phone_dot_blank__;
  
  public WebElement getElementOfAddress_dot_alternative_phone_unless_address_dot_alternative_phone_dot_blank__() {
    return address_dot_alternative_phone_unless_address_dot_alternative_phone_dot_blank__;
  }
  
  public String getTextOfAddress_dot_alternative_phone_unless_address_dot_alternative_phone_dot_blank__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_488") && matcher.group(2).equals("address_dot_alternative_phone_unless_address_dot_alternative_phone_dot_blank__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_488']")
  private WebElement ____address_dot_phone___;
  
  public WebElement getElementOf____address_dot_phone___() {
    return ____address_dot_phone___;
  }
  
  public String getTextOf____address_dot_phone___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_488") && matcher.group(2).equals("____address_dot_phone___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_488']")
  private WebElement address_dot_address1_;
  
  public WebElement getElementOfAddress_dot_address1_() {
    return address_dot_address1_;
  }
  
  public String getTextOfAddress_dot_address1_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_488") && matcher.group(2).equals("address_dot_address1_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
