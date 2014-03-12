package test.backend.app.views.spree.admin.orders.customer_details;

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
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_194']")
  private WebElement button_link_to_Spree_dot_t__back_to_orders_list___admin_orders_path___icon_____icon_minus_arrow_minus_left__;
  
  public WebElement getElementOfButton_link_to_Spree_dot_t__back_to_orders_list___admin_orders_path___icon_____icon_minus_arrow_minus_left__() {
    return button_link_to_Spree_dot_t__back_to_orders_list___admin_orders_path___icon_____icon_minus_arrow_minus_left__;
  }
  
  public String getTextOfButton_link_to_Spree_dot_t__back_to_orders_list___admin_orders_path___icon_____icon_minus_arrow_minus_left__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_194") && matcher.group(2).equals("button_link_to_Spree_dot_t__back_to_orders_list___admin_orders_path___icon_____icon_minus_arrow_minus_left__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_196']")
  private WebElement Spree_dot_t__customer_search__;
  
  public WebElement getElementOfSpree_dot_t__customer_search__() {
    return Spree_dot_t__customer_search__;
  }
  
  public String getTextOfSpree_dot_t__customer_search__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_196") && matcher.group(2).equals("Spree_dot_t__customer_search__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_195']")
  private WebElement render__partial_____spree_divide_admin_divide_orders_divide_customer_details_divide_autocomplete____formats_____js_;
  
  public WebElement getElementOfRender__partial_____spree_divide_admin_divide_orders_divide_customer_details_divide_autocomplete____formats_____js_() {
    return render__partial_____spree_divide_admin_divide_orders_divide_customer_details_divide_autocomplete____formats_____js_;
  }
  
  public String getTextOfRender__partial_____spree_divide_admin_divide_orders_divide_customer_details_divide_autocomplete____formats_____js_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_195") && matcher.group(2).equals("render__partial_____spree_divide_admin_divide_orders_divide_customer_details_divide_autocomplete____formats_____js_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_195']")
  private WebElement hidden_field_tag__customer_search___nil___class_____fullwidth_title__;
  
  public WebElement getElementOfHidden_field_tag__customer_search___nil___class_____fullwidth_title__() {
    return hidden_field_tag__customer_search___nil___class_____fullwidth_title__;
  }
  
  public String getTextOfHidden_field_tag__customer_search___nil___class_____fullwidth_title__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_195") && matcher.group(2).equals("hidden_field_tag__customer_search___nil___class_____fullwidth_title__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
