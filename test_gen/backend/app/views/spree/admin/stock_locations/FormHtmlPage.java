package test.backend.app.views.spree.admin.stock_locations;

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
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_602']")
  private WebElement f_dot_text_field__name___class_____fullwidth__;
  
  public WebElement getElementOfF_dot_text_field__name___class_____fullwidth__() {
    return f_dot_text_field__name___class_____fullwidth__;
  }
  
  public String getTextOfF_dot_text_field__name___class_____fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_602") && matcher.group(2).equals("f_dot_text_field__name___class_____fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_602']")
  private WebElement f_dot_label__name__Spree_dot_t__name__;
  
  public WebElement getElementOfF_dot_label__name__Spree_dot_t__name__() {
    return f_dot_label__name__Spree_dot_t__name__;
  }
  
  public String getTextOfF_dot_label__name__Spree_dot_t__name__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_602") && matcher.group(2).equals("f_dot_label__name__Spree_dot_t__name__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_602']")
  private WebElement f_dot_text_field__admin_name___class_____fullwidth____label____false_;
  
  public WebElement getElementOfF_dot_text_field__admin_name___class_____fullwidth____label____false_() {
    return f_dot_text_field__admin_name___class_____fullwidth____label____false_;
  }
  
  public String getTextOfF_dot_text_field__admin_name___class_____fullwidth____label____false_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_602") && matcher.group(2).equals("f_dot_text_field__admin_name___class_____fullwidth____label____false_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_602']")
  private WebElement f_dot_field_container__admin_name_do_;
  
  public WebElement getElementOfF_dot_field_container__admin_name_do_() {
    return f_dot_field_container__admin_name_do_;
  }
  
  public String getTextOfF_dot_field_container__admin_name_do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_602") && matcher.group(2).equals("f_dot_field_container__admin_name_do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_602']")
  private WebElement f_dot_label__admin_name__Spree_dot_t__internal_name__;
  
  public WebElement getElementOfF_dot_label__admin_name__Spree_dot_t__internal_name__() {
    return f_dot_label__admin_name__Spree_dot_t__internal_name__;
  }
  
  public String getTextOfF_dot_label__admin_name__Spree_dot_t__internal_name__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_602") && matcher.group(2).equals("f_dot_label__admin_name__Spree_dot_t__internal_name__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_602']")
  private WebElement f_dot_field_container__name_do_;
  
  public WebElement getElementOfF_dot_field_container__name_do_() {
    return f_dot_field_container__name_do_;
  }
  
  public String getTextOfF_dot_field_container__name_do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_602") && matcher.group(2).equals("f_dot_field_container__name_do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_604']")
  private WebElement Spree_dot_t__state__;
  
  public WebElement getElementOfSpree_dot_t__state__() {
    return Spree_dot_t__state__;
  }
  
  public String getTextOfSpree_dot_t__state__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_604") && matcher.group(2).equals("Spree_dot_t__state__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_605']")
  private WebElement f_dot_check_box__active_;
  
  public WebElement getElementOfF_dot_check_box__active_() {
    return f_dot_check_box__active_;
  }
  
  public String getTextOfF_dot_check_box__active_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_605") && matcher.group(2).equals("f_dot_check_box__active_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_605']")
  private WebElement f_dot_label__active__Spree_dot_t__active__;
  
  public WebElement getElementOfF_dot_label__active__Spree_dot_t__active__() {
    return f_dot_label__active__Spree_dot_t__active__;
  }
  
  public String getTextOfF_dot_label__active__Spree_dot_t__active__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_605") && matcher.group(2).equals("f_dot_label__active__Spree_dot_t__active__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_606']")
  private WebElement f_dot_check_box__backorderable_default_;
  
  public WebElement getElementOfF_dot_check_box__backorderable_default_() {
    return f_dot_check_box__backorderable_default_;
  }
  
  public String getTextOfF_dot_check_box__backorderable_default_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_606") && matcher.group(2).equals("f_dot_check_box__backorderable_default_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_606']")
  private WebElement f_dot_label__active__Spree_dot_t__backorderable_default__;
  
  public WebElement getElementOfF_dot_label__active__Spree_dot_t__backorderable_default__() {
    return f_dot_label__active__Spree_dot_t__backorderable_default__;
  }
  
  public String getTextOfF_dot_label__active__Spree_dot_t__backorderable_default__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_606") && matcher.group(2).equals("f_dot_label__active__Spree_dot_t__backorderable_default__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_607']")
  private WebElement f_dot_label__active__Spree_dot_t__propagate_all_variants__;
  
  public WebElement getElementOfF_dot_label__active__Spree_dot_t__propagate_all_variants__() {
    return f_dot_label__active__Spree_dot_t__propagate_all_variants__;
  }
  
  public String getTextOfF_dot_label__active__Spree_dot_t__propagate_all_variants__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_607") && matcher.group(2).equals("f_dot_label__active__Spree_dot_t__propagate_all_variants__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_607']")
  private WebElement f_dot_check_box__propagate_all_variants_;
  
  public WebElement getElementOfF_dot_check_box__propagate_all_variants_() {
    return f_dot_check_box__propagate_all_variants_;
  }
  
  public String getTextOfF_dot_check_box__propagate_all_variants_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_607") && matcher.group(2).equals("f_dot_check_box__propagate_all_variants_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_603']")
  private WebElement f_dot_field_container__active_do_;
  
  public WebElement getElementOfF_dot_field_container__active_do_() {
    return f_dot_field_container__active_do_;
  }
  
  public String getTextOfF_dot_field_container__active_do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_603") && matcher.group(2).equals("f_dot_field_container__active_do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_608']")
  private WebElement f_dot_text_field__address1___class_____fullwidth__;
  
  public WebElement getElementOfF_dot_text_field__address1___class_____fullwidth__() {
    return f_dot_text_field__address1___class_____fullwidth__;
  }
  
  public String getTextOfF_dot_text_field__address1___class_____fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_608") && matcher.group(2).equals("f_dot_text_field__address1___class_____fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_608']")
  private WebElement f_dot_label__address1__Spree_dot_t__street_address__;
  
  public WebElement getElementOfF_dot_label__address1__Spree_dot_t__street_address__() {
    return f_dot_label__address1__Spree_dot_t__street_address__;
  }
  
  public String getTextOfF_dot_label__address1__Spree_dot_t__street_address__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_608") && matcher.group(2).equals("f_dot_label__address1__Spree_dot_t__street_address__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_609']")
  private WebElement f_dot_label__address2__Spree_dot_t__street_address_2__;
  
  public WebElement getElementOfF_dot_label__address2__Spree_dot_t__street_address_2__() {
    return f_dot_label__address2__Spree_dot_t__street_address_2__;
  }
  
  public String getTextOfF_dot_label__address2__Spree_dot_t__street_address_2__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_609") && matcher.group(2).equals("f_dot_label__address2__Spree_dot_t__street_address_2__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_609']")
  private WebElement f_dot_text_field__address2___class_____fullwidth__;
  
  public WebElement getElementOfF_dot_text_field__address2___class_____fullwidth__() {
    return f_dot_text_field__address2___class_____fullwidth__;
  }
  
  public String getTextOfF_dot_text_field__address2___class_____fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_609") && matcher.group(2).equals("f_dot_text_field__address2___class_____fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_610']")
  private WebElement f_dot_text_field__city___class_____fullwidth__;
  
  public WebElement getElementOfF_dot_text_field__city___class_____fullwidth__() {
    return f_dot_text_field__city___class_____fullwidth__;
  }
  
  public String getTextOfF_dot_text_field__city___class_____fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_610") && matcher.group(2).equals("f_dot_text_field__city___class_____fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_610']")
  private WebElement f_dot_label__city__Spree_dot_t__city__;
  
  public WebElement getElementOfF_dot_label__city__Spree_dot_t__city__() {
    return f_dot_label__city__Spree_dot_t__city__;
  }
  
  public String getTextOfF_dot_label__city__Spree_dot_t__city__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_610") && matcher.group(2).equals("f_dot_label__city__Spree_dot_t__city__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_611']")
  private WebElement f_dot_label__zipcode__Spree_dot_t__zip__;
  
  public WebElement getElementOfF_dot_label__zipcode__Spree_dot_t__zip__() {
    return f_dot_label__zipcode__Spree_dot_t__zip__;
  }
  
  public String getTextOfF_dot_label__zipcode__Spree_dot_t__zip__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_611") && matcher.group(2).equals("f_dot_label__zipcode__Spree_dot_t__zip__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_611']")
  private WebElement f_dot_text_field__zipcode___class_____fullwidth__;
  
  public WebElement getElementOfF_dot_text_field__zipcode___class_____fullwidth__() {
    return f_dot_text_field__zipcode___class_____fullwidth__;
  }
  
  public String getTextOfF_dot_text_field__zipcode___class_____fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_611") && matcher.group(2).equals("f_dot_text_field__zipcode___class_____fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='country']")
  private WebElement f_dot_collection_select__country_id__available_countries___id___name________class_____select2_fullwidth___;
  
  public WebElement getElementOfF_dot_collection_select__country_id__available_countries___id___name________class_____select2_fullwidth___() {
    return f_dot_collection_select__country_id__available_countries___id___name________class_____select2_fullwidth___;
  }
  
  public String getTextOfF_dot_collection_select__country_id__available_countries___id___name________class_____select2_fullwidth___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("country") && matcher.group(2).equals("f_dot_collection_select__country_id__available_countries___id___name________class_____select2_fullwidth___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_612']")
  private WebElement f_dot_label__country_id__Spree_dot_t__country__;
  
  public WebElement getElementOfF_dot_label__country_id__Spree_dot_t__country__() {
    return f_dot_label__country_id__Spree_dot_t__country__;
  }
  
  public String getTextOfF_dot_label__country_id__Spree_dot_t__country__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_612") && matcher.group(2).equals("f_dot_label__country_id__Spree_dot_t__country__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='state']")
  private WebElement f_dot_collection_select__state_id__f_dot_object_dot_country_dot_states_dot_sort___id___name____include_blank____true_____class_____select2_fullwidth____style_____display____f_dot_object_dot_country_dot_states_dot_empty_____none_____block________disabled____f_dot_object_dot_country_dot_states_dot_empty___;
  
  public WebElement getElementOfF_dot_collection_select__state_id__f_dot_object_dot_country_dot_states_dot_sort___id___name____include_blank____true_____class_____select2_fullwidth____style_____display____f_dot_object_dot_country_dot_states_dot_empty_____none_____block________disabled____f_dot_object_dot_country_dot_states_dot_empty___() {
    return f_dot_collection_select__state_id__f_dot_object_dot_country_dot_states_dot_sort___id___name____include_blank____true_____class_____select2_fullwidth____style_____display____f_dot_object_dot_country_dot_states_dot_empty_____none_____block________disabled____f_dot_object_dot_country_dot_states_dot_empty___;
  }
  
  public String getTextOfF_dot_collection_select__state_id__f_dot_object_dot_country_dot_states_dot_sort___id___name____include_blank____true_____class_____select2_fullwidth____style_____display____f_dot_object_dot_country_dot_states_dot_empty_____none_____block________disabled____f_dot_object_dot_country_dot_states_dot_empty___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("state") && matcher.group(2).equals("f_dot_collection_select__state_id__f_dot_object_dot_country_dot_states_dot_sort___id___name____include_blank____true_____class_____select2_fullwidth____style_____display____f_dot_object_dot_country_dot_states_dot_empty_____none_____block________disabled____f_dot_object_dot_country_dot_states_dot_empty___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='state']")
  private WebElement f_dot_text_field__state_name___style_____display____f_dot_object_dot_country_dot_states_dot_empty_____block_____none________disabled_____f_dot_object_dot_country_dot_states_dot_empty____class_____fullwidth_state_name__;
  
  public WebElement getElementOfF_dot_text_field__state_name___style_____display____f_dot_object_dot_country_dot_states_dot_empty_____block_____none________disabled_____f_dot_object_dot_country_dot_states_dot_empty____class_____fullwidth_state_name__() {
    return f_dot_text_field__state_name___style_____display____f_dot_object_dot_country_dot_states_dot_empty_____block_____none________disabled_____f_dot_object_dot_country_dot_states_dot_empty____class_____fullwidth_state_name__;
  }
  
  public String getTextOfF_dot_text_field__state_name___style_____display____f_dot_object_dot_country_dot_states_dot_empty_____block_____none________disabled_____f_dot_object_dot_country_dot_states_dot_empty____class_____fullwidth_state_name__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("state") && matcher.group(2).equals("f_dot_text_field__state_name___style_____display____f_dot_object_dot_country_dot_states_dot_empty_____block_____none________disabled_____f_dot_object_dot_country_dot_states_dot_empty____class_____fullwidth_state_name__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_613']")
  private WebElement f_dot_label__state_id__Spree_dot_t__state__;
  
  public WebElement getElementOfF_dot_label__state_id__Spree_dot_t__state__() {
    return f_dot_label__state_id__Spree_dot_t__state__;
  }
  
  public String getTextOfF_dot_label__state_id__Spree_dot_t__state__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_613") && matcher.group(2).equals("f_dot_label__state_id__Spree_dot_t__state__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_614']")
  private WebElement f_dot_phone_field__phone___class_____fullwidth__;
  
  public WebElement getElementOfF_dot_phone_field__phone___class_____fullwidth__() {
    return f_dot_phone_field__phone___class_____fullwidth__;
  }
  
  public String getTextOfF_dot_phone_field__phone___class_____fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_614") && matcher.group(2).equals("f_dot_phone_field__phone___class_____fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_614']")
  private WebElement f_dot_label__phone__Spree_dot_t__phone__;
  
  public WebElement getElementOfF_dot_label__phone__Spree_dot_t__phone__() {
    return f_dot_label__phone__Spree_dot_t__phone__;
  }
  
  public String getTextOfF_dot_label__phone__Spree_dot_t__phone__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_614") && matcher.group(2).equals("f_dot_label__phone__Spree_dot_t__phone__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
