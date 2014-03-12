package test.backend.app.views.spree.admin.payments;

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

public class ShowHtmlPage extends AbstractPage {
  public ShowHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_287']")
  private WebElement _payment_dot_state_;
  
  public WebElement getElementOf_payment_dot_state_() {
    return _payment_dot_state_;
  }
  
  public String getAttributeOfClassOn_payment_dot_state_() {
    return _payment_dot_state_.getAttribute("class");
  }
  
  public String getTextOf_payment_dot_state_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_287") && matcher.group(2).equals("_payment_dot_state_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_287']")
  private WebElement Spree_dot_t__payment_dot_state___scope_____payment_states___default_____payment_dot_state_dot_capitalize__;
  
  public WebElement getElementOfSpree_dot_t__payment_dot_state___scope_____payment_states___default_____payment_dot_state_dot_capitalize__() {
    return Spree_dot_t__payment_dot_state___scope_____payment_states___default_____payment_dot_state_dot_capitalize__;
  }
  
  public String getTextOfSpree_dot_t__payment_dot_state___scope_____payment_states___default_____payment_dot_state_dot_capitalize__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_287") && matcher.group(2).equals("Spree_dot_t__payment_dot_state___scope_____payment_states___default_____payment_dot_state_dot_capitalize__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_288']")
  private WebElement button_link_to_Spree_dot_t__logs___spree_dot_admin_order_payment_log_entries_url__order___payment____icon_____icon_minus_archive__;
  
  public WebElement getElementOfButton_link_to_Spree_dot_t__logs___spree_dot_admin_order_payment_log_entries_url__order___payment____icon_____icon_minus_archive__() {
    return button_link_to_Spree_dot_t__logs___spree_dot_admin_order_payment_log_entries_url__order___payment____icon_____icon_minus_archive__;
  }
  
  public String getTextOfButton_link_to_Spree_dot_t__logs___spree_dot_admin_order_payment_log_entries_url__order___payment____icon_____icon_minus_archive__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_288") && matcher.group(2).equals("button_link_to_Spree_dot_t__logs___spree_dot_admin_order_payment_log_entries_url__order___payment____icon_____icon_minus_archive__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_289']")
  private WebElement button_link_to_Spree_dot_t__back_to_payments_list___spree_dot_admin_order_payments_url__order____icon_____icon_minus_arrow_minus_left__;
  
  public WebElement getElementOfButton_link_to_Spree_dot_t__back_to_payments_list___spree_dot_admin_order_payments_url__order____icon_____icon_minus_arrow_minus_left__() {
    return button_link_to_Spree_dot_t__back_to_payments_list___spree_dot_admin_order_payments_url__order____icon_____icon_minus_arrow_minus_left__;
  }
  
  public String getTextOfButton_link_to_Spree_dot_t__back_to_payments_list___spree_dot_admin_order_payments_url__order____icon_____icon_minus_arrow_minus_left__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_289") && matcher.group(2).equals("button_link_to_Spree_dot_t__back_to_payments_list___spree_dot_admin_order_payments_url__order____icon_____icon_minus_arrow_minus_left__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_291']")
  private WebElement _payment_dot_display_amount_dot_to_html_;
  
  public WebElement getElementOf_payment_dot_display_amount_dot_to_html_() {
    return _payment_dot_display_amount_dot_to_html_;
  }
  
  public String getTextOf_payment_dot_display_amount_dot_to_html_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_291") && matcher.group(2).equals("_payment_dot_display_amount_dot_to_html_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_290']")
  private WebElement label_tag_nil__Spree_dot_t__amount__;
  
  public WebElement getElementOfLabel_tag_nil__Spree_dot_t__amount__() {
    return label_tag_nil__Spree_dot_t__amount__;
  }
  
  public String getTextOfLabel_tag_nil__Spree_dot_t__amount__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_290") && matcher.group(2).equals("label_tag_nil__Spree_dot_t__amount__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
