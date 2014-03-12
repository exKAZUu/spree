package test.backend.app.views.spree.admin.prototypes;

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
  
  @FindBy(how = How.XPATH, using = "//*[@id='new_prototype_link']")
  private WebElement button_link_to_Spree_dot_t__new_prototype___new_admin_prototype_url____remote____true___icon_____icon_minus_plus____data_minus_update______new_prototype____id_____new_prototype_link___;
  
  public WebElement getElementOfButton_link_to_Spree_dot_t__new_prototype___new_admin_prototype_url____remote____true___icon_____icon_minus_plus____data_minus_update______new_prototype____id_____new_prototype_link___() {
    return button_link_to_Spree_dot_t__new_prototype___new_admin_prototype_url____remote____true___icon_____icon_minus_plus____data_minus_update______new_prototype____id_____new_prototype_link___;
  }
  
  public String getTextOfButton_link_to_Spree_dot_t__new_prototype___new_admin_prototype_url____remote____true___icon_____icon_minus_plus____data_minus_update______new_prototype____id_____new_prototype_link___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("new_prototype_link") && matcher.group(2).equals("button_link_to_Spree_dot_t__new_prototype___new_admin_prototype_url____remote____true___icon_____icon_minus_plus____data_minus_update______new_prototype____id_____new_prototype_link___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_434']")
  private WebElement Spree_dot_t__name__;
  
  public WebElement getElementOfSpree_dot_t__name__() {
    return Spree_dot_t__name__;
  }
  
  public String getTextOfSpree_dot_t__name__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_434") && matcher.group(2).equals("Spree_dot_t__name__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_435']")
  private WebElement prototype_dot_name_;
  
  public WebElement getElementOfPrototype_dot_name_() {
    return prototype_dot_name_;
  }
  
  public String getTextOfPrototype_dot_name_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_435") && matcher.group(2).equals("prototype_dot_name_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_436']")
  private WebElement link_to_edit_prototype___no_text____true___class_____admin_edit_prototype___;
  
  public WebElement getElementOfLink_to_edit_prototype___no_text____true___class_____admin_edit_prototype___() {
    return link_to_edit_prototype___no_text____true___class_____admin_edit_prototype___;
  }
  
  public String getTextOfLink_to_edit_prototype___no_text____true___class_____admin_edit_prototype___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_436") && matcher.group(2).equals("link_to_edit_prototype___no_text____true___class_____admin_edit_prototype___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_436']")
  private WebElement link_to_delete_prototype___no_text____true__;
  
  public WebElement getElementOfLink_to_delete_prototype___no_text____true__() {
    return link_to_delete_prototype___no_text____true__;
  }
  
  public String getTextOfLink_to_delete_prototype___no_text____true__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_436") && matcher.group(2).equals("link_to_delete_prototype___no_text____true__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='<%= spree_dom_id prototype %>']")
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
      if (matcher.group(1).equals("<%= spree_dom_id prototype %>") && matcher.group(2).equals("cycle__odd____even__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='<%= spree_dom_id prototype %>']")
  private WebElement spree_dom_id_prototype_;
  
  public WebElement getElementOfSpree_dom_id_prototype_() {
    return spree_dom_id_prototype_;
  }
  
  public String getAttributeOfIdOnSpree_dom_id_prototype_() {
    return spree_dom_id_prototype_.getAttribute("id");
  }
  
  public String getTextOfSpree_dom_id_prototype_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("<%= spree_dom_id prototype %>") && matcher.group(2).equals("spree_dom_id_prototype_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_437']")
  private WebElement link_to_Spree_dot_t__add_one___spree_dot_new_admin_prototype_path_;
  
  public WebElement getElementOfLink_to_Spree_dot_t__add_one___spree_dot_new_admin_prototype_path_() {
    return link_to_Spree_dot_t__add_one___spree_dot_new_admin_prototype_path_;
  }
  
  public String getTextOfLink_to_Spree_dot_t__add_one___spree_dot_new_admin_prototype_path_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_437") && matcher.group(2).equals("link_to_Spree_dot_t__add_one___spree_dot_new_admin_prototype_path_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_437']")
  private WebElement Spree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_prototype____;
  
  public WebElement getElementOfSpree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_prototype____() {
    return Spree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_prototype____;
  }
  
  public String getTextOfSpree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_prototype____() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_437") && matcher.group(2).equals("Spree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_prototype____")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
