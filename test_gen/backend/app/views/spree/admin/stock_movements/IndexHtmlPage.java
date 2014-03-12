package test.backend.app.views.spree.admin.stock_movements;

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

public class IndexHtmlPage extends AbstractPage {
  public IndexHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_635']")
  private WebElement button_link_to_Spree_dot_t__new_stock_movement___new_admin_stock_location_stock_movement_path__stock_location____icon___icon_minus_plus___id___admin_new_stock_movement_link__;
  
  public WebElement getElementOfButton_link_to_Spree_dot_t__new_stock_movement___new_admin_stock_location_stock_movement_path__stock_location____icon___icon_minus_plus___id___admin_new_stock_movement_link__() {
    return button_link_to_Spree_dot_t__new_stock_movement___new_admin_stock_location_stock_movement_path__stock_location____icon___icon_minus_plus___id___admin_new_stock_movement_link__;
  }
  
  public String getTextOfButton_link_to_Spree_dot_t__new_stock_movement___new_admin_stock_location_stock_movement_path__stock_location____icon___icon_minus_plus___id___admin_new_stock_movement_link__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_635") && matcher.group(2).equals("button_link_to_Spree_dot_t__new_stock_movement___new_admin_stock_location_stock_movement_path__stock_location____icon___icon_minus_plus___id___admin_new_stock_movement_link__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_636']")
  private WebElement link_to_with_icon__icon_minus_arrow_minus_left___Spree_dot_t__back_to_stock_locations_list___admin_stock_locations_path___class_____button__;
  
  public WebElement getElementOfLink_to_with_icon__icon_minus_arrow_minus_left___Spree_dot_t__back_to_stock_locations_list___admin_stock_locations_path___class_____button__() {
    return link_to_with_icon__icon_minus_arrow_minus_left___Spree_dot_t__back_to_stock_locations_list___admin_stock_locations_path___class_____button__;
  }
  
  public String getTextOfLink_to_with_icon__icon_minus_arrow_minus_left___Spree_dot_t__back_to_stock_locations_list___admin_stock_locations_path___class_____button__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_636") && matcher.group(2).equals("link_to_with_icon__icon_minus_arrow_minus_left___Spree_dot_t__back_to_stock_locations_list___admin_stock_locations_path___class_____button__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_637']")
  private WebElement Spree_dot_t__stock_item__;
  
  public WebElement getElementOfSpree_dot_t__stock_item__() {
    return Spree_dot_t__stock_item__;
  }
  
  public String getTextOfSpree_dot_t__stock_item__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_637") && matcher.group(2).equals("Spree_dot_t__stock_item__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_638']")
  private WebElement Spree_dot_t__quantity__;
  
  public WebElement getElementOfSpree_dot_t__quantity__() {
    return Spree_dot_t__quantity__;
  }
  
  public String getTextOfSpree_dot_t__quantity__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_638") && matcher.group(2).equals("Spree_dot_t__quantity__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_639']")
  private WebElement Spree_dot_t__action__;
  
  public WebElement getElementOfSpree_dot_t__action__() {
    return Spree_dot_t__action__;
  }
  
  public String getTextOfSpree_dot_t__action__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_639") && matcher.group(2).equals("Spree_dot_t__action__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_640']")
  private WebElement display_variant_stock_movement__;
  
  public WebElement getElementOfDisplay_variant_stock_movement__() {
    return display_variant_stock_movement__;
  }
  
  public String getTextOfDisplay_variant_stock_movement__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_640") && matcher.group(2).equals("display_variant_stock_movement__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_641']")
  private WebElement stock_movement_dot_quantity_;
  
  public WebElement getElementOfStock_movement_dot_quantity_() {
    return stock_movement_dot_quantity_;
  }
  
  public String getTextOfStock_movement_dot_quantity_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_641") && matcher.group(2).equals("stock_movement_dot_quantity_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_642']")
  private WebElement pretty_originator_stock_movement__;
  
  public WebElement getElementOfPretty_originator_stock_movement__() {
    return pretty_originator_stock_movement__;
  }
  
  public String getTextOfPretty_originator_stock_movement__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_642") && matcher.group(2).equals("pretty_originator_stock_movement__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='<%= spree_dom_id stock_movement %>']")
  private WebElement cycle__odd____even__;
  
  public WebElement getElementOfCycle__odd____even__() {
    return cycle__odd____even__;
  }
  
  public String getAttributeOfClassOnCycle__odd____even__() {
    return cycle__odd____even__.getAttribute("class");
  }
  
  public String getTextOfCycle__odd____even__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("<%= spree_dom_id stock_movement %>") && matcher.group(2).equals("cycle__odd____even__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='<%= spree_dom_id stock_movement %>']")
  private WebElement spree_dom_id_stock_movement_;
  
  public WebElement getElementOfSpree_dom_id_stock_movement_() {
    return spree_dom_id_stock_movement_;
  }
  
  public String getAttributeOfIdOnSpree_dom_id_stock_movement_() {
    return spree_dom_id_stock_movement_.getAttribute("id");
  }
  
  public String getTextOfSpree_dom_id_stock_movement_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("<%= spree_dom_id stock_movement %>") && matcher.group(2).equals("spree_dom_id_stock_movement_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_643']")
  private WebElement link_to_Spree_dot_t__add_one___spree_dot_new_admin_stock_movement_path_;
  
  public WebElement getElementOfLink_to_Spree_dot_t__add_one___spree_dot_new_admin_stock_movement_path_() {
    return link_to_Spree_dot_t__add_one___spree_dot_new_admin_stock_movement_path_;
  }
  
  public String getTextOfLink_to_Spree_dot_t__add_one___spree_dot_new_admin_stock_movement_path_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_643") && matcher.group(2).equals("link_to_Spree_dot_t__add_one___spree_dot_new_admin_stock_movement_path_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_643']")
  private WebElement Spree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_stock_movement____;
  
  public WebElement getElementOfSpree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_stock_movement____() {
    return Spree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_stock_movement____;
  }
  
  public String getTextOfSpree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_stock_movement____() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_643") && matcher.group(2).equals("Spree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_stock_movement____")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
