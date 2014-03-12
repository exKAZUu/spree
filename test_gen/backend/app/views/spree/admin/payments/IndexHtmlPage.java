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

public class IndexHtmlPage extends AbstractPage {
  public IndexHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='new_payment_section']")
  private WebElement button_link_to_Spree_dot_t__new_payment___new_admin_order_payment_url__order____icon_____icon_minus_plus__;
  
  public WebElement getElementOfButton_link_to_Spree_dot_t__new_payment___new_admin_order_payment_url__order____icon_____icon_minus_plus__() {
    return button_link_to_Spree_dot_t__new_payment___new_admin_order_payment_url__order____icon_____icon_minus_plus__;
  }
  
  public String getTextOfButton_link_to_Spree_dot_t__new_payment___new_admin_order_payment_url__order____icon_____icon_minus_plus__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("new_payment_section") && matcher.group(2).equals("button_link_to_Spree_dot_t__new_payment___new_admin_order_payment_url__order____icon_____icon_minus_plus__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_280']")
  private WebElement button_link_to_Spree_dot_t__back_to_orders_list___admin_orders_path___icon_____icon_minus_arrow_minus_left__;
  
  public WebElement getElementOfButton_link_to_Spree_dot_t__back_to_orders_list___admin_orders_path___icon_____icon_minus_arrow_minus_left__() {
    return button_link_to_Spree_dot_t__back_to_orders_list___admin_orders_path___icon_____icon_minus_arrow_minus_left__;
  }
  
  public String getTextOfButton_link_to_Spree_dot_t__back_to_orders_list___admin_orders_path___icon_____icon_minus_arrow_minus_left__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_280") && matcher.group(2).equals("button_link_to_Spree_dot_t__back_to_orders_list___admin_orders_path___icon_____icon_minus_arrow_minus_left__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_282']")
  private WebElement _order_dot_display_outstanding_balance_;
  
  public WebElement getElementOf_order_dot_display_outstanding_balance_() {
    return _order_dot_display_outstanding_balance_;
  }
  
  public String getTextOf_order_dot_display_outstanding_balance_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_282") && matcher.group(2).equals("_order_dot_display_outstanding_balance_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_281']")
  private WebElement _order_dot_outstanding_balance___0___Spree_dot_t__credit_owed____Spree_dot_t__balance_due__;
  
  public WebElement getElementOf_order_dot_outstanding_balance___0___Spree_dot_t__credit_owed____Spree_dot_t__balance_due__() {
    return _order_dot_outstanding_balance___0___Spree_dot_t__credit_owed____Spree_dot_t__balance_due__;
  }
  
  public String getTextOf_order_dot_outstanding_balance___0___Spree_dot_t__credit_owed____Spree_dot_t__balance_due__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_281") && matcher.group(2).equals("_order_dot_outstanding_balance___0___Spree_dot_t__credit_owed____Spree_dot_t__balance_due__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_283']")
  private WebElement Spree_dot_t__order_has_no_payments__;
  
  public WebElement getElementOfSpree_dot_t__order_has_no_payments__() {
    return Spree_dot_t__order_has_no_payments__;
  }
  
  public String getTextOfSpree_dot_t__order_has_no_payments__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_283") && matcher.group(2).equals("Spree_dot_t__order_has_no_payments__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
