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

public class FormHtmlPage extends AbstractPage {
  public FormHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_181']")
  private WebElement Spree_dot_t__account__;
  
  public WebElement getElementOfSpree_dot_t__account__() {
    return Spree_dot_t__account__;
  }
  
  public String getTextOfSpree_dot_t__account__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_181") && matcher.group(2).equals("Spree_dot_t__account__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_182']")
  private WebElement f_dot_email_field__email___class_____fullwidth__;
  
  public WebElement getElementOfF_dot_email_field__email___class_____fullwidth__() {
    return f_dot_email_field__email___class_____fullwidth__;
  }
  
  public String getTextOfF_dot_email_field__email___class_____fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_182") && matcher.group(2).equals("f_dot_email_field__email___class_____fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_182']")
  private WebElement f_dot_label__email__Spree_dot_t__email__;
  
  public WebElement getElementOfF_dot_label__email__Spree_dot_t__email__() {
    return f_dot_label__email__Spree_dot_t__email__;
  }
  
  public String getTextOfF_dot_label__email__Spree_dot_t__email__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_182") && matcher.group(2).equals("f_dot_label__email__Spree_dot_t__email__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_185']")
  private WebElement _order_dot_user_dot_nil____Spree_dot_t__say_yes____Spree_dot_t__say_no__;
  
  public WebElement getElementOf_order_dot_user_dot_nil____Spree_dot_t__say_yes____Spree_dot_t__say_no__() {
    return _order_dot_user_dot_nil____Spree_dot_t__say_yes____Spree_dot_t__say_no__;
  }
  
  public String getTextOf_order_dot_user_dot_nil____Spree_dot_t__say_yes____Spree_dot_t__say_no__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_185") && matcher.group(2).equals("_order_dot_user_dot_nil____Spree_dot_t__say_yes____Spree_dot_t__say_no__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_186']")
  private WebElement label_tag__guest_checkout_true__Spree_dot_t__say_yes__;
  
  public WebElement getElementOfLabel_tag__guest_checkout_true__Spree_dot_t__say_yes__() {
    return label_tag__guest_checkout_true__Spree_dot_t__say_yes__;
  }
  
  public String getTextOfLabel_tag__guest_checkout_true__Spree_dot_t__say_yes__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_186") && matcher.group(2).equals("label_tag__guest_checkout_true__Spree_dot_t__say_yes__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_186']")
  private WebElement radio_button_tag__guest_checkout__true__guest_;
  
  public WebElement getElementOfRadio_button_tag__guest_checkout__true__guest_() {
    return radio_button_tag__guest_checkout__true__guest_;
  }
  
  public String getTextOfRadio_button_tag__guest_checkout__true__guest_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_186") && matcher.group(2).equals("radio_button_tag__guest_checkout__true__guest_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_187']")
  private WebElement radio_button_tag__guest_checkout__false___guest___disabled_____order_dot_cart__;
  
  public WebElement getElementOfRadio_button_tag__guest_checkout__false___guest___disabled_____order_dot_cart__() {
    return radio_button_tag__guest_checkout__false___guest___disabled_____order_dot_cart__;
  }
  
  public String getTextOfRadio_button_tag__guest_checkout__false___guest___disabled_____order_dot_cart__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_187") && matcher.group(2).equals("radio_button_tag__guest_checkout__false___guest___disabled_____order_dot_cart__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_187']")
  private WebElement label_tag__guest_checkout_false__Spree_dot_t__say_no__;
  
  public WebElement getElementOfLabel_tag__guest_checkout_false__Spree_dot_t__say_no__() {
    return label_tag__guest_checkout_false__Spree_dot_t__say_no__;
  }
  
  public String getTextOfLabel_tag__guest_checkout_false__Spree_dot_t__say_no__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_187") && matcher.group(2).equals("label_tag__guest_checkout_false__Spree_dot_t__say_no__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_184']")
  private WebElement hidden_field_tag__user_id___order_dot_user_id_;
  
  public WebElement getElementOfHidden_field_tag__user_id___order_dot_user_id_() {
    return hidden_field_tag__user_id___order_dot_user_id_;
  }
  
  public String getTextOfHidden_field_tag__user_id___order_dot_user_id_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_184") && matcher.group(2).equals("hidden_field_tag__user_id___order_dot_user_id_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_183']")
  private WebElement label_tag_nil__Spree_dot_t__guest_checkout__;
  
  public WebElement getElementOfLabel_tag_nil__Spree_dot_t__guest_checkout__() {
    return label_tag_nil__Spree_dot_t__guest_checkout__;
  }
  
  public String getTextOfLabel_tag_nil__Spree_dot_t__guest_checkout__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_183") && matcher.group(2).equals("label_tag_nil__Spree_dot_t__guest_checkout__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_189']")
  private WebElement Spree_dot_t__billing_address__;
  
  public WebElement getElementOfSpree_dot_t__billing_address__() {
    return Spree_dot_t__billing_address__;
  }
  
  public String getTextOfSpree_dot_t__billing_address__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_189") && matcher.group(2).equals("Spree_dot_t__billing_address__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_188']")
  private WebElement render__partial_____spree_divide_admin_divide_shared_divide_address_form____locals_______f____ba_form___type_____billing____;
  
  public WebElement getElementOfRender__partial_____spree_divide_admin_divide_shared_divide_address_form____locals_______f____ba_form___type_____billing____() {
    return render__partial_____spree_divide_admin_divide_shared_divide_address_form____locals_______f____ba_form___type_____billing____;
  }
  
  public String getTextOfRender__partial_____spree_divide_admin_divide_shared_divide_address_form____locals_______f____ba_form___type_____billing____() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_188") && matcher.group(2).equals("render__partial_____spree_divide_admin_divide_shared_divide_address_form____locals_______f____ba_form___type_____billing____")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_188']")
  private WebElement f_dot_fields_for__bill_address_do__ba_form__;
  
  public WebElement getElementOfF_dot_fields_for__bill_address_do__ba_form__() {
    return f_dot_fields_for__bill_address_do__ba_form__;
  }
  
  public String getTextOfF_dot_fields_for__bill_address_do__ba_form__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_188") && matcher.group(2).equals("f_dot_fields_for__bill_address_do__ba_form__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_191']")
  private WebElement Spree_dot_t__shipping_address__;
  
  public WebElement getElementOfSpree_dot_t__shipping_address__() {
    return Spree_dot_t__shipping_address__;
  }
  
  public String getTextOfSpree_dot_t__shipping_address__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_191") && matcher.group(2).equals("Spree_dot_t__shipping_address__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_192']")
  private WebElement label_tag__order_use_billing____Spree_dot_t__use_billing_address__;
  
  public WebElement getElementOfLabel_tag__order_use_billing____Spree_dot_t__use_billing_address__() {
    return label_tag__order_use_billing____Spree_dot_t__use_billing_address__;
  }
  
  public String getTextOfLabel_tag__order_use_billing____Spree_dot_t__use_billing_address__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_192") && matcher.group(2).equals("label_tag__order_use_billing____Spree_dot_t__use_billing_address__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_192']")
  private WebElement check_box_tag__order_use_billing_____1_______order_dot_bill_address_dot_empty______order_dot_ship_address_dot_empty_______order_dot_bill_address_dot_same_as___order_dot_ship_address___;
  
  public WebElement getElementOfCheck_box_tag__order_use_billing_____1_______order_dot_bill_address_dot_empty______order_dot_ship_address_dot_empty_______order_dot_bill_address_dot_same_as___order_dot_ship_address___() {
    return check_box_tag__order_use_billing_____1_______order_dot_bill_address_dot_empty______order_dot_ship_address_dot_empty_______order_dot_bill_address_dot_same_as___order_dot_ship_address___;
  }
  
  public String getTextOfCheck_box_tag__order_use_billing_____1_______order_dot_bill_address_dot_empty______order_dot_ship_address_dot_empty_______order_dot_bill_address_dot_same_as___order_dot_ship_address___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_192") && matcher.group(2).equals("check_box_tag__order_use_billing_____1_______order_dot_bill_address_dot_empty______order_dot_ship_address_dot_empty_______order_dot_bill_address_dot_same_as___order_dot_ship_address___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_190']")
  private WebElement f_dot_fields_for__ship_address_do__sa_form__;
  
  public WebElement getElementOfF_dot_fields_for__ship_address_do__sa_form__() {
    return f_dot_fields_for__ship_address_do__sa_form__;
  }
  
  public String getTextOfF_dot_fields_for__ship_address_do__sa_form__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_190") && matcher.group(2).equals("f_dot_fields_for__ship_address_do__sa_form__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_190']")
  private WebElement render__partial_____spree_divide_admin_divide_shared_divide_address_form____locals_______f____sa_form___type_____shipping____;
  
  public WebElement getElementOfRender__partial_____spree_divide_admin_divide_shared_divide_address_form____locals_______f____sa_form___type_____shipping____() {
    return render__partial_____spree_divide_admin_divide_shared_divide_address_form____locals_______f____sa_form___type_____shipping____;
  }
  
  public String getTextOfRender__partial_____spree_divide_admin_divide_shared_divide_address_form____locals_______f____sa_form___type_____shipping____() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_190") && matcher.group(2).equals("render__partial_____spree_divide_admin_divide_shared_divide_address_form____locals_______f____sa_form___type_____shipping____")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_193']")
  private WebElement button_Spree_dot_t__actions_dot_update_____icon_minus_refresh__;
  
  public WebElement getElementOfButton_Spree_dot_t__actions_dot_update_____icon_minus_refresh__() {
    return button_Spree_dot_t__actions_dot_update_____icon_minus_refresh__;
  }
  
  public String getTextOfButton_Spree_dot_t__actions_dot_update_____icon_minus_refresh__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_193") && matcher.group(2).equals("button_Spree_dot_t__actions_dot_update_____icon_minus_refresh__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_180']")
  private WebElement javascript_include_tag__spree_divide_backend_divide_address_states_dot_js__;
  
  public WebElement getElementOfJavascript_include_tag__spree_divide_backend_divide_address_states_dot_js__() {
    return javascript_include_tag__spree_divide_backend_divide_address_states_dot_js__;
  }
  
  public String getTextOfJavascript_include_tag__spree_divide_backend_divide_address_states_dot_js__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_180") && matcher.group(2).equals("javascript_include_tag__spree_divide_backend_divide_address_states_dot_js__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
