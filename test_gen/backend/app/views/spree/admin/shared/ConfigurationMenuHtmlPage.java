package test.backend.app.views.spree.admin.shared;

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

public class ConfigurationMenuHtmlPage extends AbstractPage {
  public ConfigurationMenuHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_504']")
  private WebElement configurations_sidebar_menu_item_Spree_dot_t__stock_transfers___admin_stock_transfers_path_;
  
  public WebElement getElementOfConfigurations_sidebar_menu_item_Spree_dot_t__stock_transfers___admin_stock_transfers_path_() {
    return configurations_sidebar_menu_item_Spree_dot_t__stock_transfers___admin_stock_transfers_path_;
  }
  
  public String getTextOfConfigurations_sidebar_menu_item_Spree_dot_t__stock_transfers___admin_stock_transfers_path_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_504") && matcher.group(2).equals("configurations_sidebar_menu_item_Spree_dot_t__stock_transfers___admin_stock_transfers_path_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_504']")
  private WebElement configurations_sidebar_menu_item_Spree_dot_t__mail_method_settings___edit_admin_mail_method_path_;
  
  public WebElement getElementOfConfigurations_sidebar_menu_item_Spree_dot_t__mail_method_settings___edit_admin_mail_method_path_() {
    return configurations_sidebar_menu_item_Spree_dot_t__mail_method_settings___edit_admin_mail_method_path_;
  }
  
  public String getTextOfConfigurations_sidebar_menu_item_Spree_dot_t__mail_method_settings___edit_admin_mail_method_path_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_504") && matcher.group(2).equals("configurations_sidebar_menu_item_Spree_dot_t__mail_method_settings___edit_admin_mail_method_path_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_504']")
  private WebElement configurations_sidebar_menu_item_Spree_dot_t__shipping_methods___admin_shipping_methods_path_;
  
  public WebElement getElementOfConfigurations_sidebar_menu_item_Spree_dot_t__shipping_methods___admin_shipping_methods_path_() {
    return configurations_sidebar_menu_item_Spree_dot_t__shipping_methods___admin_shipping_methods_path_;
  }
  
  public String getTextOfConfigurations_sidebar_menu_item_Spree_dot_t__shipping_methods___admin_shipping_methods_path_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_504") && matcher.group(2).equals("configurations_sidebar_menu_item_Spree_dot_t__shipping_methods___admin_shipping_methods_path_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_504']")
  private WebElement configurations_sidebar_menu_item_Spree_dot_t__analytics_trackers___admin_trackers_path_;
  
  public WebElement getElementOfConfigurations_sidebar_menu_item_Spree_dot_t__analytics_trackers___admin_trackers_path_() {
    return configurations_sidebar_menu_item_Spree_dot_t__analytics_trackers___admin_trackers_path_;
  }
  
  public String getTextOfConfigurations_sidebar_menu_item_Spree_dot_t__analytics_trackers___admin_trackers_path_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_504") && matcher.group(2).equals("configurations_sidebar_menu_item_Spree_dot_t__analytics_trackers___admin_trackers_path_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_504']")
  private WebElement configurations_sidebar_menu_item_Spree_dot_t__taxonomies___admin_taxonomies_path_;
  
  public WebElement getElementOfConfigurations_sidebar_menu_item_Spree_dot_t__taxonomies___admin_taxonomies_path_() {
    return configurations_sidebar_menu_item_Spree_dot_t__taxonomies___admin_taxonomies_path_;
  }
  
  public String getTextOfConfigurations_sidebar_menu_item_Spree_dot_t__taxonomies___admin_taxonomies_path_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_504") && matcher.group(2).equals("configurations_sidebar_menu_item_Spree_dot_t__taxonomies___admin_taxonomies_path_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_504']")
  private WebElement configurations_sidebar_menu_item_Spree_dot_t__shipping_categories___admin_shipping_categories_path_;
  
  public WebElement getElementOfConfigurations_sidebar_menu_item_Spree_dot_t__shipping_categories___admin_shipping_categories_path_() {
    return configurations_sidebar_menu_item_Spree_dot_t__shipping_categories___admin_shipping_categories_path_;
  }
  
  public String getTextOfConfigurations_sidebar_menu_item_Spree_dot_t__shipping_categories___admin_shipping_categories_path_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_504") && matcher.group(2).equals("configurations_sidebar_menu_item_Spree_dot_t__shipping_categories___admin_shipping_categories_path_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_504']")
  private WebElement configurations_sidebar_menu_item_Spree_dot_t__zones___admin_zones_path_;
  
  public WebElement getElementOfConfigurations_sidebar_menu_item_Spree_dot_t__zones___admin_zones_path_() {
    return configurations_sidebar_menu_item_Spree_dot_t__zones___admin_zones_path_;
  }
  
  public String getTextOfConfigurations_sidebar_menu_item_Spree_dot_t__zones___admin_zones_path_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_504") && matcher.group(2).equals("configurations_sidebar_menu_item_Spree_dot_t__zones___admin_zones_path_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_504']")
  private WebElement configurations_sidebar_menu_item_Spree_dot_t__states___admin_country_states_path_Spree__Config__default_country_id___;
  
  public WebElement getElementOfConfigurations_sidebar_menu_item_Spree_dot_t__states___admin_country_states_path_Spree__Config__default_country_id___() {
    return configurations_sidebar_menu_item_Spree_dot_t__states___admin_country_states_path_Spree__Config__default_country_id___;
  }
  
  public String getTextOfConfigurations_sidebar_menu_item_Spree_dot_t__states___admin_country_states_path_Spree__Config__default_country_id___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_504") && matcher.group(2).equals("configurations_sidebar_menu_item_Spree_dot_t__states___admin_country_states_path_Spree__Config__default_country_id___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_504']")
  private WebElement configurations_sidebar_menu_item_Spree_dot_t__payment_methods___admin_payment_methods_path_;
  
  public WebElement getElementOfConfigurations_sidebar_menu_item_Spree_dot_t__payment_methods___admin_payment_methods_path_() {
    return configurations_sidebar_menu_item_Spree_dot_t__payment_methods___admin_payment_methods_path_;
  }
  
  public String getTextOfConfigurations_sidebar_menu_item_Spree_dot_t__payment_methods___admin_payment_methods_path_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_504") && matcher.group(2).equals("configurations_sidebar_menu_item_Spree_dot_t__payment_methods___admin_payment_methods_path_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_504']")
  private WebElement configurations_sidebar_menu_item_Spree_dot_t__tax_rates___admin_tax_rates_path_;
  
  public WebElement getElementOfConfigurations_sidebar_menu_item_Spree_dot_t__tax_rates___admin_tax_rates_path_() {
    return configurations_sidebar_menu_item_Spree_dot_t__tax_rates___admin_tax_rates_path_;
  }
  
  public String getTextOfConfigurations_sidebar_menu_item_Spree_dot_t__tax_rates___admin_tax_rates_path_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_504") && matcher.group(2).equals("configurations_sidebar_menu_item_Spree_dot_t__tax_rates___admin_tax_rates_path_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_504']")
  private WebElement configurations_sidebar_menu_item_Spree_dot_t__stock_locations___spree_dot_admin_stock_locations_path_;
  
  public WebElement getElementOfConfigurations_sidebar_menu_item_Spree_dot_t__stock_locations___spree_dot_admin_stock_locations_path_() {
    return configurations_sidebar_menu_item_Spree_dot_t__stock_locations___spree_dot_admin_stock_locations_path_;
  }
  
  public String getTextOfConfigurations_sidebar_menu_item_Spree_dot_t__stock_locations___spree_dot_admin_stock_locations_path_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_504") && matcher.group(2).equals("configurations_sidebar_menu_item_Spree_dot_t__stock_locations___spree_dot_admin_stock_locations_path_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_504']")
  private WebElement configurations_sidebar_menu_item_Spree_dot_t__general_settings___edit_admin_general_settings_path_;
  
  public WebElement getElementOfConfigurations_sidebar_menu_item_Spree_dot_t__general_settings___edit_admin_general_settings_path_() {
    return configurations_sidebar_menu_item_Spree_dot_t__general_settings___edit_admin_general_settings_path_;
  }
  
  public String getTextOfConfigurations_sidebar_menu_item_Spree_dot_t__general_settings___edit_admin_general_settings_path_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_504") && matcher.group(2).equals("configurations_sidebar_menu_item_Spree_dot_t__general_settings___edit_admin_general_settings_path_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_504']")
  private WebElement configurations_sidebar_menu_item_Spree_dot_t__countries___admin_countries_path_;
  
  public WebElement getElementOfConfigurations_sidebar_menu_item_Spree_dot_t__countries___admin_countries_path_() {
    return configurations_sidebar_menu_item_Spree_dot_t__countries___admin_countries_path_;
  }
  
  public String getTextOfConfigurations_sidebar_menu_item_Spree_dot_t__countries___admin_countries_path_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_504") && matcher.group(2).equals("configurations_sidebar_menu_item_Spree_dot_t__countries___admin_countries_path_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_504']")
  private WebElement configurations_sidebar_menu_item_Spree_dot_t__tax_settings___edit_admin_tax_settings_path_;
  
  public WebElement getElementOfConfigurations_sidebar_menu_item_Spree_dot_t__tax_settings___edit_admin_tax_settings_path_() {
    return configurations_sidebar_menu_item_Spree_dot_t__tax_settings___edit_admin_tax_settings_path_;
  }
  
  public String getTextOfConfigurations_sidebar_menu_item_Spree_dot_t__tax_settings___edit_admin_tax_settings_path_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_504") && matcher.group(2).equals("configurations_sidebar_menu_item_Spree_dot_t__tax_settings___edit_admin_tax_settings_path_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_504']")
  private WebElement configurations_sidebar_menu_item_Spree_dot_t__tax_categories___admin_tax_categories_path_;
  
  public WebElement getElementOfConfigurations_sidebar_menu_item_Spree_dot_t__tax_categories___admin_tax_categories_path_() {
    return configurations_sidebar_menu_item_Spree_dot_t__tax_categories___admin_tax_categories_path_;
  }
  
  public String getTextOfConfigurations_sidebar_menu_item_Spree_dot_t__tax_categories___admin_tax_categories_path_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_504") && matcher.group(2).equals("configurations_sidebar_menu_item_Spree_dot_t__tax_categories___admin_tax_categories_path_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
