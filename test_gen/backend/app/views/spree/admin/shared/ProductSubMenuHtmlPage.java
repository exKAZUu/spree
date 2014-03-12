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

public class ProductSubMenuHtmlPage extends AbstractPage {
  public ProductSubMenuHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='sub_nav']")
  private WebElement tab__taxons_;
  
  public WebElement getElementOfTab__taxons_() {
    return tab__taxons_;
  }
  
  public String getTextOfTab__taxons_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("sub_nav") && matcher.group(2).equals("tab__taxons_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='sub_nav']")
  private WebElement tab__prototypes_;
  
  public WebElement getElementOfTab__prototypes_() {
    return tab__prototypes_;
  }
  
  public String getTextOfTab__prototypes_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("sub_nav") && matcher.group(2).equals("tab__prototypes_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='sub_nav']")
  private WebElement tab__properties_;
  
  public WebElement getElementOfTab__properties_() {
    return tab__properties_;
  }
  
  public String getTextOfTab__properties_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("sub_nav") && matcher.group(2).equals("tab__properties_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='sub_nav']")
  private WebElement tab__option_types___match_path______divide_option_types__;
  
  public WebElement getElementOfTab__option_types___match_path______divide_option_types__() {
    return tab__option_types___match_path______divide_option_types__;
  }
  
  public String getTextOfTab__option_types___match_path______divide_option_types__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("sub_nav") && matcher.group(2).equals("tab__option_types___match_path______divide_option_types__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='sub_nav']")
  private WebElement tab__taxonomies_;
  
  public WebElement getElementOfTab__taxonomies_() {
    return tab__taxonomies_;
  }
  
  public String getTextOfTab__taxonomies_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("sub_nav") && matcher.group(2).equals("tab__taxonomies_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='sub_nav']")
  private WebElement tab__products___match_path______divide_products__;
  
  public WebElement getElementOfTab__products___match_path______divide_products__() {
    return tab__products___match_path______divide_products__;
  }
  
  public String getTextOfTab__products___match_path______divide_products__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("sub_nav") && matcher.group(2).equals("tab__products___match_path______divide_products__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
