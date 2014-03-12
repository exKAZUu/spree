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

public class ActionsHtmlPage extends AbstractPage {
  public ActionsHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_361']")
  private WebElement Spree_dot_t__promotion_actions__;
  
  public WebElement getElementOfSpree_dot_t__promotion_actions__() {
    return Spree_dot_t__promotion_actions__;
  }
  
  public String getTextOfSpree_dot_t__promotion_actions__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_361") && matcher.group(2).equals("Spree_dot_t__promotion_actions__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_362']")
  private WebElement label_tag__action_type__Spree_dot_t__add_action_of_type_;
  
  public WebElement getElementOfLabel_tag__action_type__Spree_dot_t__add_action_of_type_() {
    return label_tag__action_type__Spree_dot_t__add_action_of_type_;
  }
  
  public String getTextOfLabel_tag__action_type__Spree_dot_t__add_action_of_type_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_362") && matcher.group(2).equals("label_tag__action_type__Spree_dot_t__add_action_of_type_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_362']")
  private WebElement select_tag__action_type___options___class_____select2_fullwidth__;
  
  public WebElement getElementOfSelect_tag__action_type___options___class_____select2_fullwidth__() {
    return select_tag__action_type___options___class_____select2_fullwidth__;
  }
  
  public String getTextOfSelect_tag__action_type___options___class_____select2_fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_362") && matcher.group(2).equals("select_tag__action_type___options___class_____select2_fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_363']")
  private WebElement button_Spree_dot_t__add____icon_minus_plus____class_____fullwidth__;
  
  public WebElement getElementOfButton_Spree_dot_t__add____icon_minus_plus____class_____fullwidth__() {
    return button_Spree_dot_t__add____icon_minus_plus____class_____fullwidth__;
  }
  
  public String getTextOfButton_Spree_dot_t__add____icon_minus_plus____class_____fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_363") && matcher.group(2).equals("button_Spree_dot_t__add____icon_minus_plus____class_____fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_364']")
  private WebElement Spree_dot_t__no_actions_added__;
  
  public WebElement getElementOfSpree_dot_t__no_actions_added__() {
    return Spree_dot_t__no_actions_added__;
  }
  
  public String getTextOfSpree_dot_t__no_actions_added__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_364") && matcher.group(2).equals("Spree_dot_t__no_actions_added__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='actions']")
  private WebElement render__partial_____promotion_action_____collection_____promotion_dot_actions_;
  
  public WebElement getElementOfRender__partial_____promotion_action_____collection_____promotion_dot_actions_() {
    return render__partial_____promotion_action_____collection_____promotion_dot_actions_;
  }
  
  public String getTextOfRender__partial_____promotion_action_____collection_____promotion_dot_actions_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("actions") && matcher.group(2).equals("render__partial_____promotion_action_____collection_____promotion_dot_actions_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_365']")
  private WebElement button_Spree_dot_t__actions_dot_update_____icon_minus_refresh__;
  
  public WebElement getElementOfButton_Spree_dot_t__actions_dot_update_____icon_minus_refresh__() {
    return button_Spree_dot_t__actions_dot_update_____icon_minus_refresh__;
  }
  
  public String getTextOfButton_Spree_dot_t__actions_dot_update_____icon_minus_refresh__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_365") && matcher.group(2).equals("button_Spree_dot_t__actions_dot_update_____icon_minus_refresh__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='action_fields']")
  private WebElement form_tag_spree_dot_admin_promotion_promotion_actions_path__promotion____remote____true___id_____new_promotion_action_form__do_;
  
  public WebElement getElementOfForm_tag_spree_dot_admin_promotion_promotion_actions_path__promotion____remote____true___id_____new_promotion_action_form__do_() {
    return form_tag_spree_dot_admin_promotion_promotion_actions_path__promotion____remote____true___id_____new_promotion_action_form__do_;
  }
  
  public String getTextOfForm_tag_spree_dot_admin_promotion_promotion_actions_path__promotion____remote____true___id_____new_promotion_action_form__do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("action_fields") && matcher.group(2).equals("form_tag_spree_dot_admin_promotion_promotion_actions_path__promotion____remote____true___id_____new_promotion_action_form__do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='action_fields']")
  private WebElement form_for__promotion___url____spree_dot_admin_promotion_path__promotion____method_____put_do__f__;
  
  public WebElement getElementOfForm_for__promotion___url____spree_dot_admin_promotion_path__promotion____method_____put_do__f__() {
    return form_for__promotion___url____spree_dot_admin_promotion_path__promotion____method_____put_do__f__;
  }
  
  public String getTextOfForm_for__promotion___url____spree_dot_admin_promotion_path__promotion____method_____put_do__f__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("action_fields") && matcher.group(2).equals("form_for__promotion___url____spree_dot_admin_promotion_path__promotion____method_____put_do__f__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
