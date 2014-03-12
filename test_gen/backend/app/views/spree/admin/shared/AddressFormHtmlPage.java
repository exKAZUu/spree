package test.backend.app.views.spree.admin.shared;

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

public class AddressFormHtmlPage extends AbstractPage {
  public AddressFormHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_489']")
  private WebElement f_dot_label__firstname__Spree_dot_t__first_name__;
  
  public WebElement getElementOfF_dot_label__firstname__Spree_dot_t__first_name__() {
    return f_dot_label__firstname__Spree_dot_t__first_name__;
  }
  
  public String getTextOfF_dot_label__firstname__Spree_dot_t__first_name__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_489") && matcher.group(2).equals("f_dot_label__firstname__Spree_dot_t__first_name__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_489']")
  private WebElement f_dot_text_field__firstname___class_____fullwidth__;
  
  public WebElement getElementOfF_dot_text_field__firstname___class_____fullwidth__() {
    return f_dot_text_field__firstname___class_____fullwidth__;
  }
  
  public String getTextOfF_dot_text_field__firstname___class_____fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_489") && matcher.group(2).equals("f_dot_text_field__firstname___class_____fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_490']")
  private WebElement f_dot_text_field__lastname___class_____fullwidth__;
  
  public WebElement getElementOfF_dot_text_field__lastname___class_____fullwidth__() {
    return f_dot_text_field__lastname___class_____fullwidth__;
  }
  
  public String getTextOfF_dot_text_field__lastname___class_____fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_490") && matcher.group(2).equals("f_dot_text_field__lastname___class_____fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_490']")
  private WebElement f_dot_label__lastname__Spree_dot_t__last_name__;
  
  public WebElement getElementOfF_dot_label__lastname__Spree_dot_t__last_name__() {
    return f_dot_label__lastname__Spree_dot_t__last_name__;
  }
  
  public String getTextOfF_dot_label__lastname__Spree_dot_t__last_name__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_490") && matcher.group(2).equals("f_dot_label__lastname__Spree_dot_t__last_name__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_491']")
  private WebElement f_dot_text_field__company___class_____fullwidth__;
  
  public WebElement getElementOfF_dot_text_field__company___class_____fullwidth__() {
    return f_dot_text_field__company___class_____fullwidth__;
  }
  
  public String getTextOfF_dot_text_field__company___class_____fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_491") && matcher.group(2).equals("f_dot_text_field__company___class_____fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_491']")
  private WebElement f_dot_label__company__Spree_dot_t__company__;
  
  public WebElement getElementOfF_dot_label__company__Spree_dot_t__company__() {
    return f_dot_label__company__Spree_dot_t__company__;
  }
  
  public String getTextOfF_dot_label__company__Spree_dot_t__company__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_491") && matcher.group(2).equals("f_dot_label__company__Spree_dot_t__company__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_492']")
  private WebElement f_dot_text_field__address1___class_____fullwidth__;
  
  public WebElement getElementOfF_dot_text_field__address1___class_____fullwidth__() {
    return f_dot_text_field__address1___class_____fullwidth__;
  }
  
  public String getTextOfF_dot_text_field__address1___class_____fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_492") && matcher.group(2).equals("f_dot_text_field__address1___class_____fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_492']")
  private WebElement f_dot_label__address1__Spree_dot_t__street_address__;
  
  public WebElement getElementOfF_dot_label__address1__Spree_dot_t__street_address__() {
    return f_dot_label__address1__Spree_dot_t__street_address__;
  }
  
  public String getTextOfF_dot_label__address1__Spree_dot_t__street_address__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_492") && matcher.group(2).equals("f_dot_label__address1__Spree_dot_t__street_address__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_493']")
  private WebElement f_dot_label__address2__Spree_dot_t__street_address_2__;
  
  public WebElement getElementOfF_dot_label__address2__Spree_dot_t__street_address_2__() {
    return f_dot_label__address2__Spree_dot_t__street_address_2__;
  }
  
  public String getTextOfF_dot_label__address2__Spree_dot_t__street_address_2__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_493") && matcher.group(2).equals("f_dot_label__address2__Spree_dot_t__street_address_2__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_493']")
  private WebElement f_dot_text_field__address2___class_____fullwidth__;
  
  public WebElement getElementOfF_dot_text_field__address2___class_____fullwidth__() {
    return f_dot_text_field__address2___class_____fullwidth__;
  }
  
  public String getTextOfF_dot_text_field__address2___class_____fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_493") && matcher.group(2).equals("f_dot_text_field__address2___class_____fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_494']")
  private WebElement f_dot_text_field__city___class_____fullwidth__;
  
  public WebElement getElementOfF_dot_text_field__city___class_____fullwidth__() {
    return f_dot_text_field__city___class_____fullwidth__;
  }
  
  public String getTextOfF_dot_text_field__city___class_____fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_494") && matcher.group(2).equals("f_dot_text_field__city___class_____fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_494']")
  private WebElement f_dot_label__city__Spree_dot_t__city__;
  
  public WebElement getElementOfF_dot_label__city__Spree_dot_t__city__() {
    return f_dot_label__city__Spree_dot_t__city__;
  }
  
  public String getTextOfF_dot_label__city__Spree_dot_t__city__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_494") && matcher.group(2).equals("f_dot_label__city__Spree_dot_t__city__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_495']")
  private WebElement f_dot_label__zipcode__Spree_dot_t__zip__;
  
  public WebElement getElementOfF_dot_label__zipcode__Spree_dot_t__zip__() {
    return f_dot_label__zipcode__Spree_dot_t__zip__;
  }
  
  public String getTextOfF_dot_label__zipcode__Spree_dot_t__zip__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_495") && matcher.group(2).equals("f_dot_label__zipcode__Spree_dot_t__zip__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_495']")
  private WebElement f_dot_text_field__zipcode___class_____fullwidth__;
  
  public WebElement getElementOfF_dot_text_field__zipcode___class_____fullwidth__() {
    return f_dot_text_field__zipcode___class_____fullwidth__;
  }
  
  public String getTextOfF_dot_text_field__zipcode___class_____fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_495") && matcher.group(2).equals("f_dot_text_field__zipcode___class_____fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='<%= s_or_b %>country']")
  private WebElement f_dot_collection_select__country_id__available_countries___id___name________class_____select2_fullwidth___;
  
  public WebElement getElementOfF_dot_collection_select__country_id__available_countries___id___name________class_____select2_fullwidth___() {
    return f_dot_collection_select__country_id__available_countries___id___name________class_____select2_fullwidth___;
  }
  
  public String getTextOfF_dot_collection_select__country_id__available_countries___id___name________class_____select2_fullwidth___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("<%= s_or_b %>country") && matcher.group(2).equals("f_dot_collection_select__country_id__available_countries___id___name________class_____select2_fullwidth___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='<%= s_or_b %>country']")
  private WebElement s_or_b_;
  
  public WebElement getElementOfS_or_b_() {
    return s_or_b_;
  }
  
  public String getAttributeOfIdOnS_or_b_() {
    return s_or_b_.getAttribute("id");
  }
  
  public String getTextOfS_or_b_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("<%= s_or_b %>country") && matcher.group(2).equals("s_or_b_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_496']")
  private WebElement f_dot_label__country_id__Spree_dot_t__country__;
  
  public WebElement getElementOfF_dot_label__country_id__Spree_dot_t__country__() {
    return f_dot_label__country_id__Spree_dot_t__country__;
  }
  
  public String getTextOfF_dot_label__country_id__Spree_dot_t__country__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_496") && matcher.group(2).equals("f_dot_label__country_id__Spree_dot_t__country__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='<%= s_or_b %>state']")
  private WebElement s_or_b__PO2;
  
  public WebElement getElementOfS_or_b__PO2() {
    return s_or_b__PO2;
  }
  
  public String getAttributeOfIdOnS_or_b__PO2() {
    return s_or_b__PO2.getAttribute("id");
  }
  
  public String getTextOfS_or_b__PO2() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("<%= s_or_b %>state") && matcher.group(2).equals("s_or_b_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='<%= s_or_b %>state']")
  private WebElement f_dot_collection_select__state_id__f_dot_object_dot_country_dot_states_dot_sort___id___name____include_blank____true_____class_____select2_fullwidth____style_____display____f_dot_object_dot_country_dot_states_dot_empty_____none_____block________disabled____f_dot_object_dot_country_dot_states_dot_empty___;
  
  public WebElement getElementOfF_dot_collection_select__state_id__f_dot_object_dot_country_dot_states_dot_sort___id___name____include_blank____true_____class_____select2_fullwidth____style_____display____f_dot_object_dot_country_dot_states_dot_empty_____none_____block________disabled____f_dot_object_dot_country_dot_states_dot_empty___() {
    return f_dot_collection_select__state_id__f_dot_object_dot_country_dot_states_dot_sort___id___name____include_blank____true_____class_____select2_fullwidth____style_____display____f_dot_object_dot_country_dot_states_dot_empty_____none_____block________disabled____f_dot_object_dot_country_dot_states_dot_empty___;
  }
  
  public String getTextOfF_dot_collection_select__state_id__f_dot_object_dot_country_dot_states_dot_sort___id___name____include_blank____true_____class_____select2_fullwidth____style_____display____f_dot_object_dot_country_dot_states_dot_empty_____none_____block________disabled____f_dot_object_dot_country_dot_states_dot_empty___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("<%= s_or_b %>state") && matcher.group(2).equals("f_dot_collection_select__state_id__f_dot_object_dot_country_dot_states_dot_sort___id___name____include_blank____true_____class_____select2_fullwidth____style_____display____f_dot_object_dot_country_dot_states_dot_empty_____none_____block________disabled____f_dot_object_dot_country_dot_states_dot_empty___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_497']")
  private WebElement f_dot_label__state_id__Spree_dot_t__state__;
  
  public WebElement getElementOfF_dot_label__state_id__Spree_dot_t__state__() {
    return f_dot_label__state_id__Spree_dot_t__state__;
  }
  
  public String getTextOfF_dot_label__state_id__Spree_dot_t__state__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_497") && matcher.group(2).equals("f_dot_label__state_id__Spree_dot_t__state__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_498']")
  private WebElement f_dot_phone_field__phone___class_____fullwidth__;
  
  public WebElement getElementOfF_dot_phone_field__phone___class_____fullwidth__() {
    return f_dot_phone_field__phone___class_____fullwidth__;
  }
  
  public String getTextOfF_dot_phone_field__phone___class_____fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_498") && matcher.group(2).equals("f_dot_phone_field__phone___class_____fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_498']")
  private WebElement f_dot_label__phone__Spree_dot_t__phone__;
  
  public WebElement getElementOfF_dot_label__phone__Spree_dot_t__phone__() {
    return f_dot_label__phone__Spree_dot_t__phone__;
  }
  
  public String getTextOfF_dot_label__phone__Spree_dot_t__phone__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_498") && matcher.group(2).equals("f_dot_label__phone__Spree_dot_t__phone__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='<%= type %>']")
  private WebElement type_;
  
  public WebElement getElementOfType_() {
    return type_;
  }
  
  public String getAttributeOfIdOnType_() {
    return type_.getAttribute("id");
  }
  
  public String getTextOfType_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("<%= type %>") && matcher.group(2).equals("type_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
