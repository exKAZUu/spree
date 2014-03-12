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

public class ContentHeaderHtmlPage extends AbstractPage {
  public ContentHeaderHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_505']")
  private WebElement yield__page_title_;
  
  public WebElement getElementOfYield__page_title_() {
    return yield__page_title_;
  }
  
  public String getTextOfYield__page_title_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_505") && matcher.group(2).equals("yield__page_title_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_505']")
  private WebElement yield__page_title_classes_;
  
  public WebElement getElementOfYield__page_title_classes_() {
    return yield__page_title_classes_;
  }
  
  public String getAttributeOfClassOnYield__page_title_classes_() {
    return yield__page_title_classes_.getAttribute("class");
  }
  
  public String getTextOfYield__page_title_classes_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_505") && matcher.group(2).equals("yield__page_title_classes_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_506']")
  private WebElement yield__page_actions_;
  
  public WebElement getElementOfYield__page_actions_() {
    return yield__page_actions_;
  }
  
  public String getTextOfYield__page_actions_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_506") && matcher.group(2).equals("yield__page_actions_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
