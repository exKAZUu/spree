package test.backend.app.views.spree.admin.adjustments;

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
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_13']")
  private WebElement f_dot_label__amount__raw_Spree_dot_t__amount___plus__content_tag__span_____multiply_____class_____required____;
  
  public WebElement getElementOfF_dot_label__amount__raw_Spree_dot_t__amount___plus__content_tag__span_____multiply_____class_____required____() {
    return f_dot_label__amount__raw_Spree_dot_t__amount___plus__content_tag__span_____multiply_____class_____required____;
  }
  
  public String getTextOfF_dot_label__amount__raw_Spree_dot_t__amount___plus__content_tag__span_____multiply_____class_____required____() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_13") && matcher.group(2).equals("f_dot_label__amount__raw_Spree_dot_t__amount___plus__content_tag__span_____multiply_____class_____required____")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_13']")
  private WebElement f_dot_error_message_on__amount_;
  
  public WebElement getElementOfF_dot_error_message_on__amount_() {
    return f_dot_error_message_on__amount_;
  }
  
  public String getTextOfF_dot_error_message_on__amount_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_13") && matcher.group(2).equals("f_dot_error_message_on__amount_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_13']")
  private WebElement f_dot_field_container__amount_do_;
  
  public WebElement getElementOfF_dot_field_container__amount_do_() {
    return f_dot_field_container__amount_do_;
  }
  
  public String getTextOfF_dot_field_container__amount_do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_13") && matcher.group(2).equals("f_dot_field_container__amount_do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_13']")
  private WebElement text_field__adjustment___amount___class_____fullwidth__;
  
  public WebElement getElementOfText_field__adjustment___amount___class_____fullwidth__() {
    return text_field__adjustment___amount___class_____fullwidth__;
  }
  
  public String getTextOfText_field__adjustment___amount___class_____fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_13") && matcher.group(2).equals("text_field__adjustment___amount___class_____fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_14']")
  private WebElement f_dot_label__label__raw_Spree_dot_t__description___plus__content_tag__span_____multiply_____class_____required____;
  
  public WebElement getElementOfF_dot_label__label__raw_Spree_dot_t__description___plus__content_tag__span_____multiply_____class_____required____() {
    return f_dot_label__label__raw_Spree_dot_t__description___plus__content_tag__span_____multiply_____class_____required____;
  }
  
  public String getTextOfF_dot_label__label__raw_Spree_dot_t__description___plus__content_tag__span_____multiply_____class_____required____() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_14") && matcher.group(2).equals("f_dot_label__label__raw_Spree_dot_t__description___plus__content_tag__span_____multiply_____class_____required____")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_14']")
  private WebElement f_dot_error_message_on__label_;
  
  public WebElement getElementOfF_dot_error_message_on__label_() {
    return f_dot_error_message_on__label_;
  }
  
  public String getTextOfF_dot_error_message_on__label_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_14") && matcher.group(2).equals("f_dot_error_message_on__label_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_14']")
  private WebElement f_dot_field_container__label_do_;
  
  public WebElement getElementOfF_dot_field_container__label_do_() {
    return f_dot_field_container__label_do_;
  }
  
  public String getTextOfF_dot_field_container__label_do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_14") && matcher.group(2).equals("f_dot_field_container__label_do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_14']")
  private WebElement text_field__adjustment___label___class_____fullwidth__;
  
  public WebElement getElementOfText_field__adjustment___label___class_____fullwidth__() {
    return text_field__adjustment___label___class_____fullwidth__;
  }
  
  public String getTextOfText_field__adjustment___label___class_____fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_14") && matcher.group(2).equals("text_field__adjustment___label___class_____fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
