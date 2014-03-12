package test.backend.app.views.spree.admin.payments.source_views;

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

public class GatewayHtmlPage extends AbstractPage {
  public GatewayHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_299']")
  private WebElement Spree_dot_t__credit_card__;
  
  public WebElement getElementOfSpree_dot_t__credit_card__() {
    return Spree_dot_t__credit_card__;
  }
  
  public String getTextOfSpree_dot_t__credit_card__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_299") && matcher.group(2).equals("Spree_dot_t__credit_card__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_300']")
  private WebElement Spree_dot_t__name_on_card__;
  
  public WebElement getElementOfSpree_dot_t__name_on_card__() {
    return Spree_dot_t__name_on_card__;
  }
  
  public String getTextOfSpree_dot_t__name_on_card__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_300") && matcher.group(2).equals("Spree_dot_t__name_on_card__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_301']")
  private WebElement payment_dot_source_dot_name_;
  
  public WebElement getElementOfPayment_dot_source_dot_name_() {
    return payment_dot_source_dot_name_;
  }
  
  public String getTextOfPayment_dot_source_dot_name_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_301") && matcher.group(2).equals("payment_dot_source_dot_name_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_302']")
  private WebElement Spree_dot_t__card_type__;
  
  public WebElement getElementOfSpree_dot_t__card_type__() {
    return Spree_dot_t__card_type__;
  }
  
  public String getTextOfSpree_dot_t__card_type__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_302") && matcher.group(2).equals("Spree_dot_t__card_type__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_303']")
  private WebElement payment_dot_source_dot_cc_type_;
  
  public WebElement getElementOfPayment_dot_source_dot_cc_type_() {
    return payment_dot_source_dot_cc_type_;
  }
  
  public String getTextOfPayment_dot_source_dot_cc_type_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_303") && matcher.group(2).equals("payment_dot_source_dot_cc_type_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_304']")
  private WebElement Spree_dot_t__card_number__;
  
  public WebElement getElementOfSpree_dot_t__card_number__() {
    return Spree_dot_t__card_number__;
  }
  
  public String getTextOfSpree_dot_t__card_number__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_304") && matcher.group(2).equals("Spree_dot_t__card_number__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_305']")
  private WebElement payment_dot_source_dot_display_number_;
  
  public WebElement getElementOfPayment_dot_source_dot_display_number_() {
    return payment_dot_source_dot_display_number_;
  }
  
  public String getTextOfPayment_dot_source_dot_display_number_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_305") && matcher.group(2).equals("payment_dot_source_dot_display_number_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_306']")
  private WebElement Spree_dot_t__expiration__;
  
  public WebElement getElementOfSpree_dot_t__expiration__() {
    return Spree_dot_t__expiration__;
  }
  
  public String getTextOfSpree_dot_t__expiration__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_306") && matcher.group(2).equals("Spree_dot_t__expiration__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_307']")
  private WebElement payment_dot_source_dot_year_;
  
  public WebElement getElementOfPayment_dot_source_dot_year_() {
    return payment_dot_source_dot_year_;
  }
  
  public String getTextOfPayment_dot_source_dot_year_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_307") && matcher.group(2).equals("payment_dot_source_dot_year_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_307']")
  private WebElement payment_dot_source_dot_month_;
  
  public WebElement getElementOfPayment_dot_source_dot_month_() {
    return payment_dot_source_dot_month_;
  }
  
  public String getTextOfPayment_dot_source_dot_month_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_307") && matcher.group(2).equals("payment_dot_source_dot_month_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
