package test.backend.app.views.spree.admin.adjustments;

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
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_19']")
  private WebElement button_link_to_Spree_dot_t__new_adjustment___new_admin_order_adjustment_url__order____icon_____icon_minus_plus__;
  
  public WebElement getElementOfButton_link_to_Spree_dot_t__new_adjustment___new_admin_order_adjustment_url__order____icon_____icon_minus_plus__() {
    return button_link_to_Spree_dot_t__new_adjustment___new_admin_order_adjustment_url__order____icon_____icon_minus_plus__;
  }
  
  public String getTextOfButton_link_to_Spree_dot_t__new_adjustment___new_admin_order_adjustment_url__order____icon_____icon_minus_plus__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_19") && matcher.group(2).equals("button_link_to_Spree_dot_t__new_adjustment___new_admin_order_adjustment_url__order____icon_____icon_minus_plus__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_20']")
  private WebElement button_link_to_Spree_dot_t__back_to_orders_list___admin_orders_path___icon_____icon_minus_arrow_minus_left__;
  
  public WebElement getElementOfButton_link_to_Spree_dot_t__back_to_orders_list___admin_orders_path___icon_____icon_minus_arrow_minus_left__() {
    return button_link_to_Spree_dot_t__back_to_orders_list___admin_orders_path___icon_____icon_minus_arrow_minus_left__;
  }
  
  public String getTextOfButton_link_to_Spree_dot_t__back_to_orders_list___admin_orders_path___icon_____icon_minus_arrow_minus_left__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_20") && matcher.group(2).equals("button_link_to_Spree_dot_t__back_to_orders_list___admin_orders_path___icon_____icon_minus_arrow_minus_left__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_21']")
  private WebElement button_Spree_dot_t__add_coupon_code____icon_minus_plus____submit____id_____add_coupon_code__;
  
  public WebElement getElementOfButton_Spree_dot_t__add_coupon_code____icon_minus_plus____submit____id_____add_coupon_code__() {
    return button_Spree_dot_t__add_coupon_code____icon_minus_plus____submit____id_____add_coupon_code__;
  }
  
  public String getTextOfButton_Spree_dot_t__add_coupon_code____icon_minus_plus____submit____id_____add_coupon_code__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_21") && matcher.group(2).equals("button_Spree_dot_t__add_coupon_code____icon_minus_plus____submit____id_____add_coupon_code__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_21']")
  private WebElement text_field_tag__coupon_code________placeholder____Spree_dot_t__coupon_code__;
  
  public WebElement getElementOfText_field_tag__coupon_code________placeholder____Spree_dot_t__coupon_code__() {
    return text_field_tag__coupon_code________placeholder____Spree_dot_t__coupon_code__;
  }
  
  public String getTextOfText_field_tag__coupon_code________placeholder____Spree_dot_t__coupon_code__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_21") && matcher.group(2).equals("text_field_tag__coupon_code________placeholder____Spree_dot_t__coupon_code__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
