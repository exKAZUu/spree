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

public class IndexHtmlPage extends AbstractPage {
  public IndexHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_620']")
  private WebElement button_link_to_Spree_dot_t__new_stock_location___new_object_url_____icon_____icon_minus_plus____id_____admin_new_stock_location____;
  
  public WebElement getElementOfButton_link_to_Spree_dot_t__new_stock_location___new_object_url_____icon_____icon_minus_plus____id_____admin_new_stock_location____() {
    return button_link_to_Spree_dot_t__new_stock_location___new_object_url_____icon_____icon_minus_plus____id_____admin_new_stock_location____;
  }
  
  public String getTextOfButton_link_to_Spree_dot_t__new_stock_location___new_object_url_____icon_____icon_minus_plus____id_____admin_new_stock_location____() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_620") && matcher.group(2).equals("button_link_to_Spree_dot_t__new_stock_location___new_object_url_____icon_____icon_minus_plus____id_____admin_new_stock_location____")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_621']")
  private WebElement button_link_to_Spree_dot_t__new_stock_transfer___new_admin_stock_transfer_path_____icon_____icon_minus_forward____;
  
  public WebElement getElementOfButton_link_to_Spree_dot_t__new_stock_transfer___new_admin_stock_transfer_path_____icon_____icon_minus_forward____() {
    return button_link_to_Spree_dot_t__new_stock_transfer___new_admin_stock_transfer_path_____icon_____icon_minus_forward____;
  }
  
  public String getTextOfButton_link_to_Spree_dot_t__new_stock_transfer___new_admin_stock_transfer_path_____icon_____icon_minus_forward____() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_621") && matcher.group(2).equals("button_link_to_Spree_dot_t__new_stock_transfer___new_admin_stock_transfer_path_____icon_____icon_minus_forward____")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_622']")
  private WebElement Spree_dot_t__name__;
  
  public WebElement getElementOfSpree_dot_t__name__() {
    return Spree_dot_t__name__;
  }
  
  public String getTextOfSpree_dot_t__name__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_622") && matcher.group(2).equals("Spree_dot_t__name__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_623']")
  private WebElement Spree_dot_t__state__;
  
  public WebElement getElementOfSpree_dot_t__state__() {
    return Spree_dot_t__state__;
  }
  
  public String getTextOfSpree_dot_t__state__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_623") && matcher.group(2).equals("Spree_dot_t__state__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_624']")
  private WebElement Spree_dot_t__stock_movements__;
  
  public WebElement getElementOfSpree_dot_t__stock_movements__() {
    return Spree_dot_t__stock_movements__;
  }
  
  public String getTextOfSpree_dot_t__stock_movements__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_624") && matcher.group(2).equals("Spree_dot_t__stock_movements__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_625']")
  private WebElement display_name_stock_location__;
  
  public WebElement getElementOfDisplay_name_stock_location__() {
    return display_name_stock_location__;
  }
  
  public String getTextOfDisplay_name_stock_location__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_625") && matcher.group(2).equals("display_name_stock_location__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_626']")
  private WebElement Spree_dot_t_state_stock_location___;
  
  public WebElement getElementOfSpree_dot_t_state_stock_location___() {
    return Spree_dot_t_state_stock_location___;
  }
  
  public String getTextOfSpree_dot_t_state_stock_location___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_626") && matcher.group(2).equals("Spree_dot_t_state_stock_location___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_626']")
  private WebElement state_stock_location__;
  
  public WebElement getElementOfState_stock_location__() {
    return state_stock_location__;
  }
  
  public String getAttributeOfClassOnState_stock_location__() {
    return state_stock_location__.getAttribute("class");
  }
  
  public String getTextOfState_stock_location__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_626") && matcher.group(2).equals("state_stock_location__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_627']")
  private WebElement link_to_Spree_dot_t__stock_movements___admin_stock_location_stock_movements_path_stock_location_dot_id__;
  
  public WebElement getElementOfLink_to_Spree_dot_t__stock_movements___admin_stock_location_stock_movements_path_stock_location_dot_id__() {
    return link_to_Spree_dot_t__stock_movements___admin_stock_location_stock_movements_path_stock_location_dot_id__;
  }
  
  public String getTextOfLink_to_Spree_dot_t__stock_movements___admin_stock_location_stock_movements_path_stock_location_dot_id__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_627") && matcher.group(2).equals("link_to_Spree_dot_t__stock_movements___admin_stock_location_stock_movements_path_stock_location_dot_id__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_628']")
  private WebElement link_to_delete_stock_location___no_text____true_;
  
  public WebElement getElementOfLink_to_delete_stock_location___no_text____true_() {
    return link_to_delete_stock_location___no_text____true_;
  }
  
  public String getTextOfLink_to_delete_stock_location___no_text____true_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_628") && matcher.group(2).equals("link_to_delete_stock_location___no_text____true_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_628']")
  private WebElement link_to_edit_stock_location___no_text____true_;
  
  public WebElement getElementOfLink_to_edit_stock_location___no_text____true_() {
    return link_to_edit_stock_location___no_text____true_;
  }
  
  public String getTextOfLink_to_edit_stock_location___no_text____true_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_628") && matcher.group(2).equals("link_to_edit_stock_location___no_text____true_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='<%= spree_dom_id stock_location %>']")
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
      if (matcher.group(1).equals("<%= spree_dom_id stock_location %>") && matcher.group(2).equals("cycle__odd____even__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='<%= spree_dom_id stock_location %>']")
  private WebElement spree_dom_id_stock_location_;
  
  public WebElement getElementOfSpree_dom_id_stock_location_() {
    return spree_dom_id_stock_location_;
  }
  
  public String getAttributeOfIdOnSpree_dom_id_stock_location_() {
    return spree_dom_id_stock_location_.getAttribute("id");
  }
  
  public String getTextOfSpree_dom_id_stock_location_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("<%= spree_dom_id stock_location %>") && matcher.group(2).equals("spree_dom_id_stock_location_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_629']")
  private WebElement link_to_Spree_dot_t__add_one___spree_dot_new_admin_stock_location_path_;
  
  public WebElement getElementOfLink_to_Spree_dot_t__add_one___spree_dot_new_admin_stock_location_path_() {
    return link_to_Spree_dot_t__add_one___spree_dot_new_admin_stock_location_path_;
  }
  
  public String getTextOfLink_to_Spree_dot_t__add_one___spree_dot_new_admin_stock_location_path_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_629") && matcher.group(2).equals("link_to_Spree_dot_t__add_one___spree_dot_new_admin_stock_location_path_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_629']")
  private WebElement Spree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_stock_location____;
  
  public WebElement getElementOfSpree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_stock_location____() {
    return Spree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_stock_location____;
  }
  
  public String getTextOfSpree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_stock_location____() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_629") && matcher.group(2).equals("Spree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_stock_location____")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
