package test.backend.app.views.spree.admin.taxonomies;

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

public class ListHtmlPage extends AbstractPage {
  public ListHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_738']")
  private WebElement Spree_dot_t__name__;
  
  public WebElement getElementOfSpree_dot_t__name__() {
    return Spree_dot_t__name__;
  }
  
  public String getTextOfSpree_dot_t__name__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_738") && matcher.group(2).equals("Spree_dot_t__name__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_739']")
  private WebElement taxonomy_dot_name_;
  
  public WebElement getElementOfTaxonomy_dot_name_() {
    return taxonomy_dot_name_;
  }
  
  public String getTextOfTaxonomy_dot_name_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_739") && matcher.group(2).equals("taxonomy_dot_name_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_740']")
  private WebElement link_to_edit_taxonomy_dot_id___no_text____true_;
  
  public WebElement getElementOfLink_to_edit_taxonomy_dot_id___no_text____true_() {
    return link_to_edit_taxonomy_dot_id___no_text____true_;
  }
  
  public String getTextOfLink_to_edit_taxonomy_dot_id___no_text____true_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_740") && matcher.group(2).equals("link_to_edit_taxonomy_dot_id___no_text____true_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_740']")
  private WebElement link_to_delete_taxonomy___no_text____true_;
  
  public WebElement getElementOfLink_to_delete_taxonomy___no_text____true_() {
    return link_to_delete_taxonomy___no_text____true_;
  }
  
  public String getTextOfLink_to_delete_taxonomy___no_text____true_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_740") && matcher.group(2).equals("link_to_delete_taxonomy___no_text____true_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='<%= spree_dom_id taxonomy %>']")
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
      if (matcher.group(1).equals("<%= spree_dom_id taxonomy %>") && matcher.group(2).equals("cycle__odd____even__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='<%= spree_dom_id taxonomy %>']")
  private WebElement spree_dom_id_taxonomy_;
  
  public WebElement getElementOfSpree_dom_id_taxonomy_() {
    return spree_dom_id_taxonomy_;
  }
  
  public String getAttributeOfIdOnSpree_dom_id_taxonomy_() {
    return spree_dom_id_taxonomy_.getAttribute("id");
  }
  
  public String getTextOfSpree_dom_id_taxonomy_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("<%= spree_dom_id taxonomy %>") && matcher.group(2).equals("spree_dom_id_taxonomy_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='listing_taxonomies']")
  private WebElement update_positions_admin_taxonomies_url_;
  
  public WebElement getElementOfUpdate_positions_admin_taxonomies_url_() {
    return update_positions_admin_taxonomies_url_;
  }
  
  public String getAttributeOfData-sortable-linkOnUpdate_positions_admin_taxonomies_url_() {
    return update_positions_admin_taxonomies_url_.getAttribute("data-sortable-link");
  }
  
  public String getTextOfUpdate_positions_admin_taxonomies_url_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("listing_taxonomies") && matcher.group(2).equals("update_positions_admin_taxonomies_url_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
