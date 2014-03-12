package test.backend.app.views.spree.admin.option_types;

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
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_109']")
  private WebElement f_dot_text_field__name___class_____fullwidth__;
  
  public WebElement getElementOfF_dot_text_field__name___class_____fullwidth__() {
    return f_dot_text_field__name___class_____fullwidth__;
  }
  
  public String getTextOfF_dot_text_field__name___class_____fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_109") && matcher.group(2).equals("f_dot_text_field__name___class_____fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_109']")
  private WebElement f_dot_error_message_on__name_;
  
  public WebElement getElementOfF_dot_error_message_on__name_() {
    return f_dot_error_message_on__name_;
  }
  
  public String getTextOfF_dot_error_message_on__name_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_109") && matcher.group(2).equals("f_dot_error_message_on__name_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_109']")
  private WebElement f_dot_label__name__Spree_dot_t__name__;
  
  public WebElement getElementOfF_dot_label__name__Spree_dot_t__name__() {
    return f_dot_label__name__Spree_dot_t__name__;
  }
  
  public String getTextOfF_dot_label__name__Spree_dot_t__name__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_109") && matcher.group(2).equals("f_dot_label__name__Spree_dot_t__name__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_109']")
  private WebElement f_dot_field_container__name_do_;
  
  public WebElement getElementOfF_dot_field_container__name_do_() {
    return f_dot_field_container__name_do_;
  }
  
  public String getTextOfF_dot_field_container__name_do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_109") && matcher.group(2).equals("f_dot_field_container__name_do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_110']")
  private WebElement f_dot_error_message_on__presentation_;
  
  public WebElement getElementOfF_dot_error_message_on__presentation_() {
    return f_dot_error_message_on__presentation_;
  }
  
  public String getTextOfF_dot_error_message_on__presentation_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_110") && matcher.group(2).equals("f_dot_error_message_on__presentation_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_110']")
  private WebElement f_dot_label__presentation__Spree_dot_t__presentation__;
  
  public WebElement getElementOfF_dot_label__presentation__Spree_dot_t__presentation__() {
    return f_dot_label__presentation__Spree_dot_t__presentation__;
  }
  
  public String getTextOfF_dot_label__presentation__Spree_dot_t__presentation__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_110") && matcher.group(2).equals("f_dot_label__presentation__Spree_dot_t__presentation__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_110']")
  private WebElement f_dot_field_container__presentation_do_;
  
  public WebElement getElementOfF_dot_field_container__presentation_do_() {
    return f_dot_field_container__presentation_do_;
  }
  
  public String getTextOfF_dot_field_container__presentation_do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_110") && matcher.group(2).equals("f_dot_field_container__presentation_do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_110']")
  private WebElement f_dot_text_field__presentation___class_____fullwidth__;
  
  public WebElement getElementOfF_dot_text_field__presentation___class_____fullwidth__() {
    return f_dot_text_field__presentation___class_____fullwidth__;
  }
  
  public String getTextOfF_dot_text_field__presentation___class_____fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_110") && matcher.group(2).equals("f_dot_text_field__presentation___class_____fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
