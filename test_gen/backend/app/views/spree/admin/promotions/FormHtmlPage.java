package test.backend.app.views.spree.admin.promotions;

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
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_366']")
  private WebElement f_dot_label__code_;
  
  public WebElement getElementOfF_dot_label__code_() {
    return f_dot_label__code_;
  }
  
  public String getTextOfF_dot_label__code_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_366") && matcher.group(2).equals("f_dot_label__code_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_366']")
  private WebElement f_dot_text_field__name___class_____fullwidth__;
  
  public WebElement getElementOfF_dot_text_field__name___class_____fullwidth__() {
    return f_dot_text_field__name___class_____fullwidth__;
  }
  
  public String getTextOfF_dot_text_field__name___class_____fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_366") && matcher.group(2).equals("f_dot_text_field__name___class_____fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_366']")
  private WebElement f_dot_field_container__path_do_;
  
  public WebElement getElementOfF_dot_field_container__path_do_() {
    return f_dot_field_container__path_do_;
  }
  
  public String getTextOfF_dot_field_container__path_do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_366") && matcher.group(2).equals("f_dot_field_container__path_do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_366']")
  private WebElement f_dot_field_container__code_do_;
  
  public WebElement getElementOfF_dot_field_container__code_do_() {
    return f_dot_field_container__code_do_;
  }
  
  public String getTextOfF_dot_field_container__code_do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_366") && matcher.group(2).equals("f_dot_field_container__code_do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_366']")
  private WebElement f_dot_field_container__advertise_do_;
  
  public WebElement getElementOfF_dot_field_container__advertise_do_() {
    return f_dot_field_container__advertise_do_;
  }
  
  public String getTextOfF_dot_field_container__advertise_do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_366") && matcher.group(2).equals("f_dot_field_container__advertise_do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_366']")
  private WebElement f_dot_text_field__code___class_____fullwidth__;
  
  public WebElement getElementOfF_dot_text_field__code___class_____fullwidth__() {
    return f_dot_text_field__code___class_____fullwidth__;
  }
  
  public String getTextOfF_dot_text_field__code___class_____fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_366") && matcher.group(2).equals("f_dot_text_field__code___class_____fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_366']")
  private WebElement f_dot_label__name_;
  
  public WebElement getElementOfF_dot_label__name_() {
    return f_dot_label__name_;
  }
  
  public String getTextOfF_dot_label__name_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_366") && matcher.group(2).equals("f_dot_label__name_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_366']")
  private WebElement f_dot_label__path_;
  
  public WebElement getElementOfF_dot_label__path_() {
    return f_dot_label__path_;
  }
  
  public String getTextOfF_dot_label__path_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_366") && matcher.group(2).equals("f_dot_label__path_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_366']")
  private WebElement f_dot_text_field__path___class_____fullwidth__;
  
  public WebElement getElementOfF_dot_text_field__path___class_____fullwidth__() {
    return f_dot_text_field__path___class_____fullwidth__;
  }
  
  public String getTextOfF_dot_text_field__path___class_____fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_366") && matcher.group(2).equals("f_dot_text_field__path___class_____fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_366']")
  private WebElement f_dot_label__advertise_;
  
  public WebElement getElementOfF_dot_label__advertise_() {
    return f_dot_label__advertise_;
  }
  
  public String getTextOfF_dot_label__advertise_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_366") && matcher.group(2).equals("f_dot_label__advertise_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_366']")
  private WebElement f_dot_check_box__advertise_;
  
  public WebElement getElementOfF_dot_check_box__advertise_() {
    return f_dot_check_box__advertise_;
  }
  
  public String getTextOfF_dot_check_box__advertise_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_366") && matcher.group(2).equals("f_dot_check_box__advertise_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_366']")
  private WebElement f_dot_field_container__name_do_;
  
  public WebElement getElementOfF_dot_field_container__name_do_() {
    return f_dot_field_container__name_do_;
  }
  
  public String getTextOfF_dot_field_container__name_do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_366") && matcher.group(2).equals("f_dot_field_container__name_do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_367']")
  private WebElement f_dot_text_area__description___rows____7___class_____fullwidth__;
  
  public WebElement getElementOfF_dot_text_area__description___rows____7___class_____fullwidth__() {
    return f_dot_text_area__description___rows____7___class_____fullwidth__;
  }
  
  public String getTextOfF_dot_text_area__description___rows____7___class_____fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_367") && matcher.group(2).equals("f_dot_text_area__description___rows____7___class_____fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_367']")
  private WebElement f_dot_label__description_;
  
  public WebElement getElementOfF_dot_label__description_() {
    return f_dot_label__description_;
  }
  
  public String getTextOfF_dot_label__description_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_367") && matcher.group(2).equals("f_dot_label__description_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_367']")
  private WebElement f_dot_field_container__description_do_;
  
  public WebElement getElementOfF_dot_field_container__description_do_() {
    return f_dot_field_container__description_do_;
  }
  
  public String getTextOfF_dot_field_container__description_do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_367") && matcher.group(2).equals("f_dot_field_container__description_do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_368']")
  private WebElement Spree_dot_t__current_promotion_usage___count_____promotion_dot_credits_count__;
  
  public WebElement getElementOfSpree_dot_t__current_promotion_usage___count_____promotion_dot_credits_count__() {
    return Spree_dot_t__current_promotion_usage___count_____promotion_dot_credits_count__;
  }
  
  public String getTextOfSpree_dot_t__current_promotion_usage___count_____promotion_dot_credits_count__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_368") && matcher.group(2).equals("Spree_dot_t__current_promotion_usage___count_____promotion_dot_credits_count__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='starts_at_field']")
  private WebElement f_dot_text_field__starts_at___value____datepicker_field_value__promotion_dot_starts_at____class_____datepicker_datepicker_minus_from_fullwidth__;
  
  public WebElement getElementOfF_dot_text_field__starts_at___value____datepicker_field_value__promotion_dot_starts_at____class_____datepicker_datepicker_minus_from_fullwidth__() {
    return f_dot_text_field__starts_at___value____datepicker_field_value__promotion_dot_starts_at____class_____datepicker_datepicker_minus_from_fullwidth__;
  }
  
  public String getTextOfF_dot_text_field__starts_at___value____datepicker_field_value__promotion_dot_starts_at____class_____datepicker_datepicker_minus_from_fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("starts_at_field") && matcher.group(2).equals("f_dot_text_field__starts_at___value____datepicker_field_value__promotion_dot_starts_at____class_____datepicker_datepicker_minus_from_fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='starts_at_field']")
  private WebElement f_dot_label__starts_at_;
  
  public WebElement getElementOfF_dot_label__starts_at_() {
    return f_dot_label__starts_at_;
  }
  
  public String getTextOfF_dot_label__starts_at_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("starts_at_field") && matcher.group(2).equals("f_dot_label__starts_at_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='expires_at_field']")
  private WebElement f_dot_text_field__expires_at___value____datepicker_field_value__promotion_dot_expires_at____class_____datepicker_datepicker_minus_to_fullwidth__;
  
  public WebElement getElementOfF_dot_text_field__expires_at___value____datepicker_field_value__promotion_dot_expires_at____class_____datepicker_datepicker_minus_to_fullwidth__() {
    return f_dot_text_field__expires_at___value____datepicker_field_value__promotion_dot_expires_at____class_____datepicker_datepicker_minus_to_fullwidth__;
  }
  
  public String getTextOfF_dot_text_field__expires_at___value____datepicker_field_value__promotion_dot_expires_at____class_____datepicker_datepicker_minus_to_fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("expires_at_field") && matcher.group(2).equals("f_dot_text_field__expires_at___value____datepicker_field_value__promotion_dot_expires_at____class_____datepicker_datepicker_minus_to_fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='expires_at_field']")
  private WebElement f_dot_label__expires_at_;
  
  public WebElement getElementOfF_dot_label__expires_at_() {
    return f_dot_label__expires_at_;
  }
  
  public String getTextOfF_dot_label__expires_at_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("expires_at_field") && matcher.group(2).equals("f_dot_label__expires_at_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='expiry_fields']")
  private WebElement f_dot_number_field__usage_limit___min____0___class_____fullwidth__;
  
  public WebElement getElementOfF_dot_number_field__usage_limit___min____0___class_____fullwidth__() {
    return f_dot_number_field__usage_limit___min____0___class_____fullwidth__;
  }
  
  public String getTextOfF_dot_number_field__usage_limit___min____0___class_____fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("expiry_fields") && matcher.group(2).equals("f_dot_number_field__usage_limit___min____0___class_____fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='expiry_fields']")
  private WebElement f_dot_label__usage_limit_;
  
  public WebElement getElementOfF_dot_label__usage_limit_() {
    return f_dot_label__usage_limit_;
  }
  
  public String getTextOfF_dot_label__usage_limit_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("expiry_fields") && matcher.group(2).equals("f_dot_label__usage_limit_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='expiry_fields']")
  private WebElement f_dot_field_container__usage_limit_do_;
  
  public WebElement getElementOfF_dot_field_container__usage_limit_do_() {
    return f_dot_field_container__usage_limit_do_;
  }
  
  public String getTextOfF_dot_field_container__usage_limit_do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("expiry_fields") && matcher.group(2).equals("f_dot_field_container__usage_limit_do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
