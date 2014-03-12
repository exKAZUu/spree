package test.backend.app.views.spree.admin.return_authorizations;

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
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_457']")
  private WebElement Spree_dot_t__product__;
  
  public WebElement getElementOfSpree_dot_t__product__() {
    return Spree_dot_t__product__;
  }
  
  public String getTextOfSpree_dot_t__product__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_457") && matcher.group(2).equals("Spree_dot_t__product__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_458']")
  private WebElement Spree_dot_t__quantity_shipped__;
  
  public WebElement getElementOfSpree_dot_t__quantity_shipped__() {
    return Spree_dot_t__quantity_shipped__;
  }
  
  public String getTextOfSpree_dot_t__quantity_shipped__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_458") && matcher.group(2).equals("Spree_dot_t__quantity_shipped__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_459']")
  private WebElement Spree_dot_t__quantity_returned__;
  
  public WebElement getElementOfSpree_dot_t__quantity_returned__() {
    return Spree_dot_t__quantity_returned__;
  }
  
  public String getTextOfSpree_dot_t__quantity_returned__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_459") && matcher.group(2).equals("Spree_dot_t__quantity_returned__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_460']")
  private WebElement Spree_dot_t__return_quantity__;
  
  public WebElement getElementOfSpree_dot_t__return_quantity__() {
    return Spree_dot_t__return_quantity__;
  }
  
  public String getTextOfSpree_dot_t__return_quantity__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_460") && matcher.group(2).equals("Spree_dot_t__return_quantity__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_461']")
  private WebElement variant_dot_name_;
  
  public WebElement getElementOfVariant_dot_name_() {
    return variant_dot_name_;
  }
  
  public String getTextOfVariant_dot_name_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_461") && matcher.group(2).equals("variant_dot_name_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_462']")
  private WebElement variant_dot_options_text_;
  
  public WebElement getElementOfVariant_dot_options_text_() {
    return variant_dot_options_text_;
  }
  
  public String getTextOfVariant_dot_options_text_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_462") && matcher.group(2).equals("variant_dot_options_text_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_463']")
  private WebElement units_dot_select___shipped___dot_size_;
  
  public WebElement getElementOfUnits_dot_select___shipped___dot_size_() {
    return units_dot_select___shipped___dot_size_;
  }
  
  public String getTextOfUnits_dot_select___shipped___dot_size_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_463") && matcher.group(2).equals("units_dot_select___shipped___dot_size_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_464']")
  private WebElement units_dot_select___returned___dot_size_;
  
  public WebElement getElementOfUnits_dot_select___returned___dot_size_() {
    return units_dot_select___returned___dot_size_;
  }
  
  public String getTextOfUnits_dot_select___returned___dot_size_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_464") && matcher.group(2).equals("units_dot_select___returned___dot_size_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_465']")
  private WebElement _return_authorization_dot_inventory_units_dot_group_by___variant__variant__dot_try__size_____0_;
  
  public WebElement getElementOf_return_authorization_dot_inventory_units_dot_group_by___variant__variant__dot_try__size_____0_() {
    return _return_authorization_dot_inventory_units_dot_group_by___variant__variant__dot_try__size_____0_;
  }
  
  public String getTextOf_return_authorization_dot_inventory_units_dot_group_by___variant__variant__dot_try__size_____0_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_465") && matcher.group(2).equals("_return_authorization_dot_inventory_units_dot_group_by___variant__variant__dot_try__size_____0_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='<%= dom_id(variant) %>']")
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
      if (matcher.group(1).equals("<%= dom_id(variant) %>") && matcher.group(2).equals("cycle__odd____even__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='<%= dom_id(variant) %>']")
  private WebElement dom_id_variant__;
  
  public WebElement getElementOfDom_id_variant__() {
    return dom_id_variant__;
  }
  
  public String getAttributeOfIdOnDom_id_variant__() {
    return dom_id_variant__.getAttribute("id");
  }
  
  public String getTextOfDom_id_variant__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("<%= dom_id(variant) %>") && matcher.group(2).equals("dom_id_variant__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_456']")
  private WebElement f_dot_label__stock_location__Spree_dot_t__stock_location__;
  
  public WebElement getElementOfF_dot_label__stock_location__Spree_dot_t__stock_location__() {
    return f_dot_label__stock_location__Spree_dot_t__stock_location__;
  }
  
  public String getTextOfF_dot_label__stock_location__Spree_dot_t__stock_location__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_456") && matcher.group(2).equals("f_dot_label__stock_location__Spree_dot_t__stock_location__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_456']")
  private WebElement f_dot_text_area__reason____style_____height_100px_____class_____fullwidth___;
  
  public WebElement getElementOfF_dot_text_area__reason____style_____height_100px_____class_____fullwidth___() {
    return f_dot_text_area__reason____style_____height_100px_____class_____fullwidth___;
  }
  
  public String getTextOfF_dot_text_area__reason____style_____height_100px_____class_____fullwidth___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_456") && matcher.group(2).equals("f_dot_text_area__reason____style_____height_100px_____class_____fullwidth___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_456']")
  private WebElement f_dot_error_message_on__reason_;
  
  public WebElement getElementOfF_dot_error_message_on__reason_() {
    return f_dot_error_message_on__reason_;
  }
  
  public String getTextOfF_dot_error_message_on__reason_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_456") && matcher.group(2).equals("f_dot_error_message_on__reason_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_456']")
  private WebElement f_dot_error_message_on__amount_;
  
  public WebElement getElementOfF_dot_error_message_on__amount_() {
    return f_dot_error_message_on__amount_;
  }
  
  public String getTextOfF_dot_error_message_on__amount_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_456") && matcher.group(2).equals("f_dot_error_message_on__amount_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_456']")
  private WebElement f_dot_field_container__stock_location_do_;
  
  public WebElement getElementOfF_dot_field_container__stock_location_do_() {
    return f_dot_field_container__stock_location_do_;
  }
  
  public String getTextOfF_dot_field_container__stock_location_do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_456") && matcher.group(2).equals("f_dot_field_container__stock_location_do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_456']")
  private WebElement Spree_dot_t__rma_value__;
  
  public WebElement getElementOfSpree_dot_t__rma_value__() {
    return Spree_dot_t__rma_value__;
  }
  
  public String getTextOfSpree_dot_t__rma_value__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_456") && matcher.group(2).equals("Spree_dot_t__rma_value__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_456']")
  private WebElement f_dot_field_container__reason_do_;
  
  public WebElement getElementOfF_dot_field_container__reason_do_() {
    return f_dot_field_container__reason_do_;
  }
  
  public String getTextOfF_dot_field_container__reason_do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_456") && matcher.group(2).equals("f_dot_field_container__reason_do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_456']")
  private WebElement f_dot_text_field__amount____style_____width_80px____;
  
  public WebElement getElementOfF_dot_text_field__amount____style_____width_80px____() {
    return f_dot_text_field__amount____style_____width_80px____;
  }
  
  public String getTextOfF_dot_text_field__amount____style_____width_80px____() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_456") && matcher.group(2).equals("f_dot_text_field__amount____style_____width_80px____")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_456']")
  private WebElement f_dot_select__stock_location_id__Spree__StockLocation_dot_active_dot_to_a_dot_collect__l__l_dot_name__l_dot_id______style_____height_100px_____class_____fullwidth___;
  
  public WebElement getElementOfF_dot_select__stock_location_id__Spree__StockLocation_dot_active_dot_to_a_dot_collect__l__l_dot_name__l_dot_id______style_____height_100px_____class_____fullwidth___() {
    return f_dot_select__stock_location_id__Spree__StockLocation_dot_active_dot_to_a_dot_collect__l__l_dot_name__l_dot_id______style_____height_100px_____class_____fullwidth___;
  }
  
  public String getTextOfF_dot_select__stock_location_id__Spree__StockLocation_dot_active_dot_to_a_dot_collect__l__l_dot_name__l_dot_id______style_____height_100px_____class_____fullwidth___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_456") && matcher.group(2).equals("f_dot_select__stock_location_id__Spree__StockLocation_dot_active_dot_to_a_dot_collect__l__l_dot_name__l_dot_id______style_____height_100px_____class_____fullwidth___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_456']")
  private WebElement f_dot_field_container__amount_do_;
  
  public WebElement getElementOfF_dot_field_container__amount_do_() {
    return f_dot_field_container__amount_do_;
  }
  
  public String getTextOfF_dot_field_container__amount_do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_456") && matcher.group(2).equals("f_dot_field_container__amount_do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_456']")
  private WebElement f_dot_label__reason__Spree_dot_t__reason__;
  
  public WebElement getElementOfF_dot_label__reason__Spree_dot_t__reason__() {
    return f_dot_label__reason__Spree_dot_t__reason__;
  }
  
  public String getTextOfF_dot_label__reason__Spree_dot_t__reason__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_456") && matcher.group(2).equals("f_dot_label__reason__Spree_dot_t__reason__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_456']")
  private WebElement _return_authorization_dot_display_amount_;
  
  public WebElement getElementOf_return_authorization_dot_display_amount_() {
    return _return_authorization_dot_display_amount_;
  }
  
  public String getTextOf_return_authorization_dot_display_amount_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_456") && matcher.group(2).equals("_return_authorization_dot_display_amount_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_456']")
  private WebElement f_dot_label__amount__Spree_dot_t__amount__;
  
  public WebElement getElementOfF_dot_label__amount__Spree_dot_t__amount__() {
    return f_dot_label__amount__Spree_dot_t__amount__;
  }
  
  public String getTextOfF_dot_label__amount__Spree_dot_t__amount__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_456") && matcher.group(2).equals("f_dot_label__amount__Spree_dot_t__amount__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_466']")
  private WebElement variant_dot_id_dot_to_s_;
  
  public WebElement getElementOfVariant_dot_id_dot_to_s_() {
    return variant_dot_id_dot_to_s_;
  }
  
  public String getTextOfVariant_dot_id_dot_to_s_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_466") && matcher.group(2).equals("variant_dot_id_dot_to_s_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_466']")
  private WebElement items_dot_first_dot_price_;
  
  public WebElement getElementOfItems_dot_first_dot_price_() {
    return items_dot_first_dot_price_;
  }
  
  public String getTextOfItems_dot_first_dot_price_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_466") && matcher.group(2).equals("items_dot_first_dot_price_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
