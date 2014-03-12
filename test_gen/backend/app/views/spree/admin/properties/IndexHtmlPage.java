package test.backend.app.views.spree.admin.properties;

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
  
  @FindBy(how = How.XPATH, using = "//*[@id='new_property_link']")
  private WebElement button_link_to_Spree_dot_t__new_property___new_admin_property_url_____remote____true___icon_____icon_minus_plus____data_minus_update______new_property____id_____new_property_link____;
  
  public WebElement getElementOfButton_link_to_Spree_dot_t__new_property___new_admin_property_url_____remote____true___icon_____icon_minus_plus____data_minus_update______new_property____id_____new_property_link____() {
    return button_link_to_Spree_dot_t__new_property___new_admin_property_url_____remote____true___icon_____icon_minus_plus____data_minus_update______new_property____id_____new_property_link____;
  }
  
  public String getTextOfButton_link_to_Spree_dot_t__new_property___new_admin_property_url_____remote____true___icon_____icon_minus_plus____data_minus_update______new_property____id_____new_property_link____() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("new_property_link") && matcher.group(2).equals("button_link_to_Spree_dot_t__new_property___new_admin_property_url_____remote____true___icon_____icon_minus_plus____data_minus_update______new_property____id_____new_property_link____")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_418']")
  private WebElement Spree_dot_t__name__;
  
  public WebElement getElementOfSpree_dot_t__name__() {
    return Spree_dot_t__name__;
  }
  
  public String getTextOfSpree_dot_t__name__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_418") && matcher.group(2).equals("Spree_dot_t__name__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_419']")
  private WebElement Spree_dot_t__presentation__;
  
  public WebElement getElementOfSpree_dot_t__presentation__() {
    return Spree_dot_t__presentation__;
  }
  
  public String getTextOfSpree_dot_t__presentation__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_419") && matcher.group(2).equals("Spree_dot_t__presentation__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_420']")
  private WebElement property_dot_name_;
  
  public WebElement getElementOfProperty_dot_name_() {
    return property_dot_name_;
  }
  
  public String getTextOfProperty_dot_name_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_420") && matcher.group(2).equals("property_dot_name_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_421']")
  private WebElement property_dot_presentation_;
  
  public WebElement getElementOfProperty_dot_presentation_() {
    return property_dot_presentation_;
  }
  
  public String getTextOfProperty_dot_presentation_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_421") && matcher.group(2).equals("property_dot_presentation_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_422']")
  private WebElement link_to_delete_property___no_text____true__;
  
  public WebElement getElementOfLink_to_delete_property___no_text____true__() {
    return link_to_delete_property___no_text____true__;
  }
  
  public String getTextOfLink_to_delete_property___no_text____true__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_422") && matcher.group(2).equals("link_to_delete_property___no_text____true__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_422']")
  private WebElement link_to_edit_property___no_text____true__;
  
  public WebElement getElementOfLink_to_edit_property___no_text____true__() {
    return link_to_edit_property___no_text____true__;
  }
  
  public String getTextOfLink_to_edit_property___no_text____true__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_422") && matcher.group(2).equals("link_to_edit_property___no_text____true__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='<%= spree_dom_id property %>']")
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
      if (matcher.group(1).equals("<%= spree_dom_id property %>") && matcher.group(2).equals("cycle__odd____even__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='<%= spree_dom_id property %>']")
  private WebElement spree_dom_id_property_;
  
  public WebElement getElementOfSpree_dom_id_property_() {
    return spree_dom_id_property_;
  }
  
  public String getAttributeOfIdOnSpree_dom_id_property_() {
    return spree_dom_id_property_.getAttribute("id");
  }
  
  public String getTextOfSpree_dom_id_property_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("<%= spree_dom_id property %>") && matcher.group(2).equals("spree_dom_id_property_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_423']")
  private WebElement link_to_Spree_dot_t__add_one___spree_dot_new_admin_property_path_;
  
  public WebElement getElementOfLink_to_Spree_dot_t__add_one___spree_dot_new_admin_property_path_() {
    return link_to_Spree_dot_t__add_one___spree_dot_new_admin_property_path_;
  }
  
  public String getTextOfLink_to_Spree_dot_t__add_one___spree_dot_new_admin_property_path_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_423") && matcher.group(2).equals("link_to_Spree_dot_t__add_one___spree_dot_new_admin_property_path_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_423']")
  private WebElement Spree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_property____;
  
  public WebElement getElementOfSpree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_property____() {
    return Spree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_property____;
  }
  
  public String getTextOfSpree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_property____() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_423") && matcher.group(2).equals("Spree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_property____")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
