package test.backend.app.views.spree.admin.products;

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
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_319']")
  private WebElement f_dot_label__description__Spree_dot_t__description__;
  
  public WebElement getElementOfF_dot_label__description__Spree_dot_t__description__() {
    return f_dot_label__description__Spree_dot_t__description__;
  }
  
  public String getTextOfF_dot_label__description__Spree_dot_t__description__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_319") && matcher.group(2).equals("f_dot_label__description__Spree_dot_t__description__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_319']")
  private WebElement f_dot_error_message_on__name_;
  
  public WebElement getElementOfF_dot_error_message_on__name_() {
    return f_dot_error_message_on__name_;
  }
  
  public String getTextOfF_dot_error_message_on__name_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_319") && matcher.group(2).equals("f_dot_error_message_on__name_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_319']")
  private WebElement f_dot_label__name__raw_Spree_dot_t__name___plus__content_tag__span_____multiply_____class_____required____;
  
  public WebElement getElementOfF_dot_label__name__raw_Spree_dot_t__name___plus__content_tag__span_____multiply_____class_____required____() {
    return f_dot_label__name__raw_Spree_dot_t__name___plus__content_tag__span_____multiply_____class_____required____;
  }
  
  public String getTextOfF_dot_label__name__raw_Spree_dot_t__name___plus__content_tag__span_____multiply_____class_____required____() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_319") && matcher.group(2).equals("f_dot_label__name__raw_Spree_dot_t__name___plus__content_tag__span_____multiply_____class_____required____")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_319']")
  private WebElement f_dot_label__slug__raw_Spree_dot_t__slug___plus__content_tag__span_____multiply______class_____required____;
  
  public WebElement getElementOfF_dot_label__slug__raw_Spree_dot_t__slug___plus__content_tag__span_____multiply______class_____required____() {
    return f_dot_label__slug__raw_Spree_dot_t__slug___plus__content_tag__span_____multiply______class_____required____;
  }
  
  public String getTextOfF_dot_label__slug__raw_Spree_dot_t__slug___plus__content_tag__span_____multiply______class_____required____() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_319") && matcher.group(2).equals("f_dot_label__slug__raw_Spree_dot_t__slug___plus__content_tag__span_____multiply______class_____required____")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_319']")
  private WebElement f_dot_text_area__description____rows_______unless__product_dot_has_variants__then__20__else__13__end_____class_____fullwidth___;
  
  public WebElement getElementOfF_dot_text_area__description____rows_______unless__product_dot_has_variants__then__20__else__13__end_____class_____fullwidth___() {
    return f_dot_text_area__description____rows_______unless__product_dot_has_variants__then__20__else__13__end_____class_____fullwidth___;
  }
  
  public String getTextOfF_dot_text_area__description____rows_______unless__product_dot_has_variants__then__20__else__13__end_____class_____fullwidth___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_319") && matcher.group(2).equals("f_dot_text_area__description____rows_______unless__product_dot_has_variants__then__20__else__13__end_____class_____fullwidth___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_319']")
  private WebElement f_dot_text_field__slug___class_____fullwidth_title__;
  
  public WebElement getElementOfF_dot_text_field__slug___class_____fullwidth_title__() {
    return f_dot_text_field__slug___class_____fullwidth_title__;
  }
  
  public String getTextOfF_dot_text_field__slug___class_____fullwidth_title__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_319") && matcher.group(2).equals("f_dot_text_field__slug___class_____fullwidth_title__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_319']")
  private WebElement f_dot_error_message_on__slug_;
  
  public WebElement getElementOfF_dot_error_message_on__slug_() {
    return f_dot_error_message_on__slug_;
  }
  
  public String getTextOfF_dot_error_message_on__slug_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_319") && matcher.group(2).equals("f_dot_error_message_on__slug_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_319']")
  private WebElement f_dot_text_field__name___class_____fullwidth_title__;
  
  public WebElement getElementOfF_dot_text_field__name___class_____fullwidth_title__() {
    return f_dot_text_field__name___class_____fullwidth_title__;
  }
  
  public String getTextOfF_dot_text_field__name___class_____fullwidth_title__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_319") && matcher.group(2).equals("f_dot_text_field__name___class_____fullwidth_title__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_319']")
  private WebElement f_dot_error_message_on__description_;
  
  public WebElement getElementOfF_dot_error_message_on__description_() {
    return f_dot_error_message_on__description_;
  }
  
  public String getTextOfF_dot_error_message_on__description_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_319") && matcher.group(2).equals("f_dot_error_message_on__description_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_319']")
  private WebElement f_dot_field_container__description_do_;
  
  public WebElement getElementOfF_dot_field_container__description_do_() {
    return f_dot_field_container__description_do_;
  }
  
  public String getTextOfF_dot_field_container__description_do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_319") && matcher.group(2).equals("f_dot_field_container__description_do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_319']")
  private WebElement f_dot_field_container__slug_do_;
  
  public WebElement getElementOfF_dot_field_container__slug_do_() {
    return f_dot_field_container__slug_do_;
  }
  
  public String getTextOfF_dot_field_container__slug_do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_319") && matcher.group(2).equals("f_dot_field_container__slug_do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_319']")
  private WebElement f_dot_field_container__name_do_;
  
  public WebElement getElementOfF_dot_field_container__name_do_() {
    return f_dot_field_container__name_do_;
  }
  
  public String getTextOfF_dot_field_container__name_do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_319") && matcher.group(2).equals("f_dot_field_container__name_do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_321']")
  private WebElement f_dot_text_field__cost_price___value____number_to_currency__product_dot_cost_price___unit________;
  
  public WebElement getElementOfF_dot_text_field__cost_price___value____number_to_currency__product_dot_cost_price___unit________() {
    return f_dot_text_field__cost_price___value____number_to_currency__product_dot_cost_price___unit________;
  }
  
  public String getTextOfF_dot_text_field__cost_price___value____number_to_currency__product_dot_cost_price___unit________() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_321") && matcher.group(2).equals("f_dot_text_field__cost_price___value____number_to_currency__product_dot_cost_price___unit________")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_321']")
  private WebElement f_dot_label__cost_price__Spree_dot_t__cost_price__;
  
  public WebElement getElementOfF_dot_label__cost_price__Spree_dot_t__cost_price__() {
    return f_dot_label__cost_price__Spree_dot_t__cost_price__;
  }
  
  public String getTextOfF_dot_label__cost_price__Spree_dot_t__cost_price__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_321") && matcher.group(2).equals("f_dot_label__cost_price__Spree_dot_t__cost_price__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_321']")
  private WebElement f_dot_error_message_on__cost_price_;
  
  public WebElement getElementOfF_dot_error_message_on__cost_price_() {
    return f_dot_error_message_on__cost_price_;
  }
  
  public String getTextOfF_dot_error_message_on__cost_price_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_321") && matcher.group(2).equals("f_dot_error_message_on__cost_price_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_321']")
  private WebElement f_dot_field_container__cost_price_do_;
  
  public WebElement getElementOfF_dot_field_container__cost_price_do_() {
    return f_dot_field_container__cost_price_do_;
  }
  
  public String getTextOfF_dot_field_container__cost_price_do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_321") && matcher.group(2).equals("f_dot_field_container__cost_price_do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_322']")
  private WebElement f_dot_error_message_on__cost_currency_;
  
  public WebElement getElementOfF_dot_error_message_on__cost_currency_() {
    return f_dot_error_message_on__cost_currency_;
  }
  
  public String getTextOfF_dot_error_message_on__cost_currency_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_322") && matcher.group(2).equals("f_dot_error_message_on__cost_currency_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_322']")
  private WebElement f_dot_label__cost_currency__Spree_dot_t__cost_currency__;
  
  public WebElement getElementOfF_dot_label__cost_currency__Spree_dot_t__cost_currency__() {
    return f_dot_label__cost_currency__Spree_dot_t__cost_currency__;
  }
  
  public String getTextOfF_dot_label__cost_currency__Spree_dot_t__cost_currency__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_322") && matcher.group(2).equals("f_dot_label__cost_currency__Spree_dot_t__cost_currency__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_322']")
  private WebElement f_dot_text_field__cost_currency_;
  
  public WebElement getElementOfF_dot_text_field__cost_currency_() {
    return f_dot_text_field__cost_currency_;
  }
  
  public String getTextOfF_dot_text_field__cost_currency_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_322") && matcher.group(2).equals("f_dot_text_field__cost_currency_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_322']")
  private WebElement f_dot_field_container__cost_currency_do_;
  
  public WebElement getElementOfF_dot_field_container__cost_currency_do_() {
    return f_dot_field_container__cost_currency_do_;
  }
  
  public String getTextOfF_dot_field_container__cost_currency_do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_322") && matcher.group(2).equals("f_dot_field_container__cost_currency_do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='shipping_specs_weight_field']")
  private WebElement f_dot_label__weight__Spree_dot_t__weight__;
  
  public WebElement getElementOfF_dot_label__weight__Spree_dot_t__weight__() {
    return f_dot_label__weight__Spree_dot_t__weight__;
  }
  
  public String getTextOfF_dot_label__weight__Spree_dot_t__weight__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("shipping_specs_weight_field") && matcher.group(2).equals("f_dot_label__weight__Spree_dot_t__weight__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='shipping_specs_weight_field']")
  private WebElement f_dot_text_field__weight___size____4_;
  
  public WebElement getElementOfF_dot_text_field__weight___size____4_() {
    return f_dot_text_field__weight___size____4_;
  }
  
  public String getTextOfF_dot_text_field__weight___size____4_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("shipping_specs_weight_field") && matcher.group(2).equals("f_dot_text_field__weight___size____4_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='shipping_specs_height_field']")
  private WebElement f_dot_text_field__height___size____4_;
  
  public WebElement getElementOfF_dot_text_field__height___size____4_() {
    return f_dot_text_field__height___size____4_;
  }
  
  public String getTextOfF_dot_text_field__height___size____4_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("shipping_specs_height_field") && matcher.group(2).equals("f_dot_text_field__height___size____4_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='shipping_specs_height_field']")
  private WebElement f_dot_label__height__Spree_dot_t__height__;
  
  public WebElement getElementOfF_dot_label__height__Spree_dot_t__height__() {
    return f_dot_label__height__Spree_dot_t__height__;
  }
  
  public String getTextOfF_dot_label__height__Spree_dot_t__height__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("shipping_specs_height_field") && matcher.group(2).equals("f_dot_label__height__Spree_dot_t__height__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='shipping_specs_width_field']")
  private WebElement f_dot_label__width__Spree_dot_t__width__;
  
  public WebElement getElementOfF_dot_label__width__Spree_dot_t__width__() {
    return f_dot_label__width__Spree_dot_t__width__;
  }
  
  public String getTextOfF_dot_label__width__Spree_dot_t__width__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("shipping_specs_width_field") && matcher.group(2).equals("f_dot_label__width__Spree_dot_t__width__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='shipping_specs_width_field']")
  private WebElement f_dot_text_field__width___size____4_;
  
  public WebElement getElementOfF_dot_text_field__width___size____4_() {
    return f_dot_text_field__width___size____4_;
  }
  
  public String getTextOfF_dot_text_field__width___size____4_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("shipping_specs_width_field") && matcher.group(2).equals("f_dot_text_field__width___size____4_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='shipping_specs_depth_field']")
  private WebElement f_dot_text_field__depth___size____4_;
  
  public WebElement getElementOfF_dot_text_field__depth___size____4_() {
    return f_dot_text_field__depth___size____4_;
  }
  
  public String getTextOfF_dot_text_field__depth___size____4_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("shipping_specs_depth_field") && matcher.group(2).equals("f_dot_text_field__depth___size____4_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='shipping_specs_depth_field']")
  private WebElement f_dot_label__depth__Spree_dot_t__depth__;
  
  public WebElement getElementOfF_dot_label__depth__Spree_dot_t__depth__() {
    return f_dot_label__depth__Spree_dot_t__depth__;
  }
  
  public String getTextOfF_dot_label__depth__Spree_dot_t__depth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("shipping_specs_depth_field") && matcher.group(2).equals("f_dot_label__depth__Spree_dot_t__depth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_320']")
  private WebElement f_dot_error_message_on__shipping_category_;
  
  public WebElement getElementOfF_dot_error_message_on__shipping_category_() {
    return f_dot_error_message_on__shipping_category_;
  }
  
  public String getTextOfF_dot_error_message_on__shipping_category_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_320") && matcher.group(2).equals("f_dot_error_message_on__shipping_category_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_320']")
  private WebElement f_dot_field_container__tax_category_do_;
  
  public WebElement getElementOfF_dot_field_container__tax_category_do_() {
    return f_dot_field_container__tax_category_do_;
  }
  
  public String getTextOfF_dot_field_container__tax_category_do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_320") && matcher.group(2).equals("f_dot_field_container__tax_category_do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_320']")
  private WebElement f_dot_error_message_on__tax_category_;
  
  public WebElement getElementOfF_dot_error_message_on__tax_category_() {
    return f_dot_error_message_on__tax_category_;
  }
  
  public String getTextOfF_dot_error_message_on__tax_category_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_320") && matcher.group(2).equals("f_dot_error_message_on__tax_category_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_320']")
  private WebElement f_dot_label__available_on__Spree_dot_t__available_on__;
  
  public WebElement getElementOfF_dot_label__available_on__Spree_dot_t__available_on__() {
    return f_dot_label__available_on__Spree_dot_t__available_on__;
  }
  
  public String getTextOfF_dot_label__available_on__Spree_dot_t__available_on__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_320") && matcher.group(2).equals("f_dot_label__available_on__Spree_dot_t__available_on__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_320']")
  private WebElement f_dot_field_container__sku_do_;
  
  public WebElement getElementOfF_dot_field_container__sku_do_() {
    return f_dot_field_container__sku_do_;
  }
  
  public String getTextOfF_dot_field_container__sku_do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_320") && matcher.group(2).equals("f_dot_field_container__sku_do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_320']")
  private WebElement f_dot_collection_select__tax_category_id___tax_categories___id___name_____include_blank____Spree_dot_t__match_choices_dot_none_________class_____select2_____;
  
  public WebElement getElementOfF_dot_collection_select__tax_category_id___tax_categories___id___name_____include_blank____Spree_dot_t__match_choices_dot_none_________class_____select2_____() {
    return f_dot_collection_select__tax_category_id___tax_categories___id___name_____include_blank____Spree_dot_t__match_choices_dot_none_________class_____select2_____;
  }
  
  public String getTextOfF_dot_collection_select__tax_category_id___tax_categories___id___name_____include_blank____Spree_dot_t__match_choices_dot_none_________class_____select2_____() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_320") && matcher.group(2).equals("f_dot_collection_select__tax_category_id___tax_categories___id___name_____include_blank____Spree_dot_t__match_choices_dot_none_________class_____select2_____")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_320']")
  private WebElement f_dot_label__tax_category_id__Spree_dot_t__tax_category__;
  
  public WebElement getElementOfF_dot_label__tax_category_id__Spree_dot_t__tax_category__() {
    return f_dot_label__tax_category_id__Spree_dot_t__tax_category__;
  }
  
  public String getTextOfF_dot_label__tax_category_id__Spree_dot_t__tax_category__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_320") && matcher.group(2).equals("f_dot_label__tax_category_id__Spree_dot_t__tax_category__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_320']")
  private WebElement f_dot_label__shipping_category_id__Spree_dot_t__shipping_categories__;
  
  public WebElement getElementOfF_dot_label__shipping_category_id__Spree_dot_t__shipping_categories__() {
    return f_dot_label__shipping_category_id__Spree_dot_t__shipping_categories__;
  }
  
  public String getTextOfF_dot_label__shipping_category_id__Spree_dot_t__shipping_categories__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_320") && matcher.group(2).equals("f_dot_label__shipping_category_id__Spree_dot_t__shipping_categories__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_320']")
  private WebElement f_dot_text_field__sku___size____16_;
  
  public WebElement getElementOfF_dot_text_field__sku___size____16_() {
    return f_dot_text_field__sku___size____16_;
  }
  
  public String getTextOfF_dot_text_field__sku___size____16_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_320") && matcher.group(2).equals("f_dot_text_field__sku___size____16_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_320']")
  private WebElement f_dot_field_container__shipping_categories_do_;
  
  public WebElement getElementOfF_dot_field_container__shipping_categories_do_() {
    return f_dot_field_container__shipping_categories_do_;
  }
  
  public String getTextOfF_dot_field_container__shipping_categories_do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_320") && matcher.group(2).equals("f_dot_field_container__shipping_categories_do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_320']")
  private WebElement f_dot_label__price__raw_Spree_dot_t__master_price___plus__content_tag__span_____multiply_____class_____required____;
  
  public WebElement getElementOfF_dot_label__price__raw_Spree_dot_t__master_price___plus__content_tag__span_____multiply_____class_____required____() {
    return f_dot_label__price__raw_Spree_dot_t__master_price___plus__content_tag__span_____multiply_____class_____required____;
  }
  
  public String getTextOfF_dot_label__price__raw_Spree_dot_t__master_price___plus__content_tag__span_____multiply_____class_____required____() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_320") && matcher.group(2).equals("f_dot_label__price__raw_Spree_dot_t__master_price___plus__content_tag__span_____multiply_____class_____required____")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_320']")
  private WebElement f_dot_field_container__available_on_do_;
  
  public WebElement getElementOfF_dot_field_container__available_on_do_() {
    return f_dot_field_container__available_on_do_;
  }
  
  public String getTextOfF_dot_field_container__available_on_do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_320") && matcher.group(2).equals("f_dot_field_container__available_on_do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_320']")
  private WebElement f_dot_collection_select__shipping_category_id___shipping_categories___id___name_____include_blank____Spree_dot_t__match_choices_dot_none_________class_____select2_____;
  
  public WebElement getElementOfF_dot_collection_select__shipping_category_id___shipping_categories___id___name_____include_blank____Spree_dot_t__match_choices_dot_none_________class_____select2_____() {
    return f_dot_collection_select__shipping_category_id___shipping_categories___id___name_____include_blank____Spree_dot_t__match_choices_dot_none_________class_____select2_____;
  }
  
  public String getTextOfF_dot_collection_select__shipping_category_id___shipping_categories___id___name_____include_blank____Spree_dot_t__match_choices_dot_none_________class_____select2_____() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_320") && matcher.group(2).equals("f_dot_collection_select__shipping_category_id___shipping_categories___id___name_____include_blank____Spree_dot_t__match_choices_dot_none_________class_____select2_____")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_320']")
  private WebElement f_dot_field_container__price_do_;
  
  public WebElement getElementOfF_dot_field_container__price_do_() {
    return f_dot_field_container__price_do_;
  }
  
  public String getTextOfF_dot_field_container__price_do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_320") && matcher.group(2).equals("f_dot_field_container__price_do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_320']")
  private WebElement f_dot_text_field__available_on___value____datepicker_field_value__product_dot_available_on____class_____datepicker__;
  
  public WebElement getElementOfF_dot_text_field__available_on___value____datepicker_field_value__product_dot_available_on____class_____datepicker__() {
    return f_dot_text_field__available_on___value____datepicker_field_value__product_dot_available_on____class_____datepicker__;
  }
  
  public String getTextOfF_dot_text_field__available_on___value____datepicker_field_value__product_dot_available_on____class_____datepicker__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_320") && matcher.group(2).equals("f_dot_text_field__available_on___value____datepicker_field_value__product_dot_available_on____class_____datepicker__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_320']")
  private WebElement f_dot_error_message_on__price_;
  
  public WebElement getElementOfF_dot_error_message_on__price_() {
    return f_dot_error_message_on__price_;
  }
  
  public String getTextOfF_dot_error_message_on__price_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_320") && matcher.group(2).equals("f_dot_error_message_on__price_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_320']")
  private WebElement f_dot_error_message_on__available_on_;
  
  public WebElement getElementOfF_dot_error_message_on__available_on_() {
    return f_dot_error_message_on__available_on_;
  }
  
  public String getTextOfF_dot_error_message_on__available_on_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_320") && matcher.group(2).equals("f_dot_error_message_on__available_on_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_320']")
  private WebElement f_dot_text_field__price___value____number_to_currency__product_dot_price___unit________;
  
  public WebElement getElementOfF_dot_text_field__price___value____number_to_currency__product_dot_price___unit________() {
    return f_dot_text_field__price___value____number_to_currency__product_dot_price___unit________;
  }
  
  public String getTextOfF_dot_text_field__price___value____number_to_currency__product_dot_price___unit________() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_320") && matcher.group(2).equals("f_dot_text_field__price___value____number_to_currency__product_dot_price___unit________")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_320']")
  private WebElement f_dot_label__sku__Spree_dot_t__sku__;
  
  public WebElement getElementOfF_dot_label__sku__Spree_dot_t__sku__() {
    return f_dot_label__sku__Spree_dot_t__sku__;
  }
  
  public String getTextOfF_dot_label__sku__Spree_dot_t__sku__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_320") && matcher.group(2).equals("f_dot_label__sku__Spree_dot_t__sku__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_323']")
  private WebElement f_dot_hidden_field__option_type_ids___value_____product_dot_option_type_ids_dot_join______;
  
  public WebElement getElementOfF_dot_hidden_field__option_type_ids___value_____product_dot_option_type_ids_dot_join______() {
    return f_dot_hidden_field__option_type_ids___value_____product_dot_option_type_ids_dot_join______;
  }
  
  public String getTextOfF_dot_hidden_field__option_type_ids___value_____product_dot_option_type_ids_dot_join______() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_323") && matcher.group(2).equals("f_dot_hidden_field__option_type_ids___value_____product_dot_option_type_ids_dot_join______")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_323']")
  private WebElement f_dot_label__taxon_ids__Spree_dot_t__taxons__;
  
  public WebElement getElementOfF_dot_label__taxon_ids__Spree_dot_t__taxons__() {
    return f_dot_label__taxon_ids__Spree_dot_t__taxons__;
  }
  
  public String getTextOfF_dot_label__taxon_ids__Spree_dot_t__taxons__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_323") && matcher.group(2).equals("f_dot_label__taxon_ids__Spree_dot_t__taxons__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_323']")
  private WebElement f_dot_label__option_type_ids__Spree_dot_t__option_types__;
  
  public WebElement getElementOfF_dot_label__option_type_ids__Spree_dot_t__option_types__() {
    return f_dot_label__option_type_ids__Spree_dot_t__option_types__;
  }
  
  public String getTextOfF_dot_label__option_type_ids__Spree_dot_t__option_types__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_323") && matcher.group(2).equals("f_dot_label__option_type_ids__Spree_dot_t__option_types__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_323']")
  private WebElement f_dot_hidden_field__taxon_ids___value_____product_dot_taxon_ids_dot_join______;
  
  public WebElement getElementOfF_dot_hidden_field__taxon_ids___value_____product_dot_taxon_ids_dot_join______() {
    return f_dot_hidden_field__taxon_ids___value_____product_dot_taxon_ids_dot_join______;
  }
  
  public String getTextOfF_dot_hidden_field__taxon_ids___value_____product_dot_taxon_ids_dot_join______() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_323") && matcher.group(2).equals("f_dot_hidden_field__taxon_ids___value_____product_dot_taxon_ids_dot_join______")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_323']")
  private WebElement f_dot_field_container__option_types_do_;
  
  public WebElement getElementOfF_dot_field_container__option_types_do_() {
    return f_dot_field_container__option_types_do_;
  }
  
  public String getTextOfF_dot_field_container__option_types_do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_323") && matcher.group(2).equals("f_dot_field_container__option_types_do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_323']")
  private WebElement f_dot_field_container__taxons_do_;
  
  public WebElement getElementOfF_dot_field_container__taxons_do_() {
    return f_dot_field_container__taxons_do_;
  }
  
  public String getTextOfF_dot_field_container__taxons_do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_323") && matcher.group(2).equals("f_dot_field_container__taxons_do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_324']")
  private WebElement f_dot_text_field__meta_description___class_____fullwidth__;
  
  public WebElement getElementOfF_dot_text_field__meta_description___class_____fullwidth__() {
    return f_dot_text_field__meta_description___class_____fullwidth__;
  }
  
  public String getTextOfF_dot_text_field__meta_description___class_____fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_324") && matcher.group(2).equals("f_dot_text_field__meta_description___class_____fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_324']")
  private WebElement f_dot_field_container__meta_description_do_;
  
  public WebElement getElementOfF_dot_field_container__meta_description_do_() {
    return f_dot_field_container__meta_description_do_;
  }
  
  public String getTextOfF_dot_field_container__meta_description_do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_324") && matcher.group(2).equals("f_dot_field_container__meta_description_do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_324']")
  private WebElement f_dot_field_container__meta_keywords_do_;
  
  public WebElement getElementOfF_dot_field_container__meta_keywords_do_() {
    return f_dot_field_container__meta_keywords_do_;
  }
  
  public String getTextOfF_dot_field_container__meta_keywords_do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_324") && matcher.group(2).equals("f_dot_field_container__meta_keywords_do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_324']")
  private WebElement f_dot_label__meta_description__Spree_dot_t__meta_description__;
  
  public WebElement getElementOfF_dot_label__meta_description__Spree_dot_t__meta_description__() {
    return f_dot_label__meta_description__Spree_dot_t__meta_description__;
  }
  
  public String getTextOfF_dot_label__meta_description__Spree_dot_t__meta_description__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_324") && matcher.group(2).equals("f_dot_label__meta_description__Spree_dot_t__meta_description__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_324']")
  private WebElement f_dot_text_field__meta_keywords___class_____fullwidth__;
  
  public WebElement getElementOfF_dot_text_field__meta_keywords___class_____fullwidth__() {
    return f_dot_text_field__meta_keywords___class_____fullwidth__;
  }
  
  public String getTextOfF_dot_text_field__meta_keywords___class_____fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_324") && matcher.group(2).equals("f_dot_text_field__meta_keywords___class_____fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_324']")
  private WebElement f_dot_label__meta_keywords__Spree_dot_t__meta_keywords__;
  
  public WebElement getElementOfF_dot_label__meta_keywords__Spree_dot_t__meta_keywords__() {
    return f_dot_label__meta_keywords__Spree_dot_t__meta_keywords__;
  }
  
  public String getTextOfF_dot_label__meta_keywords__Spree_dot_t__meta_keywords__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_324") && matcher.group(2).equals("f_dot_label__meta_keywords__Spree_dot_t__meta_keywords__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
