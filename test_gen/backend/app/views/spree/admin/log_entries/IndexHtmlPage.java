package test.backend.app.views.spree.admin.log_entries;

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
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_86']")
  private WebElement button_link_to_Spree_dot_t__logs___spree_dot_admin_order_payment_log_entries_url__order___payment____icon_____icon_minus_archive__;
  
  public WebElement getElementOfButton_link_to_Spree_dot_t__logs___spree_dot_admin_order_payment_log_entries_url__order___payment____icon_____icon_minus_archive__() {
    return button_link_to_Spree_dot_t__logs___spree_dot_admin_order_payment_log_entries_url__order___payment____icon_____icon_minus_archive__;
  }
  
  public String getTextOfButton_link_to_Spree_dot_t__logs___spree_dot_admin_order_payment_log_entries_url__order___payment____icon_____icon_minus_archive__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_86") && matcher.group(2).equals("button_link_to_Spree_dot_t__logs___spree_dot_admin_order_payment_log_entries_url__order___payment____icon_____icon_minus_archive__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_87']")
  private WebElement button_link_to_Spree_dot_t__back_to_payment___spree_dot_admin_order_payment_url__order___payment____icon_____icon_minus_arrow_minus_left__;
  
  public WebElement getElementOfButton_link_to_Spree_dot_t__back_to_payment___spree_dot_admin_order_payment_url__order___payment____icon_____icon_minus_arrow_minus_left__() {
    return button_link_to_Spree_dot_t__back_to_payment___spree_dot_admin_order_payment_url__order___payment____icon_____icon_minus_arrow_minus_left__;
  }
  
  public String getTextOfButton_link_to_Spree_dot_t__back_to_payment___spree_dot_admin_order_payment_url__order___payment____icon_____icon_minus_arrow_minus_left__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_87") && matcher.group(2).equals("button_link_to_Spree_dot_t__back_to_payment___spree_dot_admin_order_payment_url__order___payment____icon_____icon_minus_arrow_minus_left__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_89']")
  private WebElement pretty_time_entry_dot_created_at__;
  
  public WebElement getElementOfPretty_time_entry_dot_created_at__() {
    return pretty_time_entry_dot_created_at__;
  }
  
  public String getTextOfPretty_time_entry_dot_created_at__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_89") && matcher.group(2).equals("pretty_time_entry_dot_created_at__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_88']")
  private WebElement entry_dot_parsed_details_dot_success_____success_____fail__;
  
  public WebElement getElementOfEntry_dot_parsed_details_dot_success_____success_____fail__() {
    return entry_dot_parsed_details_dot_success_____success_____fail__;
  }
  
  public String getAttributeOfClassOnEntry_dot_parsed_details_dot_success_____success_____fail__() {
    return entry_dot_parsed_details_dot_success_____success_____fail__.getAttribute("class");
  }
  
  public String getTextOfEntry_dot_parsed_details_dot_success_____success_____fail__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_88") && matcher.group(2).equals("entry_dot_parsed_details_dot_success_____success_____fail__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_90']")
  private WebElement render__spree_divide_admin_divide_log_entries_divide____payment_dot_payment_method_dot_name_dot_gsub__________dot_underscore____entry__entry_;
  
  public WebElement getElementOfRender__spree_divide_admin_divide_log_entries_divide____payment_dot_payment_method_dot_name_dot_gsub__________dot_underscore____entry__entry_() {
    return render__spree_divide_admin_divide_log_entries_divide____payment_dot_payment_method_dot_name_dot_gsub__________dot_underscore____entry__entry_;
  }
  
  public String getTextOfRender__spree_divide_admin_divide_log_entries_divide____payment_dot_payment_method_dot_name_dot_gsub__________dot_underscore____entry__entry_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_90") && matcher.group(2).equals("render__spree_divide_admin_divide_log_entries_divide____payment_dot_payment_method_dot_name_dot_gsub__________dot_underscore____entry__entry_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
