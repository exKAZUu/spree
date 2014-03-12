package test.backend.app.views.spree.admin.tax_rates;

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
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_706']")
  private WebElement Spree_dot_t__general_settings__;
  
  public WebElement getElementOfSpree_dot_t__general_settings__() {
    return Spree_dot_t__general_settings__;
  }
  
  public String getTextOfSpree_dot_t__general_settings__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_706") && matcher.group(2).equals("Spree_dot_t__general_settings__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_707']")
  private WebElement f_dot_text_field__name___class_____fullwidth__;
  
  public WebElement getElementOfF_dot_text_field__name___class_____fullwidth__() {
    return f_dot_text_field__name___class_____fullwidth__;
  }
  
  public String getTextOfF_dot_text_field__name___class_____fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_707") && matcher.group(2).equals("f_dot_text_field__name___class_____fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_707']")
  private WebElement f_dot_label__name__Spree_dot_t__name__;
  
  public WebElement getElementOfF_dot_label__name__Spree_dot_t__name__() {
    return f_dot_label__name__Spree_dot_t__name__;
  }
  
  public String getTextOfF_dot_label__name__Spree_dot_t__name__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_707") && matcher.group(2).equals("f_dot_label__name__Spree_dot_t__name__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_709']")
  private WebElement Spree_dot_t__tax_rate_amount_explanation__;
  
  public WebElement getElementOfSpree_dot_t__tax_rate_amount_explanation__() {
    return Spree_dot_t__tax_rate_amount_explanation__;
  }
  
  public String getTextOfSpree_dot_t__tax_rate_amount_explanation__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_709") && matcher.group(2).equals("Spree_dot_t__tax_rate_amount_explanation__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_708']")
  private WebElement f_dot_label__amount__Spree_dot_t__rate__;
  
  public WebElement getElementOfF_dot_label__amount__Spree_dot_t__rate__() {
    return f_dot_label__amount__Spree_dot_t__rate__;
  }
  
  public String getTextOfF_dot_label__amount__Spree_dot_t__rate__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_708") && matcher.group(2).equals("f_dot_label__amount__Spree_dot_t__rate__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_708']")
  private WebElement f_dot_text_field__amount___class_____fullwidth__;
  
  public WebElement getElementOfF_dot_text_field__amount___class_____fullwidth__() {
    return f_dot_text_field__amount___class_____fullwidth__;
  }
  
  public String getTextOfF_dot_text_field__amount___class_____fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_708") && matcher.group(2).equals("f_dot_text_field__amount___class_____fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_710']")
  private WebElement f_dot_label__included_in_price__Spree_dot_t__included_in_price__;
  
  public WebElement getElementOfF_dot_label__included_in_price__Spree_dot_t__included_in_price__() {
    return f_dot_label__included_in_price__Spree_dot_t__included_in_price__;
  }
  
  public String getTextOfF_dot_label__included_in_price__Spree_dot_t__included_in_price__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_710") && matcher.group(2).equals("f_dot_label__included_in_price__Spree_dot_t__included_in_price__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_710']")
  private WebElement f_dot_check_box__included_in_price_;
  
  public WebElement getElementOfF_dot_check_box__included_in_price_() {
    return f_dot_check_box__included_in_price_;
  }
  
  public String getTextOfF_dot_check_box__included_in_price_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_710") && matcher.group(2).equals("f_dot_check_box__included_in_price_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_711']")
  private WebElement f_dot_label__zone__Spree_dot_t__zone__;
  
  public WebElement getElementOfF_dot_label__zone__Spree_dot_t__zone__() {
    return f_dot_label__zone__Spree_dot_t__zone__;
  }
  
  public String getTextOfF_dot_label__zone__Spree_dot_t__zone__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_711") && matcher.group(2).equals("f_dot_label__zone__Spree_dot_t__zone__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_711']")
  private WebElement f_dot_collection_select__zone_id___available_zones___id___name________class_____select2_fullwidth____;
  
  public WebElement getElementOfF_dot_collection_select__zone_id___available_zones___id___name________class_____select2_fullwidth____() {
    return f_dot_collection_select__zone_id___available_zones___id___name________class_____select2_fullwidth____;
  }
  
  public String getTextOfF_dot_collection_select__zone_id___available_zones___id___name________class_____select2_fullwidth____() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_711") && matcher.group(2).equals("f_dot_collection_select__zone_id___available_zones___id___name________class_____select2_fullwidth____")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_712']")
  private WebElement f_dot_collection_select__tax_category_id___available_categories__id___name________class_____select2_fullwidth____;
  
  public WebElement getElementOfF_dot_collection_select__tax_category_id___available_categories__id___name________class_____select2_fullwidth____() {
    return f_dot_collection_select__tax_category_id___available_categories__id___name________class_____select2_fullwidth____;
  }
  
  public String getTextOfF_dot_collection_select__tax_category_id___available_categories__id___name________class_____select2_fullwidth____() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_712") && matcher.group(2).equals("f_dot_collection_select__tax_category_id___available_categories__id___name________class_____select2_fullwidth____")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_712']")
  private WebElement f_dot_label__tax_category_id__Spree_dot_t__tax_category__;
  
  public WebElement getElementOfF_dot_label__tax_category_id__Spree_dot_t__tax_category__() {
    return f_dot_label__tax_category_id__Spree_dot_t__tax_category__;
  }
  
  public String getTextOfF_dot_label__tax_category_id__Spree_dot_t__tax_category__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_712") && matcher.group(2).equals("f_dot_label__tax_category_id__Spree_dot_t__tax_category__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_713']")
  private WebElement f_dot_check_box__show_rate_in_label_;
  
  public WebElement getElementOfF_dot_check_box__show_rate_in_label_() {
    return f_dot_check_box__show_rate_in_label_;
  }
  
  public String getTextOfF_dot_check_box__show_rate_in_label_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_713") && matcher.group(2).equals("f_dot_check_box__show_rate_in_label_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_713']")
  private WebElement f_dot_label__show_rate_in_label__Spree_dot_t__show_rate_in_label__;
  
  public WebElement getElementOfF_dot_label__show_rate_in_label__Spree_dot_t__show_rate_in_label__() {
    return f_dot_label__show_rate_in_label__Spree_dot_t__show_rate_in_label__;
  }
  
  public String getTextOfF_dot_label__show_rate_in_label__Spree_dot_t__show_rate_in_label__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_713") && matcher.group(2).equals("f_dot_label__show_rate_in_label__Spree_dot_t__show_rate_in_label__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_705']")
  private WebElement render__spree_divide_admin_divide_shared_divide_calculator_fields____f____f_;
  
  public WebElement getElementOfRender__spree_divide_admin_divide_shared_divide_calculator_fields____f____f_() {
    return render__spree_divide_admin_divide_shared_divide_calculator_fields____f____f_;
  }
  
  public String getTextOfRender__spree_divide_admin_divide_shared_divide_calculator_fields____f____f_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_705") && matcher.group(2).equals("render__spree_divide_admin_divide_shared_divide_calculator_fields____f____f_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
