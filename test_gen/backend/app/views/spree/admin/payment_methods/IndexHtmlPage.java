package test.backend.app.views.spree.admin.payment_methods;

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
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_243']")
  private WebElement button_link_to_Spree_dot_t__new_payment_method___new_object_url___icon_____icon_minus_plus____id_____admin_new_payment_methods_link__;
  
  public WebElement getElementOfButton_link_to_Spree_dot_t__new_payment_method___new_object_url___icon_____icon_minus_plus____id_____admin_new_payment_methods_link__() {
    return button_link_to_Spree_dot_t__new_payment_method___new_object_url___icon_____icon_minus_plus____id_____admin_new_payment_methods_link__;
  }
  
  public String getTextOfButton_link_to_Spree_dot_t__new_payment_method___new_object_url___icon_____icon_minus_plus____id_____admin_new_payment_methods_link__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_243") && matcher.group(2).equals("button_link_to_Spree_dot_t__new_payment_method___new_object_url___icon_____icon_minus_plus____id_____admin_new_payment_methods_link__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_244']")
  private WebElement Spree_dot_t__name__;
  
  public WebElement getElementOfSpree_dot_t__name__() {
    return Spree_dot_t__name__;
  }
  
  public String getTextOfSpree_dot_t__name__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_244") && matcher.group(2).equals("Spree_dot_t__name__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_245']")
  private WebElement Spree_dot_t__provider__;
  
  public WebElement getElementOfSpree_dot_t__provider__() {
    return Spree_dot_t__provider__;
  }
  
  public String getTextOfSpree_dot_t__provider__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_245") && matcher.group(2).equals("Spree_dot_t__provider__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_246']")
  private WebElement Spree_dot_t__environment__;
  
  public WebElement getElementOfSpree_dot_t__environment__() {
    return Spree_dot_t__environment__;
  }
  
  public String getTextOfSpree_dot_t__environment__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_246") && matcher.group(2).equals("Spree_dot_t__environment__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_247']")
  private WebElement Spree_dot_t__display__;
  
  public WebElement getElementOfSpree_dot_t__display__() {
    return Spree_dot_t__display__;
  }
  
  public String getTextOfSpree_dot_t__display__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_247") && matcher.group(2).equals("Spree_dot_t__display__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_248']")
  private WebElement Spree_dot_t__active__;
  
  public WebElement getElementOfSpree_dot_t__active__() {
    return Spree_dot_t__active__;
  }
  
  public String getTextOfSpree_dot_t__active__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_248") && matcher.group(2).equals("Spree_dot_t__active__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_249']")
  private WebElement method_dot_name_;
  
  public WebElement getElementOfMethod_dot_name_() {
    return method_dot_name_;
  }
  
  public String getTextOfMethod_dot_name_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_249") && matcher.group(2).equals("method_dot_name_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_250']")
  private WebElement method_dot_type_;
  
  public WebElement getElementOfMethod_dot_type_() {
    return method_dot_type_;
  }
  
  public String getTextOfMethod_dot_type_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_250") && matcher.group(2).equals("method_dot_type_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_251']")
  private WebElement method_dot_environment_dot_to_s_dot_titleize_;
  
  public WebElement getElementOfMethod_dot_environment_dot_to_s_dot_titleize_() {
    return method_dot_environment_dot_to_s_dot_titleize_;
  }
  
  public String getTextOfMethod_dot_environment_dot_to_s_dot_titleize_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_251") && matcher.group(2).equals("method_dot_environment_dot_to_s_dot_titleize_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_252']")
  private WebElement method_dot_display_on_dot_blank____Spree_dot_t__both____Spree_dot_t_method_dot_display_on__;
  
  public WebElement getElementOfMethod_dot_display_on_dot_blank____Spree_dot_t__both____Spree_dot_t_method_dot_display_on__() {
    return method_dot_display_on_dot_blank____Spree_dot_t__both____Spree_dot_t_method_dot_display_on__;
  }
  
  public String getTextOfMethod_dot_display_on_dot_blank____Spree_dot_t__both____Spree_dot_t_method_dot_display_on__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_252") && matcher.group(2).equals("method_dot_display_on_dot_blank____Spree_dot_t__both____Spree_dot_t_method_dot_display_on__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_253']")
  private WebElement method_dot_active___Spree_dot_t__say_yes____Spree_dot_t__say_no__;
  
  public WebElement getElementOfMethod_dot_active___Spree_dot_t__say_yes____Spree_dot_t__say_no__() {
    return method_dot_active___Spree_dot_t__say_yes____Spree_dot_t__say_no__;
  }
  
  public String getTextOfMethod_dot_active___Spree_dot_t__say_yes____Spree_dot_t__say_no__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_253") && matcher.group(2).equals("method_dot_active___Spree_dot_t__say_yes____Spree_dot_t__say_no__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_254']")
  private WebElement link_to_delete_method___no_text____true__;
  
  public WebElement getElementOfLink_to_delete_method___no_text____true__() {
    return link_to_delete_method___no_text____true__;
  }
  
  public String getTextOfLink_to_delete_method___no_text____true__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_254") && matcher.group(2).equals("link_to_delete_method___no_text____true__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_254']")
  private WebElement link_to_edit_method___no_text____true_;
  
  public WebElement getElementOfLink_to_edit_method___no_text____true_() {
    return link_to_edit_method___no_text____true_;
  }
  
  public String getTextOfLink_to_edit_method___no_text____true_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_254") && matcher.group(2).equals("link_to_edit_method___no_text____true_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='<%= spree_dom_id method %>']")
  private WebElement cycle__odd____even__;
  
  public WebElement getElementOfCycle__odd____even__() {
    return cycle__odd____even__;
  }
  
  public String getAttributeOfClassOnCycle__odd____even__() {
    return cycle__odd____even__.getAttribute("class");
  }
  
  public String getTextOfCycle__odd____even__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("<%= spree_dom_id method %>") && matcher.group(2).equals("cycle__odd____even__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='<%= spree_dom_id method %>']")
  private WebElement spree_dom_id_method_;
  
  public WebElement getElementOfSpree_dom_id_method_() {
    return spree_dom_id_method_;
  }
  
  public String getAttributeOfIdOnSpree_dom_id_method_() {
    return spree_dom_id_method_.getAttribute("id");
  }
  
  public String getTextOfSpree_dom_id_method_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("<%= spree_dom_id method %>") && matcher.group(2).equals("spree_dom_id_method_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_255']")
  private WebElement link_to_Spree_dot_t__add_one___spree_dot_new_admin_payment_method_path_;
  
  public WebElement getElementOfLink_to_Spree_dot_t__add_one___spree_dot_new_admin_payment_method_path_() {
    return link_to_Spree_dot_t__add_one___spree_dot_new_admin_payment_method_path_;
  }
  
  public String getTextOfLink_to_Spree_dot_t__add_one___spree_dot_new_admin_payment_method_path_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_255") && matcher.group(2).equals("link_to_Spree_dot_t__add_one___spree_dot_new_admin_payment_method_path_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_255']")
  private WebElement Spree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_payment_method____;
  
  public WebElement getElementOfSpree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_payment_method____() {
    return Spree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_payment_method____;
  }
  
  public String getTextOfSpree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_payment_method____() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_255") && matcher.group(2).equals("Spree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_payment_method____")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
