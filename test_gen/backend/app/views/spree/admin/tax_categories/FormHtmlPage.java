package test.backend.app.views.spree.admin.tax_categories;

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
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_688']")
  private WebElement f_dot_text_field__name___class_____fullwidth__;
  
  public WebElement getElementOfF_dot_text_field__name___class_____fullwidth__() {
    return f_dot_text_field__name___class_____fullwidth__;
  }
  
  public String getTextOfF_dot_text_field__name___class_____fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_688") && matcher.group(2).equals("f_dot_text_field__name___class_____fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_688']")
  private WebElement f_dot_label__name__Spree_dot_t__name__;
  
  public WebElement getElementOfF_dot_label__name__Spree_dot_t__name__() {
    return f_dot_label__name__Spree_dot_t__name__;
  }
  
  public String getTextOfF_dot_label__name__Spree_dot_t__name__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_688") && matcher.group(2).equals("f_dot_label__name__Spree_dot_t__name__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_688']")
  private WebElement f_dot_field_container__name_do_;
  
  public WebElement getElementOfF_dot_field_container__name_do_() {
    return f_dot_field_container__name_do_;
  }
  
  public String getTextOfF_dot_field_container__name_do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_688") && matcher.group(2).equals("f_dot_field_container__name_do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_689']")
  private WebElement f_dot_label__description__Spree_dot_t__description__;
  
  public WebElement getElementOfF_dot_label__description__Spree_dot_t__description__() {
    return f_dot_label__description__Spree_dot_t__description__;
  }
  
  public String getTextOfF_dot_label__description__Spree_dot_t__description__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_689") && matcher.group(2).equals("f_dot_label__description__Spree_dot_t__description__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_689']")
  private WebElement f_dot_text_field__description___class_____fullwidth__;
  
  public WebElement getElementOfF_dot_text_field__description___class_____fullwidth__() {
    return f_dot_text_field__description___class_____fullwidth__;
  }
  
  public String getTextOfF_dot_text_field__description___class_____fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_689") && matcher.group(2).equals("f_dot_text_field__description___class_____fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_689']")
  private WebElement f_dot_field_container__description_do_;
  
  public WebElement getElementOfF_dot_field_container__description_do_() {
    return f_dot_field_container__description_do_;
  }
  
  public String getTextOfF_dot_field_container__description_do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_689") && matcher.group(2).equals("f_dot_field_container__description_do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_691']")
  private WebElement f_dot_check_box__is_default_;
  
  public WebElement getElementOfF_dot_check_box__is_default_() {
    return f_dot_check_box__is_default_;
  }
  
  public String getTextOfF_dot_check_box__is_default_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_691") && matcher.group(2).equals("f_dot_check_box__is_default_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_691']")
  private WebElement Spree_dot_t__default__;
  
  public WebElement getElementOfSpree_dot_t__default__() {
    return Spree_dot_t__default__;
  }
  
  public String getTextOfSpree_dot_t__default__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_691") && matcher.group(2).equals("Spree_dot_t__default__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_690']")
  private WebElement f_dot_field_container__is_default___class______checkbox___do_;
  
  public WebElement getElementOfF_dot_field_container__is_default___class______checkbox___do_() {
    return f_dot_field_container__is_default___class______checkbox___do_;
  }
  
  public String getTextOfF_dot_field_container__is_default___class______checkbox___do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_690") && matcher.group(2).equals("f_dot_field_container__is_default___class______checkbox___do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
