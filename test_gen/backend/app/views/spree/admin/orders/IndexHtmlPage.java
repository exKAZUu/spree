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

public class IndexHtmlPage extends AbstractPage {
  public IndexHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_202']")
  private WebElement button_link_to_Spree_dot_t__new_order___new_admin_order_url___icon_____icon_minus_plus____id_____admin_new_order__;
  
  public WebElement getElementOfButton_link_to_Spree_dot_t__new_order___new_admin_order_url___icon_____icon_minus_plus____id_____admin_new_order__() {
    return button_link_to_Spree_dot_t__new_order___new_admin_order_url___icon_____icon_minus_plus____id_____admin_new_order__;
  }
  
  public String getTextOfButton_link_to_Spree_dot_t__new_order___new_admin_order_url___icon_____icon_minus_plus____id_____admin_new_order__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_202") && matcher.group(2).equals("button_link_to_Spree_dot_t__new_order___new_admin_order_url___icon_____icon_minus_plus____id_____admin_new_order__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_205']")
  private WebElement f_dot_text_field__created_at_gt___class_____datepicker_datepicker_minus_from____value____params__q___created_at_gt____placeholder____Spree_dot_t__start__;
  
  public WebElement getElementOfF_dot_text_field__created_at_gt___class_____datepicker_datepicker_minus_from____value____params__q___created_at_gt____placeholder____Spree_dot_t__start__() {
    return f_dot_text_field__created_at_gt___class_____datepicker_datepicker_minus_from____value____params__q___created_at_gt____placeholder____Spree_dot_t__start__;
  }
  
  public String getTextOfF_dot_text_field__created_at_gt___class_____datepicker_datepicker_minus_from____value____params__q___created_at_gt____placeholder____Spree_dot_t__start__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_205") && matcher.group(2).equals("f_dot_text_field__created_at_gt___class_____datepicker_datepicker_minus_from____value____params__q___created_at_gt____placeholder____Spree_dot_t__start__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_205']")
  private WebElement f_dot_text_field__created_at_lt___class_____datepicker_datepicker_minus_to____value____params__q___created_at_lt____placeholder____Spree_dot_t__stop__;
  
  public WebElement getElementOfF_dot_text_field__created_at_lt___class_____datepicker_datepicker_minus_to____value____params__q___created_at_lt____placeholder____Spree_dot_t__stop__() {
    return f_dot_text_field__created_at_lt___class_____datepicker_datepicker_minus_to____value____params__q___created_at_lt____placeholder____Spree_dot_t__stop__;
  }
  
  public String getTextOfF_dot_text_field__created_at_lt___class_____datepicker_datepicker_minus_to____value____params__q___created_at_lt____placeholder____Spree_dot_t__stop__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_205") && matcher.group(2).equals("f_dot_text_field__created_at_lt___class_____datepicker_datepicker_minus_to____value____params__q___created_at_lt____placeholder____Spree_dot_t__stop__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_204']")
  private WebElement label_tag_nil__Spree_dot_t__date_range__;
  
  public WebElement getElementOfLabel_tag_nil__Spree_dot_t__date_range__() {
    return label_tag_nil__Spree_dot_t__date_range__;
  }
  
  public String getTextOfLabel_tag_nil__Spree_dot_t__date_range__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_204") && matcher.group(2).equals("label_tag_nil__Spree_dot_t__date_range__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_206']")
  private WebElement f_dot_select__state_eq__Spree__Order_dot_state_machines__state__dot_states_dot_collect___s___Spree_dot_t__order_state_dot___s_dot_name_____s_dot_value______include_blank____true____class_____select2__;
  
  public WebElement getElementOfF_dot_select__state_eq__Spree__Order_dot_state_machines__state__dot_states_dot_collect___s___Spree_dot_t__order_state_dot___s_dot_name_____s_dot_value______include_blank____true____class_____select2__() {
    return f_dot_select__state_eq__Spree__Order_dot_state_machines__state__dot_states_dot_collect___s___Spree_dot_t__order_state_dot___s_dot_name_____s_dot_value______include_blank____true____class_____select2__;
  }
  
  public String getTextOfF_dot_select__state_eq__Spree__Order_dot_state_machines__state__dot_states_dot_collect___s___Spree_dot_t__order_state_dot___s_dot_name_____s_dot_value______include_blank____true____class_____select2__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_206") && matcher.group(2).equals("f_dot_select__state_eq__Spree__Order_dot_state_machines__state__dot_states_dot_collect___s___Spree_dot_t__order_state_dot___s_dot_name_____s_dot_value______include_blank____true____class_____select2__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_206']")
  private WebElement label_tag_nil__Spree_dot_t__status__;
  
  public WebElement getElementOfLabel_tag_nil__Spree_dot_t__status__() {
    return label_tag_nil__Spree_dot_t__status__;
  }
  
  public String getTextOfLabel_tag_nil__Spree_dot_t__status__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_206") && matcher.group(2).equals("label_tag_nil__Spree_dot_t__status__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_207']")
  private WebElement label_tag_nil__Spree_dot_t__order_number___number________;
  
  public WebElement getElementOfLabel_tag_nil__Spree_dot_t__order_number___number________() {
    return label_tag_nil__Spree_dot_t__order_number___number________;
  }
  
  public String getTextOfLabel_tag_nil__Spree_dot_t__order_number___number________() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_207") && matcher.group(2).equals("label_tag_nil__Spree_dot_t__order_number___number________")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_207']")
  private WebElement f_dot_text_field__number_cont_;
  
  public WebElement getElementOfF_dot_text_field__number_cont_() {
    return f_dot_text_field__number_cont_;
  }
  
  public String getTextOfF_dot_text_field__number_cont_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_207") && matcher.group(2).equals("f_dot_text_field__number_cont_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_208']")
  private WebElement label_tag_nil__Spree_dot_t__email__;
  
  public WebElement getElementOfLabel_tag_nil__Spree_dot_t__email__() {
    return label_tag_nil__Spree_dot_t__email__;
  }
  
  public String getTextOfLabel_tag_nil__Spree_dot_t__email__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_208") && matcher.group(2).equals("label_tag_nil__Spree_dot_t__email__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_208']")
  private WebElement f_dot_email_field__email_cont_;
  
  public WebElement getElementOfF_dot_email_field__email_cont_() {
    return f_dot_email_field__email_cont_;
  }
  
  public String getTextOfF_dot_email_field__email_cont_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_208") && matcher.group(2).equals("f_dot_email_field__email_cont_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_209']")
  private WebElement label_tag_nil__Spree_dot_t__first_name_begins_with__;
  
  public WebElement getElementOfLabel_tag_nil__Spree_dot_t__first_name_begins_with__() {
    return label_tag_nil__Spree_dot_t__first_name_begins_with__;
  }
  
  public String getTextOfLabel_tag_nil__Spree_dot_t__first_name_begins_with__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_209") && matcher.group(2).equals("label_tag_nil__Spree_dot_t__first_name_begins_with__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_209']")
  private WebElement f_dot_text_field__bill_address_firstname_start___size____25_;
  
  public WebElement getElementOfF_dot_text_field__bill_address_firstname_start___size____25_() {
    return f_dot_text_field__bill_address_firstname_start___size____25_;
  }
  
  public String getTextOfF_dot_text_field__bill_address_firstname_start___size____25_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_209") && matcher.group(2).equals("f_dot_text_field__bill_address_firstname_start___size____25_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_210']")
  private WebElement label_tag_nil__Spree_dot_t__last_name_begins_with__;
  
  public WebElement getElementOfLabel_tag_nil__Spree_dot_t__last_name_begins_with__() {
    return label_tag_nil__Spree_dot_t__last_name_begins_with__;
  }
  
  public String getTextOfLabel_tag_nil__Spree_dot_t__last_name_begins_with__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_210") && matcher.group(2).equals("label_tag_nil__Spree_dot_t__last_name_begins_with__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_210']")
  private WebElement f_dot_text_field__bill_address_lastname_start___size____25;
  
  public WebElement getElementOfF_dot_text_field__bill_address_lastname_start___size____25() {
    return f_dot_text_field__bill_address_lastname_start___size____25;
  }
  
  public String getTextOfF_dot_text_field__bill_address_lastname_start___size____25() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_210") && matcher.group(2).equals("f_dot_text_field__bill_address_lastname_start___size____25")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_211']")
  private WebElement Spree_dot_t__show_only_complete_orders__;
  
  public WebElement getElementOfSpree_dot_t__show_only_complete_orders__() {
    return Spree_dot_t__show_only_complete_orders__;
  }
  
  public String getTextOfSpree_dot_t__show_only_complete_orders__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_211") && matcher.group(2).equals("Spree_dot_t__show_only_complete_orders__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_211']")
  private WebElement f_dot_check_box__completed_at_not_null____checked_____show_only_completed____1____0__;
  
  public WebElement getElementOfF_dot_check_box__completed_at_not_null____checked_____show_only_completed____1____0__() {
    return f_dot_check_box__completed_at_not_null____checked_____show_only_completed____1____0__;
  }
  
  public String getTextOfF_dot_check_box__completed_at_not_null____checked_____show_only_completed____1____0__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_211") && matcher.group(2).equals("f_dot_check_box__completed_at_not_null____checked_____show_only_completed____1____0__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_212']")
  private WebElement label_tag_nil__Spree_dot_t__promotion__;
  
  public WebElement getElementOfLabel_tag_nil__Spree_dot_t__promotion__() {
    return label_tag_nil__Spree_dot_t__promotion__;
  }
  
  public String getTextOfLabel_tag_nil__Spree_dot_t__promotion__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_212") && matcher.group(2).equals("label_tag_nil__Spree_dot_t__promotion__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_212']")
  private WebElement f_dot_select__promotions_id_in__Spree__Promotion_dot_all_dot_collect___p___p_dot_name__p_dot_id______include_blank____true____class_____select2__;
  
  public WebElement getElementOfF_dot_select__promotions_id_in__Spree__Promotion_dot_all_dot_collect___p___p_dot_name__p_dot_id______include_blank____true____class_____select2__() {
    return f_dot_select__promotions_id_in__Spree__Promotion_dot_all_dot_collect___p___p_dot_name__p_dot_id______include_blank____true____class_____select2__;
  }
  
  public String getTextOfF_dot_select__promotions_id_in__Spree__Promotion_dot_all_dot_collect___p___p_dot_name__p_dot_id______include_blank____true____class_____select2__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_212") && matcher.group(2).equals("f_dot_select__promotions_id_in__Spree__Promotion_dot_all_dot_collect___p___p_dot_name__p_dot_id______include_blank____true____class_____select2__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_213']")
  private WebElement button_Spree_dot_t__filter_results____icon_minus_search__;
  
  public WebElement getElementOfButton_Spree_dot_t__filter_results____icon_minus_search__() {
    return button_Spree_dot_t__filter_results____icon_minus_search__;
  }
  
  public String getTextOfButton_Spree_dot_t__filter_results____icon_minus_search__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_213") && matcher.group(2).equals("button_Spree_dot_t__filter_results____icon_minus_search__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_203']")
  private WebElement search_form_for___admin___search__do__f__;
  
  public WebElement getElementOfSearch_form_for___admin___search__do__f__() {
    return search_form_for___admin___search__do__f__;
  }
  
  public String getTextOfSearch_form_for___admin___search__do__f__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_203") && matcher.group(2).equals("search_form_for___admin___search__do__f__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_214']")
  private WebElement sort_link__search___completed_at__I18n_dot_t__completed_at___scope_____activerecord_dot_attributes_dot_spree_divide_order___;
  
  public WebElement getElementOfSort_link__search___completed_at__I18n_dot_t__completed_at___scope_____activerecord_dot_attributes_dot_spree_divide_order___() {
    return sort_link__search___completed_at__I18n_dot_t__completed_at___scope_____activerecord_dot_attributes_dot_spree_divide_order___;
  }
  
  public String getTextOfSort_link__search___completed_at__I18n_dot_t__completed_at___scope_____activerecord_dot_attributes_dot_spree_divide_order___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_214") && matcher.group(2).equals("sort_link__search___completed_at__I18n_dot_t__completed_at___scope_____activerecord_dot_attributes_dot_spree_divide_order___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_215']")
  private WebElement sort_link__search___created_at____I18n_dot_t__created_at___scope_____activerecord_dot_attributes_dot_spree_divide_order___;
  
  public WebElement getElementOfSort_link__search___created_at____I18n_dot_t__created_at___scope_____activerecord_dot_attributes_dot_spree_divide_order___() {
    return sort_link__search___created_at____I18n_dot_t__created_at___scope_____activerecord_dot_attributes_dot_spree_divide_order___;
  }
  
  public String getTextOfSort_link__search___created_at____I18n_dot_t__created_at___scope_____activerecord_dot_attributes_dot_spree_divide_order___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_215") && matcher.group(2).equals("sort_link__search___created_at____I18n_dot_t__created_at___scope_____activerecord_dot_attributes_dot_spree_divide_order___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_216']")
  private WebElement sort_link__search___number__________I18n_dot_t__number___scope_____activerecord_dot_attributes_dot_spree_divide_order___;
  
  public WebElement getElementOfSort_link__search___number__________I18n_dot_t__number___scope_____activerecord_dot_attributes_dot_spree_divide_order___() {
    return sort_link__search___number__________I18n_dot_t__number___scope_____activerecord_dot_attributes_dot_spree_divide_order___;
  }
  
  public String getTextOfSort_link__search___number__________I18n_dot_t__number___scope_____activerecord_dot_attributes_dot_spree_divide_order___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_216") && matcher.group(2).equals("sort_link__search___number__________I18n_dot_t__number___scope_____activerecord_dot_attributes_dot_spree_divide_order___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_217']")
  private WebElement sort_link__search___state___________I18n_dot_t__state___scope_____activerecord_dot_attributes_dot_spree_divide_order___;
  
  public WebElement getElementOfSort_link__search___state___________I18n_dot_t__state___scope_____activerecord_dot_attributes_dot_spree_divide_order___() {
    return sort_link__search___state___________I18n_dot_t__state___scope_____activerecord_dot_attributes_dot_spree_divide_order___;
  }
  
  public String getTextOfSort_link__search___state___________I18n_dot_t__state___scope_____activerecord_dot_attributes_dot_spree_divide_order___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_217") && matcher.group(2).equals("sort_link__search___state___________I18n_dot_t__state___scope_____activerecord_dot_attributes_dot_spree_divide_order___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_218']")
  private WebElement sort_link__search___payment_state___I18n_dot_t__payment_state___scope_____activerecord_dot_attributes_dot_spree_divide_order___;
  
  public WebElement getElementOfSort_link__search___payment_state___I18n_dot_t__payment_state___scope_____activerecord_dot_attributes_dot_spree_divide_order___() {
    return sort_link__search___payment_state___I18n_dot_t__payment_state___scope_____activerecord_dot_attributes_dot_spree_divide_order___;
  }
  
  public String getTextOfSort_link__search___payment_state___I18n_dot_t__payment_state___scope_____activerecord_dot_attributes_dot_spree_divide_order___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_218") && matcher.group(2).equals("sort_link__search___payment_state___I18n_dot_t__payment_state___scope_____activerecord_dot_attributes_dot_spree_divide_order___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_219']")
  private WebElement sort_link__search___shipment_state__I18n_dot_t__shipment_state___scope_____activerecord_dot_attributes_dot_spree_divide_order___;
  
  public WebElement getElementOfSort_link__search___shipment_state__I18n_dot_t__shipment_state___scope_____activerecord_dot_attributes_dot_spree_divide_order___() {
    return sort_link__search___shipment_state__I18n_dot_t__shipment_state___scope_____activerecord_dot_attributes_dot_spree_divide_order___;
  }
  
  public String getTextOfSort_link__search___shipment_state__I18n_dot_t__shipment_state___scope_____activerecord_dot_attributes_dot_spree_divide_order___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_219") && matcher.group(2).equals("sort_link__search___shipment_state__I18n_dot_t__shipment_state___scope_____activerecord_dot_attributes_dot_spree_divide_order___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_220']")
  private WebElement sort_link__search___email___________I18n_dot_t__email___scope_____activerecord_dot_attributes_dot_spree_divide_order___;
  
  public WebElement getElementOfSort_link__search___email___________I18n_dot_t__email___scope_____activerecord_dot_attributes_dot_spree_divide_order___() {
    return sort_link__search___email___________I18n_dot_t__email___scope_____activerecord_dot_attributes_dot_spree_divide_order___;
  }
  
  public String getTextOfSort_link__search___email___________I18n_dot_t__email___scope_____activerecord_dot_attributes_dot_spree_divide_order___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_220") && matcher.group(2).equals("sort_link__search___email___________I18n_dot_t__email___scope_____activerecord_dot_attributes_dot_spree_divide_order___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_221']")
  private WebElement sort_link__search___total___________I18n_dot_t__total___scope_____activerecord_dot_attributes_dot_spree_divide_order___;
  
  public WebElement getElementOfSort_link__search___total___________I18n_dot_t__total___scope_____activerecord_dot_attributes_dot_spree_divide_order___() {
    return sort_link__search___total___________I18n_dot_t__total___scope_____activerecord_dot_attributes_dot_spree_divide_order___;
  }
  
  public String getTextOfSort_link__search___total___________I18n_dot_t__total___scope_____activerecord_dot_attributes_dot_spree_divide_order___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_221") && matcher.group(2).equals("sort_link__search___total___________I18n_dot_t__total___scope_____activerecord_dot_attributes_dot_spree_divide_order___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_223']")
  private WebElement l___show_only_completed___order_dot_completed_at___order_dot_created_at__dot_to_date_;
  
  public WebElement getElementOfL___show_only_completed___order_dot_completed_at___order_dot_created_at__dot_to_date_() {
    return l___show_only_completed___order_dot_completed_at___order_dot_created_at__dot_to_date_;
  }
  
  public String getTextOfL___show_only_completed___order_dot_completed_at___order_dot_created_at__dot_to_date_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_223") && matcher.group(2).equals("l___show_only_completed___order_dot_completed_at___order_dot_created_at__dot_to_date_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_224']")
  private WebElement link_to_order_dot_number__edit_admin_order_path_order__;
  
  public WebElement getElementOfLink_to_order_dot_number__edit_admin_order_path_order__() {
    return link_to_order_dot_number__edit_admin_order_path_order__;
  }
  
  public String getTextOfLink_to_order_dot_number__edit_admin_order_path_order__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_224") && matcher.group(2).equals("link_to_order_dot_number__edit_admin_order_path_order__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_225']")
  private WebElement order_dot_state_dot_downcase_;
  
  public WebElement getElementOfOrder_dot_state_dot_downcase_() {
    return order_dot_state_dot_downcase_;
  }
  
  public String getAttributeOfClassOnOrder_dot_state_dot_downcase_() {
    return order_dot_state_dot_downcase_.getAttribute("class");
  }
  
  public String getTextOfOrder_dot_state_dot_downcase_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_225") && matcher.group(2).equals("order_dot_state_dot_downcase_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_225']")
  private WebElement Spree_dot_t__order_state_dot___order_dot_state_dot_downcase____;
  
  public WebElement getElementOfSpree_dot_t__order_state_dot___order_dot_state_dot_downcase____() {
    return Spree_dot_t__order_state_dot___order_dot_state_dot_downcase____;
  }
  
  public String getTextOfSpree_dot_t__order_state_dot___order_dot_state_dot_downcase____() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_225") && matcher.group(2).equals("Spree_dot_t__order_state_dot___order_dot_state_dot_downcase____")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_226']")
  private WebElement order_dot_payment_state_;
  
  public WebElement getElementOfOrder_dot_payment_state_() {
    return order_dot_payment_state_;
  }
  
  public String getAttributeOfClassOnOrder_dot_payment_state_() {
    return order_dot_payment_state_.getAttribute("class");
  }
  
  public String getTextOfOrder_dot_payment_state_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_226") && matcher.group(2).equals("order_dot_payment_state_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_226']")
  private WebElement link_to_Spree_dot_t__payment_states_dot___order_dot_payment_state_____admin_order_payments_path_order__if_order_dot_payment_state_;
  
  public WebElement getElementOfLink_to_Spree_dot_t__payment_states_dot___order_dot_payment_state_____admin_order_payments_path_order__if_order_dot_payment_state_() {
    return link_to_Spree_dot_t__payment_states_dot___order_dot_payment_state_____admin_order_payments_path_order__if_order_dot_payment_state_;
  }
  
  public String getTextOfLink_to_Spree_dot_t__payment_states_dot___order_dot_payment_state_____admin_order_payments_path_order__if_order_dot_payment_state_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_226") && matcher.group(2).equals("link_to_Spree_dot_t__payment_states_dot___order_dot_payment_state_____admin_order_payments_path_order__if_order_dot_payment_state_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_227']")
  private WebElement order_dot_shipment_state_;
  
  public WebElement getElementOfOrder_dot_shipment_state_() {
    return order_dot_shipment_state_;
  }
  
  public String getAttributeOfClassOnOrder_dot_shipment_state_() {
    return order_dot_shipment_state_.getAttribute("class");
  }
  
  public String getTextOfOrder_dot_shipment_state_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_227") && matcher.group(2).equals("order_dot_shipment_state_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_227']")
  private WebElement Spree_dot_t__shipment_states_dot___order_dot_shipment_state____if_order_dot_shipment_state_;
  
  public WebElement getElementOfSpree_dot_t__shipment_states_dot___order_dot_shipment_state____if_order_dot_shipment_state_() {
    return Spree_dot_t__shipment_states_dot___order_dot_shipment_state____if_order_dot_shipment_state_;
  }
  
  public String getTextOfSpree_dot_t__shipment_states_dot___order_dot_shipment_state____if_order_dot_shipment_state_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_227") && matcher.group(2).equals("Spree_dot_t__shipment_states_dot___order_dot_shipment_state____if_order_dot_shipment_state_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_228']")
  private WebElement mail_to_order_dot_email_;
  
  public WebElement getElementOfMail_to_order_dot_email_() {
    return mail_to_order_dot_email_;
  }
  
  public String getTextOfMail_to_order_dot_email_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_228") && matcher.group(2).equals("mail_to_order_dot_email_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_229']")
  private WebElement order_dot_display_total_dot_to_html_;
  
  public WebElement getElementOfOrder_dot_display_total_dot_to_html_() {
    return order_dot_display_total_dot_to_html_;
  }
  
  public String getTextOfOrder_dot_display_total_dot_to_html_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_229") && matcher.group(2).equals("order_dot_display_total_dot_to_html_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_230']")
  private WebElement link_to_edit_url_edit_admin_order_path_order____title_____admin_edit___dom_id_order______no_text____true_;
  
  public WebElement getElementOfLink_to_edit_url_edit_admin_order_path_order____title_____admin_edit___dom_id_order______no_text____true_() {
    return link_to_edit_url_edit_admin_order_path_order____title_____admin_edit___dom_id_order______no_text____true_;
  }
  
  public String getTextOfLink_to_edit_url_edit_admin_order_path_order____title_____admin_edit___dom_id_order______no_text____true_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_230") && matcher.group(2).equals("link_to_edit_url_edit_admin_order_path_order____title_____admin_edit___dom_id_order______no_text____true_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_222']")
  private WebElement cycle__odd____even___;
  
  public WebElement getElementOfCycle__odd____even___() {
    return cycle__odd____even___;
  }
  
  public String getAttributeOfClassOnCycle__odd____even___() {
    return cycle__odd____even___.getAttribute("class");
  }
  
  public String getTextOfCycle__odd____even___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_222") && matcher.group(2).equals("cycle__odd____even___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_222']")
  private WebElement order_dot_state_dot_downcase__PO2;
  
  public WebElement getElementOfOrder_dot_state_dot_downcase__PO2() {
    return order_dot_state_dot_downcase__PO2;
  }
  
  public String getAttributeOfClassOnOrder_dot_state_dot_downcase__PO2() {
    return order_dot_state_dot_downcase__PO2.getAttribute("class");
  }
  
  public String getTextOfOrder_dot_state_dot_downcase__PO2() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_222") && matcher.group(2).equals("order_dot_state_dot_downcase_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_231']")
  private WebElement Spree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_order____;
  
  public WebElement getElementOfSpree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_order____() {
    return Spree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_order____;
  }
  
  public String getTextOfSpree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_order____() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_231") && matcher.group(2).equals("Spree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_order____")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_231']")
  private WebElement link_to_Spree_dot_t__add_one___spree_dot_new_admin_order_path_;
  
  public WebElement getElementOfLink_to_Spree_dot_t__add_one___spree_dot_new_admin_order_path_() {
    return link_to_Spree_dot_t__add_one___spree_dot_new_admin_order_path_;
  }
  
  public String getTextOfLink_to_Spree_dot_t__add_one___spree_dot_new_admin_order_path_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_231") && matcher.group(2).equals("link_to_Spree_dot_t__add_one___spree_dot_new_admin_order_path_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
