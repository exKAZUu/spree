package test.backend.app.views.spree.admin.inventory_units;

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

public class AdjustHtmlPage extends AbstractPage {
  public AdjustHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_77']")
  private WebElement Spree_dot_t__inventory_adjustment__;
  
  public WebElement getElementOfSpree_dot_t__inventory_adjustment__() {
    return Spree_dot_t__inventory_adjustment__;
  }
  
  public String getTextOfSpree_dot_t__inventory_adjustment__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_77") && matcher.group(2).equals("Spree_dot_t__inventory_adjustment__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_78']")
  private WebElement Spree_dot_t__sku__;
  
  public WebElement getElementOfSpree_dot_t__sku__() {
    return Spree_dot_t__sku__;
  }
  
  public String getTextOfSpree_dot_t__sku__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_78") && matcher.group(2).equals("Spree_dot_t__sku__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_79']")
  private WebElement Spree_dot_t__product__;
  
  public WebElement getElementOfSpree_dot_t__product__() {
    return Spree_dot_t__product__;
  }
  
  public String getTextOfSpree_dot_t__product__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_79") && matcher.group(2).equals("Spree_dot_t__product__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_80']")
  private WebElement Spree_dot_t__options__;
  
  public WebElement getElementOfSpree_dot_t__options__() {
    return Spree_dot_t__options__;
  }
  
  public String getTextOfSpree_dot_t__options__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_80") && matcher.group(2).equals("Spree_dot_t__options__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_81']")
  private WebElement Spree_dot_t__adjustment__;
  
  public WebElement getElementOfSpree_dot_t__adjustment__() {
    return Spree_dot_t__adjustment__;
  }
  
  public String getTextOfSpree_dot_t__adjustment__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_81") && matcher.group(2).equals("Spree_dot_t__adjustment__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_82']")
  private WebElement _variant_dot_sku_;
  
  public WebElement getElementOf_variant_dot_sku_() {
    return _variant_dot_sku_;
  }
  
  public String getTextOf_variant_dot_sku_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_82") && matcher.group(2).equals("_variant_dot_sku_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_83']")
  private WebElement _variant_dot_product_dot_name_;
  
  public WebElement getElementOf_variant_dot_product_dot_name_() {
    return _variant_dot_product_dot_name_;
  }
  
  public String getTextOf_variant_dot_product_dot_name_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_83") && matcher.group(2).equals("_variant_dot_product_dot_name_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_84']")
  private WebElement variant_options__variant_;
  
  public WebElement getElementOfVariant_options__variant_() {
    return variant_options__variant_;
  }
  
  public String getTextOfVariant_options__variant_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_84") && matcher.group(2).equals("variant_options__variant_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_85']")
  private WebElement text_field__level___adjustment___class_____quantity__;
  
  public WebElement getElementOfText_field__level___adjustment___class_____quantity__() {
    return text_field__level___adjustment___class_____quantity__;
  }
  
  public String getTextOfText_field__level___adjustment___class_____quantity__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_85") && matcher.group(2).equals("text_field__level___adjustment___class_____quantity__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
