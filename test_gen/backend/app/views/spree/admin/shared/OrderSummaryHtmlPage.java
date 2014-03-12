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

public class OrderSummaryHtmlPage extends AbstractPage {
  public OrderSummaryHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='order_status']")
  private WebElement Spree_dot_t__status__;
  
  public WebElement getElementOfSpree_dot_t__status__() {
    return Spree_dot_t__status__;
  }
  
  public String getTextOfSpree_dot_t__status__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("order_status") && matcher.group(2).equals("Spree_dot_t__status__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_520']")
  private WebElement Spree_dot_t__order_dot_state___scope_____order_state__;
  
  public WebElement getElementOfSpree_dot_t__order_dot_state___scope_____order_state__() {
    return Spree_dot_t__order_dot_state___scope_____order_state__;
  }
  
  public String getTextOfSpree_dot_t__order_dot_state___scope_____order_state__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_520") && matcher.group(2).equals("Spree_dot_t__order_dot_state___scope_____order_state__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_520']")
  private WebElement _order_dot_state_;
  
  public WebElement getElementOf_order_dot_state_() {
    return _order_dot_state_;
  }
  
  public String getAttributeOfClassOn_order_dot_state_() {
    return _order_dot_state_.getAttribute("class");
  }
  
  public String getTextOf_order_dot_state_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_520") && matcher.group(2).equals("_order_dot_state_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_521']")
  private WebElement Spree_dot_t__subtotal__;
  
  public WebElement getElementOfSpree_dot_t__subtotal__() {
    return Spree_dot_t__subtotal__;
  }
  
  public String getTextOfSpree_dot_t__subtotal__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_521") && matcher.group(2).equals("Spree_dot_t__subtotal__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='item_total']")
  private WebElement _order_dot_display_item_total_dot_to_html_;
  
  public WebElement getElementOf_order_dot_display_item_total_dot_to_html_() {
    return _order_dot_display_item_total_dot_to_html_;
  }
  
  public String getTextOf_order_dot_display_item_total_dot_to_html_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("item_total") && matcher.group(2).equals("_order_dot_display_item_total_dot_to_html_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_522']")
  private WebElement Spree_dot_t__ship_total__;
  
  public WebElement getElementOfSpree_dot_t__ship_total__() {
    return Spree_dot_t__ship_total__;
  }
  
  public String getTextOfSpree_dot_t__ship_total__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_522") && matcher.group(2).equals("Spree_dot_t__ship_total__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='item_total']")
  private WebElement _order_dot_display_ship_total_dot_to_html_;
  
  public WebElement getElementOf_order_dot_display_ship_total_dot_to_html_() {
    return _order_dot_display_ship_total_dot_to_html_;
  }
  
  public String getTextOf_order_dot_display_ship_total_dot_to_html_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("item_total") && matcher.group(2).equals("_order_dot_display_ship_total_dot_to_html_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_523']")
  private WebElement Spree_dot_t__tax_included__;
  
  public WebElement getElementOfSpree_dot_t__tax_included__() {
    return Spree_dot_t__tax_included__;
  }
  
  public String getTextOfSpree_dot_t__tax_included__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_523") && matcher.group(2).equals("Spree_dot_t__tax_included__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='included_tax_total']")
  private WebElement _order_dot_display_included_tax_total_dot_to_html_;
  
  public WebElement getElementOf_order_dot_display_included_tax_total_dot_to_html_() {
    return _order_dot_display_included_tax_total_dot_to_html_;
  }
  
  public String getTextOf_order_dot_display_included_tax_total_dot_to_html_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("included_tax_total") && matcher.group(2).equals("_order_dot_display_included_tax_total_dot_to_html_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_524']")
  private WebElement Spree_dot_t__tax__;
  
  public WebElement getElementOfSpree_dot_t__tax__() {
    return Spree_dot_t__tax__;
  }
  
  public String getTextOfSpree_dot_t__tax__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_524") && matcher.group(2).equals("Spree_dot_t__tax__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='item_total']")
  private WebElement _order_dot_display_additional_tax_total_dot_to_html_;
  
  public WebElement getElementOf_order_dot_display_additional_tax_total_dot_to_html_() {
    return _order_dot_display_additional_tax_total_dot_to_html_;
  }
  
  public String getTextOf_order_dot_display_additional_tax_total_dot_to_html_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("item_total") && matcher.group(2).equals("_order_dot_display_additional_tax_total_dot_to_html_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_525']")
  private WebElement Spree_dot_t__total__;
  
  public WebElement getElementOfSpree_dot_t__total__() {
    return Spree_dot_t__total__;
  }
  
  public String getTextOfSpree_dot_t__total__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_525") && matcher.group(2).equals("Spree_dot_t__total__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='order_total']")
  private WebElement _order_dot_display_total_dot_to_html_;
  
  public WebElement getElementOf_order_dot_display_total_dot_to_html_() {
    return _order_dot_display_total_dot_to_html_;
  }
  
  public String getTextOf_order_dot_display_total_dot_to_html_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("order_total") && matcher.group(2).equals("_order_dot_display_total_dot_to_html_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_526']")
  private WebElement Spree_dot_t__shipment__;
  
  public WebElement getElementOfSpree_dot_t__shipment__() {
    return Spree_dot_t__shipment__;
  }
  
  public String getTextOfSpree_dot_t__shipment__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_526") && matcher.group(2).equals("Spree_dot_t__shipment__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_527']")
  private WebElement _order_dot_shipment_state_;
  
  public WebElement getElementOf_order_dot_shipment_state_() {
    return _order_dot_shipment_state_;
  }
  
  public String getAttributeOfClassOn_order_dot_shipment_state_() {
    return _order_dot_shipment_state_.getAttribute("class");
  }
  
  public String getTextOf_order_dot_shipment_state_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_527") && matcher.group(2).equals("_order_dot_shipment_state_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_527']")
  private WebElement Spree_dot_t__order_dot_shipment_state___scope_____shipment_states___default______missing___none____;
  
  public WebElement getElementOfSpree_dot_t__order_dot_shipment_state___scope_____shipment_states___default______missing___none____() {
    return Spree_dot_t__order_dot_shipment_state___scope_____shipment_states___default______missing___none____;
  }
  
  public String getTextOfSpree_dot_t__order_dot_shipment_state___scope_____shipment_states___default______missing___none____() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_527") && matcher.group(2).equals("Spree_dot_t__order_dot_shipment_state___scope_____shipment_states___default______missing___none____")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_528']")
  private WebElement Spree_dot_t__payment__;
  
  public WebElement getElementOfSpree_dot_t__payment__() {
    return Spree_dot_t__payment__;
  }
  
  public String getTextOfSpree_dot_t__payment__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_528") && matcher.group(2).equals("Spree_dot_t__payment__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_529']")
  private WebElement _order_dot_payment_state_;
  
  public WebElement getElementOf_order_dot_payment_state_() {
    return _order_dot_payment_state_;
  }
  
  public String getAttributeOfClassOn_order_dot_payment_state_() {
    return _order_dot_payment_state_.getAttribute("class");
  }
  
  public String getTextOf_order_dot_payment_state_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_529") && matcher.group(2).equals("_order_dot_payment_state_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_529']")
  private WebElement Spree_dot_t__order_dot_payment_state___scope_____payment_states___default______missing___none____;
  
  public WebElement getElementOfSpree_dot_t__order_dot_payment_state___scope_____payment_states___default______missing___none____() {
    return Spree_dot_t__order_dot_payment_state___scope_____payment_states___default______missing___none____;
  }
  
  public String getTextOfSpree_dot_t__order_dot_payment_state___scope_____payment_states___default______missing___none____() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_529") && matcher.group(2).equals("Spree_dot_t__order_dot_payment_state___scope_____payment_states___default______missing___none____")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_530']")
  private WebElement Spree_dot_t__date_completed__;
  
  public WebElement getElementOfSpree_dot_t__date_completed__() {
    return Spree_dot_t__date_completed__;
  }
  
  public String getTextOfSpree_dot_t__date_completed__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_530") && matcher.group(2).equals("Spree_dot_t__date_completed__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='date_complete']")
  private WebElement pretty_time__order_dot_completed_at__;
  
  public WebElement getElementOfPretty_time__order_dot_completed_at__() {
    return pretty_time__order_dot_completed_at__;
  }
  
  public String getTextOfPretty_time__order_dot_completed_at__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("date_complete") && matcher.group(2).equals("pretty_time__order_dot_completed_at__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_531']")
  private WebElement Spree_dot_t__approver__;
  
  public WebElement getElementOfSpree_dot_t__approver__() {
    return Spree_dot_t__approver__;
  }
  
  public String getTextOfSpree_dot_t__approver__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_531") && matcher.group(2).equals("Spree_dot_t__approver__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_532']")
  private WebElement _order_dot_approver_dot_email_;
  
  public WebElement getElementOf_order_dot_approver_dot_email_() {
    return _order_dot_approver_dot_email_;
  }
  
  public String getTextOf_order_dot_approver_dot_email_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_532") && matcher.group(2).equals("_order_dot_approver_dot_email_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_533']")
  private WebElement Spree_dot_t__approved_at__;
  
  public WebElement getElementOfSpree_dot_t__approved_at__() {
    return Spree_dot_t__approved_at__;
  }
  
  public String getTextOfSpree_dot_t__approved_at__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_533") && matcher.group(2).equals("Spree_dot_t__approved_at__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_534']")
  private WebElement pretty_time__order_dot_approved_at__;
  
  public WebElement getElementOfPretty_time__order_dot_approved_at__() {
    return pretty_time__order_dot_approved_at__;
  }
  
  public String getTextOfPretty_time__order_dot_approved_at__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_534") && matcher.group(2).equals("pretty_time__order_dot_approved_at__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
