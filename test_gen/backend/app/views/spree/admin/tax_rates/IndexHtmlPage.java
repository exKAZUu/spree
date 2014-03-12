package test.backend.app.views.spree.admin.tax_rates;

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
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_716']")
  private WebElement button_link_to_Spree_dot_t__new_tax_rate___new_object_url___icon_____icon_minus_plus__;
  
  public WebElement getElementOfButton_link_to_Spree_dot_t__new_tax_rate___new_object_url___icon_____icon_minus_plus__() {
    return button_link_to_Spree_dot_t__new_tax_rate___new_object_url___icon_____icon_minus_plus__;
  }
  
  public String getTextOfButton_link_to_Spree_dot_t__new_tax_rate___new_object_url___icon_____icon_minus_plus__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_716") && matcher.group(2).equals("button_link_to_Spree_dot_t__new_tax_rate___new_object_url___icon_____icon_minus_plus__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_717']")
  private WebElement Spree_dot_t__zone__;
  
  public WebElement getElementOfSpree_dot_t__zone__() {
    return Spree_dot_t__zone__;
  }
  
  public String getTextOfSpree_dot_t__zone__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_717") && matcher.group(2).equals("Spree_dot_t__zone__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_718']")
  private WebElement Spree_dot_t__name__;
  
  public WebElement getElementOfSpree_dot_t__name__() {
    return Spree_dot_t__name__;
  }
  
  public String getTextOfSpree_dot_t__name__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_718") && matcher.group(2).equals("Spree_dot_t__name__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_719']")
  private WebElement Spree_dot_t__category__;
  
  public WebElement getElementOfSpree_dot_t__category__() {
    return Spree_dot_t__category__;
  }
  
  public String getTextOfSpree_dot_t__category__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_719") && matcher.group(2).equals("Spree_dot_t__category__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_720']")
  private WebElement Spree_dot_t__amount__;
  
  public WebElement getElementOfSpree_dot_t__amount__() {
    return Spree_dot_t__amount__;
  }
  
  public String getTextOfSpree_dot_t__amount__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_720") && matcher.group(2).equals("Spree_dot_t__amount__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_721']")
  private WebElement Spree_dot_t__included_in_price__;
  
  public WebElement getElementOfSpree_dot_t__included_in_price__() {
    return Spree_dot_t__included_in_price__;
  }
  
  public String getTextOfSpree_dot_t__included_in_price__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_721") && matcher.group(2).equals("Spree_dot_t__included_in_price__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_722']")
  private WebElement Spree_dot_t__show_rate_in_label__;
  
  public WebElement getElementOfSpree_dot_t__show_rate_in_label__() {
    return Spree_dot_t__show_rate_in_label__;
  }
  
  public String getTextOfSpree_dot_t__show_rate_in_label__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_722") && matcher.group(2).equals("Spree_dot_t__show_rate_in_label__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_723']")
  private WebElement Spree_dot_t__calculator__;
  
  public WebElement getElementOfSpree_dot_t__calculator__() {
    return Spree_dot_t__calculator__;
  }
  
  public String getTextOfSpree_dot_t__calculator__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_723") && matcher.group(2).equals("Spree_dot_t__calculator__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_724']")
  private WebElement tax_rate_dot_zone_dot_try__name_____Spree_dot_t__not_available__;
  
  public WebElement getElementOfTax_rate_dot_zone_dot_try__name_____Spree_dot_t__not_available__() {
    return tax_rate_dot_zone_dot_try__name_____Spree_dot_t__not_available__;
  }
  
  public String getTextOfTax_rate_dot_zone_dot_try__name_____Spree_dot_t__not_available__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_724") && matcher.group(2).equals("tax_rate_dot_zone_dot_try__name_____Spree_dot_t__not_available__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_725']")
  private WebElement tax_rate_dot_name_;
  
  public WebElement getElementOfTax_rate_dot_name_() {
    return tax_rate_dot_name_;
  }
  
  public String getTextOfTax_rate_dot_name_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_725") && matcher.group(2).equals("tax_rate_dot_name_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_726']")
  private WebElement tax_rate_dot_tax_category_dot_try__name_____Spree_dot_t__not_available__;
  
  public WebElement getElementOfTax_rate_dot_tax_category_dot_try__name_____Spree_dot_t__not_available__() {
    return tax_rate_dot_tax_category_dot_try__name_____Spree_dot_t__not_available__;
  }
  
  public String getTextOfTax_rate_dot_tax_category_dot_try__name_____Spree_dot_t__not_available__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_726") && matcher.group(2).equals("tax_rate_dot_tax_category_dot_try__name_____Spree_dot_t__not_available__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_727']")
  private WebElement tax_rate_dot_amount_;
  
  public WebElement getElementOfTax_rate_dot_amount_() {
    return tax_rate_dot_amount_;
  }
  
  public String getTextOfTax_rate_dot_amount_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_727") && matcher.group(2).equals("tax_rate_dot_amount_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_728']")
  private WebElement tax_rate_dot_included_in_price____Spree_dot_t__say_yes____Spree_dot_t__say_no__;
  
  public WebElement getElementOfTax_rate_dot_included_in_price____Spree_dot_t__say_yes____Spree_dot_t__say_no__() {
    return tax_rate_dot_included_in_price____Spree_dot_t__say_yes____Spree_dot_t__say_no__;
  }
  
  public String getTextOfTax_rate_dot_included_in_price____Spree_dot_t__say_yes____Spree_dot_t__say_no__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_728") && matcher.group(2).equals("tax_rate_dot_included_in_price____Spree_dot_t__say_yes____Spree_dot_t__say_no__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_729']")
  private WebElement tax_rate_dot_show_rate_in_label____Spree_dot_t__say_yes____Spree_dot_t__say_no__;
  
  public WebElement getElementOfTax_rate_dot_show_rate_in_label____Spree_dot_t__say_yes____Spree_dot_t__say_no__() {
    return tax_rate_dot_show_rate_in_label____Spree_dot_t__say_yes____Spree_dot_t__say_no__;
  }
  
  public String getTextOfTax_rate_dot_show_rate_in_label____Spree_dot_t__say_yes____Spree_dot_t__say_no__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_729") && matcher.group(2).equals("tax_rate_dot_show_rate_in_label____Spree_dot_t__say_yes____Spree_dot_t__say_no__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_730']")
  private WebElement tax_rate_dot_calculator_dot_to_s_;
  
  public WebElement getElementOfTax_rate_dot_calculator_dot_to_s_() {
    return tax_rate_dot_calculator_dot_to_s_;
  }
  
  public String getTextOfTax_rate_dot_calculator_dot_to_s_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_730") && matcher.group(2).equals("tax_rate_dot_calculator_dot_to_s_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_731']")
  private WebElement link_to_delete_tax_rate___no_text____true_;
  
  public WebElement getElementOfLink_to_delete_tax_rate___no_text____true_() {
    return link_to_delete_tax_rate___no_text____true_;
  }
  
  public String getTextOfLink_to_delete_tax_rate___no_text____true_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_731") && matcher.group(2).equals("link_to_delete_tax_rate___no_text____true_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_731']")
  private WebElement link_to_edit_tax_rate___no_text____true_;
  
  public WebElement getElementOfLink_to_edit_tax_rate___no_text____true_() {
    return link_to_edit_tax_rate___no_text____true_;
  }
  
  public String getTextOfLink_to_edit_tax_rate___no_text____true_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_731") && matcher.group(2).equals("link_to_edit_tax_rate___no_text____true_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='<%= spree_dom_id tax_rate %>']")
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
      if (matcher.group(1).equals("<%= spree_dom_id tax_rate %>") && matcher.group(2).equals("cycle__odd____even__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='<%= spree_dom_id tax_rate %>']")
  private WebElement spree_dom_id_tax_rate_;
  
  public WebElement getElementOfSpree_dom_id_tax_rate_() {
    return spree_dom_id_tax_rate_;
  }
  
  public String getAttributeOfIdOnSpree_dom_id_tax_rate_() {
    return spree_dom_id_tax_rate_.getAttribute("id");
  }
  
  public String getTextOfSpree_dom_id_tax_rate_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("<%= spree_dom_id tax_rate %>") && matcher.group(2).equals("spree_dom_id_tax_rate_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_732']")
  private WebElement Spree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_tax_rate____;
  
  public WebElement getElementOfSpree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_tax_rate____() {
    return Spree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_tax_rate____;
  }
  
  public String getTextOfSpree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_tax_rate____() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_732") && matcher.group(2).equals("Spree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_tax_rate____")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_732']")
  private WebElement link_to_Spree_dot_t__add_one___spree_dot_new_admin_tax_rate_path_;
  
  public WebElement getElementOfLink_to_Spree_dot_t__add_one___spree_dot_new_admin_tax_rate_path_() {
    return link_to_Spree_dot_t__add_one___spree_dot_new_admin_tax_rate_path_;
  }
  
  public String getTextOfLink_to_Spree_dot_t__add_one___spree_dot_new_admin_tax_rate_path_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_732") && matcher.group(2).equals("link_to_Spree_dot_t__add_one___spree_dot_new_admin_tax_rate_path_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
