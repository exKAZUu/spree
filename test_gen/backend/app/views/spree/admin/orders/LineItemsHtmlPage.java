package test.backend.app.views.spree.admin.orders;

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

public class LineItemsHtmlPage extends AbstractPage {
  public LineItemsHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_137']")
  private WebElement Spree_dot_t__name__;
  
  public WebElement getElementOfSpree_dot_t__name__() {
    return Spree_dot_t__name__;
  }
  
  public String getTextOfSpree_dot_t__name__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_137") && matcher.group(2).equals("Spree_dot_t__name__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_138']")
  private WebElement Spree_dot_t__price__;
  
  public WebElement getElementOfSpree_dot_t__price__() {
    return Spree_dot_t__price__;
  }
  
  public String getTextOfSpree_dot_t__price__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_138") && matcher.group(2).equals("Spree_dot_t__price__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_139']")
  private WebElement Spree_dot_t__quantity__;
  
  public WebElement getElementOfSpree_dot_t__quantity__() {
    return Spree_dot_t__quantity__;
  }
  
  public String getTextOfSpree_dot_t__quantity__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_139") && matcher.group(2).equals("Spree_dot_t__quantity__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_140']")
  private WebElement Spree_dot_t__total_price__;
  
  public WebElement getElementOfSpree_dot_t__total_price__() {
    return Spree_dot_t__total_price__;
  }
  
  public String getTextOfSpree_dot_t__total_price__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_140") && matcher.group(2).equals("Spree_dot_t__total_price__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_141']")
  private WebElement mini_image_item_dot_variant__;
  
  public WebElement getElementOfMini_image_item_dot_variant__() {
    return mini_image_item_dot_variant__;
  }
  
  public String getTextOfMini_image_item_dot_variant__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_141") && matcher.group(2).equals("mini_image_item_dot_variant__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_142']")
  private WebElement item_dot_variant_dot_product_dot_name_;
  
  public WebElement getElementOfItem_dot_variant_dot_product_dot_name_() {
    return item_dot_variant_dot_product_dot_name_;
  }
  
  public String getTextOfItem_dot_variant_dot_product_dot_name_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_142") && matcher.group(2).equals("item_dot_variant_dot_product_dot_name_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_142']")
  private WebElement _____plus__variant_options_item_dot_variant___plus______unless_item_dot_variant_dot_option_values_dot_empty__;
  
  public WebElement getElementOf_____plus__variant_options_item_dot_variant___plus______unless_item_dot_variant_dot_option_values_dot_empty__() {
    return _____plus__variant_options_item_dot_variant___plus______unless_item_dot_variant_dot_option_values_dot_empty__;
  }
  
  public String getTextOf_____plus__variant_options_item_dot_variant___plus______unless_item_dot_variant_dot_option_values_dot_empty__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_142") && matcher.group(2).equals("_____plus__variant_options_item_dot_variant___plus______unless_item_dot_variant_dot_option_values_dot_empty__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_143']")
  private WebElement item_dot_single_money_dot_to_html_;
  
  public WebElement getElementOfItem_dot_single_money_dot_to_html_() {
    return item_dot_single_money_dot_to_html_;
  }
  
  public String getTextOfItem_dot_single_money_dot_to_html_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_143") && matcher.group(2).equals("item_dot_single_money_dot_to_html_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_144']")
  private WebElement item_dot_quantity_;
  
  public WebElement getElementOfItem_dot_quantity_() {
    return item_dot_quantity_;
  }
  
  public String getTextOfItem_dot_quantity_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_144") && matcher.group(2).equals("item_dot_quantity_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_145']")
  private WebElement number_field_tag__quantity__item_dot_quantity___min____0___class_____line_item_quantity____size____5_;
  
  public WebElement getElementOfNumber_field_tag__quantity__item_dot_quantity___min____0___class_____line_item_quantity____size____5_() {
    return number_field_tag__quantity__item_dot_quantity___min____0___class_____line_item_quantity____size____5_;
  }
  
  public String getTextOfNumber_field_tag__quantity__item_dot_quantity___min____0___class_____line_item_quantity____size____5_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_145") && matcher.group(2).equals("number_field_tag__quantity__item_dot_quantity___min____0___class_____line_item_quantity____size____5_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_146']")
  private WebElement line_item_shipment_price_item__item_dot_quantity__;
  
  public WebElement getElementOfLine_item_shipment_price_item__item_dot_quantity__() {
    return line_item_shipment_price_item__item_dot_quantity__;
  }
  
  public String getTextOfLine_item_shipment_price_item__item_dot_quantity__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_146") && matcher.group(2).equals("line_item_shipment_price_item__item_dot_quantity__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_147']")
  private WebElement link_to___________class_____cancel_minus_line_minus_item_icon_link_icon_minus_cancel_no_minus_text_with_minus_tip____data______action_____cancel_____title____Spree_dot_t__actions_dot_cancel_____style_____display__none__;
  
  public WebElement getElementOfLink_to___________class_____cancel_minus_line_minus_item_icon_link_icon_minus_cancel_no_minus_text_with_minus_tip____data______action_____cancel_____title____Spree_dot_t__actions_dot_cancel_____style_____display__none__() {
    return link_to___________class_____cancel_minus_line_minus_item_icon_link_icon_minus_cancel_no_minus_text_with_minus_tip____data______action_____cancel_____title____Spree_dot_t__actions_dot_cancel_____style_____display__none__;
  }
  
  public String getTextOfLink_to___________class_____cancel_minus_line_minus_item_icon_link_icon_minus_cancel_no_minus_text_with_minus_tip____data______action_____cancel_____title____Spree_dot_t__actions_dot_cancel_____style_____display__none__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_147") && matcher.group(2).equals("link_to___________class_____cancel_minus_line_minus_item_icon_link_icon_minus_cancel_no_minus_text_with_minus_tip____data______action_____cancel_____title____Spree_dot_t__actions_dot_cancel_____style_____display__none__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_147']")
  private WebElement link_to___________class_____save_minus_line_minus_item_icon_link_icon_minus_ok_no_minus_text_with_minus_tip____data_______line_minus_item_minus_id_____item_dot_id___action_____save_____title____Spree_dot_t__actions_dot_save_____style_____display__none__;
  
  public WebElement getElementOfLink_to___________class_____save_minus_line_minus_item_icon_link_icon_minus_ok_no_minus_text_with_minus_tip____data_______line_minus_item_minus_id_____item_dot_id___action_____save_____title____Spree_dot_t__actions_dot_save_____style_____display__none__() {
    return link_to___________class_____save_minus_line_minus_item_icon_link_icon_minus_ok_no_minus_text_with_minus_tip____data_______line_minus_item_minus_id_____item_dot_id___action_____save_____title____Spree_dot_t__actions_dot_save_____style_____display__none__;
  }
  
  public String getTextOfLink_to___________class_____save_minus_line_minus_item_icon_link_icon_minus_ok_no_minus_text_with_minus_tip____data_______line_minus_item_minus_id_____item_dot_id___action_____save_____title____Spree_dot_t__actions_dot_save_____style_____display__none__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_147") && matcher.group(2).equals("link_to___________class_____save_minus_line_minus_item_icon_link_icon_minus_ok_no_minus_text_with_minus_tip____data_______line_minus_item_minus_id_____item_dot_id___action_____save_____title____Spree_dot_t__actions_dot_save_____style_____display__none__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_147']")
  private WebElement link_to___________class_____delete_minus_line_minus_item_icon_minus_trash_no_minus_text_with_minus_tip____data_______line_minus_item_minus_id_____item_dot_id___action_____remove_____title____Spree_dot_t__delete___;
  
  public WebElement getElementOfLink_to___________class_____delete_minus_line_minus_item_icon_minus_trash_no_minus_text_with_minus_tip____data_______line_minus_item_minus_id_____item_dot_id___action_____remove_____title____Spree_dot_t__delete___() {
    return link_to___________class_____delete_minus_line_minus_item_icon_minus_trash_no_minus_text_with_minus_tip____data_______line_minus_item_minus_id_____item_dot_id___action_____remove_____title____Spree_dot_t__delete___;
  }
  
  public String getTextOfLink_to___________class_____delete_minus_line_minus_item_icon_minus_trash_no_minus_text_with_minus_tip____data_______line_minus_item_minus_id_____item_dot_id___action_____remove_____title____Spree_dot_t__delete___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_147") && matcher.group(2).equals("link_to___________class_____delete_minus_line_minus_item_icon_minus_trash_no_minus_text_with_minus_tip____data_______line_minus_item_minus_id_____item_dot_id___action_____remove_____title____Spree_dot_t__delete___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_147']")
  private WebElement link_to___________class_____edit_minus_line_minus_item_icon_link_icon_minus_edit_no_minus_text_with_minus_tip____data______action_____edit_____title____Spree_dot_t__edit___;
  
  public WebElement getElementOfLink_to___________class_____edit_minus_line_minus_item_icon_link_icon_minus_edit_no_minus_text_with_minus_tip____data______action_____edit_____title____Spree_dot_t__edit___() {
    return link_to___________class_____edit_minus_line_minus_item_icon_link_icon_minus_edit_no_minus_text_with_minus_tip____data______action_____edit_____title____Spree_dot_t__edit___;
  }
  
  public String getTextOfLink_to___________class_____edit_minus_line_minus_item_icon_link_icon_minus_edit_no_minus_text_with_minus_tip____data______action_____edit_____title____Spree_dot_t__edit___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_147") && matcher.group(2).equals("link_to___________class_____edit_minus_line_minus_item_icon_link_icon_minus_edit_no_minus_text_with_minus_tip____data______action_____edit_____title____Spree_dot_t__edit___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='line-item-<%= item.id %>']")
  private WebElement item_dot_id_;
  
  public WebElement getElementOfItem_dot_id_() {
    return item_dot_id_;
  }
  
  public String getAttributeOfIdOnItem_dot_id_() {
    return item_dot_id_.getAttribute("id");
  }
  
  public String getTextOfItem_dot_id_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("line-item-<%= item.id %>") && matcher.group(2).equals("item_dot_id_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
