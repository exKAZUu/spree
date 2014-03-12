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

public class IndexHtmlPage extends AbstractPage {
  public IndexHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='new_product_link']")
  private WebElement button_link_to_Spree_dot_t__new_product___new_object_url_____remote____true___icon_____icon_minus_plus____id_____admin_new_product____;
  
  public WebElement getElementOfButton_link_to_Spree_dot_t__new_product___new_object_url_____remote____true___icon_____icon_minus_plus____id_____admin_new_product____() {
    return button_link_to_Spree_dot_t__new_product___new_object_url_____remote____true___icon_____icon_minus_plus____id_____admin_new_product____;
  }
  
  public String getTextOfButton_link_to_Spree_dot_t__new_product___new_object_url_____remote____true___icon_____icon_minus_plus____id_____admin_new_product____() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("new_product_link") && matcher.group(2).equals("button_link_to_Spree_dot_t__new_product___new_object_url_____remote____true___icon_____icon_minus_plus____id_____admin_new_product____")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_329']")
  private WebElement f_dot_label__name_cont__Spree_dot_t__name__;
  
  public WebElement getElementOfF_dot_label__name_cont__Spree_dot_t__name__() {
    return f_dot_label__name_cont__Spree_dot_t__name__;
  }
  
  public String getTextOfF_dot_label__name_cont__Spree_dot_t__name__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_329") && matcher.group(2).equals("f_dot_label__name_cont__Spree_dot_t__name__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_329']")
  private WebElement f_dot_text_field__name_cont___size____15_;
  
  public WebElement getElementOfF_dot_text_field__name_cont___size____15_() {
    return f_dot_text_field__name_cont___size____15_;
  }
  
  public String getTextOfF_dot_text_field__name_cont___size____15_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_329") && matcher.group(2).equals("f_dot_text_field__name_cont___size____15_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_330']")
  private WebElement f_dot_label__variants_including_master_sku_cont__Spree_dot_t__sku__;
  
  public WebElement getElementOfF_dot_label__variants_including_master_sku_cont__Spree_dot_t__sku__() {
    return f_dot_label__variants_including_master_sku_cont__Spree_dot_t__sku__;
  }
  
  public String getTextOfF_dot_label__variants_including_master_sku_cont__Spree_dot_t__sku__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_330") && matcher.group(2).equals("f_dot_label__variants_including_master_sku_cont__Spree_dot_t__sku__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_330']")
  private WebElement f_dot_text_field__variants_including_master_sku_cont___size____15_;
  
  public WebElement getElementOfF_dot_text_field__variants_including_master_sku_cont___size____15_() {
    return f_dot_text_field__variants_including_master_sku_cont___size____15_;
  }
  
  public String getTextOfF_dot_text_field__variants_including_master_sku_cont___size____15_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_330") && matcher.group(2).equals("f_dot_text_field__variants_including_master_sku_cont___size____15_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_331']")
  private WebElement Spree_dot_t__show_deleted__;
  
  public WebElement getElementOfSpree_dot_t__show_deleted__() {
    return Spree_dot_t__show_deleted__;
  }
  
  public String getTextOfSpree_dot_t__show_deleted__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_331") && matcher.group(2).equals("Spree_dot_t__show_deleted__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_331']")
  private WebElement f_dot_check_box__deleted_at_null____checked____params__q___deleted_at_null__dot_blank_________1__;
  
  public WebElement getElementOfF_dot_check_box__deleted_at_null____checked____params__q___deleted_at_null__dot_blank_________1__() {
    return f_dot_check_box__deleted_at_null____checked____params__q___deleted_at_null__dot_blank_________1__;
  }
  
  public String getTextOfF_dot_check_box__deleted_at_null____checked____params__q___deleted_at_null__dot_blank_________1__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_331") && matcher.group(2).equals("f_dot_check_box__deleted_at_null____checked____params__q___deleted_at_null__dot_blank_________1__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_332']")
  private WebElement button_Spree_dot_t__search____icon_minus_search__;
  
  public WebElement getElementOfButton_Spree_dot_t__search____icon_minus_search__() {
    return button_Spree_dot_t__search____icon_minus_search__;
  }
  
  public String getTextOfButton_Spree_dot_t__search____icon_minus_search__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_332") && matcher.group(2).equals("button_Spree_dot_t__search____icon_minus_search__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_328']")
  private WebElement search_form_for___admin___search__do__f__;
  
  public WebElement getElementOfSearch_form_for___admin___search__do__f__() {
    return search_form_for___admin___search__do__f__;
  }
  
  public String getTextOfSearch_form_for___admin___search__do__f__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_328") && matcher.group(2).equals("search_form_for___admin___search__do__f__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_333']")
  private WebElement Spree_dot_t__sku__;
  
  public WebElement getElementOfSpree_dot_t__sku__() {
    return Spree_dot_t__sku__;
  }
  
  public String getTextOfSpree_dot_t__sku__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_333") && matcher.group(2).equals("Spree_dot_t__sku__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_334']")
  private WebElement sort_link__search__name__Spree_dot_t__name______default_order_____desc_______title_____admin_products_listing_name_title___;
  
  public WebElement getElementOfSort_link__search__name__Spree_dot_t__name______default_order_____desc_______title_____admin_products_listing_name_title___() {
    return sort_link__search__name__Spree_dot_t__name______default_order_____desc_______title_____admin_products_listing_name_title___;
  }
  
  public String getTextOfSort_link__search__name__Spree_dot_t__name______default_order_____desc_______title_____admin_products_listing_name_title___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_334") && matcher.group(2).equals("sort_link__search__name__Spree_dot_t__name______default_order_____desc_______title_____admin_products_listing_name_title___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_335']")
  private WebElement sort_link__search__master_default_price_amount__Spree_dot_t__master_price_________title_____admin_products_listing_price_title___;
  
  public WebElement getElementOfSort_link__search__master_default_price_amount__Spree_dot_t__master_price_________title_____admin_products_listing_price_title___() {
    return sort_link__search__master_default_price_amount__Spree_dot_t__master_price_________title_____admin_products_listing_price_title___;
  }
  
  public String getTextOfSort_link__search__master_default_price_amount__Spree_dot_t__master_price_________title_____admin_products_listing_price_title___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_335") && matcher.group(2).equals("sort_link__search__master_default_price_amount__Spree_dot_t__master_price_________title_____admin_products_listing_price_title___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_337']")
  private WebElement product_dot_sku_rescue____;
  
  public WebElement getElementOfProduct_dot_sku_rescue____() {
    return product_dot_sku_rescue____;
  }
  
  public String getTextOfProduct_dot_sku_rescue____() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_337") && matcher.group(2).equals("product_dot_sku_rescue____")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_338']")
  private WebElement mini_image_product__;
  
  public WebElement getElementOfMini_image_product__() {
    return mini_image_product__;
  }
  
  public String getTextOfMini_image_product__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_338") && matcher.group(2).equals("mini_image_product__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_339']")
  private WebElement link_to_product_dot_try__name___edit_admin_product_path_product__;
  
  public WebElement getElementOfLink_to_product_dot_try__name___edit_admin_product_path_product__() {
    return link_to_product_dot_try__name___edit_admin_product_path_product__;
  }
  
  public String getTextOfLink_to_product_dot_try__name___edit_admin_product_path_product__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_339") && matcher.group(2).equals("link_to_product_dot_try__name___edit_admin_product_path_product__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_340']")
  private WebElement product_dot_display_price_dot_to_html_rescue____;
  
  public WebElement getElementOfProduct_dot_display_price_dot_to_html_rescue____() {
    return product_dot_display_price_dot_to_html_rescue____;
  }
  
  public String getTextOfProduct_dot_display_price_dot_to_html_rescue____() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_340") && matcher.group(2).equals("product_dot_display_price_dot_to_html_rescue____")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_341']")
  private WebElement link_to_clone_product___no_text____true___class_____clone__if_can___clone__product__;
  
  public WebElement getElementOfLink_to_clone_product___no_text____true___class_____clone__if_can___clone__product__() {
    return link_to_clone_product___no_text____true___class_____clone__if_can___clone__product__;
  }
  
  public String getTextOfLink_to_clone_product___no_text____true___class_____clone__if_can___clone__product__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_341") && matcher.group(2).equals("link_to_clone_product___no_text____true___class_____clone__if_can___clone__product__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_341']")
  private WebElement link_to_delete_product___no_text____true_if_can___delete__product______product_dot_deleted__;
  
  public WebElement getElementOfLink_to_delete_product___no_text____true_if_can___delete__product______product_dot_deleted__() {
    return link_to_delete_product___no_text____true_if_can___delete__product______product_dot_deleted__;
  }
  
  public String getTextOfLink_to_delete_product___no_text____true_if_can___delete__product______product_dot_deleted__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_341") && matcher.group(2).equals("link_to_delete_product___no_text____true_if_can___delete__product______product_dot_deleted__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_341']")
  private WebElement link_to_edit_product___no_text____true___class_____edit__if_can___edit__product______product_dot_deleted__;
  
  public WebElement getElementOfLink_to_edit_product___no_text____true___class_____edit__if_can___edit__product______product_dot_deleted__() {
    return link_to_edit_product___no_text____true___class_____edit__if_can___edit__product______product_dot_deleted__;
  }
  
  public String getTextOfLink_to_edit_product___no_text____true___class_____edit__if_can___edit__product______product_dot_deleted__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_341") && matcher.group(2).equals("link_to_edit_product___no_text____true___class_____edit__if_can___edit__product______product_dot_deleted__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_336']")
  private WebElement cycle__odd____even___;
  
  public WebElement getElementOfCycle__odd____even___() {
    return cycle__odd____even___;
  }
  
  public String getTextOfCycle__odd____even___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_336") && matcher.group(2).equals("cycle__odd____even___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_336']")
  private WebElement ___style__color__red____if_product_dot_deleted__;
  
  public WebElement getElementOf___style__color__red____if_product_dot_deleted__() {
    return ___style__color__red____if_product_dot_deleted__;
  }
  
  public String getTextOf___style__color__red____if_product_dot_deleted__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_336") && matcher.group(2).equals("___style__color__red____if_product_dot_deleted__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_336']")
  private WebElement spree_dom_id_product_;
  
  public WebElement getElementOfSpree_dom_id_product_() {
    return spree_dom_id_product_;
  }
  
  public String getTextOfSpree_dom_id_product_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_336") && matcher.group(2).equals("spree_dom_id_product_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_342']")
  private WebElement link_to_Spree_dot_t__add_one___spree_dot_new_admin_product_path_;
  
  public WebElement getElementOfLink_to_Spree_dot_t__add_one___spree_dot_new_admin_product_path_() {
    return link_to_Spree_dot_t__add_one___spree_dot_new_admin_product_path_;
  }
  
  public String getTextOfLink_to_Spree_dot_t__add_one___spree_dot_new_admin_product_path_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_342") && matcher.group(2).equals("link_to_Spree_dot_t__add_one___spree_dot_new_admin_product_path_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_342']")
  private WebElement Spree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_product____;
  
  public WebElement getElementOfSpree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_product____() {
    return Spree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_product____;
  }
  
  public String getTextOfSpree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_product____() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_342") && matcher.group(2).equals("Spree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_product____")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
