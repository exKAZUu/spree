package test.backend.app.views.spree.admin.shipping_methods;

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
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_573']")
  private WebElement button_link_to_Spree_dot_t__new_shipping_method___new_object_url____icon_____icon_minus_plus____id_____admin_new_shipping_method_link__;
  
  public WebElement getElementOfButton_link_to_Spree_dot_t__new_shipping_method___new_object_url____icon_____icon_minus_plus____id_____admin_new_shipping_method_link__() {
    return button_link_to_Spree_dot_t__new_shipping_method___new_object_url____icon_____icon_minus_plus____id_____admin_new_shipping_method_link__;
  }
  
  public String getTextOfButton_link_to_Spree_dot_t__new_shipping_method___new_object_url____icon_____icon_minus_plus____id_____admin_new_shipping_method_link__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_573") && matcher.group(2).equals("button_link_to_Spree_dot_t__new_shipping_method___new_object_url____icon_____icon_minus_plus____id_____admin_new_shipping_method_link__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_574']")
  private WebElement Spree_dot_t__name__;
  
  public WebElement getElementOfSpree_dot_t__name__() {
    return Spree_dot_t__name__;
  }
  
  public String getTextOfSpree_dot_t__name__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_574") && matcher.group(2).equals("Spree_dot_t__name__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_575']")
  private WebElement Spree_dot_t__zone__;
  
  public WebElement getElementOfSpree_dot_t__zone__() {
    return Spree_dot_t__zone__;
  }
  
  public String getTextOfSpree_dot_t__zone__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_575") && matcher.group(2).equals("Spree_dot_t__zone__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_576']")
  private WebElement Spree_dot_t__calculator__;
  
  public WebElement getElementOfSpree_dot_t__calculator__() {
    return Spree_dot_t__calculator__;
  }
  
  public String getTextOfSpree_dot_t__calculator__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_576") && matcher.group(2).equals("Spree_dot_t__calculator__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_577']")
  private WebElement Spree_dot_t__display__;
  
  public WebElement getElementOfSpree_dot_t__display__() {
    return Spree_dot_t__display__;
  }
  
  public String getTextOfSpree_dot_t__display__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_577") && matcher.group(2).equals("Spree_dot_t__display__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_578']")
  private WebElement shipping_method_dot_admin_name__plus_____divide____if_shipping_method_dot_admin_name_dot_present__;
  
  public WebElement getElementOfShipping_method_dot_admin_name__plus_____divide____if_shipping_method_dot_admin_name_dot_present__() {
    return shipping_method_dot_admin_name__plus_____divide____if_shipping_method_dot_admin_name_dot_present__;
  }
  
  public String getTextOfShipping_method_dot_admin_name__plus_____divide____if_shipping_method_dot_admin_name_dot_present__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_578") && matcher.group(2).equals("shipping_method_dot_admin_name__plus_____divide____if_shipping_method_dot_admin_name_dot_present__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_578']")
  private WebElement shipping_method_dot_name_;
  
  public WebElement getElementOfShipping_method_dot_name_() {
    return shipping_method_dot_name_;
  }
  
  public String getTextOfShipping_method_dot_name_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_578") && matcher.group(2).equals("shipping_method_dot_name_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_579']")
  private WebElement shipping_method_dot_zones_dot_collect___name__dot_join_______if_shipping_method_dot_zones_;
  
  public WebElement getElementOfShipping_method_dot_zones_dot_collect___name__dot_join_______if_shipping_method_dot_zones_() {
    return shipping_method_dot_zones_dot_collect___name__dot_join_______if_shipping_method_dot_zones_;
  }
  
  public String getTextOfShipping_method_dot_zones_dot_collect___name__dot_join_______if_shipping_method_dot_zones_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_579") && matcher.group(2).equals("shipping_method_dot_zones_dot_collect___name__dot_join_______if_shipping_method_dot_zones_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_580']")
  private WebElement shipping_method_dot_calculator_dot_description_;
  
  public WebElement getElementOfShipping_method_dot_calculator_dot_description_() {
    return shipping_method_dot_calculator_dot_description_;
  }
  
  public String getTextOfShipping_method_dot_calculator_dot_description_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_580") && matcher.group(2).equals("shipping_method_dot_calculator_dot_description_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_581']")
  private WebElement shipping_method_dot_display_on_dot_blank____Spree_dot_t__both____Spree_dot_t_shipping_method_dot_display_on__;
  
  public WebElement getElementOfShipping_method_dot_display_on_dot_blank____Spree_dot_t__both____Spree_dot_t_shipping_method_dot_display_on__() {
    return shipping_method_dot_display_on_dot_blank____Spree_dot_t__both____Spree_dot_t_shipping_method_dot_display_on__;
  }
  
  public String getTextOfShipping_method_dot_display_on_dot_blank____Spree_dot_t__both____Spree_dot_t_shipping_method_dot_display_on__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_581") && matcher.group(2).equals("shipping_method_dot_display_on_dot_blank____Spree_dot_t__both____Spree_dot_t_shipping_method_dot_display_on__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_582']")
  private WebElement link_to_edit_shipping_method___no_text____true_;
  
  public WebElement getElementOfLink_to_edit_shipping_method___no_text____true_() {
    return link_to_edit_shipping_method___no_text____true_;
  }
  
  public String getTextOfLink_to_edit_shipping_method___no_text____true_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_582") && matcher.group(2).equals("link_to_edit_shipping_method___no_text____true_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_582']")
  private WebElement link_to_delete_shipping_method___no_text____true_;
  
  public WebElement getElementOfLink_to_delete_shipping_method___no_text____true_() {
    return link_to_delete_shipping_method___no_text____true_;
  }
  
  public String getTextOfLink_to_delete_shipping_method___no_text____true_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_582") && matcher.group(2).equals("link_to_delete_shipping_method___no_text____true_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='<%= spree_dom_id shipping_method %>']")
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
      if (matcher.group(1).equals("<%= spree_dom_id shipping_method %>") && matcher.group(2).equals("cycle__odd____even__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='<%= spree_dom_id shipping_method %>']")
  private WebElement spree_dom_id_shipping_method_;
  
  public WebElement getElementOfSpree_dom_id_shipping_method_() {
    return spree_dom_id_shipping_method_;
  }
  
  public String getAttributeOfIdOnSpree_dom_id_shipping_method_() {
    return spree_dom_id_shipping_method_.getAttribute("id");
  }
  
  public String getTextOfSpree_dom_id_shipping_method_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("<%= spree_dom_id shipping_method %>") && matcher.group(2).equals("spree_dom_id_shipping_method_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_583']")
  private WebElement link_to_Spree_dot_t__add_one___spree_dot_new_admin_shipping_method_path_;
  
  public WebElement getElementOfLink_to_Spree_dot_t__add_one___spree_dot_new_admin_shipping_method_path_() {
    return link_to_Spree_dot_t__add_one___spree_dot_new_admin_shipping_method_path_;
  }
  
  public String getTextOfLink_to_Spree_dot_t__add_one___spree_dot_new_admin_shipping_method_path_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_583") && matcher.group(2).equals("link_to_Spree_dot_t__add_one___spree_dot_new_admin_shipping_method_path_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_583']")
  private WebElement Spree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_shipping_method____;
  
  public WebElement getElementOfSpree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_shipping_method____() {
    return Spree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_shipping_method____;
  }
  
  public String getTextOfSpree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_shipping_method____() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_583") && matcher.group(2).equals("Spree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_shipping_method____")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
