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

public class NewHtmlPage extends AbstractPage {
  public NewHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_22']")
  private WebElement button_link_to_Spree_dot_t__back_to_adjustments_list___spree_dot_admin_order_adjustments_url__order____icon_____icon_minus_arrow_minus_left__;
  
  public WebElement getElementOfButton_link_to_Spree_dot_t__back_to_adjustments_list___spree_dot_admin_order_adjustments_url__order____icon_____icon_minus_arrow_minus_left__() {
    return button_link_to_Spree_dot_t__back_to_adjustments_list___spree_dot_admin_order_adjustments_url__order____icon_____icon_minus_arrow_minus_left__;
  }
  
  public String getTextOfButton_link_to_Spree_dot_t__back_to_adjustments_list___spree_dot_admin_order_adjustments_url__order____icon_____icon_minus_arrow_minus_left__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_22") && matcher.group(2).equals("button_link_to_Spree_dot_t__back_to_adjustments_list___spree_dot_admin_order_adjustments_url__order____icon_____icon_minus_arrow_minus_left__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_25']")
  private WebElement Spree_dot_t__or__;
  
  public WebElement getElementOfSpree_dot_t__or__() {
    return Spree_dot_t__or__;
  }
  
  public String getTextOfSpree_dot_t__or__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_25") && matcher.group(2).equals("Spree_dot_t__or__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_24']")
  private WebElement button_Spree_dot_t__continue____icon_minus_arrow_minus_right__;
  
  public WebElement getElementOfButton_Spree_dot_t__continue____icon_minus_arrow_minus_right__() {
    return button_Spree_dot_t__continue____icon_minus_arrow_minus_right__;
  }
  
  public String getTextOfButton_Spree_dot_t__continue____icon_minus_arrow_minus_right__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_24") && matcher.group(2).equals("button_Spree_dot_t__continue____icon_minus_arrow_minus_right__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_24']")
  private WebElement button_link_to_Spree_dot_t__actions_dot_cancel____admin_order_adjustments_url__order____icon_____icon_minus_remove__;
  
  public WebElement getElementOfButton_link_to_Spree_dot_t__actions_dot_cancel____admin_order_adjustments_url__order____icon_____icon_minus_remove__() {
    return button_link_to_Spree_dot_t__actions_dot_cancel____admin_order_adjustments_url__order____icon_____icon_minus_remove__;
  }
  
  public String getTextOfButton_link_to_Spree_dot_t__actions_dot_cancel____admin_order_adjustments_url__order____icon_____icon_minus_remove__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_24") && matcher.group(2).equals("button_link_to_Spree_dot_t__actions_dot_cancel____admin_order_adjustments_url__order____icon_____icon_minus_remove__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_23']")
  private WebElement render__partial_____form____locals_______f____f___;
  
  public WebElement getElementOfRender__partial_____form____locals_______f____f___() {
    return render__partial_____form____locals_______f____f___;
  }
  
  public String getTextOfRender__partial_____form____locals_______f____f___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_23") && matcher.group(2).equals("render__partial_____form____locals_______f____f___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
