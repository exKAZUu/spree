package test.backend.app.views.spree.admin.taxons;

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

public class TaxonTableHtmlPage extends AbstractPage {
  public TaxonTableHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_756']")
  private WebElement Spree_dot_t__name__;
  
  public WebElement getElementOfSpree_dot_t__name__() {
    return Spree_dot_t__name__;
  }
  
  public String getTextOfSpree_dot_t__name__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_756") && matcher.group(2).equals("Spree_dot_t__name__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_757']")
  private WebElement Spree_dot_t__path__;
  
  public WebElement getElementOfSpree_dot_t__path__() {
    return Spree_dot_t__path__;
  }
  
  public String getTextOfSpree_dot_t__path__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_757") && matcher.group(2).equals("Spree_dot_t__path__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_758']")
  private WebElement taxon_dot_name_;
  
  public WebElement getElementOfTaxon_dot_name_() {
    return taxon_dot_name_;
  }
  
  public String getTextOfTaxon_dot_name_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_758") && matcher.group(2).equals("taxon_dot_name_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_759']")
  private WebElement taxon_path_taxon_;
  
  public WebElement getElementOfTaxon_path_taxon_() {
    return taxon_path_taxon_;
  }
  
  public String getTextOfTaxon_path_taxon_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_759") && matcher.group(2).equals("taxon_path_taxon_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_760']")
  private WebElement link_to_delete_taxon___url____remove_admin_product_taxon_url__product__taxon____name____icon__delete____plus_______plus__Spree_dot_t__remove__;
  
  public WebElement getElementOfLink_to_delete_taxon___url____remove_admin_product_taxon_url__product__taxon____name____icon__delete____plus_______plus__Spree_dot_t__remove__() {
    return link_to_delete_taxon___url____remove_admin_product_taxon_url__product__taxon____name____icon__delete____plus_______plus__Spree_dot_t__remove__;
  }
  
  public String getTextOfLink_to_delete_taxon___url____remove_admin_product_taxon_url__product__taxon____name____icon__delete____plus_______plus__Spree_dot_t__remove__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_760") && matcher.group(2).equals("link_to_delete_taxon___url____remove_admin_product_taxon_url__product__taxon____name____icon__delete____plus_______plus__Spree_dot_t__remove__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='<%= spree_dom_id(taxon) %>']")
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
      if (matcher.group(1).equals("<%= spree_dom_id(taxon) %>") && matcher.group(2).equals("cycle__odd____even__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='<%= spree_dom_id(taxon) %>']")
  private WebElement spree_dom_id_taxon__;
  
  public WebElement getElementOfSpree_dom_id_taxon__() {
    return spree_dom_id_taxon__;
  }
  
  public String getAttributeOfIdOnSpree_dom_id_taxon__() {
    return spree_dom_id_taxon__.getAttribute("id");
  }
  
  public String getTextOfSpree_dom_id_taxon__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("<%= spree_dom_id(taxon) %>") && matcher.group(2).equals("spree_dom_id_taxon__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_761']")
  private WebElement Spree_dot_t__none__;
  
  public WebElement getElementOfSpree_dot_t__none__() {
    return Spree_dot_t__none__;
  }
  
  public String getTextOfSpree_dot_t__none__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_761") && matcher.group(2).equals("Spree_dot_t__none__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
