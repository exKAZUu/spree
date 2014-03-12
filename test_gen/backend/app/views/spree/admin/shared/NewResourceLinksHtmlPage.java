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

public class NewResourceLinksHtmlPage extends AbstractPage {
  public NewResourceLinksHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_514']")
  private WebElement Spree_dot_t__or__;
  
  public WebElement getElementOfSpree_dot_t__or__() {
    return Spree_dot_t__or__;
  }
  
  public String getTextOfSpree_dot_t__or__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_514") && matcher.group(2).equals("Spree_dot_t__or__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_513']")
  private WebElement link_to_with_icon__icon_minus_remove___Spree_dot_t__actions_dot_cancel____collection_url___class_____button__;
  
  public WebElement getElementOfLink_to_with_icon__icon_minus_remove___Spree_dot_t__actions_dot_cancel____collection_url___class_____button__() {
    return link_to_with_icon__icon_minus_remove___Spree_dot_t__actions_dot_cancel____collection_url___class_____button__;
  }
  
  public String getTextOfLink_to_with_icon__icon_minus_remove___Spree_dot_t__actions_dot_cancel____collection_url___class_____button__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_513") && matcher.group(2).equals("link_to_with_icon__icon_minus_remove___Spree_dot_t__actions_dot_cancel____collection_url___class_____button__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_513']")
  private WebElement button_Spree_dot_t__actions_dot_create_____icon_minus_ok__;
  
  public WebElement getElementOfButton_Spree_dot_t__actions_dot_create_____icon_minus_ok__() {
    return button_Spree_dot_t__actions_dot_create_____icon_minus_ok__;
  }
  
  public String getTextOfButton_Spree_dot_t__actions_dot_create_____icon_minus_ok__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_513") && matcher.group(2).equals("button_Spree_dot_t__actions_dot_create_____icon_minus_ok__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
