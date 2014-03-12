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

public class ShipmentHtmlPage extends AbstractPage {
  public ShipmentHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_158']")
  private WebElement shipment_dot_number_;
  
  public WebElement getElementOfShipment_dot_number_() {
    return shipment_dot_number_;
  }
  
  public String getTextOfShipment_dot_number_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_158") && matcher.group(2).equals("shipment_dot_number_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_159']")
  private WebElement Spree_dot_t__shipment_states_dot___shipment_dot_state____;
  
  public WebElement getElementOfSpree_dot_t__shipment_states_dot___shipment_dot_state____() {
    return Spree_dot_t__shipment_states_dot___shipment_dot_state____;
  }
  
  public String getTextOfSpree_dot_t__shipment_states_dot___shipment_dot_state____() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_159") && matcher.group(2).equals("Spree_dot_t__shipment_states_dot___shipment_dot_state____")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_160']")
  private WebElement shipment_dot_stock_location_dot_name_;
  
  public WebElement getElementOfShipment_dot_stock_location_dot_name_() {
    return shipment_dot_stock_location_dot_name_;
  }
  
  public String getTextOfShipment_dot_stock_location_dot_name_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_160") && matcher.group(2).equals("shipment_dot_stock_location_dot_name_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_157']")
  private WebElement link_to_Spree_dot_t__ship_________class_____ship_button_icon_minus_arrow_minus_right____data______shipment_minus_number_____shipment_dot_number__;
  
  public WebElement getElementOfLink_to_Spree_dot_t__ship_________class_____ship_button_icon_minus_arrow_minus_right____data______shipment_minus_number_____shipment_dot_number__() {
    return link_to_Spree_dot_t__ship_________class_____ship_button_icon_minus_arrow_minus_right____data______shipment_minus_number_____shipment_dot_number__;
  }
  
  public String getTextOfLink_to_Spree_dot_t__ship_________class_____ship_button_icon_minus_arrow_minus_right____data______shipment_minus_number_____shipment_dot_number__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_157") && matcher.group(2).equals("link_to_Spree_dot_t__ship_________class_____ship_button_icon_minus_arrow_minus_right____data______shipment_minus_number_____shipment_dot_number__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_157']")
  private WebElement Spree_dot_t__package_from__;
  
  public WebElement getElementOfSpree_dot_t__package_from__() {
    return Spree_dot_t__package_from__;
  }
  
  public String getTextOfSpree_dot_t__package_from__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_157") && matcher.group(2).equals("Spree_dot_t__package_from__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_161']")
  private WebElement Spree_dot_t__item_description__;
  
  public WebElement getElementOfSpree_dot_t__item_description__() {
    return Spree_dot_t__item_description__;
  }
  
  public String getTextOfSpree_dot_t__item_description__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_161") && matcher.group(2).equals("Spree_dot_t__item_description__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_162']")
  private WebElement Spree_dot_t__price__;
  
  public WebElement getElementOfSpree_dot_t__price__() {
    return Spree_dot_t__price__;
  }
  
  public String getTextOfSpree_dot_t__price__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_162") && matcher.group(2).equals("Spree_dot_t__price__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_163']")
  private WebElement Spree_dot_t__quantity__;
  
  public WebElement getElementOfSpree_dot_t__quantity__() {
    return Spree_dot_t__quantity__;
  }
  
  public String getTextOfSpree_dot_t__quantity__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_163") && matcher.group(2).equals("Spree_dot_t__quantity__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_164']")
  private WebElement Spree_dot_t__total__;
  
  public WebElement getElementOfSpree_dot_t__total__() {
    return Spree_dot_t__total__;
  }
  
  public String getTextOfSpree_dot_t__total__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_164") && matcher.group(2).equals("Spree_dot_t__total__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_166']")
  private WebElement label_tag__selected_shipping_rate_id___Spree_dot_t__shipping_method__;
  
  public WebElement getElementOfLabel_tag__selected_shipping_rate_id___Spree_dot_t__shipping_method__() {
    return label_tag__selected_shipping_rate_id___Spree_dot_t__shipping_method__;
  }
  
  public String getTextOfLabel_tag__selected_shipping_rate_id___Spree_dot_t__shipping_method__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_166") && matcher.group(2).equals("label_tag__selected_shipping_rate_id___Spree_dot_t__shipping_method__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_167']")
  private WebElement shipment_dot_shipping_method_dot_name_;
  
  public WebElement getElementOfShipment_dot_shipping_method_dot_name_() {
    return shipment_dot_shipping_method_dot_name_;
  }
  
  public String getTextOfShipment_dot_shipping_method_dot_name_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_167") && matcher.group(2).equals("shipment_dot_shipping_method_dot_name_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_168']")
  private WebElement shipment_dot_display_cost_;
  
  public WebElement getElementOfShipment_dot_display_cost_() {
    return shipment_dot_display_cost_;
  }
  
  public String getTextOfShipment_dot_display_cost_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_168") && matcher.group(2).equals("shipment_dot_display_cost_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_169']")
  private WebElement Spree_dot_t__no_shipping_method_selected__;
  
  public WebElement getElementOfSpree_dot_t__no_shipping_method_selected__() {
    return Spree_dot_t__no_shipping_method_selected__;
  }
  
  public String getTextOfSpree_dot_t__no_shipping_method_selected__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_169") && matcher.group(2).equals("Spree_dot_t__no_shipping_method_selected__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_170']")
  private WebElement link_to___________class_____edit_minus_method_icon_link_icon_minus_edit_no_minus_text_with_minus_tip____data______action_____edit_____title____Spree_dot_t__edit___;
  
  public WebElement getElementOfLink_to___________class_____edit_minus_method_icon_link_icon_minus_edit_no_minus_text_with_minus_tip____data______action_____edit_____title____Spree_dot_t__edit___() {
    return link_to___________class_____edit_minus_method_icon_link_icon_minus_edit_no_minus_text_with_minus_tip____data______action_____edit_____title____Spree_dot_t__edit___;
  }
  
  public String getTextOfLink_to___________class_____edit_minus_method_icon_link_icon_minus_edit_no_minus_text_with_minus_tip____data______action_____edit_____title____Spree_dot_t__edit___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_170") && matcher.group(2).equals("link_to___________class_____edit_minus_method_icon_link_icon_minus_edit_no_minus_text_with_minus_tip____data______action_____edit_____title____Spree_dot_t__edit___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_172']")
  private WebElement Spree_dot_t__tracking_number__;
  
  public WebElement getElementOfSpree_dot_t__tracking_number__() {
    return Spree_dot_t__tracking_number__;
  }
  
  public String getTextOfSpree_dot_t__tracking_number__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_172") && matcher.group(2).equals("Spree_dot_t__tracking_number__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_171']")
  private WebElement text_field_tag__tracking__shipment_dot_tracking_;
  
  public WebElement getElementOfText_field_tag__tracking__shipment_dot_tracking_() {
    return text_field_tag__tracking__shipment_dot_tracking_;
  }
  
  public String getTextOfText_field_tag__tracking__shipment_dot_tracking_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_171") && matcher.group(2).equals("text_field_tag__tracking__shipment_dot_tracking_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_173']")
  private WebElement link_to___________class_____cancel_minus_tracking_icon_link_icon_minus_cancel_no_minus_text_with_minus_tip____data______action_____cancel_____title____Spree_dot_t__actions_dot_cancel___;
  
  public WebElement getElementOfLink_to___________class_____cancel_minus_tracking_icon_link_icon_minus_cancel_no_minus_text_with_minus_tip____data______action_____cancel_____title____Spree_dot_t__actions_dot_cancel___() {
    return link_to___________class_____cancel_minus_tracking_icon_link_icon_minus_cancel_no_minus_text_with_minus_tip____data______action_____cancel_____title____Spree_dot_t__actions_dot_cancel___;
  }
  
  public String getTextOfLink_to___________class_____cancel_minus_tracking_icon_link_icon_minus_cancel_no_minus_text_with_minus_tip____data______action_____cancel_____title____Spree_dot_t__actions_dot_cancel___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_173") && matcher.group(2).equals("link_to___________class_____cancel_minus_tracking_icon_link_icon_minus_cancel_no_minus_text_with_minus_tip____data______action_____cancel_____title____Spree_dot_t__actions_dot_cancel___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_173']")
  private WebElement link_to___________class_____save_minus_tracking_icon_link_icon_minus_ok_no_minus_text_with_minus_tip____data______shipment_minus_number_____shipment_dot_number___action_____save_____title____Spree_dot_t__actions_dot_save___;
  
  public WebElement getElementOfLink_to___________class_____save_minus_tracking_icon_link_icon_minus_ok_no_minus_text_with_minus_tip____data______shipment_minus_number_____shipment_dot_number___action_____save_____title____Spree_dot_t__actions_dot_save___() {
    return link_to___________class_____save_minus_tracking_icon_link_icon_minus_ok_no_minus_text_with_minus_tip____data______shipment_minus_number_____shipment_dot_number___action_____save_____title____Spree_dot_t__actions_dot_save___;
  }
  
  public String getTextOfLink_to___________class_____save_minus_tracking_icon_link_icon_minus_ok_no_minus_text_with_minus_tip____data______shipment_minus_number_____shipment_dot_number___action_____save_____title____Spree_dot_t__actions_dot_save___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_173") && matcher.group(2).equals("link_to___________class_____save_minus_tracking_icon_link_icon_minus_ok_no_minus_text_with_minus_tip____data______shipment_minus_number_____shipment_dot_number___action_____save_____title____Spree_dot_t__actions_dot_save___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_175']")
  private WebElement Spree_dot_t__special_instructions__;
  
  public WebElement getElementOfSpree_dot_t__special_instructions__() {
    return Spree_dot_t__special_instructions__;
  }
  
  public String getTextOfSpree_dot_t__special_instructions__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_175") && matcher.group(2).equals("Spree_dot_t__special_instructions__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_174']")
  private WebElement _order_dot_special_instructions_;
  
  public WebElement getElementOf_order_dot_special_instructions_() {
    return _order_dot_special_instructions_;
  }
  
  public String getTextOf_order_dot_special_instructions_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_174") && matcher.group(2).equals("_order_dot_special_instructions_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_177']")
  private WebElement Spree_dot_t__tracking__;
  
  public WebElement getElementOfSpree_dot_t__tracking__() {
    return Spree_dot_t__tracking__;
  }
  
  public String getTextOfSpree_dot_t__tracking__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_177") && matcher.group(2).equals("Spree_dot_t__tracking__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_176']")
  private WebElement shipment_dot_tracking_;
  
  public WebElement getElementOfShipment_dot_tracking_() {
    return shipment_dot_tracking_;
  }
  
  public String getTextOfShipment_dot_tracking_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_176") && matcher.group(2).equals("shipment_dot_tracking_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_176']")
  private WebElement Spree_dot_t__no_tracking_present__;
  
  public WebElement getElementOfSpree_dot_t__no_tracking_present__() {
    return Spree_dot_t__no_tracking_present__;
  }
  
  public String getTextOfSpree_dot_t__no_tracking_present__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_176") && matcher.group(2).equals("Spree_dot_t__no_tracking_present__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_178']")
  private WebElement link_to___________class_____edit_minus_tracking_icon_link_icon_minus_edit_no_minus_text_with_minus_tip____data______action_____edit_____title____Spree_dot_t__edit___;
  
  public WebElement getElementOfLink_to___________class_____edit_minus_tracking_icon_link_icon_minus_edit_no_minus_text_with_minus_tip____data______action_____edit_____title____Spree_dot_t__edit___() {
    return link_to___________class_____edit_minus_tracking_icon_link_icon_minus_edit_no_minus_text_with_minus_tip____data______action_____edit_____title____Spree_dot_t__edit___;
  }
  
  public String getTextOfLink_to___________class_____edit_minus_tracking_icon_link_icon_minus_edit_no_minus_text_with_minus_tip____data______action_____edit_____title____Spree_dot_t__edit___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_178") && matcher.group(2).equals("link_to___________class_____edit_minus_tracking_icon_link_icon_minus_edit_no_minus_text_with_minus_tip____data______action_____edit_____title____Spree_dot_t__edit___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_165']")
  private WebElement order_dot_number_;
  
  public WebElement getElementOfOrder_dot_number_() {
    return order_dot_number_;
  }
  
  public String getAttributeOfData-order-numberOnOrder_dot_number_() {
    return order_dot_number_.getAttribute("data-order-number");
  }
  
  public String getTextOfOrder_dot_number_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_165") && matcher.group(2).equals("order_dot_number_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_165']")
  private WebElement shipment_dot_number__PO2;
  
  public WebElement getElementOfShipment_dot_number__PO2() {
    return shipment_dot_number__PO2;
  }
  
  public String getAttributeOfData-shipment-numberOnShipment_dot_number__PO2() {
    return shipment_dot_number__PO2.getAttribute("data-shipment-number");
  }
  
  public String getTextOfShipment_dot_number__PO2() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_165") && matcher.group(2).equals("shipment_dot_number_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_165']")
  private WebElement render__spree_divide_admin_divide_orders_divide_shipment_manifest___order__order__shipment__shipment_;
  
  public WebElement getElementOfRender__spree_divide_admin_divide_orders_divide_shipment_manifest___order__order__shipment__shipment_() {
    return render__spree_divide_admin_divide_orders_divide_shipment_manifest___order__order__shipment__shipment_;
  }
  
  public String getTextOfRender__spree_divide_admin_divide_orders_divide_shipment_manifest___order__order__shipment__shipment_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_165") && matcher.group(2).equals("render__spree_divide_admin_divide_orders_divide_shipment_manifest___order__order__shipment__shipment_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='<%= ']")
  private WebElement render__partial_____spree_divide_admin_divide_variants_divide_split____formats_____js_;
  
  public WebElement getElementOfRender__partial_____spree_divide_admin_divide_variants_divide_split____formats_____js_() {
    return render__partial_____spree_divide_admin_divide_variants_divide_split____formats_____js_;
  }
  
  public String getTextOfRender__partial_____spree_divide_admin_divide_variants_divide_split____formats_____js_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("<%= ") && matcher.group(2).equals("render__partial_____spree_divide_admin_divide_variants_divide_split____formats_____js_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
