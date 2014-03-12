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

public class NewHtmlPage extends AbstractPage {
  public NewHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_344']")
  private WebElement Spree_dot_t__new_product__;
  
  public WebElement getElementOfSpree_dot_t__new_product__() {
    return Spree_dot_t__new_product__;
  }
  
  public String getTextOfSpree_dot_t__new_product__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_344") && matcher.group(2).equals("Spree_dot_t__new_product__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_345']")
  private WebElement f_dot_text_field__sku___size____16___class_____fullwidth__;
  
  public WebElement getElementOfF_dot_text_field__sku___size____16___class_____fullwidth__() {
    return f_dot_text_field__sku___size____16___class_____fullwidth__;
  }
  
  public String getTextOfF_dot_text_field__sku___size____16___class_____fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_345") && matcher.group(2).equals("f_dot_text_field__sku___size____16___class_____fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_345']")
  private WebElement f_dot_field_container__sku_do_;
  
  public WebElement getElementOfF_dot_field_container__sku_do_() {
    return f_dot_field_container__sku_do_;
  }
  
  public String getTextOfF_dot_field_container__sku_do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_345") && matcher.group(2).equals("f_dot_field_container__sku_do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_345']")
  private WebElement f_dot_label__sku__Spree_dot_t__sku__;
  
  public WebElement getElementOfF_dot_label__sku__Spree_dot_t__sku__() {
    return f_dot_label__sku__Spree_dot_t__sku__;
  }
  
  public String getTextOfF_dot_label__sku__Spree_dot_t__sku__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_345") && matcher.group(2).equals("f_dot_label__sku__Spree_dot_t__sku__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_345']")
  private WebElement f_dot_error_message_on__sku_;
  
  public WebElement getElementOfF_dot_error_message_on__sku_() {
    return f_dot_error_message_on__sku_;
  }
  
  public String getTextOfF_dot_error_message_on__sku_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_345") && matcher.group(2).equals("f_dot_error_message_on__sku_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_346']")
  private WebElement f_dot_label__prototype_id__Spree_dot_t__prototype__;
  
  public WebElement getElementOfF_dot_label__prototype_id__Spree_dot_t__prototype__() {
    return f_dot_label__prototype_id__Spree_dot_t__prototype__;
  }
  
  public String getTextOfF_dot_label__prototype_id__Spree_dot_t__prototype__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_346") && matcher.group(2).equals("f_dot_label__prototype_id__Spree_dot_t__prototype__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_346']")
  private WebElement f_dot_field_container__prototype_do_;
  
  public WebElement getElementOfF_dot_field_container__prototype_do_() {
    return f_dot_field_container__prototype_do_;
  }
  
  public String getTextOfF_dot_field_container__prototype_do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_346") && matcher.group(2).equals("f_dot_field_container__prototype_do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_346']")
  private WebElement f_dot_collection_select__prototype_id__Spree__Prototype_dot_all___id___name____include_blank____true_____class_____select2_fullwidth___;
  
  public WebElement getElementOfF_dot_collection_select__prototype_id__Spree__Prototype_dot_all___id___name____include_blank____true_____class_____select2_fullwidth___() {
    return f_dot_collection_select__prototype_id__Spree__Prototype_dot_all___id___name____include_blank____true_____class_____select2_fullwidth___;
  }
  
  public String getTextOfF_dot_collection_select__prototype_id__Spree__Prototype_dot_all___id___name____include_blank____true_____class_____select2_fullwidth___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_346") && matcher.group(2).equals("f_dot_collection_select__prototype_id__Spree__Prototype_dot_all___id___name____include_blank____true_____class_____select2_fullwidth___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_347']")
  private WebElement f_dot_field_container__price_do_;
  
  public WebElement getElementOfF_dot_field_container__price_do_() {
    return f_dot_field_container__price_do_;
  }
  
  public String getTextOfF_dot_field_container__price_do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_347") && matcher.group(2).equals("f_dot_field_container__price_do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_347']")
  private WebElement f_dot_label__price__Spree_dot_t__master_price__;
  
  public WebElement getElementOfF_dot_label__price__Spree_dot_t__master_price__() {
    return f_dot_label__price__Spree_dot_t__master_price__;
  }
  
  public String getTextOfF_dot_label__price__Spree_dot_t__master_price__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_347") && matcher.group(2).equals("f_dot_label__price__Spree_dot_t__master_price__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_347']")
  private WebElement f_dot_error_message_on__price_;
  
  public WebElement getElementOfF_dot_error_message_on__price_() {
    return f_dot_error_message_on__price_;
  }
  
  public String getTextOfF_dot_error_message_on__price_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_347") && matcher.group(2).equals("f_dot_error_message_on__price_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_347']")
  private WebElement f_dot_text_field__price___value____number_to_currency__product_dot_price___unit__________class_____fullwidth__;
  
  public WebElement getElementOfF_dot_text_field__price___value____number_to_currency__product_dot_price___unit__________class_____fullwidth__() {
    return f_dot_text_field__price___value____number_to_currency__product_dot_price___unit__________class_____fullwidth__;
  }
  
  public String getTextOfF_dot_text_field__price___value____number_to_currency__product_dot_price___unit__________class_____fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_347") && matcher.group(2).equals("f_dot_text_field__price___value____number_to_currency__product_dot_price___unit__________class_____fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_348']")
  private WebElement f_dot_field_container__available_on_do_;
  
  public WebElement getElementOfF_dot_field_container__available_on_do_() {
    return f_dot_field_container__available_on_do_;
  }
  
  public String getTextOfF_dot_field_container__available_on_do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_348") && matcher.group(2).equals("f_dot_field_container__available_on_do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_348']")
  private WebElement f_dot_label__available_on__Spree_dot_t__available_on__;
  
  public WebElement getElementOfF_dot_label__available_on__Spree_dot_t__available_on__() {
    return f_dot_label__available_on__Spree_dot_t__available_on__;
  }
  
  public String getTextOfF_dot_label__available_on__Spree_dot_t__available_on__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_348") && matcher.group(2).equals("f_dot_label__available_on__Spree_dot_t__available_on__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_348']")
  private WebElement f_dot_text_field__available_on___class_____datepicker_fullwidth__;
  
  public WebElement getElementOfF_dot_text_field__available_on___class_____datepicker_fullwidth__() {
    return f_dot_text_field__available_on___class_____datepicker_fullwidth__;
  }
  
  public String getTextOfF_dot_text_field__available_on___class_____datepicker_fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_348") && matcher.group(2).equals("f_dot_text_field__available_on___class_____datepicker_fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_348']")
  private WebElement f_dot_error_message_on__available_on_;
  
  public WebElement getElementOfF_dot_error_message_on__available_on_() {
    return f_dot_error_message_on__available_on_;
  }
  
  public String getTextOfF_dot_error_message_on__available_on_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_348") && matcher.group(2).equals("f_dot_error_message_on__available_on_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_349']")
  private WebElement f_dot_collection_select__shipping_category_id___shipping_categories___id___name_____include_blank____Spree_dot_t__match_choices_dot_none_________class_____select2_fullwidth_____;
  
  public WebElement getElementOfF_dot_collection_select__shipping_category_id___shipping_categories___id___name_____include_blank____Spree_dot_t__match_choices_dot_none_________class_____select2_fullwidth_____() {
    return f_dot_collection_select__shipping_category_id___shipping_categories___id___name_____include_blank____Spree_dot_t__match_choices_dot_none_________class_____select2_fullwidth_____;
  }
  
  public String getTextOfF_dot_collection_select__shipping_category_id___shipping_categories___id___name_____include_blank____Spree_dot_t__match_choices_dot_none_________class_____select2_fullwidth_____() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_349") && matcher.group(2).equals("f_dot_collection_select__shipping_category_id___shipping_categories___id___name_____include_blank____Spree_dot_t__match_choices_dot_none_________class_____select2_fullwidth_____")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_349']")
  private WebElement f_dot_error_message_on__shipping_category_id_;
  
  public WebElement getElementOfF_dot_error_message_on__shipping_category_id_() {
    return f_dot_error_message_on__shipping_category_id_;
  }
  
  public String getTextOfF_dot_error_message_on__shipping_category_id_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_349") && matcher.group(2).equals("f_dot_error_message_on__shipping_category_id_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_349']")
  private WebElement f_dot_field_container__shipping_category_do_;
  
  public WebElement getElementOfF_dot_field_container__shipping_category_do_() {
    return f_dot_field_container__shipping_category_do_;
  }
  
  public String getTextOfF_dot_field_container__shipping_category_do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_349") && matcher.group(2).equals("f_dot_field_container__shipping_category_do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_349']")
  private WebElement f_dot_label__shipping_category_id__Spree_dot_t__shipping_categories__;
  
  public WebElement getElementOfF_dot_label__shipping_category_id__Spree_dot_t__shipping_categories__() {
    return f_dot_label__shipping_category_id__Spree_dot_t__shipping_categories__;
  }
  
  public String getTextOfF_dot_label__shipping_category_id__Spree_dot_t__shipping_categories__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_349") && matcher.group(2).equals("f_dot_label__shipping_category_id__Spree_dot_t__shipping_categories__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='product-from-prototype']")
  private WebElement render__file_____spree_divide_admin_divide_prototypes_divide_show__if__prototype_;
  
  public WebElement getElementOfRender__file_____spree_divide_admin_divide_prototypes_divide_show__if__prototype_() {
    return render__file_____spree_divide_admin_divide_prototypes_divide_show__if__prototype_;
  }
  
  public String getTextOfRender__file_____spree_divide_admin_divide_prototypes_divide_show__if__prototype_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("product-from-prototype") && matcher.group(2).equals("render__file_____spree_divide_admin_divide_prototypes_divide_show__if__prototype_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_343']")
  private WebElement f_dot_error_message_on__name_;
  
  public WebElement getElementOfF_dot_error_message_on__name_() {
    return f_dot_error_message_on__name_;
  }
  
  public String getTextOfF_dot_error_message_on__name_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_343") && matcher.group(2).equals("f_dot_error_message_on__name_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_343']")
  private WebElement f_dot_label__name__Spree_dot_t__name__;
  
  public WebElement getElementOfF_dot_label__name__Spree_dot_t__name__() {
    return f_dot_label__name__Spree_dot_t__name__;
  }
  
  public String getTextOfF_dot_label__name__Spree_dot_t__name__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_343") && matcher.group(2).equals("f_dot_label__name__Spree_dot_t__name__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_343']")
  private WebElement render__partial_____spree_divide_admin_divide_shared_divide_new_resource_links__;
  
  public WebElement getElementOfRender__partial_____spree_divide_admin_divide_shared_divide_new_resource_links__() {
    return render__partial_____spree_divide_admin_divide_shared_divide_new_resource_links__;
  }
  
  public String getTextOfRender__partial_____spree_divide_admin_divide_shared_divide_new_resource_links__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_343") && matcher.group(2).equals("render__partial_____spree_divide_admin_divide_shared_divide_new_resource_links__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_343']")
  private WebElement f_dot_text_field__name___class_____fullwidth_title__;
  
  public WebElement getElementOfF_dot_text_field__name___class_____fullwidth_title__() {
    return f_dot_text_field__name___class_____fullwidth_title__;
  }
  
  public String getTextOfF_dot_text_field__name___class_____fullwidth_title__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_343") && matcher.group(2).equals("f_dot_text_field__name___class_____fullwidth_title__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_343']")
  private WebElement f_dot_field_container__name_do_;
  
  public WebElement getElementOfF_dot_field_container__name_do_() {
    return f_dot_field_container__name_do_;
  }
  
  public String getTextOfF_dot_field_container__name_do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_343") && matcher.group(2).equals("f_dot_field_container__name_do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_350']")
  private WebElement admin_prototypes_url_;
  
  public WebElement getElementOfAdmin_prototypes_url_() {
    return admin_prototypes_url_;
  }
  
  public String getTextOfAdmin_prototypes_url_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_350") && matcher.group(2).equals("admin_prototypes_url_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
