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

public class ProductHtmlPage extends AbstractPage {
  public ProductHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_410']")
  private WebElement hidden_field_tag____param_prefix__product_ids_string____promotion_rule_dot_product_ids_dot_join________class_____product_picker_fullwidth__;
  
  public WebElement getElementOfHidden_field_tag____param_prefix__product_ids_string____promotion_rule_dot_product_ids_dot_join________class_____product_picker_fullwidth__() {
    return hidden_field_tag____param_prefix__product_ids_string____promotion_rule_dot_product_ids_dot_join________class_____product_picker_fullwidth__;
  }
  
  public String getTextOfHidden_field_tag____param_prefix__product_ids_string____promotion_rule_dot_product_ids_dot_join________class_____product_picker_fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_410") && matcher.group(2).equals("hidden_field_tag____param_prefix__product_ids_string____promotion_rule_dot_product_ids_dot_join________class_____product_picker_fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_410']")
  private WebElement label_tag____param_prefix__product_ids_string___Spree_dot_t__product_rule_dot_choose_products___;
  
  public WebElement getElementOfLabel_tag____param_prefix__product_ids_string___Spree_dot_t__product_rule_dot_choose_products___() {
    return label_tag____param_prefix__product_ids_string___Spree_dot_t__product_rule_dot_choose_products___;
  }
  
  public String getTextOfLabel_tag____param_prefix__product_ids_string___Spree_dot_t__product_rule_dot_choose_products___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_410") && matcher.group(2).equals("label_tag____param_prefix__product_ids_string___Spree_dot_t__product_rule_dot_choose_products___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_411']")
  private WebElement Spree_dot_t__product_rule_dot_label____select____select_tag____param_prefix__preferred_match_policy____options_for_select_Spree__Promotion__Rules__Product__MATCH_POLICIES_dot_map__s___Spree_dot_t__product_rule_dot_match___s____s_____promotion_rule_dot_preferred_match_policy_____class_____select_product_select2_____dot_html_safe_;
  
  public WebElement getElementOfSpree_dot_t__product_rule_dot_label____select____select_tag____param_prefix__preferred_match_policy____options_for_select_Spree__Promotion__Rules__Product__MATCH_POLICIES_dot_map__s___Spree_dot_t__product_rule_dot_match___s____s_____promotion_rule_dot_preferred_match_policy_____class_____select_product_select2_____dot_html_safe_() {
    return Spree_dot_t__product_rule_dot_label____select____select_tag____param_prefix__preferred_match_policy____options_for_select_Spree__Promotion__Rules__Product__MATCH_POLICIES_dot_map__s___Spree_dot_t__product_rule_dot_match___s____s_____promotion_rule_dot_preferred_match_policy_____class_____select_product_select2_____dot_html_safe_;
  }
  
  public String getTextOfSpree_dot_t__product_rule_dot_label____select____select_tag____param_prefix__preferred_match_policy____options_for_select_Spree__Promotion__Rules__Product__MATCH_POLICIES_dot_map__s___Spree_dot_t__product_rule_dot_match___s____s_____promotion_rule_dot_preferred_match_policy_____class_____select_product_select2_____dot_html_safe_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_411") && matcher.group(2).equals("Spree_dot_t__product_rule_dot_label____select____select_tag____param_prefix__preferred_match_policy____options_for_select_Spree__Promotion__Rules__Product__MATCH_POLICIES_dot_map__s___Spree_dot_t__product_rule_dot_match___s____s_____promotion_rule_dot_preferred_match_policy_____class_____select_product_select2_____dot_html_safe_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
