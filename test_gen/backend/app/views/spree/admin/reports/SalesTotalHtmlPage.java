package test.backend.app.views.spree.admin.reports;

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

public class SalesTotalHtmlPage extends AbstractPage {
  public SalesTotalHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_447']")
  private WebElement link_to_with_icon__icon_minus_arrow_minus_left___Spree_dot_t__back_to_reports_list___spree_dot_admin_reports_url___class_____button__;
  
  public WebElement getElementOfLink_to_with_icon__icon_minus_arrow_minus_left___Spree_dot_t__back_to_reports_list___spree_dot_admin_reports_url___class_____button__() {
    return link_to_with_icon__icon_minus_arrow_minus_left___Spree_dot_t__back_to_reports_list___spree_dot_admin_reports_url___class_____button__;
  }
  
  public String getTextOfLink_to_with_icon__icon_minus_arrow_minus_left___Spree_dot_t__back_to_reports_list___spree_dot_admin_reports_url___class_____button__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_447") && matcher.group(2).equals("link_to_with_icon__icon_minus_arrow_minus_left___Spree_dot_t__back_to_reports_list___spree_dot_admin_reports_url___class_____button__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_448']")
  private WebElement Spree_dot_t__currency__;
  
  public WebElement getElementOfSpree_dot_t__currency__() {
    return Spree_dot_t__currency__;
  }
  
  public String getTextOfSpree_dot_t__currency__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_448") && matcher.group(2).equals("Spree_dot_t__currency__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_449']")
  private WebElement Spree_dot_t__item_total__;
  
  public WebElement getElementOfSpree_dot_t__item_total__() {
    return Spree_dot_t__item_total__;
  }
  
  public String getTextOfSpree_dot_t__item_total__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_449") && matcher.group(2).equals("Spree_dot_t__item_total__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_450']")
  private WebElement Spree_dot_t__adjustment_total__;
  
  public WebElement getElementOfSpree_dot_t__adjustment_total__() {
    return Spree_dot_t__adjustment_total__;
  }
  
  public String getTextOfSpree_dot_t__adjustment_total__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_450") && matcher.group(2).equals("Spree_dot_t__adjustment_total__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_451']")
  private WebElement Spree_dot_t__sales_total__;
  
  public WebElement getElementOfSpree_dot_t__sales_total__() {
    return Spree_dot_t__sales_total__;
  }
  
  public String getTextOfSpree_dot_t__sales_total__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_451") && matcher.group(2).equals("Spree_dot_t__sales_total__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_452']")
  private WebElement key_;
  
  public WebElement getElementOfKey_() {
    return key_;
  }
  
  public String getTextOfKey_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_452") && matcher.group(2).equals("key_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_453']")
  private WebElement row__item_total__dot_format_;
  
  public WebElement getElementOfRow__item_total__dot_format_() {
    return row__item_total__dot_format_;
  }
  
  public String getTextOfRow__item_total__dot_format_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_453") && matcher.group(2).equals("row__item_total__dot_format_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_454']")
  private WebElement row__adjustment_total__dot_format_;
  
  public WebElement getElementOfRow__adjustment_total__dot_format_() {
    return row__adjustment_total__dot_format_;
  }
  
  public String getTextOfRow__adjustment_total__dot_format_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_454") && matcher.group(2).equals("row__adjustment_total__dot_format_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_455']")
  private WebElement row__sales_total__dot_format_;
  
  public WebElement getElementOfRow__sales_total__dot_format_() {
    return row__sales_total__dot_format_;
  }
  
  public String getTextOfRow__sales_total__dot_format_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_455") && matcher.group(2).equals("row__sales_total__dot_format_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
