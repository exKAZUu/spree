package test.backend.app.views.spree.admin.tax_categories;

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
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_694']")
  private WebElement button_link_to_Spree_dot_t__new_tax_category___new_object_url___icon_____icon_minus_plus____id_____admin_new_tax_categories_link__;
  
  public WebElement getElementOfButton_link_to_Spree_dot_t__new_tax_category___new_object_url___icon_____icon_minus_plus____id_____admin_new_tax_categories_link__() {
    return button_link_to_Spree_dot_t__new_tax_category___new_object_url___icon_____icon_minus_plus____id_____admin_new_tax_categories_link__;
  }
  
  public String getTextOfButton_link_to_Spree_dot_t__new_tax_category___new_object_url___icon_____icon_minus_plus____id_____admin_new_tax_categories_link__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_694") && matcher.group(2).equals("button_link_to_Spree_dot_t__new_tax_category___new_object_url___icon_____icon_minus_plus____id_____admin_new_tax_categories_link__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_695']")
  private WebElement Spree_dot_t__name__;
  
  public WebElement getElementOfSpree_dot_t__name__() {
    return Spree_dot_t__name__;
  }
  
  public String getTextOfSpree_dot_t__name__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_695") && matcher.group(2).equals("Spree_dot_t__name__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_696']")
  private WebElement Spree_dot_t__description__;
  
  public WebElement getElementOfSpree_dot_t__description__() {
    return Spree_dot_t__description__;
  }
  
  public String getTextOfSpree_dot_t__description__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_696") && matcher.group(2).equals("Spree_dot_t__description__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_697']")
  private WebElement Spree_dot_t__default__;
  
  public WebElement getElementOfSpree_dot_t__default__() {
    return Spree_dot_t__default__;
  }
  
  public String getTextOfSpree_dot_t__default__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_697") && matcher.group(2).equals("Spree_dot_t__default__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_698']")
  private WebElement tax_category_dot_name_;
  
  public WebElement getElementOfTax_category_dot_name_() {
    return tax_category_dot_name_;
  }
  
  public String getTextOfTax_category_dot_name_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_698") && matcher.group(2).equals("tax_category_dot_name_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_699']")
  private WebElement tax_category_dot_description_;
  
  public WebElement getElementOfTax_category_dot_description_() {
    return tax_category_dot_description_;
  }
  
  public String getTextOfTax_category_dot_description_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_699") && matcher.group(2).equals("tax_category_dot_description_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_700']")
  private WebElement tax_category_dot_is_default____Spree_dot_t__say_yes____Spree_dot_t__say_no__;
  
  public WebElement getElementOfTax_category_dot_is_default____Spree_dot_t__say_yes____Spree_dot_t__say_no__() {
    return tax_category_dot_is_default____Spree_dot_t__say_yes____Spree_dot_t__say_no__;
  }
  
  public String getTextOfTax_category_dot_is_default____Spree_dot_t__say_yes____Spree_dot_t__say_no__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_700") && matcher.group(2).equals("tax_category_dot_is_default____Spree_dot_t__say_yes____Spree_dot_t__say_no__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_701']")
  private WebElement link_to_delete_tax_category___no_text____true_;
  
  public WebElement getElementOfLink_to_delete_tax_category___no_text____true_() {
    return link_to_delete_tax_category___no_text____true_;
  }
  
  public String getTextOfLink_to_delete_tax_category___no_text____true_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_701") && matcher.group(2).equals("link_to_delete_tax_category___no_text____true_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_701']")
  private WebElement link_to_edit_tax_category___no_text____true_;
  
  public WebElement getElementOfLink_to_edit_tax_category___no_text____true_() {
    return link_to_edit_tax_category___no_text____true_;
  }
  
  public String getTextOfLink_to_edit_tax_category___no_text____true_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_701") && matcher.group(2).equals("link_to_edit_tax_category___no_text____true_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='<%= spree_dom_id tax_category %>']")
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
      if (matcher.group(1).equals("<%= spree_dom_id tax_category %>") && matcher.group(2).equals("cycle__odd____even__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='<%= spree_dom_id tax_category %>']")
  private WebElement spree_dom_id_tax_category_;
  
  public WebElement getElementOfSpree_dom_id_tax_category_() {
    return spree_dom_id_tax_category_;
  }
  
  public String getAttributeOfIdOnSpree_dom_id_tax_category_() {
    return spree_dom_id_tax_category_.getAttribute("id");
  }
  
  public String getTextOfSpree_dom_id_tax_category_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("<%= spree_dom_id tax_category %>") && matcher.group(2).equals("spree_dom_id_tax_category_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_702']")
  private WebElement Spree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_tax_category____;
  
  public WebElement getElementOfSpree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_tax_category____() {
    return Spree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_tax_category____;
  }
  
  public String getTextOfSpree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_tax_category____() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_702") && matcher.group(2).equals("Spree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_tax_category____")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_702']")
  private WebElement link_to_Spree_dot_t__add_one___spree_dot_new_admin_tax_category_path_;
  
  public WebElement getElementOfLink_to_Spree_dot_t__add_one___spree_dot_new_admin_tax_category_path_() {
    return link_to_Spree_dot_t__add_one___spree_dot_new_admin_tax_category_path_;
  }
  
  public String getTextOfLink_to_Spree_dot_t__add_one___spree_dot_new_admin_tax_category_path_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_702") && matcher.group(2).equals("link_to_Spree_dot_t__add_one___spree_dot_new_admin_tax_category_path_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
