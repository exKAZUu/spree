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

public class ReportOrderCriteriaHtmlPage extends AbstractPage {
  public ReportOrderCriteriaHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_539']")
  private WebElement s_dot_text_field__completed_at_lt___class_____datepicker_datepicker_minus_to____value____datepicker_field_value_params__q___completed_at_lt___;
  
  public WebElement getElementOfS_dot_text_field__completed_at_lt___class_____datepicker_datepicker_minus_to____value____datepicker_field_value_params__q___completed_at_lt___() {
    return s_dot_text_field__completed_at_lt___class_____datepicker_datepicker_minus_to____value____datepicker_field_value_params__q___completed_at_lt___;
  }
  
  public String getTextOfS_dot_text_field__completed_at_lt___class_____datepicker_datepicker_minus_to____value____datepicker_field_value_params__q___completed_at_lt___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_539") && matcher.group(2).equals("s_dot_text_field__completed_at_lt___class_____datepicker_datepicker_minus_to____value____datepicker_field_value_params__q___completed_at_lt___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_539']")
  private WebElement label_tag_nil__Spree_dot_t__start____class_____inline__;
  
  public WebElement getElementOfLabel_tag_nil__Spree_dot_t__start____class_____inline__() {
    return label_tag_nil__Spree_dot_t__start____class_____inline__;
  }
  
  public String getTextOfLabel_tag_nil__Spree_dot_t__start____class_____inline__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_539") && matcher.group(2).equals("label_tag_nil__Spree_dot_t__start____class_____inline__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_539']")
  private WebElement s_dot_text_field__completed_at_gt___class_____datepicker_datepicker_minus_from____value____datepicker_field_value_params__q___completed_at_gt___;
  
  public WebElement getElementOfS_dot_text_field__completed_at_gt___class_____datepicker_datepicker_minus_from____value____datepicker_field_value_params__q___completed_at_gt___() {
    return s_dot_text_field__completed_at_gt___class_____datepicker_datepicker_minus_from____value____datepicker_field_value_params__q___completed_at_gt___;
  }
  
  public String getTextOfS_dot_text_field__completed_at_gt___class_____datepicker_datepicker_minus_from____value____datepicker_field_value_params__q___completed_at_gt___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_539") && matcher.group(2).equals("s_dot_text_field__completed_at_gt___class_____datepicker_datepicker_minus_from____value____datepicker_field_value_params__q___completed_at_gt___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_539']")
  private WebElement label_tag_nil__Spree_dot_t__end____class_____inline__;
  
  public WebElement getElementOfLabel_tag_nil__Spree_dot_t__end____class_____inline__() {
    return label_tag_nil__Spree_dot_t__end____class_____inline__;
  }
  
  public String getTextOfLabel_tag_nil__Spree_dot_t__end____class_____inline__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_539") && matcher.group(2).equals("label_tag_nil__Spree_dot_t__end____class_____inline__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_540']")
  private WebElement button_Spree_dot_t__search____icon_minus_search___;
  
  public WebElement getElementOfButton_Spree_dot_t__search____icon_minus_search___() {
    return button_Spree_dot_t__search____icon_minus_search___;
  }
  
  public String getTextOfButton_Spree_dot_t__search____icon_minus_search___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_540") && matcher.group(2).equals("button_Spree_dot_t__search____icon_minus_search___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
