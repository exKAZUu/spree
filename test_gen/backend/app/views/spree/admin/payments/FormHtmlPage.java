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

public class FormHtmlPage extends AbstractPage {
  public FormHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_264']")
  private WebElement f_dot_text_field__amount___value_____order_dot_outstanding_balance___class_____fullwidth__;
  
  public WebElement getElementOfF_dot_text_field__amount___value_____order_dot_outstanding_balance___class_____fullwidth__() {
    return f_dot_text_field__amount___value_____order_dot_outstanding_balance___class_____fullwidth__;
  }
  
  public String getTextOfF_dot_text_field__amount___value_____order_dot_outstanding_balance___class_____fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_264") && matcher.group(2).equals("f_dot_text_field__amount___value_____order_dot_outstanding_balance___class_____fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_264']")
  private WebElement f_dot_label__amount__Spree_dot_t__amount__;
  
  public WebElement getElementOfF_dot_label__amount__Spree_dot_t__amount__() {
    return f_dot_label__amount__Spree_dot_t__amount__;
  }
  
  public String getTextOfF_dot_label__amount__Spree_dot_t__amount__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_264") && matcher.group(2).equals("f_dot_label__amount__Spree_dot_t__amount__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_265']")
  private WebElement Spree_dot_t__payment_method__;
  
  public WebElement getElementOfSpree_dot_t__payment_method__() {
    return Spree_dot_t__payment_method__;
  }
  
  public String getTextOfSpree_dot_t__payment_method__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_265") && matcher.group(2).equals("Spree_dot_t__payment_method__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_266']")
  private WebElement Spree_dot_t_method_dot_name___scope_____payment_methods___default____method_dot_name__;
  
  public WebElement getElementOfSpree_dot_t_method_dot_name___scope_____payment_methods___default____method_dot_name__() {
    return Spree_dot_t_method_dot_name___scope_____payment_methods___default____method_dot_name__;
  }
  
  public String getTextOfSpree_dot_t_method_dot_name___scope_____payment_methods___default____method_dot_name__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_266") && matcher.group(2).equals("Spree_dot_t_method_dot_name___scope_____payment_methods___default____method_dot_name__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_266']")
  private WebElement radio_button_tag__payment_payment_method_id____method_dot_id__method_____payment_method_;
  
  public WebElement getElementOfRadio_button_tag__payment_payment_method_id____method_dot_id__method_____payment_method_() {
    return radio_button_tag__payment_payment_method_id____method_dot_id__method_____payment_method_;
  }
  
  public String getTextOfRadio_button_tag__payment_payment_method_id____method_dot_id__method_____payment_method_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_266") && matcher.group(2).equals("radio_button_tag__payment_payment_method_id____method_dot_id__method_____payment_method_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_267']")
  private WebElement render__partial_____spree_divide_admin_divide_payments_divide_source_forms_divide___method_dot_method_type_____locals_______payment_method____method___;
  
  public WebElement getElementOfRender__partial_____spree_divide_admin_divide_payments_divide_source_forms_divide___method_dot_method_type_____locals_______payment_method____method___() {
    return render__partial_____spree_divide_admin_divide_payments_divide_source_forms_divide___method_dot_method_type_____locals_______payment_method____method___;
  }
  
  public String getTextOfRender__partial_____spree_divide_admin_divide_payments_divide_source_forms_divide___method_dot_method_type_____locals_______payment_method____method___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_267") && matcher.group(2).equals("render__partial_____spree_divide_admin_divide_payments_divide_source_forms_divide___method_dot_method_type_____locals_______payment_method____method___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
