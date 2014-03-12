package test.backend.app.views.spree.admin.stock_transfers;

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

public class NewHtmlPage extends AbstractPage {
  public NewHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_670']")
  private WebElement button_link_to_Spree_dot_t__back_to_stock_transfers_list___admin_stock_transfers_path___icon_____icon_minus_arrow_minus_left__;
  
  public WebElement getElementOfButton_link_to_Spree_dot_t__back_to_stock_transfers_list___admin_stock_transfers_path___icon_____icon_minus_arrow_minus_left__() {
    return button_link_to_Spree_dot_t__back_to_stock_transfers_list___admin_stock_transfers_path___icon_____icon_minus_arrow_minus_left__;
  }
  
  public String getTextOfButton_link_to_Spree_dot_t__back_to_stock_transfers_list___admin_stock_transfers_path___icon_____icon_minus_arrow_minus_left__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_670") && matcher.group(2).equals("button_link_to_Spree_dot_t__back_to_stock_transfers_list___admin_stock_transfers_path___icon_____icon_minus_arrow_minus_left__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_671']")
  private WebElement Spree_dot_t__transfer_stock__;
  
  public WebElement getElementOfSpree_dot_t__transfer_stock__() {
    return Spree_dot_t__transfer_stock__;
  }
  
  public String getTextOfSpree_dot_t__transfer_stock__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_671") && matcher.group(2).equals("Spree_dot_t__transfer_stock__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='stock_movement_reference_field']")
  private WebElement label_tag__reference___raw____Spree_dot_t__reference______Spree_dot_t__optional______;
  
  public WebElement getElementOfLabel_tag__reference___raw____Spree_dot_t__reference______Spree_dot_t__optional______() {
    return label_tag__reference___raw____Spree_dot_t__reference______Spree_dot_t__optional______;
  }
  
  public String getTextOfLabel_tag__reference___raw____Spree_dot_t__reference______Spree_dot_t__optional______() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("stock_movement_reference_field") && matcher.group(2).equals("label_tag__reference___raw____Spree_dot_t__reference______Spree_dot_t__optional______")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='stock_movement_reference_field']")
  private WebElement text_field_tag__reference______class___fullwidth__;
  
  public WebElement getElementOfText_field_tag__reference______class___fullwidth__() {
    return text_field_tag__reference______class___fullwidth__;
  }
  
  public String getTextOfText_field_tag__reference______class___fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("stock_movement_reference_field") && matcher.group(2).equals("text_field_tag__reference______class___fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_672']")
  private WebElement check_box_tag__transfer_receive_stock_;
  
  public WebElement getElementOfCheck_box_tag__transfer_receive_stock_() {
    return check_box_tag__transfer_receive_stock_;
  }
  
  public String getTextOfCheck_box_tag__transfer_receive_stock_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_672") && matcher.group(2).equals("check_box_tag__transfer_receive_stock_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_672']")
  private WebElement Spree_dot_t__receive_stock___;
  
  public WebElement getElementOfSpree_dot_t__receive_stock___() {
    return Spree_dot_t__receive_stock___;
  }
  
  public String getTextOfSpree_dot_t__receive_stock___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_672") && matcher.group(2).equals("Spree_dot_t__receive_stock___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='transfer_source_location_id_field']")
  private WebElement label_tag__transfer_source_location_id__Spree_dot_t__source__;
  
  public WebElement getElementOfLabel_tag__transfer_source_location_id__Spree_dot_t__source__() {
    return label_tag__transfer_source_location_id__Spree_dot_t__source__;
  }
  
  public String getTextOfLabel_tag__transfer_source_location_id__Spree_dot_t__source__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("transfer_source_location_id_field") && matcher.group(2).equals("label_tag__transfer_source_location_id__Spree_dot_t__source__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='transfer_source_location_id_field']")
  private WebElement select_tag__transfer_source_location_id______class___select2_fullwidth__;
  
  public WebElement getElementOfSelect_tag__transfer_source_location_id______class___select2_fullwidth__() {
    return select_tag__transfer_source_location_id______class___select2_fullwidth__;
  }
  
  public String getTextOfSelect_tag__transfer_source_location_id______class___select2_fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("transfer_source_location_id_field") && matcher.group(2).equals("select_tag__transfer_source_location_id______class___select2_fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='transfer_destination_location_id_field']")
  private WebElement select_tag__transfer_destination_location_id______class___select2_fullwidth__;
  
  public WebElement getElementOfSelect_tag__transfer_destination_location_id______class___select2_fullwidth__() {
    return select_tag__transfer_destination_location_id______class___select2_fullwidth__;
  }
  
  public String getTextOfSelect_tag__transfer_destination_location_id______class___select2_fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("transfer_destination_location_id_field") && matcher.group(2).equals("select_tag__transfer_destination_location_id______class___select2_fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='transfer_destination_location_id_field']")
  private WebElement label_tag__transfer_destination_location_id__Spree_dot_t__destination__;
  
  public WebElement getElementOfLabel_tag__transfer_destination_location_id__Spree_dot_t__destination__() {
    return label_tag__transfer_destination_location_id__Spree_dot_t__destination__;
  }
  
  public String getTextOfLabel_tag__transfer_destination_location_id__Spree_dot_t__destination__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("transfer_destination_location_id_field") && matcher.group(2).equals("label_tag__transfer_destination_location_id__Spree_dot_t__destination__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_673']")
  private WebElement Spree_dot_t__add_variant__;
  
  public WebElement getElementOfSpree_dot_t__add_variant__() {
    return Spree_dot_t__add_variant__;
  }
  
  public String getTextOfSpree_dot_t__add_variant__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_673") && matcher.group(2).equals("Spree_dot_t__add_variant__")) {
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
  
  @FindBy(how = How.XPATH, using = "//*[@id='stock_movement_variant_id_field']")
  private WebElement select_tag__transfer_variant_______class___fullwidth__;
  
  public WebElement getElementOfSelect_tag__transfer_variant_______class___fullwidth__() {
    return select_tag__transfer_variant_______class___fullwidth__;
  }
  
  public String getTextOfSelect_tag__transfer_variant_______class___fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("stock_movement_variant_id_field") && matcher.group(2).equals("select_tag__transfer_variant_______class___fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='stock_movement_quantity_field']")
  private WebElement number_field_tag__transfer_variant_quantity___1__class___fullwidth___min__0_;
  
  public WebElement getElementOfNumber_field_tag__transfer_variant_quantity___1__class___fullwidth___min__0_() {
    return number_field_tag__transfer_variant_quantity___1__class___fullwidth___min__0_;
  }
  
  public String getTextOfNumber_field_tag__transfer_variant_quantity___1__class___fullwidth___min__0_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("stock_movement_quantity_field") && matcher.group(2).equals("number_field_tag__transfer_variant_quantity___1__class___fullwidth___min__0_")) {
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
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_674']")
  private WebElement button_Spree_dot_t__add____icon_minus_plus_button_transfer_add_variant__;
  
  public WebElement getElementOfButton_Spree_dot_t__add____icon_minus_plus_button_transfer_add_variant__() {
    return button_Spree_dot_t__add____icon_minus_plus_button_transfer_add_variant__;
  }
  
  public String getTextOfButton_Spree_dot_t__add____icon_minus_plus_button_transfer_add_variant__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_674") && matcher.group(2).equals("button_Spree_dot_t__add____icon_minus_plus_button_transfer_add_variant__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_675']")
  private WebElement Spree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_stock_transfer____;
  
  public WebElement getElementOfSpree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_stock_transfer____() {
    return Spree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_stock_transfer____;
  }
  
  public String getTextOfSpree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_stock_transfer____() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_675") && matcher.group(2).equals("Spree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_stock_transfer____")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_675']")
  private WebElement link_to_Spree_dot_t__add_one___spree_dot_new_admin_tax_rate_path_;
  
  public WebElement getElementOfLink_to_Spree_dot_t__add_one___spree_dot_new_admin_tax_rate_path_() {
    return link_to_Spree_dot_t__add_one___spree_dot_new_admin_tax_rate_path_;
  }
  
  public String getTextOfLink_to_Spree_dot_t__add_one___spree_dot_new_admin_tax_rate_path_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_675") && matcher.group(2).equals("link_to_Spree_dot_t__add_one___spree_dot_new_admin_tax_rate_path_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_676']")
  private WebElement Spree_dot_t__name__;
  
  public WebElement getElementOfSpree_dot_t__name__() {
    return Spree_dot_t__name__;
  }
  
  public String getTextOfSpree_dot_t__name__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_676") && matcher.group(2).equals("Spree_dot_t__name__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_677']")
  private WebElement Spree_dot_t__quantity__;
  
  public WebElement getElementOfSpree_dot_t__quantity__() {
    return Spree_dot_t__quantity__;
  }
  
  public String getTextOfSpree_dot_t__quantity__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_677") && matcher.group(2).equals("Spree_dot_t__quantity__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_678']")
  private WebElement button_Spree_dot_t__transfer_stock____icon_minus_plus_transfer_transfer__;
  
  public WebElement getElementOfButton_Spree_dot_t__transfer_stock____icon_minus_plus_transfer_transfer__() {
    return button_Spree_dot_t__transfer_stock____icon_minus_plus_transfer_transfer__;
  }
  
  public String getTextOfButton_Spree_dot_t__transfer_stock____icon_minus_plus_transfer_transfer__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_678") && matcher.group(2).equals("button_Spree_dot_t__transfer_stock____icon_minus_plus_transfer_transfer__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
