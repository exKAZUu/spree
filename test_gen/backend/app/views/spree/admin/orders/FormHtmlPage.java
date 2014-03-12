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

public class FormHtmlPage extends AbstractPage {
  public FormHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_135']")
  private WebElement Spree_dot_t__order_total__;
  
  public WebElement getElementOfSpree_dot_t__order_total__() {
    return Spree_dot_t__order_total__;
  }
  
  public String getTextOfSpree_dot_t__order_total__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_135") && matcher.group(2).equals("Spree_dot_t__order_total__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_136']")
  private WebElement order_dot_display_total_;
  
  public WebElement getElementOfOrder_dot_display_total_() {
    return order_dot_display_total_;
  }
  
  public String getTextOfOrder_dot_display_total_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_136") && matcher.group(2).equals("order_dot_display_total_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_134']")
  private WebElement javascript_tag_do__minus_;
  
  public WebElement getElementOfJavascript_tag_do__minus_() {
    return javascript_tag_do__minus_;
  }
  
  public String getTextOfJavascript_tag_do__minus_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_134") && matcher.group(2).equals("javascript_tag_do__minus_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_134']")
  private WebElement render__partial_____spree_divide_shared_divide_error_messages____locals_______target_____line_item___;
  
  public WebElement getElementOfRender__partial_____spree_divide_shared_divide_error_messages____locals_______target_____line_item___() {
    return render__partial_____spree_divide_shared_divide_error_messages____locals_______target_____line_item___;
  }
  
  public String getTextOfRender__partial_____spree_divide_shared_divide_error_messages____locals_______target_____line_item___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_134") && matcher.group(2).equals("render__partial_____spree_divide_shared_divide_error_messages____locals_______target_____line_item___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_134']")
  private WebElement render__partial_____spree_divide_admin_divide_shared_divide_update_order_state____handlers______js__;
  
  public WebElement getElementOfRender__partial_____spree_divide_admin_divide_shared_divide_update_order_state____handlers______js__() {
    return render__partial_____spree_divide_admin_divide_shared_divide_update_order_state____handlers______js__;
  }
  
  public String getTextOfRender__partial_____spree_divide_admin_divide_shared_divide_update_order_state____handlers______js__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_134") && matcher.group(2).equals("render__partial_____spree_divide_admin_divide_shared_divide_update_order_state____handlers______js__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_134']")
  private WebElement render__partial_____spree_divide_admin_divide_orders_divide_line_items____locals_______order____order___;
  
  public WebElement getElementOfRender__partial_____spree_divide_admin_divide_orders_divide_line_items____locals_______order____order___() {
    return render__partial_____spree_divide_admin_divide_orders_divide_line_items____locals_______order____order___;
  }
  
  public String getTextOfRender__partial_____spree_divide_admin_divide_orders_divide_line_items____locals_______order____order___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_134") && matcher.group(2).equals("render__partial_____spree_divide_admin_divide_orders_divide_line_items____locals_______order____order___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_134']")
  private WebElement __shipment_dot_to_json__root____false___include______inventory_units___stock_location___;
  
  public WebElement getElementOf__shipment_dot_to_json__root____false___include______inventory_units___stock_location___() {
    return __shipment_dot_to_json__root____false___include______inventory_units___stock_location___;
  }
  
  public String getTextOf__shipment_dot_to_json__root____false___include______inventory_units___stock_location___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_134") && matcher.group(2).equals("__shipment_dot_to_json__root____false___include______inventory_units___stock_location___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_134']")
  private WebElement _order_dot_number_;
  
  public WebElement getElementOf_order_dot_number_() {
    return _order_dot_number_;
  }
  
  public String getTextOf_order_dot_number_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_134") && matcher.group(2).equals("_order_dot_number_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_134']")
  private WebElement render__partial_____spree_divide_admin_divide_orders_divide_shipment____collection_____order_dot_shipments___locals_______order____order___;
  
  public WebElement getElementOfRender__partial_____spree_divide_admin_divide_orders_divide_shipment____collection_____order_dot_shipments___locals_______order____order___() {
    return render__partial_____spree_divide_admin_divide_orders_divide_shipment____collection_____order_dot_shipments___locals_______order____order___;
  }
  
  public String getTextOfRender__partial_____spree_divide_admin_divide_orders_divide_shipment____collection_____order_dot_shipments___locals_______order____order___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_134") && matcher.group(2).equals("render__partial_____spree_divide_admin_divide_orders_divide_shipment____collection_____order_dot_shipments___locals_______order____order___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
