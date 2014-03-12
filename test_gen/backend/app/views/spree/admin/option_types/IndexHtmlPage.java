package test.backend.app.views.spree.admin.option_types;

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
  
  @FindBy(how = How.XPATH, using = "//*[@id='new_ot_link']")
  private WebElement button_link_to_Spree_dot_t__new_option_type___new_admin_option_type_url_____remote____true___icon_____icon_minus_plus____id_____new_option_type_link____;
  
  public WebElement getElementOfButton_link_to_Spree_dot_t__new_option_type___new_admin_option_type_url_____remote____true___icon_____icon_minus_plus____id_____new_option_type_link____() {
    return button_link_to_Spree_dot_t__new_option_type___new_admin_option_type_url_____remote____true___icon_____icon_minus_plus____id_____new_option_type_link____;
  }
  
  public String getTextOfButton_link_to_Spree_dot_t__new_option_type___new_admin_option_type_url_____remote____true___icon_____icon_minus_plus____id_____new_option_type_link____() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("new_ot_link") && matcher.group(2).equals("button_link_to_Spree_dot_t__new_option_type___new_admin_option_type_url_____remote____true___icon_____icon_minus_plus____id_____new_option_type_link____")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_119']")
  private WebElement Spree_dot_t__name__;
  
  public WebElement getElementOfSpree_dot_t__name__() {
    return Spree_dot_t__name__;
  }
  
  public String getTextOfSpree_dot_t__name__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_119") && matcher.group(2).equals("Spree_dot_t__name__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_120']")
  private WebElement Spree_dot_t__presentation__;
  
  public WebElement getElementOfSpree_dot_t__presentation__() {
    return Spree_dot_t__presentation__;
  }
  
  public String getTextOfSpree_dot_t__presentation__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_120") && matcher.group(2).equals("Spree_dot_t__presentation__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_121']")
  private WebElement option_type_dot_name_;
  
  public WebElement getElementOfOption_type_dot_name_() {
    return option_type_dot_name_;
  }
  
  public String getTextOfOption_type_dot_name_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_121") && matcher.group(2).equals("option_type_dot_name_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_122']")
  private WebElement option_type_dot_presentation_;
  
  public WebElement getElementOfOption_type_dot_presentation_() {
    return option_type_dot_presentation_;
  }
  
  public String getTextOfOption_type_dot_presentation_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_122") && matcher.group(2).equals("option_type_dot_presentation_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_123']")
  private WebElement link_to_edit_option_type___class_____admin_edit_option_type____no_text____true__;
  
  public WebElement getElementOfLink_to_edit_option_type___class_____admin_edit_option_type____no_text____true__() {
    return link_to_edit_option_type___class_____admin_edit_option_type____no_text____true__;
  }
  
  public String getTextOfLink_to_edit_option_type___class_____admin_edit_option_type____no_text____true__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_123") && matcher.group(2).equals("link_to_edit_option_type___class_____admin_edit_option_type____no_text____true__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_123']")
  private WebElement link_to_delete_option_type___no_text____true__;
  
  public WebElement getElementOfLink_to_delete_option_type___no_text____true__() {
    return link_to_delete_option_type___no_text____true__;
  }
  
  public String getTextOfLink_to_delete_option_type___no_text____true__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_123") && matcher.group(2).equals("link_to_delete_option_type___no_text____true__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='<%= spree_dom_id option_type %>']")
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
      if (matcher.group(1).equals("<%= spree_dom_id option_type %>") && matcher.group(2).equals("cycle__odd____even__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='<%= spree_dom_id option_type %>']")
  private WebElement spree_dom_id_option_type_;
  
  public WebElement getElementOfSpree_dom_id_option_type_() {
    return spree_dom_id_option_type_;
  }
  
  public String getAttributeOfIdOnSpree_dom_id_option_type_() {
    return spree_dom_id_option_type_.getAttribute("id");
  }
  
  public String getTextOfSpree_dom_id_option_type_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("<%= spree_dom_id option_type %>") && matcher.group(2).equals("spree_dom_id_option_type_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='listing_option_types']")
  private WebElement update_positions_admin_option_types_url_;
  
  public WebElement getElementOfUpdate_positions_admin_option_types_url_() {
    return update_positions_admin_option_types_url_;
  }
  
  public String getAttributeOfData-sortable-linkOnUpdate_positions_admin_option_types_url_() {
    return update_positions_admin_option_types_url_.getAttribute("data-sortable-link");
  }
  
  public String getTextOfUpdate_positions_admin_option_types_url_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("listing_option_types") && matcher.group(2).equals("update_positions_admin_option_types_url_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_124']")
  private WebElement Spree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_option_type____;
  
  public WebElement getElementOfSpree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_option_type____() {
    return Spree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_option_type____;
  }
  
  public String getTextOfSpree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_option_type____() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_124") && matcher.group(2).equals("Spree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_option_type____")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_124']")
  private WebElement link_to_Spree_dot_t__add_one___spree_dot_new_admin_option_type_path_;
  
  public WebElement getElementOfLink_to_Spree_dot_t__add_one___spree_dot_new_admin_option_type_path_() {
    return link_to_Spree_dot_t__add_one___spree_dot_new_admin_option_type_path_;
  }
  
  public String getTextOfLink_to_Spree_dot_t__add_one___spree_dot_new_admin_option_type_path_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_124") && matcher.group(2).equals("link_to_Spree_dot_t__add_one___spree_dot_new_admin_option_type_path_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
