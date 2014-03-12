package test.backend.app.views.spree.admin.adjustments;

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

public class AdjustmentsTableHtmlPage extends AbstractPage {
  public AdjustmentsTableHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_7']")
  private WebElement Spree_dot_t__adjustable__;
  
  public WebElement getElementOfSpree_dot_t__adjustable__() {
    return Spree_dot_t__adjustable__;
  }
  
  public String getTextOfSpree_dot_t__adjustable__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_7") && matcher.group(2).equals("Spree_dot_t__adjustable__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_8']")
  private WebElement Spree_dot_t__description__;
  
  public WebElement getElementOfSpree_dot_t__description__() {
    return Spree_dot_t__description__;
  }
  
  public String getTextOfSpree_dot_t__description__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_8") && matcher.group(2).equals("Spree_dot_t__description__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_9']")
  private WebElement Spree_dot_t__amount__;
  
  public WebElement getElementOfSpree_dot_t__amount__() {
    return Spree_dot_t__amount__;
  }
  
  public String getTextOfSpree_dot_t__amount__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_9") && matcher.group(2).equals("Spree_dot_t__amount__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_10']")
  private WebElement Spree_dot_t__state__;
  
  public WebElement getElementOfSpree_dot_t__state__() {
    return Spree_dot_t__state__;
  }
  
  public String getTextOfSpree_dot_t__state__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_10") && matcher.group(2).equals("Spree_dot_t__state__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_12']")
  private WebElement button_to_Spree_dot_t__open_all_adjustments___open_adjustments_admin_order_path__order____method_____get_;
  
  public WebElement getElementOfButton_to_Spree_dot_t__open_all_adjustments___open_adjustments_admin_order_path__order____method_____get_() {
    return button_to_Spree_dot_t__open_all_adjustments___open_adjustments_admin_order_path__order____method_____get_;
  }
  
  public String getTextOfButton_to_Spree_dot_t__open_all_adjustments___open_adjustments_admin_order_path__order____method_____get_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_12") && matcher.group(2).equals("button_to_Spree_dot_t__open_all_adjustments___open_adjustments_admin_order_path__order____method_____get_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_12']")
  private WebElement button_to_Spree_dot_t__close_all_adjustments___close_adjustments_admin_order_path__order____method_____get_;
  
  public WebElement getElementOfButton_to_Spree_dot_t__close_all_adjustments___close_adjustments_admin_order_path__order____method_____get_() {
    return button_to_Spree_dot_t__close_all_adjustments___close_adjustments_admin_order_path__order____method_____get_;
  }
  
  public String getTextOfButton_to_Spree_dot_t__close_all_adjustments___close_adjustments_admin_order_path__order____method_____get_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_12") && matcher.group(2).equals("button_to_Spree_dot_t__close_all_adjustments___close_adjustments_admin_order_path__order____method_____get_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_11']")
  private WebElement render__partial_____adjustment____collection_____adjustments_;
  
  public WebElement getElementOfRender__partial_____adjustment____collection_____adjustments_() {
    return render__partial_____adjustment____collection_____adjustments_;
  }
  
  public String getTextOfRender__partial_____adjustment____collection_____adjustments_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_11") && matcher.group(2).equals("render__partial_____adjustment____collection_____adjustments_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
