package test.backend.app.views.spree.admin.promotions.actions;

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

public class CreateItemAdjustmentsHtmlPage extends AbstractPage {
  public CreateItemAdjustmentsHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_381']")
  private WebElement Spree_dot_t__calculator_settings_warning__;
  
  public WebElement getElementOfSpree_dot_t__calculator_settings_warning__() {
    return Spree_dot_t__calculator_settings_warning__;
  }
  
  public String getTextOfSpree_dot_t__calculator_settings_warning__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_381") && matcher.group(2).equals("Spree_dot_t__calculator_settings_warning__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_380']")
  private WebElement label_tag_field_name__Spree_dot_t__calculator__;
  
  public WebElement getElementOfLabel_tag_field_name__Spree_dot_t__calculator__() {
    return label_tag_field_name__Spree_dot_t__calculator__;
  }
  
  public String getTextOfLabel_tag_field_name__Spree_dot_t__calculator__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_380") && matcher.group(2).equals("label_tag_field_name__Spree_dot_t__calculator__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_382']")
  private WebElement label_tag_field_name__Spree_dot_t_key_dot_to_s__;
  
  public WebElement getElementOfLabel_tag_field_name__Spree_dot_t_key_dot_to_s__() {
    return label_tag_field_name__Spree_dot_t_key_dot_to_s__;
  }
  
  public String getTextOfLabel_tag_field_name__Spree_dot_t_key_dot_to_s__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_382") && matcher.group(2).equals("label_tag_field_name__Spree_dot_t_key_dot_to_s__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_382']")
  private WebElement hidden_field_tag____param_prefix__calculator_attributes__id____promotion_action_dot_calculator_dot_id_;
  
  public WebElement getElementOfHidden_field_tag____param_prefix__calculator_attributes__id____promotion_action_dot_calculator_dot_id_() {
    return hidden_field_tag____param_prefix__calculator_attributes__id____promotion_action_dot_calculator_dot_id_;
  }
  
  public String getTextOfHidden_field_tag____param_prefix__calculator_attributes__id____promotion_action_dot_calculator_dot_id_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_382") && matcher.group(2).equals("hidden_field_tag____param_prefix__calculator_attributes__id____promotion_action_dot_calculator_dot_id_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
