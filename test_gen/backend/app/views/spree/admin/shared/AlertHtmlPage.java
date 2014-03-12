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

public class AlertHtmlPage extends AbstractPage {
  public AlertHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_499']")
  private WebElement alert__severity___dot_downcase_;
  
  public WebElement getElementOfAlert__severity___dot_downcase_() {
    return alert__severity___dot_downcase_;
  }
  
  public String getAttributeOfClassOnAlert__severity___dot_downcase_() {
    return alert__severity___dot_downcase_.getAttribute("class");
  }
  
  public String getTextOfAlert__severity___dot_downcase_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_499") && matcher.group(2).equals("alert__severity___dot_downcase_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_499']")
  private WebElement link_to_alert__url_name____alert__url___if_alert__url___;
  
  public WebElement getElementOfLink_to_alert__url_name____alert__url___if_alert__url___() {
    return link_to_alert__url_name____alert__url___if_alert__url___;
  }
  
  public String getTextOfLink_to_alert__url_name____alert__url___if_alert__url___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_499") && matcher.group(2).equals("link_to_alert__url_name____alert__url___if_alert__url___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_499']")
  private WebElement alert__message___;
  
  public WebElement getElementOfAlert__message___() {
    return alert__message___;
  }
  
  public String getTextOfAlert__message___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_499") && matcher.group(2).equals("alert__message___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
