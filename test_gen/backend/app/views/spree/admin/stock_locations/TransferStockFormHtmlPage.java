package test.backend.app.views.spree.admin.stock_locations;

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

public class TransferStockFormHtmlPage extends AbstractPage {
  public TransferStockFormHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_615']")
  private WebElement Spree_dot_t__move_stock_between_locations_;
  
  public WebElement getElementOfSpree_dot_t__move_stock_between_locations_() {
    return Spree_dot_t__move_stock_between_locations_;
  }
  
  public String getTextOfSpree_dot_t__move_stock_between_locations_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_615") && matcher.group(2).equals("Spree_dot_t__move_stock_between_locations_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='stock_movement_transfer_from_field']")
  private WebElement label_tag__stock_location_from_id__Spree_dot_t__transfer_from_location__;
  
  public WebElement getElementOfLabel_tag__stock_location_from_id__Spree_dot_t__transfer_from_location__() {
    return label_tag__stock_location_from_id__Spree_dot_t__transfer_from_location__;
  }
  
  public String getTextOfLabel_tag__stock_location_from_id__Spree_dot_t__transfer_from_location__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("stock_movement_transfer_from_field") && matcher.group(2).equals("label_tag__stock_location_from_id__Spree_dot_t__transfer_from_location__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='stock_movement_transfer_from_field']")
  private WebElement select_tag__stock_location_from_id__options_from_collection_for_select__stock_locations___id___name___class___select2_fullwidth__;
  
  public WebElement getElementOfSelect_tag__stock_location_from_id__options_from_collection_for_select__stock_locations___id___name___class___select2_fullwidth__() {
    return select_tag__stock_location_from_id__options_from_collection_for_select__stock_locations___id___name___class___select2_fullwidth__;
  }
  
  public String getTextOfSelect_tag__stock_location_from_id__options_from_collection_for_select__stock_locations___id___name___class___select2_fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("stock_movement_transfer_from_field") && matcher.group(2).equals("select_tag__stock_location_from_id__options_from_collection_for_select__stock_locations___id___name___class___select2_fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='stock_movement_transfer_to_field']")
  private WebElement label_tag__stock_location_to_id__Spree_dot_t__transfer_to_location__;
  
  public WebElement getElementOfLabel_tag__stock_location_to_id__Spree_dot_t__transfer_to_location__() {
    return label_tag__stock_location_to_id__Spree_dot_t__transfer_to_location__;
  }
  
  public String getTextOfLabel_tag__stock_location_to_id__Spree_dot_t__transfer_to_location__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("stock_movement_transfer_to_field") && matcher.group(2).equals("label_tag__stock_location_to_id__Spree_dot_t__transfer_to_location__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='stock_movement_transfer_to_field']")
  private WebElement select_tag__stock_location_to_id__options_from_collection_for_select__stock_locations___id___name___class___select2_fullwidth__;
  
  public WebElement getElementOfSelect_tag__stock_location_to_id__options_from_collection_for_select__stock_locations___id___name___class___select2_fullwidth__() {
    return select_tag__stock_location_to_id__options_from_collection_for_select__stock_locations___id___name___class___select2_fullwidth__;
  }
  
  public String getTextOfSelect_tag__stock_location_to_id__options_from_collection_for_select__stock_locations___id___name___class___select2_fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("stock_movement_transfer_to_field") && matcher.group(2).equals("select_tag__stock_location_to_id__options_from_collection_for_select__stock_locations___id___name___class___select2_fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='stock_movement_variant_id_field']")
  private WebElement select_tag__variant_id__options_from_collection_for_select__variants___id___name_and_sku___class___select2_fullwidth__;
  
  public WebElement getElementOfSelect_tag__variant_id__options_from_collection_for_select__variants___id___name_and_sku___class___select2_fullwidth__() {
    return select_tag__variant_id__options_from_collection_for_select__variants___id___name_and_sku___class___select2_fullwidth__;
  }
  
  public String getTextOfSelect_tag__variant_id__options_from_collection_for_select__variants___id___name_and_sku___class___select2_fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("stock_movement_variant_id_field") && matcher.group(2).equals("select_tag__variant_id__options_from_collection_for_select__variants___id___name_and_sku___class___select2_fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='stock_movement_variant_id_field']")
  private WebElement label_tag__variant_id___Spree_dot_t__variant__;
  
  public WebElement getElementOfLabel_tag__variant_id___Spree_dot_t__variant__() {
    return label_tag__variant_id___Spree_dot_t__variant__;
  }
  
  public String getTextOfLabel_tag__variant_id___Spree_dot_t__variant__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("stock_movement_variant_id_field") && matcher.group(2).equals("label_tag__variant_id___Spree_dot_t__variant__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='stock_movement_quantity_field']")
  private WebElement label_tag__quantity___Spree_dot_t__quantity__;
  
  public WebElement getElementOfLabel_tag__quantity___Spree_dot_t__quantity__() {
    return label_tag__quantity___Spree_dot_t__quantity__;
  }
  
  public String getTextOfLabel_tag__quantity___Spree_dot_t__quantity__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("stock_movement_quantity_field") && matcher.group(2).equals("label_tag__quantity___Spree_dot_t__quantity__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='stock_movement_quantity_field']")
  private WebElement number_field_tag__quantity__1__class___fullwidth__;
  
  public WebElement getElementOfNumber_field_tag__quantity__1__class___fullwidth__() {
    return number_field_tag__quantity__1__class___fullwidth__;
  }
  
  public String getTextOfNumber_field_tag__quantity__1__class___fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("stock_movement_quantity_field") && matcher.group(2).equals("number_field_tag__quantity__1__class___fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_617']")
  private WebElement Spree_dot_t__or__;
  
  public WebElement getElementOfSpree_dot_t__or__() {
    return Spree_dot_t__or__;
  }
  
  public String getTextOfSpree_dot_t__or__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_617") && matcher.group(2).equals("Spree_dot_t__or__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_616']")
  private WebElement button_Spree_dot_t__transfer_stock____icon_minus_plus__;
  
  public WebElement getElementOfButton_Spree_dot_t__transfer_stock____icon_minus_plus__() {
    return button_Spree_dot_t__transfer_stock____icon_minus_plus__;
  }
  
  public String getTextOfButton_Spree_dot_t__transfer_stock____icon_minus_plus__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_616") && matcher.group(2).equals("button_Spree_dot_t__transfer_stock____icon_minus_plus__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_616']")
  private WebElement link_to_with_icon__icon_minus_remove___Spree_dot_t__actions_dot_cancel____collection_url___class_____button__;
  
  public WebElement getElementOfLink_to_with_icon__icon_minus_remove___Spree_dot_t__actions_dot_cancel____collection_url___class_____button__() {
    return link_to_with_icon__icon_minus_remove___Spree_dot_t__actions_dot_cancel____collection_url___class_____button__;
  }
  
  public String getTextOfLink_to_with_icon__icon_minus_remove___Spree_dot_t__actions_dot_cancel____collection_url___class_____button__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_616") && matcher.group(2).equals("link_to_with_icon__icon_minus_remove___Spree_dot_t__actions_dot_cancel____collection_url___class_____button__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
