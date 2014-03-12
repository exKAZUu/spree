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

public class FormHtmlPage extends AbstractPage {
  public FormHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='gateway-settings-warning']")
  private WebElement Spree_dot_t__provider_settings_warning__;
  
  public WebElement getElementOfSpree_dot_t__provider_settings_warning__() {
    return Spree_dot_t__provider_settings_warning__;
  }
  
  public String getTextOfSpree_dot_t__provider_settings_warning__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("gateway-settings-warning") && matcher.group(2).equals("Spree_dot_t__provider_settings_warning__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='preference-settings']")
  private WebElement f_dot_label__type__Spree_dot_t__provider__;
  
  public WebElement getElementOfF_dot_label__type__Spree_dot_t__provider__() {
    return f_dot_label__type__Spree_dot_t__provider__;
  }
  
  public String getTextOfF_dot_label__type__Spree_dot_t__provider__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("preference-settings") && matcher.group(2).equals("f_dot_label__type__Spree_dot_t__provider__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='preference-settings']")
  private WebElement collection_select__payment_method___type___providers___to_s___name________id_____gtwy_minus_type____class_____select2_fullwidth____;
  
  public WebElement getElementOfCollection_select__payment_method___type___providers___to_s___name________id_____gtwy_minus_type____class_____select2_fullwidth____() {
    return collection_select__payment_method___type___providers___to_s___name________id_____gtwy_minus_type____class_____select2_fullwidth____;
  }
  
  public String getTextOfCollection_select__payment_method___type___providers___to_s___name________id_____gtwy_minus_type____class_____select2_fullwidth____() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("preference-settings") && matcher.group(2).equals("collection_select__payment_method___type___providers___to_s___name________id_____gtwy_minus_type____class_____select2_fullwidth____")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='preference-settings']")
  private WebElement preference_fields__object__f__;
  
  public WebElement getElementOfPreference_fields__object__f__() {
    return preference_fields__object__f__;
  }
  
  public String getTextOfPreference_fields__object__f__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("preference-settings") && matcher.group(2).equals("preference_fields__object__f__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_232']")
  private WebElement collection_select__payment_method___environment__Rails_dot_configuration_dot_database_configuration_dot_keys_dot_sort___to_s___titleize________id_____gtwy_minus_env____class_____select2_fullwidth____;
  
  public WebElement getElementOfCollection_select__payment_method___environment__Rails_dot_configuration_dot_database_configuration_dot_keys_dot_sort___to_s___titleize________id_____gtwy_minus_env____class_____select2_fullwidth____() {
    return collection_select__payment_method___environment__Rails_dot_configuration_dot_database_configuration_dot_keys_dot_sort___to_s___titleize________id_____gtwy_minus_env____class_____select2_fullwidth____;
  }
  
  public String getTextOfCollection_select__payment_method___environment__Rails_dot_configuration_dot_database_configuration_dot_keys_dot_sort___to_s___titleize________id_____gtwy_minus_env____class_____select2_fullwidth____() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_232") && matcher.group(2).equals("collection_select__payment_method___environment__Rails_dot_configuration_dot_database_configuration_dot_keys_dot_sort___to_s___titleize________id_____gtwy_minus_env____class_____select2_fullwidth____")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_232']")
  private WebElement label_tag_nil__Spree_dot_t__environment__;
  
  public WebElement getElementOfLabel_tag_nil__Spree_dot_t__environment__() {
    return label_tag_nil__Spree_dot_t__environment__;
  }
  
  public String getTextOfLabel_tag_nil__Spree_dot_t__environment__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_232") && matcher.group(2).equals("label_tag_nil__Spree_dot_t__environment__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_233']")
  private WebElement select__payment_method___display_on__Spree__PaymentMethod__DISPLAY_dot_collect____display___Spree_dot_t_display___display_____both___nil___display_dot_to_s___________class_____select2_fullwidth____;
  
  public WebElement getElementOfSelect__payment_method___display_on__Spree__PaymentMethod__DISPLAY_dot_collect____display___Spree_dot_t_display___display_____both___nil___display_dot_to_s___________class_____select2_fullwidth____() {
    return select__payment_method___display_on__Spree__PaymentMethod__DISPLAY_dot_collect____display___Spree_dot_t_display___display_____both___nil___display_dot_to_s___________class_____select2_fullwidth____;
  }
  
  public String getTextOfSelect__payment_method___display_on__Spree__PaymentMethod__DISPLAY_dot_collect____display___Spree_dot_t_display___display_____both___nil___display_dot_to_s___________class_____select2_fullwidth____() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_233") && matcher.group(2).equals("select__payment_method___display_on__Spree__PaymentMethod__DISPLAY_dot_collect____display___Spree_dot_t_display___display_____both___nil___display_dot_to_s___________class_____select2_fullwidth____")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_233']")
  private WebElement label_tag_nil__Spree_dot_t__display__;
  
  public WebElement getElementOfLabel_tag_nil__Spree_dot_t__display__() {
    return label_tag_nil__Spree_dot_t__display__;
  }
  
  public String getTextOfLabel_tag_nil__Spree_dot_t__display__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_233") && matcher.group(2).equals("label_tag_nil__Spree_dot_t__display__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_234']")
  private WebElement label_tag_nil__Spree_dot_t__auto_capture__;
  
  public WebElement getElementOfLabel_tag_nil__Spree_dot_t__auto_capture__() {
    return label_tag_nil__Spree_dot_t__auto_capture__;
  }
  
  public String getTextOfLabel_tag_nil__Spree_dot_t__auto_capture__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_234") && matcher.group(2).equals("label_tag_nil__Spree_dot_t__auto_capture__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_234']")
  private WebElement select__payment_method___auto_capture_______Spree_dot_t__use_app_default______Spree__Config__auto_capture____________Spree_dot_t__say_yes___true____Spree_dot_t__say_no___false__________class_____select2_fullwidth____;
  
  public WebElement getElementOfSelect__payment_method___auto_capture_______Spree_dot_t__use_app_default______Spree__Config__auto_capture____________Spree_dot_t__say_yes___true____Spree_dot_t__say_no___false__________class_____select2_fullwidth____() {
    return select__payment_method___auto_capture_______Spree_dot_t__use_app_default______Spree__Config__auto_capture____________Spree_dot_t__say_yes___true____Spree_dot_t__say_no___false__________class_____select2_fullwidth____;
  }
  
  public String getTextOfSelect__payment_method___auto_capture_______Spree_dot_t__use_app_default______Spree__Config__auto_capture____________Spree_dot_t__say_yes___true____Spree_dot_t__say_no___false__________class_____select2_fullwidth____() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_234") && matcher.group(2).equals("select__payment_method___auto_capture_______Spree_dot_t__use_app_default______Spree__Config__auto_capture____________Spree_dot_t__say_yes___true____Spree_dot_t__say_no___false__________class_____select2_fullwidth____")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_236']")
  private WebElement radio_button__payment_method___active__true_;
  
  public WebElement getElementOfRadio_button__payment_method___active__true_() {
    return radio_button__payment_method___active__true_;
  }
  
  public String getTextOfRadio_button__payment_method___active__true_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_236") && matcher.group(2).equals("radio_button__payment_method___active__true_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_236']")
  private WebElement label_tag_nil__Spree_dot_t__say_yes__;
  
  public WebElement getElementOfLabel_tag_nil__Spree_dot_t__say_yes__() {
    return label_tag_nil__Spree_dot_t__say_yes__;
  }
  
  public String getTextOfLabel_tag_nil__Spree_dot_t__say_yes__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_236") && matcher.group(2).equals("label_tag_nil__Spree_dot_t__say_yes__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_237']")
  private WebElement label_tag_nil__Spree_dot_t__say_no__;
  
  public WebElement getElementOfLabel_tag_nil__Spree_dot_t__say_no__() {
    return label_tag_nil__Spree_dot_t__say_no__;
  }
  
  public String getTextOfLabel_tag_nil__Spree_dot_t__say_no__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_237") && matcher.group(2).equals("label_tag_nil__Spree_dot_t__say_no__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_237']")
  private WebElement radio_button__payment_method___active__false_;
  
  public WebElement getElementOfRadio_button__payment_method___active__false_() {
    return radio_button__payment_method___active__false_;
  }
  
  public String getTextOfRadio_button__payment_method___active__false_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_237") && matcher.group(2).equals("radio_button__payment_method___active__false_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_235']")
  private WebElement label_tag_nil__Spree_dot_t__active__;
  
  public WebElement getElementOfLabel_tag_nil__Spree_dot_t__active__() {
    return label_tag_nil__Spree_dot_t__active__;
  }
  
  public String getTextOfLabel_tag_nil__Spree_dot_t__active__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_235") && matcher.group(2).equals("label_tag_nil__Spree_dot_t__active__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_238']")
  private WebElement label_tag_nil__Spree_dot_t__name__;
  
  public WebElement getElementOfLabel_tag_nil__Spree_dot_t__name__() {
    return label_tag_nil__Spree_dot_t__name__;
  }
  
  public String getTextOfLabel_tag_nil__Spree_dot_t__name__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_238") && matcher.group(2).equals("label_tag_nil__Spree_dot_t__name__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_238']")
  private WebElement text_field__payment_method___name___class_____fullwidth__;
  
  public WebElement getElementOfText_field__payment_method___name___class_____fullwidth__() {
    return text_field__payment_method___name___class_____fullwidth__;
  }
  
  public String getTextOfText_field__payment_method___name___class_____fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_238") && matcher.group(2).equals("text_field__payment_method___name___class_____fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_239']")
  private WebElement label_tag_nil__Spree_dot_t__description__;
  
  public WebElement getElementOfLabel_tag_nil__Spree_dot_t__description__() {
    return label_tag_nil__Spree_dot_t__description__;
  }
  
  public String getTextOfLabel_tag_nil__Spree_dot_t__description__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_239") && matcher.group(2).equals("label_tag_nil__Spree_dot_t__description__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_239']")
  private WebElement text_area__payment_method___description____cols____60___rows____6___class_____fullwidth___;
  
  public WebElement getElementOfText_area__payment_method___description____cols____60___rows____6___class_____fullwidth___() {
    return text_area__payment_method___description____cols____60___rows____6___class_____fullwidth___;
  }
  
  public String getTextOfText_area__payment_method___description____cols____60___rows____6___class_____fullwidth___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_239") && matcher.group(2).equals("text_area__payment_method___description____cols____60___rows____6___class_____fullwidth___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
