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

public class EditHtmlPage extends AbstractPage {
  public EditHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_197']")
  private WebElement event_links_;
  
  public WebElement getElementOfEvent_links_() {
    return event_links_;
  }
  
  public String getTextOfEvent_links_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_197") && matcher.group(2).equals("event_links_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_198']")
  private WebElement button_link_to_Spree_dot_t__resend___resend_admin_order_url__order____method_____post___icon_____icon_minus_email__;
  
  public WebElement getElementOfButton_link_to_Spree_dot_t__resend___resend_admin_order_url__order____method_____post___icon_____icon_minus_email__() {
    return button_link_to_Spree_dot_t__resend___resend_admin_order_url__order____method_____post___icon_____icon_minus_email__;
  }
  
  public String getTextOfButton_link_to_Spree_dot_t__resend___resend_admin_order_url__order____method_____post___icon_____icon_minus_email__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_198") && matcher.group(2).equals("button_link_to_Spree_dot_t__resend___resend_admin_order_url__order____method_____post___icon_____icon_minus_email__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_199']")
  private WebElement button_link_to_Spree_dot_t__back_to_orders_list___admin_orders_path___icon_____icon_minus_arrow_minus_left__;
  
  public WebElement getElementOfButton_link_to_Spree_dot_t__back_to_orders_list___admin_orders_path___icon_____icon_minus_arrow_minus_left__() {
    return button_link_to_Spree_dot_t__back_to_orders_list___admin_orders_path___icon_____icon_minus_arrow_minus_left__;
  }
  
  public String getTextOfButton_link_to_Spree_dot_t__back_to_orders_list___admin_orders_path___icon_____icon_minus_arrow_minus_left__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_199") && matcher.group(2).equals("button_link_to_Spree_dot_t__back_to_orders_list___admin_orders_path___icon_____icon_minus_arrow_minus_left__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_200']")
  private WebElement render__partial_____spree_divide_shared_divide_error_messages____locals_______target_____order___;
  
  public WebElement getElementOfRender__partial_____spree_divide_shared_divide_error_messages____locals_______target_____order___() {
    return render__partial_____spree_divide_shared_divide_error_messages____locals_______target_____order___;
  }
  
  public String getTextOfRender__partial_____spree_divide_shared_divide_error_messages____locals_______target_____order___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_200") && matcher.group(2).equals("render__partial_____spree_divide_shared_divide_error_messages____locals_______target_____order___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_201']")
  private WebElement Spree_dot_t__your_order_is_empty_add_product_;
  
  public WebElement getElementOfSpree_dot_t__your_order_is_empty_add_product_() {
    return Spree_dot_t__your_order_is_empty_add_product_;
  }
  
  public String getTextOfSpree_dot_t__your_order_is_empty_add_product_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_201") && matcher.group(2).equals("Spree_dot_t__your_order_is_empty_add_product_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='order-form-wrapper']")
  private WebElement render__partial_____form____locals_______order_____order___;
  
  public WebElement getElementOfRender__partial_____form____locals_______order_____order___() {
    return render__partial_____form____locals_______order_____order___;
  }
  
  public String getTextOfRender__partial_____form____locals_______order_____order___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("order-form-wrapper") && matcher.group(2).equals("render__partial_____form____locals_______order_____order___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
