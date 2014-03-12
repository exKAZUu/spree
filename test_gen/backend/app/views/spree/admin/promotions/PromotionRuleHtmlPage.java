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

public class PromotionRuleHtmlPage extends AbstractPage {
  public PromotionRuleHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_370']")
  private WebElement Spree_dot_t__promotion_rule_types_dot___type_name__dot_description___;
  
  public WebElement getElementOfSpree_dot_t__promotion_rule_types_dot___type_name__dot_description___() {
    return Spree_dot_t__promotion_rule_types_dot___type_name__dot_description___;
  }
  
  public String getTextOfSpree_dot_t__promotion_rule_types_dot___type_name__dot_description___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_370") && matcher.group(2).equals("Spree_dot_t__promotion_rule_types_dot___type_name__dot_description___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='<%= dom_id promotion_rule %>']")
  private WebElement render__partial_____spree_divide_admin_divide_promotions_divide_rules_divide___type_name_____locals_______promotion_rule____promotion_rule___param_prefix____param_prefix___;
  
  public WebElement getElementOfRender__partial_____spree_divide_admin_divide_promotions_divide_rules_divide___type_name_____locals_______promotion_rule____promotion_rule___param_prefix____param_prefix___() {
    return render__partial_____spree_divide_admin_divide_promotions_divide_rules_divide___type_name_____locals_______promotion_rule____promotion_rule___param_prefix____param_prefix___;
  }
  
  public String getTextOfRender__partial_____spree_divide_admin_divide_promotions_divide_rules_divide___type_name_____locals_______promotion_rule____promotion_rule___param_prefix____param_prefix___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("<%= dom_id promotion_rule %>") && matcher.group(2).equals("render__partial_____spree_divide_admin_divide_promotions_divide_rules_divide___type_name_____locals_______promotion_rule____promotion_rule___param_prefix____param_prefix___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='<%= dom_id promotion_rule %>']")
  private WebElement link_to_with_icon__icon_minus_trash_______spree_dot_admin_promotion_promotion_rule_path__promotion__promotion_rule____remote____true___method_____delete___class_____delete__;
  
  public WebElement getElementOfLink_to_with_icon__icon_minus_trash_______spree_dot_admin_promotion_promotion_rule_path__promotion__promotion_rule____remote____true___method_____delete___class_____delete__() {
    return link_to_with_icon__icon_minus_trash_______spree_dot_admin_promotion_promotion_rule_path__promotion__promotion_rule____remote____true___method_____delete___class_____delete__;
  }
  
  public String getTextOfLink_to_with_icon__icon_minus_trash_______spree_dot_admin_promotion_promotion_rule_path__promotion__promotion_rule____remote____true___method_____delete___class_____delete__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("<%= dom_id promotion_rule %>") && matcher.group(2).equals("link_to_with_icon__icon_minus_trash_______spree_dot_admin_promotion_promotion_rule_path__promotion__promotion_rule____remote____true___method_____delete___class_____delete__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='<%= dom_id promotion_rule %>']")
  private WebElement render__partial_____spree_divide_shared_divide_error_messages____locals_______target____promotion_rule___;
  
  public WebElement getElementOfRender__partial_____spree_divide_shared_divide_error_messages____locals_______target____promotion_rule___() {
    return render__partial_____spree_divide_shared_divide_error_messages____locals_______target____promotion_rule___;
  }
  
  public String getTextOfRender__partial_____spree_divide_shared_divide_error_messages____locals_______target____promotion_rule___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("<%= dom_id promotion_rule %>") && matcher.group(2).equals("render__partial_____spree_divide_shared_divide_error_messages____locals_______target____promotion_rule___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='<%= dom_id promotion_rule %>']")
  private WebElement hidden_field_tag____param_prefix__id____promotion_rule_dot_id_;
  
  public WebElement getElementOfHidden_field_tag____param_prefix__id____promotion_rule_dot_id_() {
    return hidden_field_tag____param_prefix__id____promotion_rule_dot_id_;
  }
  
  public String getTextOfHidden_field_tag____param_prefix__id____promotion_rule_dot_id_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("<%= dom_id promotion_rule %>") && matcher.group(2).equals("hidden_field_tag____param_prefix__id____promotion_rule_dot_id_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='<%= dom_id promotion_rule %>']")
  private WebElement dom_id_promotion_rule_;
  
  public WebElement getElementOfDom_id_promotion_rule_() {
    return dom_id_promotion_rule_;
  }
  
  public String getAttributeOfIdOnDom_id_promotion_rule_() {
    return dom_id_promotion_rule_.getAttribute("id");
  }
  
  public String getTextOfDom_id_promotion_rule_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("<%= dom_id promotion_rule %>") && matcher.group(2).equals("dom_id_promotion_rule_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
