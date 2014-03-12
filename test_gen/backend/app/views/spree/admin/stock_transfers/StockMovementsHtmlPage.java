package test.backend.app.views.spree.admin.stock_transfers;

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

public class StockMovementsHtmlPage extends AbstractPage {
  public StockMovementsHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_646']")
  private WebElement Spree_dot_t__variant___;
  
  public WebElement getElementOfSpree_dot_t__variant___() {
    return Spree_dot_t__variant___;
  }
  
  public String getTextOfSpree_dot_t__variant___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_646") && matcher.group(2).equals("Spree_dot_t__variant___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_647']")
  private WebElement Spree_dot_t__sku___;
  
  public WebElement getElementOfSpree_dot_t__sku___() {
    return Spree_dot_t__sku___;
  }
  
  public String getTextOfSpree_dot_t__sku___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_647") && matcher.group(2).equals("Spree_dot_t__sku___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_648']")
  private WebElement Spree_dot_t__quantity___;
  
  public WebElement getElementOfSpree_dot_t__quantity___() {
    return Spree_dot_t__quantity___;
  }
  
  public String getTextOfSpree_dot_t__quantity___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_648") && matcher.group(2).equals("Spree_dot_t__quantity___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_649']")
  private WebElement Spree_dot_t__count_on_hand___;
  
  public WebElement getElementOfSpree_dot_t__count_on_hand___() {
    return Spree_dot_t__count_on_hand___;
  }
  
  public String getTextOfSpree_dot_t__count_on_hand___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_649") && matcher.group(2).equals("Spree_dot_t__count_on_hand___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_650']")
  private WebElement movement_dot_stock_item_dot_variant_dot_name_;
  
  public WebElement getElementOfMovement_dot_stock_item_dot_variant_dot_name_() {
    return movement_dot_stock_item_dot_variant_dot_name_;
  }
  
  public String getTextOfMovement_dot_stock_item_dot_variant_dot_name_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_650") && matcher.group(2).equals("movement_dot_stock_item_dot_variant_dot_name_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_651']")
  private WebElement movement_dot_stock_item_dot_variant_dot_sku_;
  
  public WebElement getElementOfMovement_dot_stock_item_dot_variant_dot_sku_() {
    return movement_dot_stock_item_dot_variant_dot_sku_;
  }
  
  public String getTextOfMovement_dot_stock_item_dot_variant_dot_sku_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_651") && matcher.group(2).equals("movement_dot_stock_item_dot_variant_dot_sku_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_652']")
  private WebElement movement_dot_quantity_;
  
  public WebElement getElementOfMovement_dot_quantity_() {
    return movement_dot_quantity_;
  }
  
  public String getTextOfMovement_dot_quantity_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_652") && matcher.group(2).equals("movement_dot_quantity_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_653']")
  private WebElement movement_dot_stock_item_dot_count_on_hand_;
  
  public WebElement getElementOfMovement_dot_stock_item_dot_count_on_hand_() {
    return movement_dot_stock_item_dot_count_on_hand_;
  }
  
  public String getTextOfMovement_dot_stock_item_dot_count_on_hand_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_653") && matcher.group(2).equals("movement_dot_stock_item_dot_count_on_hand_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
