package test.backend.app.views.spree.admin.orders;

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

public class RiskAnalysisHtmlPage extends AbstractPage {
  public RiskAnalysisHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_148']")
  private WebElement ___Spree_dot_t__risk_analysis______Spree_dot_t__not__unless__order_dot_is_risky_____Spree_dot_t__risky____;
  
  public WebElement getElementOf___Spree_dot_t__risk_analysis______Spree_dot_t__not__unless__order_dot_is_risky_____Spree_dot_t__risky____() {
    return ___Spree_dot_t__risk_analysis______Spree_dot_t__not__unless__order_dot_is_risky_____Spree_dot_t__risky____;
  }
  
  public String getTextOf___Spree_dot_t__risk_analysis______Spree_dot_t__not__unless__order_dot_is_risky_____Spree_dot_t__risky____() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_148") && matcher.group(2).equals("___Spree_dot_t__risk_analysis______Spree_dot_t__not__unless__order_dot_is_risky_____Spree_dot_t__risky____")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_149']")
  private WebElement Spree_dot_t__risk__;
  
  public WebElement getElementOfSpree_dot_t__risk__() {
    return Spree_dot_t__risk__;
  }
  
  public String getTextOfSpree_dot_t__risk__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_149") && matcher.group(2).equals("Spree_dot_t__risk__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_150']")
  private WebElement Spree_dot_t__status__;
  
  public WebElement getElementOfSpree_dot_t__status__() {
    return Spree_dot_t__status__;
  }
  
  public String getTextOfSpree_dot_t__status__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_150") && matcher.group(2).equals("Spree_dot_t__status__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_151']")
  private WebElement Spree_dot_t__failed_payment_attempts__;
  
  public WebElement getElementOfSpree_dot_t__failed_payment_attempts__() {
    return Spree_dot_t__failed_payment_attempts__;
  }
  
  public String getTextOfSpree_dot_t__failed_payment_attempts__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_151") && matcher.group(2).equals("Spree_dot_t__failed_payment_attempts__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_152']")
  private WebElement _order_dot_payments_dot_failed_dot_count___0____state_void_____state_complete__;
  
  public WebElement getElementOf_order_dot_payments_dot_failed_dot_count___0____state_void_____state_complete__() {
    return _order_dot_payments_dot_failed_dot_count___0____state_void_____state_complete__;
  }
  
  public String getAttributeOfClassOn_order_dot_payments_dot_failed_dot_count___0____state_void_____state_complete__() {
    return _order_dot_payments_dot_failed_dot_count___0____state_void_____state_complete__.getAttribute("class");
  }
  
  public String getTextOf_order_dot_payments_dot_failed_dot_count___0____state_void_____state_complete__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_152") && matcher.group(2).equals("_order_dot_payments_dot_failed_dot_count___0____state_void_____state_complete__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_152']")
  private WebElement link_to____pluralize__order_dot_payments_dot_failed_dot_count__Spree_dot_t__payment______spree_dot_admin_order_payments_path__order__;
  
  public WebElement getElementOfLink_to____pluralize__order_dot_payments_dot_failed_dot_count__Spree_dot_t__payment______spree_dot_admin_order_payments_path__order__() {
    return link_to____pluralize__order_dot_payments_dot_failed_dot_count__Spree_dot_t__payment______spree_dot_admin_order_payments_path__order__;
  }
  
  public String getTextOfLink_to____pluralize__order_dot_payments_dot_failed_dot_count__Spree_dot_t__payment______spree_dot_admin_order_payments_path__order__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_152") && matcher.group(2).equals("link_to____pluralize__order_dot_payments_dot_failed_dot_count__Spree_dot_t__payment______spree_dot_admin_order_payments_path__order__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_153']")
  private WebElement Spree_dot_t__avs_response__;
  
  public WebElement getElementOfSpree_dot_t__avs_response__() {
    return Spree_dot_t__avs_response__;
  }
  
  public String getTextOfSpree_dot_t__avs_response__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_153") && matcher.group(2).equals("Spree_dot_t__avs_response__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_154']")
  private WebElement ___Spree_dot_t__error______avs_response_code_latest_payment_dot_avs_response____;
  
  public WebElement getElementOf___Spree_dot_t__error______avs_response_code_latest_payment_dot_avs_response____() {
    return ___Spree_dot_t__error______avs_response_code_latest_payment_dot_avs_response____;
  }
  
  public String getTextOf___Spree_dot_t__error______avs_response_code_latest_payment_dot_avs_response____() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_154") && matcher.group(2).equals("___Spree_dot_t__error______avs_response_code_latest_payment_dot_avs_response____")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_154']")
  private WebElement latest_payment_dot_is_avs_risky_____state_void_____state_complete__;
  
  public WebElement getElementOfLatest_payment_dot_is_avs_risky_____state_void_____state_complete__() {
    return latest_payment_dot_is_avs_risky_____state_void_____state_complete__;
  }
  
  public String getAttributeOfClassOnLatest_payment_dot_is_avs_risky_____state_void_____state_complete__() {
    return latest_payment_dot_is_avs_risky_____state_void_____state_complete__.getAttribute("class");
  }
  
  public String getTextOfLatest_payment_dot_is_avs_risky_____state_void_____state_complete__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_154") && matcher.group(2).equals("latest_payment_dot_is_avs_risky_____state_void_____state_complete__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_154']")
  private WebElement Spree_dot_t__success__;
  
  public WebElement getElementOfSpree_dot_t__success__() {
    return Spree_dot_t__success__;
  }
  
  public String getTextOfSpree_dot_t__success__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_154") && matcher.group(2).equals("Spree_dot_t__success__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_155']")
  private WebElement Spree_dot_t__cvv_response__;
  
  public WebElement getElementOfSpree_dot_t__cvv_response__() {
    return Spree_dot_t__cvv_response__;
  }
  
  public String getTextOfSpree_dot_t__cvv_response__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_155") && matcher.group(2).equals("Spree_dot_t__cvv_response__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_156']")
  private WebElement latest_payment_dot_is_cvv_risky_____state_void_____state_complete__;
  
  public WebElement getElementOfLatest_payment_dot_is_cvv_risky_____state_void_____state_complete__() {
    return latest_payment_dot_is_cvv_risky_____state_void_____state_complete__;
  }
  
  public String getAttributeOfClassOnLatest_payment_dot_is_cvv_risky_____state_void_____state_complete__() {
    return latest_payment_dot_is_cvv_risky_____state_void_____state_complete__.getAttribute("class");
  }
  
  public String getTextOfLatest_payment_dot_is_cvv_risky_____state_void_____state_complete__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_156") && matcher.group(2).equals("latest_payment_dot_is_cvv_risky_____state_void_____state_complete__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_156']")
  private WebElement Spree_dot_t__success___PO2;
  
  public WebElement getElementOfSpree_dot_t__success___PO2() {
    return Spree_dot_t__success___PO2;
  }
  
  public String getTextOfSpree_dot_t__success___PO2() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_156") && matcher.group(2).equals("Spree_dot_t__success__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_156']")
  private WebElement ___Spree_dot_t__error______cvv_response_code_latest_payment_dot_cvv_response_code____;
  
  public WebElement getElementOf___Spree_dot_t__error______cvv_response_code_latest_payment_dot_cvv_response_code____() {
    return ___Spree_dot_t__error______cvv_response_code_latest_payment_dot_cvv_response_code____;
  }
  
  public String getTextOf___Spree_dot_t__error______cvv_response_code_latest_payment_dot_cvv_response_code____() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_156") && matcher.group(2).equals("___Spree_dot_t__error______cvv_response_code_latest_payment_dot_cvv_response_code____")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
