package test.backend.app.views.spree.admin.images;

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
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_54']")
  private WebElement f_dot_file_field__attachment_;
  
  public WebElement getElementOfF_dot_file_field__attachment_() {
    return f_dot_file_field__attachment_;
  }
  
  public String getTextOfF_dot_file_field__attachment_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_54") && matcher.group(2).equals("f_dot_file_field__attachment_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_54']")
  private WebElement f_dot_label_Spree_dot_t__filename__;
  
  public WebElement getElementOfF_dot_label_Spree_dot_t__filename__() {
    return f_dot_label_Spree_dot_t__filename__;
  }
  
  public String getTextOfF_dot_label_Spree_dot_t__filename__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_54") && matcher.group(2).equals("f_dot_label_Spree_dot_t__filename__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_55']")
  private WebElement f_dot_select__viewable_id___variants________class_____select2_fullwidth___;
  
  public WebElement getElementOfF_dot_select__viewable_id___variants________class_____select2_fullwidth___() {
    return f_dot_select__viewable_id___variants________class_____select2_fullwidth___;
  }
  
  public String getTextOfF_dot_select__viewable_id___variants________class_____select2_fullwidth___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_55") && matcher.group(2).equals("f_dot_select__viewable_id___variants________class_____select2_fullwidth___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_55']")
  private WebElement f_dot_label_Spree__Variant_dot_model_name_dot_human_;
  
  public WebElement getElementOfF_dot_label_Spree__Variant_dot_model_name_dot_human_() {
    return f_dot_label_Spree__Variant_dot_model_name_dot_human_;
  }
  
  public String getTextOfF_dot_label_Spree__Variant_dot_model_name_dot_human_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_55") && matcher.group(2).equals("f_dot_label_Spree__Variant_dot_model_name_dot_human_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_56']")
  private WebElement f_dot_label_Spree_dot_t__alt_text__;
  
  public WebElement getElementOfF_dot_label_Spree_dot_t__alt_text__() {
    return f_dot_label_Spree_dot_t__alt_text__;
  }
  
  public String getTextOfF_dot_label_Spree_dot_t__alt_text__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_56") && matcher.group(2).equals("f_dot_label_Spree_dot_t__alt_text__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_56']")
  private WebElement f_dot_text_area__alt___rows____4___class_____fullwidth__;
  
  public WebElement getElementOfF_dot_text_area__alt___rows____4___class_____fullwidth__() {
    return f_dot_text_area__alt___rows____4___class_____fullwidth__;
  }
  
  public String getTextOfF_dot_text_area__alt___rows____4___class_____fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_56") && matcher.group(2).equals("f_dot_text_area__alt___rows____4___class_____fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
