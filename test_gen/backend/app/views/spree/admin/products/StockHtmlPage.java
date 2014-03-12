package test.backend.app.views.spree.admin.products;

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

public class StockHtmlPage extends AbstractPage {
  public StockHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_351']")
  private WebElement button_link_to_Spree_dot_t__back_to_products_list___session__return_to_____admin_products_url___icon_____icon_minus_arrow_minus_left__;
  
  public WebElement getElementOfButton_link_to_Spree_dot_t__back_to_products_list___session__return_to_____admin_products_url___icon_____icon_minus_arrow_minus_left__() {
    return button_link_to_Spree_dot_t__back_to_products_list___session__return_to_____admin_products_url___icon_____icon_minus_arrow_minus_left__;
  }
  
  public String getTextOfButton_link_to_Spree_dot_t__back_to_products_list___session__return_to_____admin_products_url___icon_____icon_minus_arrow_minus_left__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_351") && matcher.group(2).equals("button_link_to_Spree_dot_t__back_to_products_list___session__return_to_____admin_products_url___icon_____icon_minus_arrow_minus_left__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='add_stock_form']")
  private WebElement render__add_stock_form__;
  
  public WebElement getElementOfRender__add_stock_form__() {
    return render__add_stock_form__;
  }
  
  public String getTextOfRender__add_stock_form__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("add_stock_form") && matcher.group(2).equals("render__add_stock_form__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_352']")
  private WebElement Spree_dot_t__variant__;
  
  public WebElement getElementOfSpree_dot_t__variant__() {
    return Spree_dot_t__variant__;
  }
  
  public String getTextOfSpree_dot_t__variant__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_352") && matcher.group(2).equals("Spree_dot_t__variant__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_353']")
  private WebElement Spree_dot_t__stock_location_info__;
  
  public WebElement getElementOfSpree_dot_t__stock_location_info__() {
    return Spree_dot_t__stock_location_info__;
  }
  
  public String getTextOfSpree_dot_t__stock_location_info__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_353") && matcher.group(2).equals("Spree_dot_t__stock_location_info__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_354']")
  private WebElement variant_dot_sku_and_options_text_;
  
  public WebElement getElementOfVariant_dot_sku_and_options_text_() {
    return variant_dot_sku_and_options_text_;
  }
  
  public String getTextOfVariant_dot_sku_and_options_text_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_354") && matcher.group(2).equals("variant_dot_sku_and_options_text_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_354']")
  private WebElement Spree_dot_t__track_inventory__;
  
  public WebElement getElementOfSpree_dot_t__track_inventory__() {
    return Spree_dot_t__track_inventory__;
  }
  
  public String getTextOfSpree_dot_t__track_inventory__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_354") && matcher.group(2).equals("Spree_dot_t__track_inventory__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_354']")
  private WebElement image_tag_variant_dot_images_dot_first_dot_attachment_dot_url__mini__;
  
  public WebElement getElementOfImage_tag_variant_dot_images_dot_first_dot_attachment_dot_url__mini__() {
    return image_tag_variant_dot_images_dot_first_dot_attachment_dot_url__mini__;
  }
  
  public String getTextOfImage_tag_variant_dot_images_dot_first_dot_attachment_dot_url__mini__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_354") && matcher.group(2).equals("image_tag_variant_dot_images_dot_first_dot_attachment_dot_url__mini__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_354']")
  private WebElement form_tag_admin_product_variants_including_master_path__product__variant__format___js___method___put__class___toggle_variant_track_inventory__do_;
  
  public WebElement getElementOfForm_tag_admin_product_variants_including_master_path__product__variant__format___js___method___put__class___toggle_variant_track_inventory__do_() {
    return form_tag_admin_product_variants_including_master_path__product__variant__format___js___method___put__class___toggle_variant_track_inventory__do_;
  }
  
  public String getTextOfForm_tag_admin_product_variants_including_master_path__product__variant__format___js___method___put__class___toggle_variant_track_inventory__do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_354") && matcher.group(2).equals("form_tag_admin_product_variants_including_master_path__product__variant__format___js___method___put__class___toggle_variant_track_inventory__do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_355']")
  private WebElement Spree_dot_t__stock_location__;
  
  public WebElement getElementOfSpree_dot_t__stock_location__() {
    return Spree_dot_t__stock_location__;
  }
  
  public String getTextOfSpree_dot_t__stock_location__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_355") && matcher.group(2).equals("Spree_dot_t__stock_location__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_356']")
  private WebElement Spree_dot_t__count_on_hand__;
  
  public WebElement getElementOfSpree_dot_t__count_on_hand__() {
    return Spree_dot_t__count_on_hand__;
  }
  
  public String getTextOfSpree_dot_t__count_on_hand__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_356") && matcher.group(2).equals("Spree_dot_t__count_on_hand__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_357']")
  private WebElement Spree_dot_t__backorderable__;
  
  public WebElement getElementOfSpree_dot_t__backorderable__() {
    return Spree_dot_t__backorderable__;
  }
  
  public String getTextOfSpree_dot_t__backorderable__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_357") && matcher.group(2).equals("Spree_dot_t__backorderable__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_358']")
  private WebElement item_dot_stock_location_dot_name_;
  
  public WebElement getElementOfItem_dot_stock_location_dot_name_() {
    return item_dot_stock_location_dot_name_;
  }
  
  public String getTextOfItem_dot_stock_location_dot_name_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_358") && matcher.group(2).equals("item_dot_stock_location_dot_name_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_359']")
  private WebElement item_dot_count_on_hand_;
  
  public WebElement getElementOfItem_dot_count_on_hand_() {
    return item_dot_count_on_hand_;
  }
  
  public String getTextOfItem_dot_count_on_hand_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_359") && matcher.group(2).equals("item_dot_count_on_hand_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_360']")
  private WebElement form_tag_admin_stock_item_path_item___method___put__class___toggle_stock_item_backorderable__do_;
  
  public WebElement getElementOfForm_tag_admin_stock_item_path_item___method___put__class___toggle_stock_item_backorderable__do_() {
    return form_tag_admin_stock_item_path_item___method___put__class___toggle_stock_item_backorderable__do_;
  }
  
  public String getTextOfForm_tag_admin_stock_item_path_item___method___put__class___toggle_stock_item_backorderable__do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_360") && matcher.group(2).equals("form_tag_admin_stock_item_path_item___method___put__class___toggle_stock_item_backorderable__do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='stock-item-<%= item.id %>']")
  private WebElement cycle__odd____even____name_____stock_locations__;
  
  public WebElement getElementOfCycle__odd____even____name_____stock_locations__() {
    return cycle__odd____even____name_____stock_locations__;
  }
  
  public String getAttributeOfClassOnCycle__odd____even____name_____stock_locations__() {
    return cycle__odd____even____name_____stock_locations__.getAttribute("class");
  }
  
  public String getTextOfCycle__odd____even____name_____stock_locations__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("stock-item-<%= item.id %>") && matcher.group(2).equals("cycle__odd____even____name_____stock_locations__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='stock-item-<%= item.id %>']")
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
      if (matcher.group(1).equals("stock-item-<%= item.id %>") && matcher.group(2).equals("item_dot_id_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='<%= spree_dom_id variant %>']")
  private WebElement cycle__odd____even___;
  
  public WebElement getElementOfCycle__odd____even___() {
    return cycle__odd____even___;
  }
  
  public String getAttributeOfClassOnCycle__odd____even___() {
    return cycle__odd____even___.getAttribute("class");
  }
  
  public String getTextOfCycle__odd____even___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("<%= spree_dom_id variant %>") && matcher.group(2).equals("cycle__odd____even___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='<%= spree_dom_id variant %>']")
  private WebElement spree_dom_id_variant_;
  
  public WebElement getElementOfSpree_dom_id_variant_() {
    return spree_dom_id_variant_;
  }
  
  public String getAttributeOfIdOnSpree_dom_id_variant_() {
    return spree_dom_id_variant_.getAttribute("id");
  }
  
  public String getTextOfSpree_dom_id_variant_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("<%= spree_dom_id variant %>") && matcher.group(2).equals("spree_dom_id_variant_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
