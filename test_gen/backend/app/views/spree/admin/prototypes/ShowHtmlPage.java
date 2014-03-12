package test.backend.app.views.spree.admin.prototypes;

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

public class ShowHtmlPage extends AbstractPage {
  public ShowHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_440']")
  private WebElement Spree_dot_t__variants__;
  
  public WebElement getElementOfSpree_dot_t__variants__() {
    return Spree_dot_t__variants__;
  }
  
  public String getTextOfSpree_dot_t__variants__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_440") && matcher.group(2).equals("Spree_dot_t__variants__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_441']")
  private WebElement check_box_tag__option_types_____ot_dot_id___params__option_types_________dot_include__ot_dot_id_dot_to_s____id_____option_type___ot_dot_id_____class_____option_minus_type__;
  
  public WebElement getElementOfCheck_box_tag__option_types_____ot_dot_id___params__option_types_________dot_include__ot_dot_id_dot_to_s____id_____option_type___ot_dot_id_____class_____option_minus_type__() {
    return check_box_tag__option_types_____ot_dot_id___params__option_types_________dot_include__ot_dot_id_dot_to_s____id_____option_type___ot_dot_id_____class_____option_minus_type__;
  }
  
  public String getTextOfCheck_box_tag__option_types_____ot_dot_id___params__option_types_________dot_include__ot_dot_id_dot_to_s____id_____option_type___ot_dot_id_____class_____option_minus_type__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_441") && matcher.group(2).equals("check_box_tag__option_types_____ot_dot_id___params__option_types_________dot_include__ot_dot_id_dot_to_s____id_____option_type___ot_dot_id_____class_____option_minus_type__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_441']")
  private WebElement label_tag__option_type___ot_dot_id____ot_dot_presentation_;
  
  public WebElement getElementOfLabel_tag__option_type___ot_dot_id____ot_dot_presentation_() {
    return label_tag__option_type___ot_dot_id____ot_dot_presentation_;
  }
  
  public String getTextOfLabel_tag__option_type___ot_dot_id____ot_dot_presentation_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_441") && matcher.group(2).equals("label_tag__option_type___ot_dot_id____ot_dot_presentation_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_442']")
  private WebElement check_box_tag__product_option_values_hash___ot_dot_id________ov_dot_id__params__product______params__product___option_values_hash_________dot_values_dot_flatten_dot_include__ov_dot_id_dot_to_s____id_____option_value___ov_dot_id_____class_____option_minus_value__;
  
  public WebElement getElementOfCheck_box_tag__product_option_values_hash___ot_dot_id________ov_dot_id__params__product______params__product___option_values_hash_________dot_values_dot_flatten_dot_include__ov_dot_id_dot_to_s____id_____option_value___ov_dot_id_____class_____option_minus_value__() {
    return check_box_tag__product_option_values_hash___ot_dot_id________ov_dot_id__params__product______params__product___option_values_hash_________dot_values_dot_flatten_dot_include__ov_dot_id_dot_to_s____id_____option_value___ov_dot_id_____class_____option_minus_value__;
  }
  
  public String getTextOfCheck_box_tag__product_option_values_hash___ot_dot_id________ov_dot_id__params__product______params__product___option_values_hash_________dot_values_dot_flatten_dot_include__ov_dot_id_dot_to_s____id_____option_value___ov_dot_id_____class_____option_minus_value__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_442") && matcher.group(2).equals("check_box_tag__product_option_values_hash___ot_dot_id________ov_dot_id__params__product______params__product___option_values_hash_________dot_values_dot_flatten_dot_include__ov_dot_id_dot_to_s____id_____option_value___ov_dot_id_____class_____option_minus_value__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_442']")
  private WebElement label_tag__option_value___ov_dot_id____ov_dot_presentation_;
  
  public WebElement getElementOfLabel_tag__option_value___ov_dot_id____ov_dot_presentation_() {
    return label_tag__option_value___ov_dot_id____ov_dot_presentation_;
  }
  
  public String getTextOfLabel_tag__option_value___ov_dot_id____ov_dot_presentation_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_442") && matcher.group(2).equals("label_tag__option_value___ov_dot_id____ov_dot_presentation_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
