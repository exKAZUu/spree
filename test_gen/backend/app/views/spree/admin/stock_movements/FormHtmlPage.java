package test.backend.app.views.spree.admin.stock_movements;

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
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_632']")
  private WebElement f_dot_text_field__stock_item_id____class_____fullwidth__;
  
  public WebElement getElementOfF_dot_text_field__stock_item_id____class_____fullwidth__() {
    return f_dot_text_field__stock_item_id____class_____fullwidth__;
  }
  
  public String getTextOfF_dot_text_field__stock_item_id____class_____fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_632") && matcher.group(2).equals("f_dot_text_field__stock_item_id____class_____fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_632']")
  private WebElement f_dot_label__quantity__Spree_dot_t__quantity__;
  
  public WebElement getElementOfF_dot_label__quantity__Spree_dot_t__quantity__() {
    return f_dot_label__quantity__Spree_dot_t__quantity__;
  }
  
  public String getTextOfF_dot_label__quantity__Spree_dot_t__quantity__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_632") && matcher.group(2).equals("f_dot_label__quantity__Spree_dot_t__quantity__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_632']")
  private WebElement f_dot_label__stock_item_id__Spree_dot_t__stock_item_id__;
  
  public WebElement getElementOfF_dot_label__stock_item_id__Spree_dot_t__stock_item_id__() {
    return f_dot_label__stock_item_id__Spree_dot_t__stock_item_id__;
  }
  
  public String getTextOfF_dot_label__stock_item_id__Spree_dot_t__stock_item_id__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_632") && matcher.group(2).equals("f_dot_label__stock_item_id__Spree_dot_t__stock_item_id__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_632']")
  private WebElement f_dot_field_container__quantity_do_;
  
  public WebElement getElementOfF_dot_field_container__quantity_do_() {
    return f_dot_field_container__quantity_do_;
  }
  
  public String getTextOfF_dot_field_container__quantity_do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_632") && matcher.group(2).equals("f_dot_field_container__quantity_do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_632']")
  private WebElement f_dot_field_container__stock_item_id_do_;
  
  public WebElement getElementOfF_dot_field_container__stock_item_id_do_() {
    return f_dot_field_container__stock_item_id_do_;
  }
  
  public String getTextOfF_dot_field_container__stock_item_id_do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_632") && matcher.group(2).equals("f_dot_field_container__stock_item_id_do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_632']")
  private WebElement f_dot_text_field__quantity_;
  
  public WebElement getElementOfF_dot_text_field__quantity_() {
    return f_dot_text_field__quantity_;
  }
  
  public String getTextOfF_dot_text_field__quantity_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_632") && matcher.group(2).equals("f_dot_text_field__quantity_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
