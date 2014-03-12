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

public class PromotionActionHtmlPage extends AbstractPage {
  public PromotionActionHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_369']")
  private WebElement Spree_dot_t__promotion_action_types_dot___type_name__dot_description___;
  
  public WebElement getElementOfSpree_dot_t__promotion_action_types_dot___type_name__dot_description___() {
    return Spree_dot_t__promotion_action_types_dot___type_name__dot_description___;
  }
  
  public String getTextOfSpree_dot_t__promotion_action_types_dot___type_name__dot_description___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_369") && matcher.group(2).equals("Spree_dot_t__promotion_action_types_dot___type_name__dot_description___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='<%= dom_id promotion_action %>']")
  private WebElement link_to_with_icon__icon_minus_trash_______spree_dot_admin_promotion_promotion_action_path__promotion__promotion_action____remote____true___method_____delete___class_____delete__;
  
  public WebElement getElementOfLink_to_with_icon__icon_minus_trash_______spree_dot_admin_promotion_promotion_action_path__promotion__promotion_action____remote____true___method_____delete___class_____delete__() {
    return link_to_with_icon__icon_minus_trash_______spree_dot_admin_promotion_promotion_action_path__promotion__promotion_action____remote____true___method_____delete___class_____delete__;
  }
  
  public String getTextOfLink_to_with_icon__icon_minus_trash_______spree_dot_admin_promotion_promotion_action_path__promotion__promotion_action____remote____true___method_____delete___class_____delete__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("<%= dom_id promotion_action %>") && matcher.group(2).equals("link_to_with_icon__icon_minus_trash_______spree_dot_admin_promotion_promotion_action_path__promotion__promotion_action____remote____true___method_____delete___class_____delete__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='<%= dom_id promotion_action %>']")
  private WebElement render__partial_____spree_divide_shared_divide_error_messages____locals_______target____promotion_action___;
  
  public WebElement getElementOfRender__partial_____spree_divide_shared_divide_error_messages____locals_______target____promotion_action___() {
    return render__partial_____spree_divide_shared_divide_error_messages____locals_______target____promotion_action___;
  }
  
  public String getTextOfRender__partial_____spree_divide_shared_divide_error_messages____locals_______target____promotion_action___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("<%= dom_id promotion_action %>") && matcher.group(2).equals("render__partial_____spree_divide_shared_divide_error_messages____locals_______target____promotion_action___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='<%= dom_id promotion_action %>']")
  private WebElement hidden_field_tag____param_prefix__id____promotion_action_dot_id_;
  
  public WebElement getElementOfHidden_field_tag____param_prefix__id____promotion_action_dot_id_() {
    return hidden_field_tag____param_prefix__id____promotion_action_dot_id_;
  }
  
  public String getTextOfHidden_field_tag____param_prefix__id____promotion_action_dot_id_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("<%= dom_id promotion_action %>") && matcher.group(2).equals("hidden_field_tag____param_prefix__id____promotion_action_dot_id_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='<%= dom_id promotion_action %>']")
  private WebElement dom_id_promotion_action_;
  
  public WebElement getElementOfDom_id_promotion_action_() {
    return dom_id_promotion_action_;
  }
  
  public String getAttributeOfIdOnDom_id_promotion_action_() {
    return dom_id_promotion_action_.getAttribute("id");
  }
  
  public String getTextOfDom_id_promotion_action_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("<%= dom_id promotion_action %>") && matcher.group(2).equals("dom_id_promotion_action_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='<%= dom_id promotion_action %>']")
  private WebElement promotion_action_dot_type_dot_to_s_dot_demodulize_dot_underscore_;
  
  public WebElement getElementOfPromotion_action_dot_type_dot_to_s_dot_demodulize_dot_underscore_() {
    return promotion_action_dot_type_dot_to_s_dot_demodulize_dot_underscore_;
  }
  
  public String getAttributeOfClassOnPromotion_action_dot_type_dot_to_s_dot_demodulize_dot_underscore_() {
    return promotion_action_dot_type_dot_to_s_dot_demodulize_dot_underscore_.getAttribute("class");
  }
  
  public String getTextOfPromotion_action_dot_type_dot_to_s_dot_demodulize_dot_underscore_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("<%= dom_id promotion_action %>") && matcher.group(2).equals("promotion_action_dot_type_dot_to_s_dot_demodulize_dot_underscore_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
