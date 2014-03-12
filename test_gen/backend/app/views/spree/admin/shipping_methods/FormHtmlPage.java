package test.backend.app.views.spree.admin.shipping_methods;

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
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_557']")
  private WebElement f_dot_text_field__name___class_____fullwidth__;
  
  public WebElement getElementOfF_dot_text_field__name___class_____fullwidth__() {
    return f_dot_text_field__name___class_____fullwidth__;
  }
  
  public String getTextOfF_dot_text_field__name___class_____fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_557") && matcher.group(2).equals("f_dot_text_field__name___class_____fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_557']")
  private WebElement f_dot_label__name__Spree_dot_t__name__;
  
  public WebElement getElementOfF_dot_label__name__Spree_dot_t__name__() {
    return f_dot_label__name__Spree_dot_t__name__;
  }
  
  public String getTextOfF_dot_label__name__Spree_dot_t__name__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_557") && matcher.group(2).equals("f_dot_label__name__Spree_dot_t__name__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_557']")
  private WebElement error_message_on__shipping_method___name_;
  
  public WebElement getElementOfError_message_on__shipping_method___name_() {
    return error_message_on__shipping_method___name_;
  }
  
  public String getTextOfError_message_on__shipping_method___name_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_557") && matcher.group(2).equals("error_message_on__shipping_method___name_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_557']")
  private WebElement f_dot_field_container__name_do_;
  
  public WebElement getElementOfF_dot_field_container__name_do_() {
    return f_dot_field_container__name_do_;
  }
  
  public String getTextOfF_dot_field_container__name_do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_557") && matcher.group(2).equals("f_dot_field_container__name_do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_558']")
  private WebElement f_dot_field_container__display_on_do_;
  
  public WebElement getElementOfF_dot_field_container__display_on_do_() {
    return f_dot_field_container__display_on_do_;
  }
  
  public String getTextOfF_dot_field_container__display_on_do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_558") && matcher.group(2).equals("f_dot_field_container__display_on_do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_558']")
  private WebElement error_message_on__shipping_method___display_on_;
  
  public WebElement getElementOfError_message_on__shipping_method___display_on_() {
    return error_message_on__shipping_method___display_on_;
  }
  
  public String getTextOfError_message_on__shipping_method___display_on_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_558") && matcher.group(2).equals("error_message_on__shipping_method___display_on_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_558']")
  private WebElement f_dot_label__display_on__Spree_dot_t__display__;
  
  public WebElement getElementOfF_dot_label__display_on__Spree_dot_t__display__() {
    return f_dot_label__display_on__Spree_dot_t__display__;
  }
  
  public String getTextOfF_dot_label__display_on__Spree_dot_t__display__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_558") && matcher.group(2).equals("f_dot_label__display_on__Spree_dot_t__display__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_558']")
  private WebElement select__shipping_method___display_on__Spree__ShippingMethod__DISPLAY_dot_collect____display___Spree_dot_t_display___display_____both___nil___display_dot_to_s___________class_____select2_fullwidth____;
  
  public WebElement getElementOfSelect__shipping_method___display_on__Spree__ShippingMethod__DISPLAY_dot_collect____display___Spree_dot_t_display___display_____both___nil___display_dot_to_s___________class_____select2_fullwidth____() {
    return select__shipping_method___display_on__Spree__ShippingMethod__DISPLAY_dot_collect____display___Spree_dot_t_display___display_____both___nil___display_dot_to_s___________class_____select2_fullwidth____;
  }
  
  public String getTextOfSelect__shipping_method___display_on__Spree__ShippingMethod__DISPLAY_dot_collect____display___Spree_dot_t_display___display_____both___nil___display_dot_to_s___________class_____select2_fullwidth____() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_558") && matcher.group(2).equals("select__shipping_method___display_on__Spree__ShippingMethod__DISPLAY_dot_collect____display___Spree_dot_t_display___display_____both___nil___display_dot_to_s___________class_____select2_fullwidth____")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_559']")
  private WebElement f_dot_text_field__admin_name___class_____fullwidth____label____false__;
  
  public WebElement getElementOfF_dot_text_field__admin_name___class_____fullwidth____label____false__() {
    return f_dot_text_field__admin_name___class_____fullwidth____label____false__;
  }
  
  public String getTextOfF_dot_text_field__admin_name___class_____fullwidth____label____false__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_559") && matcher.group(2).equals("f_dot_text_field__admin_name___class_____fullwidth____label____false__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_559']")
  private WebElement f_dot_field_container__admin_name_do_;
  
  public WebElement getElementOfF_dot_field_container__admin_name_do_() {
    return f_dot_field_container__admin_name_do_;
  }
  
  public String getTextOfF_dot_field_container__admin_name_do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_559") && matcher.group(2).equals("f_dot_field_container__admin_name_do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_559']")
  private WebElement error_message_on__shipping_method___admin_name_;
  
  public WebElement getElementOfError_message_on__shipping_method___admin_name_() {
    return error_message_on__shipping_method___admin_name_;
  }
  
  public String getTextOfError_message_on__shipping_method___admin_name_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_559") && matcher.group(2).equals("error_message_on__shipping_method___admin_name_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_559']")
  private WebElement f_dot_label__admin_name__Spree_dot_t__internal_name__;
  
  public WebElement getElementOfF_dot_label__admin_name__Spree_dot_t__internal_name__() {
    return f_dot_label__admin_name__Spree_dot_t__internal_name__;
  }
  
  public String getTextOfF_dot_label__admin_name__Spree_dot_t__internal_name__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_559") && matcher.group(2).equals("f_dot_label__admin_name__Spree_dot_t__internal_name__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_560']")
  private WebElement f_dot_text_field__tracking_url___class_____fullwidth____placeholder____Spree_dot_t__tracking_url_placeholder__;
  
  public WebElement getElementOfF_dot_text_field__tracking_url___class_____fullwidth____placeholder____Spree_dot_t__tracking_url_placeholder__() {
    return f_dot_text_field__tracking_url___class_____fullwidth____placeholder____Spree_dot_t__tracking_url_placeholder__;
  }
  
  public String getTextOfF_dot_text_field__tracking_url___class_____fullwidth____placeholder____Spree_dot_t__tracking_url_placeholder__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_560") && matcher.group(2).equals("f_dot_text_field__tracking_url___class_____fullwidth____placeholder____Spree_dot_t__tracking_url_placeholder__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_560']")
  private WebElement error_message_on__shipping_method___tracking_url_;
  
  public WebElement getElementOfError_message_on__shipping_method___tracking_url_() {
    return error_message_on__shipping_method___tracking_url_;
  }
  
  public String getTextOfError_message_on__shipping_method___tracking_url_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_560") && matcher.group(2).equals("error_message_on__shipping_method___tracking_url_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_560']")
  private WebElement f_dot_label__tracking_url__Spree_dot_t__tracking_url__;
  
  public WebElement getElementOfF_dot_label__tracking_url__Spree_dot_t__tracking_url__() {
    return f_dot_label__tracking_url__Spree_dot_t__tracking_url__;
  }
  
  public String getTextOfF_dot_label__tracking_url__Spree_dot_t__tracking_url__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_560") && matcher.group(2).equals("f_dot_label__tracking_url__Spree_dot_t__tracking_url__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_560']")
  private WebElement f_dot_field_container__tracking_url_do_;
  
  public WebElement getElementOfF_dot_field_container__tracking_url_do_() {
    return f_dot_field_container__tracking_url_do_;
  }
  
  public String getTextOfF_dot_field_container__tracking_url_do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_560") && matcher.group(2).equals("f_dot_field_container__tracking_url_do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_562']")
  private WebElement Spree_dot_t__shipping_categories__;
  
  public WebElement getElementOfSpree_dot_t__shipping_categories__() {
    return Spree_dot_t__shipping_categories__;
  }
  
  public String getTextOfSpree_dot_t__shipping_categories__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_562") && matcher.group(2).equals("Spree_dot_t__shipping_categories__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_561']")
  private WebElement category_dot_name_;
  
  public WebElement getElementOfCategory_dot_name_() {
    return category_dot_name_;
  }
  
  public String getTextOfCategory_dot_name_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_561") && matcher.group(2).equals("category_dot_name_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_561']")
  private WebElement error_message_on__shipping_method___shipping_category_id_;
  
  public WebElement getElementOfError_message_on__shipping_method___shipping_category_id_() {
    return error_message_on__shipping_method___shipping_category_id_;
  }
  
  public String getTextOfError_message_on__shipping_method___shipping_category_id_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_561") && matcher.group(2).equals("error_message_on__shipping_method___shipping_category_id_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_561']")
  private WebElement label_tag_do_;
  
  public WebElement getElementOfLabel_tag_do_() {
    return label_tag_do_;
  }
  
  public String getTextOfLabel_tag_do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_561") && matcher.group(2).equals("label_tag_do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_561']")
  private WebElement check_box_tag__shipping_method_shipping_categories______category_dot_id___shipping_method_dot_shipping_categories_dot_include__category___;
  
  public WebElement getElementOfCheck_box_tag__shipping_method_shipping_categories______category_dot_id___shipping_method_dot_shipping_categories_dot_include__category___() {
    return check_box_tag__shipping_method_shipping_categories______category_dot_id___shipping_method_dot_shipping_categories_dot_include__category___;
  }
  
  public String getTextOfCheck_box_tag__shipping_method_shipping_categories______category_dot_id___shipping_method_dot_shipping_categories_dot_include__category___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_561") && matcher.group(2).equals("check_box_tag__shipping_method_shipping_categories______category_dot_id___shipping_method_dot_shipping_categories_dot_include__category___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_561']")
  private WebElement f_dot_field_container__categories_do_;
  
  public WebElement getElementOfF_dot_field_container__categories_do_() {
    return f_dot_field_container__categories_do_;
  }
  
  public String getTextOfF_dot_field_container__categories_do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_561") && matcher.group(2).equals("f_dot_field_container__categories_do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_564']")
  private WebElement Spree_dot_t__zones__;
  
  public WebElement getElementOfSpree_dot_t__zones__() {
    return Spree_dot_t__zones__;
  }
  
  public String getTextOfSpree_dot_t__zones__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_564") && matcher.group(2).equals("Spree_dot_t__zones__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_563']")
  private WebElement f_dot_field_container__zones_do_;
  
  public WebElement getElementOfF_dot_field_container__zones_do_() {
    return f_dot_field_container__zones_do_;
  }
  
  public String getTextOfF_dot_field_container__zones_do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_563") && matcher.group(2).equals("f_dot_field_container__zones_do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_563']")
  private WebElement error_message_on__shipping_method___zone_id_;
  
  public WebElement getElementOfError_message_on__shipping_method___zone_id_() {
    return error_message_on__shipping_method___zone_id_;
  }
  
  public String getTextOfError_message_on__shipping_method___zone_id_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_563") && matcher.group(2).equals("error_message_on__shipping_method___zone_id_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_563']")
  private WebElement label_tag_do__PO2;
  
  public WebElement getElementOfLabel_tag_do__PO2() {
    return label_tag_do__PO2;
  }
  
  public String getTextOfLabel_tag_do__PO2() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_563") && matcher.group(2).equals("label_tag_do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_563']")
  private WebElement check_box_tag__shipping_method_zones______zone_dot_id___shipping_method_dot_zones_dot_include__zone___;
  
  public WebElement getElementOfCheck_box_tag__shipping_method_zones______zone_dot_id___shipping_method_dot_zones_dot_include__zone___() {
    return check_box_tag__shipping_method_zones______zone_dot_id___shipping_method_dot_zones_dot_include__zone___;
  }
  
  public String getTextOfCheck_box_tag__shipping_method_zones______zone_dot_id___shipping_method_dot_zones_dot_include__zone___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_563") && matcher.group(2).equals("check_box_tag__shipping_method_zones______zone_dot_id___shipping_method_dot_zones_dot_include__zone___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_563']")
  private WebElement zone_dot_name_;
  
  public WebElement getElementOfZone_dot_name_() {
    return zone_dot_name_;
  }
  
  public String getTextOfZone_dot_name_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_563") && matcher.group(2).equals("zone_dot_name_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_565']")
  private WebElement render__partial_____spree_divide_admin_divide_shared_divide_calculator_fields____locals_______f____f___;
  
  public WebElement getElementOfRender__partial_____spree_divide_admin_divide_shared_divide_calculator_fields____locals_______f____f___() {
    return render__partial_____spree_divide_admin_divide_shared_divide_calculator_fields____locals_______f____f___;
  }
  
  public String getTextOfRender__partial_____spree_divide_admin_divide_shared_divide_calculator_fields____locals_______f____f___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_565") && matcher.group(2).equals("render__partial_____spree_divide_admin_divide_shared_divide_calculator_fields____locals_______f____f___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_567']")
  private WebElement Spree_dot_t__tax_category__;
  
  public WebElement getElementOfSpree_dot_t__tax_category__() {
    return Spree_dot_t__tax_category__;
  }
  
  public String getTextOfSpree_dot_t__tax_category__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_567") && matcher.group(2).equals("Spree_dot_t__tax_category__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_566']")
  private WebElement error_message_on__shipping_method___tax_category_id_;
  
  public WebElement getElementOfError_message_on__shipping_method___tax_category_id_() {
    return error_message_on__shipping_method___tax_category_id_;
  }
  
  public String getTextOfError_message_on__shipping_method___tax_category_id_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_566") && matcher.group(2).equals("error_message_on__shipping_method___tax_category_id_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_566']")
  private WebElement f_dot_select__tax_category_id___tax_categories_dot_map____tc___tc_dot_name__tc_dot_id__________class_____select2_fullwidth__;
  
  public WebElement getElementOfF_dot_select__tax_category_id___tax_categories_dot_map____tc___tc_dot_name__tc_dot_id__________class_____select2_fullwidth__() {
    return f_dot_select__tax_category_id___tax_categories_dot_map____tc___tc_dot_name__tc_dot_id__________class_____select2_fullwidth__;
  }
  
  public String getTextOfF_dot_select__tax_category_id___tax_categories_dot_map____tc___tc_dot_name__tc_dot_id__________class_____select2_fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_566") && matcher.group(2).equals("f_dot_select__tax_category_id___tax_categories_dot_map____tc___tc_dot_name__tc_dot_id__________class_____select2_fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_566']")
  private WebElement f_dot_field_container__categories_do__PO2;
  
  public WebElement getElementOfF_dot_field_container__categories_do__PO2() {
    return f_dot_field_container__categories_do__PO2;
  }
  
  public String getTextOfF_dot_field_container__categories_do__PO2() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_566") && matcher.group(2).equals("f_dot_field_container__categories_do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
