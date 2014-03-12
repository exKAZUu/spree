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

public class HeadHtmlPage extends AbstractPage {
  public HeadHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_509']")
  private WebElement yield__title_;
  
  public WebElement getElementOfYield__title_() {
    return yield__title_;
  }
  
  public String getTextOfYield__title_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_509") && matcher.group(2).equals("yield__title_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_509']")
  private WebElement _Spree___Spree_dot_t__administration_______;
  
  public WebElement getElementOf_Spree___Spree_dot_t__administration_______() {
    return _Spree___Spree_dot_t__administration_______;
  }
  
  public String getTextOf_Spree___Spree_dot_t__administration_______() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_509") && matcher.group(2).equals("_Spree___Spree_dot_t__administration_______")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_509']")
  private WebElement Spree_dot_t_controller_dot_controller_name___default____controller_dot_controller_name_dot_titleize__;
  
  public WebElement getElementOfSpree_dot_t_controller_dot_controller_name___default____controller_dot_controller_name_dot_titleize__() {
    return Spree_dot_t_controller_dot_controller_name___default____controller_dot_controller_name_dot_titleize__;
  }
  
  public String getTextOfSpree_dot_t_controller_dot_controller_name___default____controller_dot_controller_name_dot_titleize__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_509") && matcher.group(2).equals("Spree_dot_t_controller_dot_controller_name___default____controller_dot_controller_name_dot_titleize__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_510']")
  private WebElement LINK;
  
  public WebElement getElementOfLINK() {
    return LINK;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
