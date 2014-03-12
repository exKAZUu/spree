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

public class TaxonHtmlPage extends AbstractPage {
  public TaxonHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_741']")
  private WebElement A_____child_dot_name___;
  
  public WebElement getElementOfA_____child_dot_name___() {
    return A_____child_dot_name___;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_741']")
  private WebElement child_dot_name_;
  
  public WebElement getElementOfChild_dot_name_() {
    return child_dot_name_;
  }
  
  public String getTextOfChild_dot_name_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_741") && matcher.group(2).equals("child_dot_name_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_741']")
  private WebElement child_dot_icon_dot_url_;
  
  public WebElement getElementOfChild_dot_icon_dot_url_() {
    return child_dot_icon_dot_url_;
  }
  
  public String getAttributeOfStyleOnChild_dot_icon_dot_url_() {
    return child_dot_icon_dot_url_.getAttribute("style");
  }
  
  public String getTextOfChild_dot_icon_dot_url_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_741") && matcher.group(2).equals("child_dot_icon_dot_url_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='<%= child.id %>']")
  private WebElement child_dot_id_;
  
  public WebElement getElementOfChild_dot_id_() {
    return child_dot_id_;
  }
  
  public String getAttributeOfIdOnChild_dot_id_() {
    return child_dot_id_.getAttribute("id");
  }
  
  public String getTextOfChild_dot_id_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("<%= child.id %>") && matcher.group(2).equals("child_dot_id_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='<%= child.id %>']")
  private WebElement render__partial_____taxon____locals_______taxon____child___;
  
  public WebElement getElementOfRender__partial_____taxon____locals_______taxon____child___() {
    return render__partial_____taxon____locals_______taxon____child___;
  }
  
  public String getTextOfRender__partial_____taxon____locals_______taxon____child___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("<%= child.id %>") && matcher.group(2).equals("render__partial_____taxon____locals_______taxon____child___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
