package test.backend.app.views.spree.admin.product_properties;

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
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_308']")
  private WebElement link_to_add_fields_Spree_dot_t__add_product_properties____tbody_product_properties____class_____icon_minus_plus_button__;
  
  public WebElement getElementOfLink_to_add_fields_Spree_dot_t__add_product_properties____tbody_product_properties____class_____icon_minus_plus_button__() {
    return link_to_add_fields_Spree_dot_t__add_product_properties____tbody_product_properties____class_____icon_minus_plus_button__;
  }
  
  public String getTextOfLink_to_add_fields_Spree_dot_t__add_product_properties____tbody_product_properties____class_____icon_minus_plus_button__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_308") && matcher.group(2).equals("link_to_add_fields_Spree_dot_t__add_product_properties____tbody_product_properties____class_____icon_minus_plus_button__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='new_ptype_link']")
  private WebElement link_to_Spree_dot_t__select_from_prototype___available_admin_prototypes_url___remote____true___data_minus_update______prototypes____class_____button_icon_minus_copy__;
  
  public WebElement getElementOfLink_to_Spree_dot_t__select_from_prototype___available_admin_prototypes_url___remote____true___data_minus_update______prototypes____class_____button_icon_minus_copy__() {
    return link_to_Spree_dot_t__select_from_prototype___available_admin_prototypes_url___remote____true___data_minus_update______prototypes____class_____button_icon_minus_copy__;
  }
  
  public String getTextOfLink_to_Spree_dot_t__select_from_prototype___available_admin_prototypes_url___remote____true___data_minus_update______prototypes____class_____button_icon_minus_copy__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("new_ptype_link") && matcher.group(2).equals("link_to_Spree_dot_t__select_from_prototype___available_admin_prototypes_url___remote____true___data_minus_update______prototypes____class_____button_icon_minus_copy__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_311']")
  private WebElement Spree_dot_t__property__;
  
  public WebElement getElementOfSpree_dot_t__property__() {
    return Spree_dot_t__property__;
  }
  
  public String getTextOfSpree_dot_t__property__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_311") && matcher.group(2).equals("Spree_dot_t__property__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_312']")
  private WebElement Spree_dot_t__value__;
  
  public WebElement getElementOfSpree_dot_t__value__() {
    return Spree_dot_t__value__;
  }
  
  public String getTextOfSpree_dot_t__value__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_312") && matcher.group(2).equals("Spree_dot_t__value__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='product_properties']")
  private WebElement render__product_property_fields____f____pp_form_;
  
  public WebElement getElementOfRender__product_property_fields____f____pp_form_() {
    return render__product_property_fields____f____pp_form_;
  }
  
  public String getTextOfRender__product_property_fields____f____pp_form_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("product_properties") && matcher.group(2).equals("render__product_property_fields____f____pp_form_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='product_properties']")
  private WebElement f_dot_fields_for__product_properties_do__pp_form__;
  
  public WebElement getElementOfF_dot_fields_for__product_properties_do__pp_form__() {
    return f_dot_fields_for__product_properties_do__pp_form__;
  }
  
  public String getTextOfF_dot_fields_for__product_properties_do__pp_form__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("product_properties") && matcher.group(2).equals("f_dot_fields_for__product_properties_do__pp_form__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_310']")
  private WebElement update_positions_admin_product_product_properties_url_;
  
  public WebElement getElementOfUpdate_positions_admin_product_product_properties_url_() {
    return update_positions_admin_product_product_properties_url_;
  }
  
  public String getAttributeOfData-sortable-linkOnUpdate_positions_admin_product_product_properties_url_() {
    return update_positions_admin_product_product_properties_url_.getAttribute("data-sortable-link");
  }
  
  public String getTextOfUpdate_positions_admin_product_product_properties_url_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_310") && matcher.group(2).equals("update_positions_admin_product_product_properties_url_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_309']")
  private WebElement image_tag__select2_minus_spinner_dot_gif____plugin_____spree____style_____display_none_____id_____busy_indicator__;
  
  public WebElement getElementOfImage_tag__select2_minus_spinner_dot_gif____plugin_____spree____style_____display_none_____id_____busy_indicator__() {
    return image_tag__select2_minus_spinner_dot_gif____plugin_____spree____style_____display_none_____id_____busy_indicator__;
  }
  
  public String getTextOfImage_tag__select2_minus_spinner_dot_gif____plugin_____spree____style_____display_none_____id_____busy_indicator__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_309") && matcher.group(2).equals("image_tag__select2_minus_spinner_dot_gif____plugin_____spree____style_____display_none_____id_____busy_indicator__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_309']")
  private WebElement hidden_field_tag__clear_product_properties____true__;
  
  public WebElement getElementOfHidden_field_tag__clear_product_properties____true__() {
    return hidden_field_tag__clear_product_properties____true__;
  }
  
  public String getTextOfHidden_field_tag__clear_product_properties____true__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_309") && matcher.group(2).equals("hidden_field_tag__clear_product_properties____true__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_309']")
  private WebElement render__spree_divide_admin_divide_shared_divide_edit_resource_links__;
  
  public WebElement getElementOfRender__spree_divide_admin_divide_shared_divide_edit_resource_links__() {
    return render__spree_divide_admin_divide_shared_divide_edit_resource_links__;
  }
  
  public String getTextOfRender__spree_divide_admin_divide_shared_divide_edit_resource_links__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_309") && matcher.group(2).equals("render__spree_divide_admin_divide_shared_divide_edit_resource_links__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
