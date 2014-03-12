package test.api.app.views.spree.admin.users;

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

public class ApiFieldsHtmlPage extends AbstractPage {
  public ApiFieldsHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_0']")
  private WebElement Spree_dot_t__access____scope_____api___;
  
  public WebElement getElementOfSpree_dot_t__access____scope_____api___() {
    return Spree_dot_t__access____scope_____api___;
  }
  
  public String getTextOfSpree_dot_t__access____scope_____api___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_0") && matcher.group(2).equals("Spree_dot_t__access____scope_____api___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_1']")
  private WebElement label_tag_Spree_dot_t__key____scope_____api___;
  
  public WebElement getElementOfLabel_tag_Spree_dot_t__key____scope_____api___() {
    return label_tag_Spree_dot_t__key____scope_____api___;
  }
  
  public String getTextOfLabel_tag_Spree_dot_t__key____scope_____api___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_1") && matcher.group(2).equals("label_tag_Spree_dot_t__key____scope_____api___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_1']")
  private WebElement _user_dot_spree_api_key_;
  
  public WebElement getElementOf_user_dot_spree_api_key_() {
    return _user_dot_spree_api_key_;
  }
  
  public String getTextOf_user_dot_spree_api_key_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_1") && matcher.group(2).equals("_user_dot_spree_api_key_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_3']")
  private WebElement Spree_dot_t__or_;
  
  public WebElement getElementOfSpree_dot_t__or_() {
    return Spree_dot_t__or_;
  }
  
  public String getTextOfSpree_dot_t__or_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_3") && matcher.group(2).equals("Spree_dot_t__or_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_2']")
  private WebElement form_tag_spree_dot_generate_api_key_admin_user_path__user____method_____put_do_;
  
  public WebElement getElementOfForm_tag_spree_dot_generate_api_key_admin_user_path__user____method_____put_do_() {
    return form_tag_spree_dot_generate_api_key_admin_user_path__user____method_____put_do_;
  }
  
  public String getTextOfForm_tag_spree_dot_generate_api_key_admin_user_path__user____method_____put_do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_2") && matcher.group(2).equals("form_tag_spree_dot_generate_api_key_admin_user_path__user____method_____put_do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_2']")
  private WebElement button_Spree_dot_t__regenerate_key____scope_____api_____icon_minus_refresh__;
  
  public WebElement getElementOfButton_Spree_dot_t__regenerate_key____scope_____api_____icon_minus_refresh__() {
    return button_Spree_dot_t__regenerate_key____scope_____api_____icon_minus_refresh__;
  }
  
  public String getTextOfButton_Spree_dot_t__regenerate_key____scope_____api_____icon_minus_refresh__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_2") && matcher.group(2).equals("button_Spree_dot_t__regenerate_key____scope_____api_____icon_minus_refresh__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_2']")
  private WebElement form_tag_spree_dot_clear_api_key_admin_user_path__user____method_____put_do_;
  
  public WebElement getElementOfForm_tag_spree_dot_clear_api_key_admin_user_path__user____method_____put_do_() {
    return form_tag_spree_dot_clear_api_key_admin_user_path__user____method_____put_do_;
  }
  
  public String getTextOfForm_tag_spree_dot_clear_api_key_admin_user_path__user____method_____put_do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_2") && matcher.group(2).equals("form_tag_spree_dot_clear_api_key_admin_user_path__user____method_____put_do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_2']")
  private WebElement button_Spree_dot_t__clear_key____scope_____api_____icon_minus_trash__;
  
  public WebElement getElementOfButton_Spree_dot_t__clear_key____scope_____api_____icon_minus_trash__() {
    return button_Spree_dot_t__clear_key____scope_____api_____icon_minus_trash__;
  }
  
  public String getTextOfButton_Spree_dot_t__clear_key____scope_____api_____icon_minus_trash__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_2") && matcher.group(2).equals("button_Spree_dot_t__clear_key____scope_____api_____icon_minus_trash__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_4']")
  private WebElement Spree_dot_t__no_key____scope_____api___;
  
  public WebElement getElementOfSpree_dot_t__no_key____scope_____api___() {
    return Spree_dot_t__no_key____scope_____api___;
  }
  
  public String getTextOfSpree_dot_t__no_key____scope_____api___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_4") && matcher.group(2).equals("Spree_dot_t__no_key____scope_____api___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_5']")
  private WebElement form_tag_spree_dot_generate_api_key_admin_user_path__user____method_____put_do__PO2;
  
  public WebElement getElementOfForm_tag_spree_dot_generate_api_key_admin_user_path__user____method_____put_do__PO2() {
    return form_tag_spree_dot_generate_api_key_admin_user_path__user____method_____put_do__PO2;
  }
  
  public String getTextOfForm_tag_spree_dot_generate_api_key_admin_user_path__user____method_____put_do__PO2() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_5") && matcher.group(2).equals("form_tag_spree_dot_generate_api_key_admin_user_path__user____method_____put_do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_5']")
  private WebElement button_Spree_dot_t__generate_key____scope_____api_____icon_minus_key__;
  
  public WebElement getElementOfButton_Spree_dot_t__generate_key____scope_____api_____icon_minus_key__() {
    return button_Spree_dot_t__generate_key____scope_____api_____icon_minus_key__;
  }
  
  public String getTextOfButton_Spree_dot_t__generate_key____scope_____api_____icon_minus_key__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_5") && matcher.group(2).equals("button_Spree_dot_t__generate_key____scope_____api_____icon_minus_key__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
