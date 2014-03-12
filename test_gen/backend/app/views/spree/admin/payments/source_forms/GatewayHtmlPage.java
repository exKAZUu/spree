package test.backend.app.views.spree.admin.payments.source_forms;

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

public class GatewayHtmlPage extends AbstractPage {
  public GatewayHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_292']")
  private WebElement radio_button_tag__card__card_dot_id__card_____previous_cards_dot_first_;
  
  public WebElement getElementOfRadio_button_tag__card__card_dot_id__card_____previous_cards_dot_first_() {
    return radio_button_tag__card__card_dot_id__card_____previous_cards_dot_first_;
  }
  
  public String getTextOfRadio_button_tag__card__card_dot_id__card_____previous_cards_dot_first_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_292") && matcher.group(2).equals("radio_button_tag__card__card_dot_id__card_____previous_cards_dot_first_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_292']")
  private WebElement card_dot_display_number_;
  
  public WebElement getElementOfCard_dot_display_number_() {
    return card_dot_display_number_;
  }
  
  public String getTextOfCard_dot_display_number_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_292") && matcher.group(2).equals("card_dot_display_number_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_293']")
  private WebElement radio_button_tag__card___new____previous_cards_dot_none__;
  
  public WebElement getElementOfRadio_button_tag__card___new____previous_cards_dot_none__() {
    return radio_button_tag__card___new____previous_cards_dot_none__;
  }
  
  public String getTextOfRadio_button_tag__card___new____previous_cards_dot_none__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_293") && matcher.group(2).equals("radio_button_tag__card___new____previous_cards_dot_none__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_293']")
  private WebElement Spree_dot_t__use_new_cc__;
  
  public WebElement getElementOfSpree_dot_t__use_new_cc__() {
    return Spree_dot_t__use_new_cc__;
  }
  
  public String getTextOfSpree_dot_t__use_new_cc__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_293") && matcher.group(2).equals("Spree_dot_t__use_new_cc__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_294']")
  private WebElement image_tag__credit_cards_divide_credit_card_dot_gif____id_____credit_minus_card_minus_image__;
  
  public WebElement getElementOfImage_tag__credit_cards_divide_credit_card_dot_gif____id_____credit_minus_card_minus_image__() {
    return image_tag__credit_cards_divide_credit_card_dot_gif____id_____credit_minus_card_minus_image__;
  }
  
  public String getTextOfImage_tag__credit_cards_divide_credit_card_dot_gif____id_____credit_minus_card_minus_image__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_294") && matcher.group(2).equals("image_tag__credit_cards_divide_credit_card_dot_gif____id_____credit_minus_card_minus_image__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='looks_like']")
  private WebElement Spree_dot_t__card_type_is__;
  
  public WebElement getElementOfSpree_dot_t__card_type_is__() {
    return Spree_dot_t__card_type_is__;
  }
  
  public String getTextOfSpree_dot_t__card_type_is__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("looks_like") && matcher.group(2).equals("Spree_dot_t__card_type_is__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='unrecognized']")
  private WebElement Spree_dot_t__unrecognized_card_type__;
  
  public WebElement getElementOfSpree_dot_t__unrecognized_card_type__() {
    return Spree_dot_t__unrecognized_card_type__;
  }
  
  public String getTextOfSpree_dot_t__unrecognized_card_type__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("unrecognized") && matcher.group(2).equals("Spree_dot_t__unrecognized_card_type__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_295']")
  private WebElement label_tag__card_number___raw_Spree_dot_t__card_number___plus__content_tag__span_____multiply_____class_____required____;
  
  public WebElement getElementOfLabel_tag__card_number___raw_Spree_dot_t__card_number___plus__content_tag__span_____multiply_____class_____required____() {
    return label_tag__card_number___raw_Spree_dot_t__card_number___plus__content_tag__span_____multiply_____class_____required____;
  }
  
  public String getTextOfLabel_tag__card_number___raw_Spree_dot_t__card_number___plus__content_tag__span_____multiply_____class_____required____() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_295") && matcher.group(2).equals("label_tag__card_number___raw_Spree_dot_t__card_number___plus__content_tag__span_____multiply_____class_____required____")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_295']")
  private WebElement hidden_field_tag____param_prefix__cc_type__________id_____cc_type___;
  
  public WebElement getElementOfHidden_field_tag____param_prefix__cc_type__________id_____cc_type___() {
    return hidden_field_tag____param_prefix__cc_type__________id_____cc_type___;
  }
  
  public String getTextOfHidden_field_tag____param_prefix__cc_type__________id_____cc_type___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_295") && matcher.group(2).equals("hidden_field_tag____param_prefix__cc_type__________id_____cc_type___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_295']")
  private WebElement text_field_tag____param_prefix__number_________class_____required_fullwidth____id_____card_number____maxlength____19_;
  
  public WebElement getElementOfText_field_tag____param_prefix__number_________class_____required_fullwidth____id_____card_number____maxlength____19_() {
    return text_field_tag____param_prefix__number_________class_____required_fullwidth____id_____card_number____maxlength____19_;
  }
  
  public String getTextOfText_field_tag____param_prefix__number_________class_____required_fullwidth____id_____card_number____maxlength____19_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_295") && matcher.group(2).equals("text_field_tag____param_prefix__number_________class_____required_fullwidth____id_____card_number____maxlength____19_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_296']")
  private WebElement text_field_tag____param_prefix__name_________class_____required_fullwidth____id_____card_name____maxlength____19_;
  
  public WebElement getElementOfText_field_tag____param_prefix__name_________class_____required_fullwidth____id_____card_name____maxlength____19_() {
    return text_field_tag____param_prefix__name_________class_____required_fullwidth____id_____card_name____maxlength____19_;
  }
  
  public String getTextOfText_field_tag____param_prefix__name_________class_____required_fullwidth____id_____card_name____maxlength____19_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_296") && matcher.group(2).equals("text_field_tag____param_prefix__name_________class_____required_fullwidth____id_____card_name____maxlength____19_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_296']")
  private WebElement label_tag__card_name___raw_Spree_dot_t__name___plus__content_tag__span_____multiply_____class_____required____;
  
  public WebElement getElementOfLabel_tag__card_name___raw_Spree_dot_t__name___plus__content_tag__span_____multiply_____class_____required____() {
    return label_tag__card_name___raw_Spree_dot_t__name___plus__content_tag__span_____multiply_____class_____required____;
  }
  
  public String getTextOfLabel_tag__card_name___raw_Spree_dot_t__name___plus__content_tag__span_____multiply_____class_____required____() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_296") && matcher.group(2).equals("label_tag__card_name___raw_Spree_dot_t__name___plus__content_tag__span_____multiply_____class_____required____")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_297']")
  private WebElement label_tag__card_expiry___raw_Spree_dot_t__expiration___plus__content_tag__span_____multiply_____class_____required____;
  
  public WebElement getElementOfLabel_tag__card_expiry___raw_Spree_dot_t__expiration___plus__content_tag__span_____multiply_____class_____required____() {
    return label_tag__card_expiry___raw_Spree_dot_t__expiration___plus__content_tag__span_____multiply_____class_____required____;
  }
  
  public String getTextOfLabel_tag__card_expiry___raw_Spree_dot_t__expiration___plus__content_tag__span_____multiply_____class_____required____() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_297") && matcher.group(2).equals("label_tag__card_expiry___raw_Spree_dot_t__expiration___plus__content_tag__span_____multiply_____class_____required____")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_297']")
  private WebElement text_field_tag____param_prefix__expiry_________id_____card_expiry____class_____required____placeholder_____MM__divide__YY__;
  
  public WebElement getElementOfText_field_tag____param_prefix__expiry_________id_____card_expiry____class_____required____placeholder_____MM__divide__YY__() {
    return text_field_tag____param_prefix__expiry_________id_____card_expiry____class_____required____placeholder_____MM__divide__YY__;
  }
  
  public String getTextOfText_field_tag____param_prefix__expiry_________id_____card_expiry____class_____required____placeholder_____MM__divide__YY__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_297") && matcher.group(2).equals("text_field_tag____param_prefix__expiry_________id_____card_expiry____class_____required____placeholder_____MM__divide__YY__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='cvv_link']")
  private WebElement Spree_dot_t__what_is_this__;
  
  public WebElement getElementOfSpree_dot_t__what_is_this__() {
    return Spree_dot_t__what_is_this__;
  }
  
  public String getTextOfSpree_dot_t__what_is_this__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("cvv_link") && matcher.group(2).equals("Spree_dot_t__what_is_this__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='cvv_link']")
  private WebElement A_cvv_link;
  
  public WebElement getElementOfA_cvv_link() {
    return A_cvv_link;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_298']")
  private WebElement text_field_tag____param_prefix__verification_value_________class_____required_fullwidth____size____5___id_____card_code__;
  
  public WebElement getElementOfText_field_tag____param_prefix__verification_value_________class_____required_fullwidth____size____5___id_____card_code__() {
    return text_field_tag____param_prefix__verification_value_________class_____required_fullwidth____size____5___id_____card_code__;
  }
  
  public String getTextOfText_field_tag____param_prefix__verification_value_________class_____required_fullwidth____size____5___id_____card_code__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_298") && matcher.group(2).equals("text_field_tag____param_prefix__verification_value_________class_____required_fullwidth____size____5___id_____card_code__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_298']")
  private WebElement label_tag__card_code___raw_Spree_dot_t__card_code___plus__content_tag__span_____multiply_____class_____required____;
  
  public WebElement getElementOfLabel_tag__card_code___raw_Spree_dot_t__card_code___plus__content_tag__span_____multiply_____class_____required____() {
    return label_tag__card_code___raw_Spree_dot_t__card_code___plus__content_tag__span_____multiply_____class_____required____;
  }
  
  public String getTextOfLabel_tag__card_code___raw_Spree_dot_t__card_code___plus__content_tag__span_____multiply_____class_____required____() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_298") && matcher.group(2).equals("label_tag__card_code___raw_Spree_dot_t__card_code___plus__content_tag__span_____multiply_____class_____required____")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
