package test.backend.app.views.spree.admin.promotions.rules;

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

public class ItemTotalHtmlPage extends AbstractPage {
  public ItemTotalHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_405']")
  private WebElement select_tag____param_prefix__preferred_operator____options_for_select_Spree__Promotion__Rules__ItemTotal__OPERATORS_dot_map__o___Spree_dot_t__item_total_rule_dot_operators_dot___o____o____promotion_rule_dot_preferred_operator_____class_____select2_select_item_total_fullwidth___;
  
  public WebElement getElementOfSelect_tag____param_prefix__preferred_operator____options_for_select_Spree__Promotion__Rules__ItemTotal__OPERATORS_dot_map__o___Spree_dot_t__item_total_rule_dot_operators_dot___o____o____promotion_rule_dot_preferred_operator_____class_____select2_select_item_total_fullwidth___() {
    return select_tag____param_prefix__preferred_operator____options_for_select_Spree__Promotion__Rules__ItemTotal__OPERATORS_dot_map__o___Spree_dot_t__item_total_rule_dot_operators_dot___o____o____promotion_rule_dot_preferred_operator_____class_____select2_select_item_total_fullwidth___;
  }
  
  public String getTextOfSelect_tag____param_prefix__preferred_operator____options_for_select_Spree__Promotion__Rules__ItemTotal__OPERATORS_dot_map__o___Spree_dot_t__item_total_rule_dot_operators_dot___o____o____promotion_rule_dot_preferred_operator_____class_____select2_select_item_total_fullwidth___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_405") && matcher.group(2).equals("select_tag____param_prefix__preferred_operator____options_for_select_Spree__Promotion__Rules__ItemTotal__OPERATORS_dot_map__o___Spree_dot_t__item_total_rule_dot_operators_dot___o____o____promotion_rule_dot_preferred_operator_____class_____select2_select_item_total_fullwidth___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_406']")
  private WebElement text_field_tag____param_prefix__preferred_amount____promotion_rule_dot_preferred_amount___class_____fullwidth__;
  
  public WebElement getElementOfText_field_tag____param_prefix__preferred_amount____promotion_rule_dot_preferred_amount___class_____fullwidth__() {
    return text_field_tag____param_prefix__preferred_amount____promotion_rule_dot_preferred_amount___class_____fullwidth__;
  }
  
  public String getTextOfText_field_tag____param_prefix__preferred_amount____promotion_rule_dot_preferred_amount___class_____fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_406") && matcher.group(2).equals("text_field_tag____param_prefix__preferred_amount____promotion_rule_dot_preferred_amount___class_____fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
