package test.backend.app.views.spree.admin.promotions;

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

public class RulesHtmlPage extends AbstractPage {
  public RulesHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_371']")
  private WebElement Spree_dot_t__rules__;
  
  public WebElement getElementOfSpree_dot_t__rules__() {
    return Spree_dot_t__rules__;
  }
  
  public String getTextOfSpree_dot_t__rules__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_371") && matcher.group(2).equals("Spree_dot_t__rules__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_372']")
  private WebElement select_tag__promotion_rule_type____options_for_promotion_rule_types__promotion____class_____select2_fullwidth___;
  
  public WebElement getElementOfSelect_tag__promotion_rule_type____options_for_promotion_rule_types__promotion____class_____select2_fullwidth___() {
    return select_tag__promotion_rule_type____options_for_promotion_rule_types__promotion____class_____select2_fullwidth___;
  }
  
  public String getTextOfSelect_tag__promotion_rule_type____options_for_promotion_rule_types__promotion____class_____select2_fullwidth___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_372") && matcher.group(2).equals("select_tag__promotion_rule_type____options_for_promotion_rule_types__promotion____class_____select2_fullwidth___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_372']")
  private WebElement label_tag__promotion_rule_type__Spree_dot_t__add_rule_of_type__;
  
  public WebElement getElementOfLabel_tag__promotion_rule_type__Spree_dot_t__add_rule_of_type__() {
    return label_tag__promotion_rule_type__Spree_dot_t__add_rule_of_type__;
  }
  
  public String getTextOfLabel_tag__promotion_rule_type__Spree_dot_t__add_rule_of_type__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_372") && matcher.group(2).equals("label_tag__promotion_rule_type__Spree_dot_t__add_rule_of_type__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_373']")
  private WebElement button_Spree_dot_t__add____icon_minus_plus__;
  
  public WebElement getElementOfButton_Spree_dot_t__add____icon_minus_plus__() {
    return button_Spree_dot_t__add____icon_minus_plus__;
  }
  
  public String getTextOfButton_Spree_dot_t__add____icon_minus_plus__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_373") && matcher.group(2).equals("button_Spree_dot_t__add____icon_minus_plus__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_374']")
  private WebElement Spree_dot_t__promotion_form_dot_match_policies_dot___policy___;
  
  public WebElement getElementOfSpree_dot_t__promotion_form_dot_match_policies_dot___policy___() {
    return Spree_dot_t__promotion_form_dot_match_policies_dot___policy___;
  }
  
  public String getTextOfSpree_dot_t__promotion_form_dot_match_policies_dot___policy___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_374") && matcher.group(2).equals("Spree_dot_t__promotion_form_dot_match_policies_dot___policy___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_374']")
  private WebElement f_dot_radio_button__match_policy__policy_;
  
  public WebElement getElementOfF_dot_radio_button__match_policy__policy_() {
    return f_dot_radio_button__match_policy__policy_;
  }
  
  public String getTextOfF_dot_radio_button__match_policy__policy_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_374") && matcher.group(2).equals("f_dot_radio_button__match_policy__policy_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_375']")
  private WebElement Spree_dot_t__no_rules_added__;
  
  public WebElement getElementOfSpree_dot_t__no_rules_added__() {
    return Spree_dot_t__no_rules_added__;
  }
  
  public String getTextOfSpree_dot_t__no_rules_added__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_375") && matcher.group(2).equals("Spree_dot_t__no_rules_added__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='rules']")
  private WebElement render__partial_____promotion_rule____collection_____promotion_dot_rules___locals_______;
  
  public WebElement getElementOfRender__partial_____promotion_rule____collection_____promotion_dot_rules___locals_______() {
    return render__partial_____promotion_rule____collection_____promotion_dot_rules___locals_______;
  }
  
  public String getTextOfRender__partial_____promotion_rule____collection_____promotion_dot_rules___locals_______() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("rules") && matcher.group(2).equals("render__partial_____promotion_rule____collection_____promotion_dot_rules___locals_______")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_376']")
  private WebElement button_Spree_dot_t__actions_dot_update_____icon_minus_refresh__;
  
  public WebElement getElementOfButton_Spree_dot_t__actions_dot_update_____icon_minus_refresh__() {
    return button_Spree_dot_t__actions_dot_update_____icon_minus_refresh__;
  }
  
  public String getTextOfButton_Spree_dot_t__actions_dot_update_____icon_minus_refresh__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_376") && matcher.group(2).equals("button_Spree_dot_t__actions_dot_update_____icon_minus_refresh__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='rule_fields']")
  private WebElement form_tag_spree_dot_admin_promotion_promotion_rules_path__promotion____remote____true___id_____new_product_rule_form__do_;
  
  public WebElement getElementOfForm_tag_spree_dot_admin_promotion_promotion_rules_path__promotion____remote____true___id_____new_product_rule_form__do_() {
    return form_tag_spree_dot_admin_promotion_promotion_rules_path__promotion____remote____true___id_____new_product_rule_form__do_;
  }
  
  public String getTextOfForm_tag_spree_dot_admin_promotion_promotion_rules_path__promotion____remote____true___id_____new_product_rule_form__do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("rule_fields") && matcher.group(2).equals("form_tag_spree_dot_admin_promotion_promotion_rules_path__promotion____remote____true___id_____new_product_rule_form__do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='rule_fields']")
  private WebElement form_for__promotion___url____object_url___method_____put_do__f__;
  
  public WebElement getElementOfForm_for__promotion___url____object_url___method_____put_do__f__() {
    return form_for__promotion___url____object_url___method_____put_do__f__;
  }
  
  public String getTextOfForm_for__promotion___url____object_url___method_____put_do__f__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("rule_fields") && matcher.group(2).equals("form_for__promotion___url____object_url___method_____put_do__f__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
