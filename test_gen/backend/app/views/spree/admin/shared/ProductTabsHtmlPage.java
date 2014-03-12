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

public class ProductTabsHtmlPage extends AbstractPage {
  public ProductTabsHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_535']")
  private WebElement _product_dot_sku_;
  
  public WebElement getElementOf_product_dot_sku_() {
    return _product_dot_sku_;
  }
  
  public String getTextOf_product_dot_sku_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_535") && matcher.group(2).equals("_product_dot_sku_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_536']")
  private WebElement content_tag__li___class______active__if_current_____Stock_Management___do_;
  
  public WebElement getElementOfContent_tag__li___class______active__if_current_____Stock_Management___do_() {
    return content_tag__li___class______active__if_current_____Stock_Management___do_;
  }
  
  public String getTextOfContent_tag__li___class______active__if_current_____Stock_Management___do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_536") && matcher.group(2).equals("content_tag__li___class______active__if_current_____Stock_Management___do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_536']")
  private WebElement content_tag__li___class______active__if_current_____Product_Properties___do_;
  
  public WebElement getElementOfContent_tag__li___class______active__if_current_____Product_Properties___do_() {
    return content_tag__li___class______active__if_current_____Product_Properties___do_;
  }
  
  public String getTextOfContent_tag__li___class______active__if_current_____Product_Properties___do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_536") && matcher.group(2).equals("content_tag__li___class______active__if_current_____Product_Properties___do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_536']")
  private WebElement content_tag__li___class______active__if_current_____Variants___do_;
  
  public WebElement getElementOfContent_tag__li___class______active__if_current_____Variants___do_() {
    return content_tag__li___class______active__if_current_____Variants___do_;
  }
  
  public String getTextOfContent_tag__li___class______active__if_current_____Variants___do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_536") && matcher.group(2).equals("content_tag__li___class______active__if_current_____Variants___do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_536']")
  private WebElement content_tag__li___class______active__if_current_____Images___do_;
  
  public WebElement getElementOfContent_tag__li___class______active__if_current_____Images___do_() {
    return content_tag__li___class______active__if_current_____Images___do_;
  }
  
  public String getTextOfContent_tag__li___class______active__if_current_____Images___do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_536") && matcher.group(2).equals("content_tag__li___class______active__if_current_____Images___do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_536']")
  private WebElement link_to_with_icon__icon_minus_edit___Spree_dot_t__product_details___edit_admin_product_url__product__;
  
  public WebElement getElementOfLink_to_with_icon__icon_minus_edit___Spree_dot_t__product_details___edit_admin_product_url__product__() {
    return link_to_with_icon__icon_minus_edit___Spree_dot_t__product_details___edit_admin_product_url__product__;
  }
  
  public String getTextOfLink_to_with_icon__icon_minus_edit___Spree_dot_t__product_details___edit_admin_product_url__product__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_536") && matcher.group(2).equals("link_to_with_icon__icon_minus_edit___Spree_dot_t__product_details___edit_admin_product_url__product__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_536']")
  private WebElement content_tag__li___class______active__if_current_____Product_Details___do_;
  
  public WebElement getElementOfContent_tag__li___class______active__if_current_____Product_Details___do_() {
    return content_tag__li___class______active__if_current_____Product_Details___do_;
  }
  
  public String getTextOfContent_tag__li___class______active__if_current_____Product_Details___do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_536") && matcher.group(2).equals("content_tag__li___class______active__if_current_____Product_Details___do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_536']")
  private WebElement link_to_with_icon__icon_minus_picture___Spree_dot_t__images___admin_product_images_url__product__;
  
  public WebElement getElementOfLink_to_with_icon__icon_minus_picture___Spree_dot_t__images___admin_product_images_url__product__() {
    return link_to_with_icon__icon_minus_picture___Spree_dot_t__images___admin_product_images_url__product__;
  }
  
  public String getTextOfLink_to_with_icon__icon_minus_picture___Spree_dot_t__images___admin_product_images_url__product__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_536") && matcher.group(2).equals("link_to_with_icon__icon_minus_picture___Spree_dot_t__images___admin_product_images_url__product__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_536']")
  private WebElement link_to_with_icon__icon_minus_th_minus_large___Spree_dot_t__variants____admin_product_variants_url__product__;
  
  public WebElement getElementOfLink_to_with_icon__icon_minus_th_minus_large___Spree_dot_t__variants____admin_product_variants_url__product__() {
    return link_to_with_icon__icon_minus_th_minus_large___Spree_dot_t__variants____admin_product_variants_url__product__;
  }
  
  public String getTextOfLink_to_with_icon__icon_minus_th_minus_large___Spree_dot_t__variants____admin_product_variants_url__product__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_536") && matcher.group(2).equals("link_to_with_icon__icon_minus_th_minus_large___Spree_dot_t__variants____admin_product_variants_url__product__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_536']")
  private WebElement link_to_with_icon__icon_minus_tasks___Spree_dot_t__stock_management___stock_admin_product_url__product__;
  
  public WebElement getElementOfLink_to_with_icon__icon_minus_tasks___Spree_dot_t__stock_management___stock_admin_product_url__product__() {
    return link_to_with_icon__icon_minus_tasks___Spree_dot_t__stock_management___stock_admin_product_url__product__;
  }
  
  public String getTextOfLink_to_with_icon__icon_minus_tasks___Spree_dot_t__stock_management___stock_admin_product_url__product__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_536") && matcher.group(2).equals("link_to_with_icon__icon_minus_tasks___Spree_dot_t__stock_management___stock_admin_product_url__product__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_536']")
  private WebElement link_to_with_icon__icon_minus_tasks___Spree_dot_t__product_properties___admin_product_product_properties_url__product__;
  
  public WebElement getElementOfLink_to_with_icon__icon_minus_tasks___Spree_dot_t__product_properties___admin_product_product_properties_url__product__() {
    return link_to_with_icon__icon_minus_tasks___Spree_dot_t__product_properties___admin_product_product_properties_url__product__;
  }
  
  public String getTextOfLink_to_with_icon__icon_minus_tasks___Spree_dot_t__product_properties___admin_product_product_properties_url__product__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_536") && matcher.group(2).equals("link_to_with_icon__icon_minus_tasks___Spree_dot_t__product_properties___admin_product_product_properties_url__product__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
