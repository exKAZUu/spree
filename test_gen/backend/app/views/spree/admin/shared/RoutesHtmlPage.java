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

public class RoutesHtmlPage extends AbstractPage {
  public RoutesHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_541']")
  private WebElement spree_dot_api_taxon_products_url__format_____json___;
  
  public WebElement getElementOfSpree_dot_api_taxon_products_url__format_____json___() {
    return spree_dot_api_taxon_products_url__format_____json___;
  }
  
  public String getTextOfSpree_dot_api_taxon_products_url__format_____json___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_541") && matcher.group(2).equals("spree_dot_api_taxon_products_url__format_____json___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_541']")
  private WebElement spree_dot_admin_search_users_url__format_____json___;
  
  public WebElement getElementOfSpree_dot_admin_search_users_url__format_____json___() {
    return spree_dot_admin_search_users_url__format_____json___;
  }
  
  public String getTextOfSpree_dot_admin_search_users_url__format_____json___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_541") && matcher.group(2).equals("spree_dot_admin_search_users_url__format_____json___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_541']")
  private WebElement spree_dot_api_checkouts_url__format_____json___;
  
  public WebElement getElementOfSpree_dot_api_checkouts_url__format_____json___() {
    return spree_dot_api_checkouts_url__format_____json___;
  }
  
  public String getTextOfSpree_dot_api_checkouts_url__format_____json___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_541") && matcher.group(2).equals("spree_dot_api_checkouts_url__format_____json___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_541']")
  private WebElement spree_dot_api_taxons_url__format_____json___;
  
  public WebElement getElementOfSpree_dot_api_taxons_url__format_____json___() {
    return spree_dot_api_taxons_url__format_____json___;
  }
  
  public String getTextOfSpree_dot_api_taxons_url__format_____json___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_541") && matcher.group(2).equals("spree_dot_api_taxons_url__format_____json___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_541']")
  private WebElement spree_dot_api_order_payments_url__format_____json___if_params__order_id__;
  
  public WebElement getElementOfSpree_dot_api_order_payments_url__format_____json___if_params__order_id__() {
    return spree_dot_api_order_payments_url__format_____json___if_params__order_id__;
  }
  
  public String getTextOfSpree_dot_api_order_payments_url__format_____json___if_params__order_id__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_541") && matcher.group(2).equals("spree_dot_api_order_payments_url__format_____json___if_params__order_id__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_541']")
  private WebElement spree_dot_api_stock_location_stock_items_url__format_____json___if_params__stock_location_id__;
  
  public WebElement getElementOfSpree_dot_api_stock_location_stock_items_url__format_____json___if_params__stock_location_id__() {
    return spree_dot_api_stock_location_stock_items_url__format_____json___if_params__stock_location_id__;
  }
  
  public String getTextOfSpree_dot_api_stock_location_stock_items_url__format_____json___if_params__stock_location_id__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_541") && matcher.group(2).equals("spree_dot_api_stock_location_stock_items_url__format_____json___if_params__stock_location_id__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_541']")
  private WebElement spree_dot_api_stock_locations_url__format_____json___;
  
  public WebElement getElementOfSpree_dot_api_stock_locations_url__format_____json___() {
    return spree_dot_api_stock_locations_url__format_____json___;
  }
  
  public String getTextOfSpree_dot_api_stock_locations_url__format_____json___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_541") && matcher.group(2).equals("spree_dot_api_stock_locations_url__format_____json___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_541']")
  private WebElement spree_dot_api_option_types_url__format_____json___;
  
  public WebElement getElementOfSpree_dot_api_option_types_url__format_____json___() {
    return spree_dot_api_option_types_url__format_____json___;
  }
  
  public String getTextOfSpree_dot_api_option_types_url__format_____json___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_541") && matcher.group(2).equals("spree_dot_api_option_types_url__format_____json___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_541']")
  private WebElement spree_dot_api_orders_url__format_____json___;
  
  public WebElement getElementOfSpree_dot_api_orders_url__format_____json___() {
    return spree_dot_api_orders_url__format_____json___;
  }
  
  public String getTextOfSpree_dot_api_orders_url__format_____json___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_541") && matcher.group(2).equals("spree_dot_api_orders_url__format_____json___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_541']")
  private WebElement spree_dot_api_products_url__format_____json___;
  
  public WebElement getElementOfSpree_dot_api_products_url__format_____json___() {
    return spree_dot_api_products_url__format_____json___;
  }
  
  public String getTextOfSpree_dot_api_products_url__format_____json___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_541") && matcher.group(2).equals("spree_dot_api_products_url__format_____json___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_541']")
  private WebElement spree_dot_api_classifications_url__format_____json___;
  
  public WebElement getElementOfSpree_dot_api_classifications_url__format_____json___() {
    return spree_dot_api_classifications_url__format_____json___;
  }
  
  public String getTextOfSpree_dot_api_classifications_url__format_____json___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_541") && matcher.group(2).equals("spree_dot_api_classifications_url__format_____json___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_541']")
  private WebElement spree_dot_api_variants_url__format_____json___;
  
  public WebElement getElementOfSpree_dot_api_variants_url__format_____json___() {
    return spree_dot_api_variants_url__format_____json___;
  }
  
  public String getTextOfSpree_dot_api_variants_url__format_____json___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_541") && matcher.group(2).equals("spree_dot_api_variants_url__format_____json___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
