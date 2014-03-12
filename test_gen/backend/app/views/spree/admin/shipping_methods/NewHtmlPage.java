package test.backend.app.views.spree.admin.shipping_methods;

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

public class NewHtmlPage extends AbstractPage {
  public NewHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_584']")
  private WebElement button_link_to_Spree_dot_t__back_to_shipping_methods_list___spree_dot_admin_shipping_methods_path___icon_____icon_minus_arrow_minus_left__;
  
  public WebElement getElementOfButton_link_to_Spree_dot_t__back_to_shipping_methods_list___spree_dot_admin_shipping_methods_path___icon_____icon_minus_arrow_minus_left__() {
    return button_link_to_Spree_dot_t__back_to_shipping_methods_list___spree_dot_admin_shipping_methods_path___icon_____icon_minus_arrow_minus_left__;
  }
  
  public String getTextOfButton_link_to_Spree_dot_t__back_to_shipping_methods_list___spree_dot_admin_shipping_methods_path___icon_____icon_minus_arrow_minus_left__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_584") && matcher.group(2).equals("button_link_to_Spree_dot_t__back_to_shipping_methods_list___spree_dot_admin_shipping_methods_path___icon_____icon_minus_arrow_minus_left__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_585']")
  private WebElement render__partial_____spree_divide_shared_divide_error_messages____locals_______target_____shipping_method___;
  
  public WebElement getElementOfRender__partial_____spree_divide_shared_divide_error_messages____locals_______target_____shipping_method___() {
    return render__partial_____spree_divide_shared_divide_error_messages____locals_______target_____shipping_method___;
  }
  
  public String getTextOfRender__partial_____spree_divide_shared_divide_error_messages____locals_______target_____shipping_method___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_585") && matcher.group(2).equals("render__partial_____spree_divide_shared_divide_error_messages____locals_______target_____shipping_method___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_588']")
  private WebElement render__partial_____spree_divide_admin_divide_shared_divide_new_resource_links__;
  
  public WebElement getElementOfRender__partial_____spree_divide_admin_divide_shared_divide_new_resource_links__() {
    return render__partial_____spree_divide_admin_divide_shared_divide_new_resource_links__;
  }
  
  public String getTextOfRender__partial_____spree_divide_admin_divide_shared_divide_new_resource_links__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_588") && matcher.group(2).equals("render__partial_____spree_divide_admin_divide_shared_divide_new_resource_links__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_587']")
  private WebElement render__partial_____form____locals_______f____f___;
  
  public WebElement getElementOfRender__partial_____form____locals_______f____f___() {
    return render__partial_____form____locals_______f____f___;
  }
  
  public String getTextOfRender__partial_____form____locals_______f____f___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_587") && matcher.group(2).equals("render__partial_____form____locals_______f____f___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_586']")
  private WebElement form_for___admin___shipping_method__do__f__;
  
  public WebElement getElementOfForm_for___admin___shipping_method__do__f__() {
    return form_for___admin___shipping_method__do__f__;
  }
  
  public String getTextOfForm_for___admin___shipping_method__do__f__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_586") && matcher.group(2).equals("form_for___admin___shipping_method__do__f__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
