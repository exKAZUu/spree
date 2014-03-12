package test.backend.app.views.spree.admin.payments;

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

public class CaptureEventsHtmlPage extends AbstractPage {
  public CaptureEventsHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_259']")
  private WebElement Spree_dot_t__capture_events__;
  
  public WebElement getElementOfSpree_dot_t__capture_events__() {
    return Spree_dot_t__capture_events__;
  }
  
  public String getTextOfSpree_dot_t__capture_events__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_259") && matcher.group(2).equals("Spree_dot_t__capture_events__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_260']")
  private WebElement ___Spree_dot_t__date____divide___Spree_dot_t__time_____;
  
  public WebElement getElementOf___Spree_dot_t__date____divide___Spree_dot_t__time_____() {
    return ___Spree_dot_t__date____divide___Spree_dot_t__time_____;
  }
  
  public String getTextOf___Spree_dot_t__date____divide___Spree_dot_t__time_____() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_260") && matcher.group(2).equals("___Spree_dot_t__date____divide___Spree_dot_t__time_____")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_261']")
  private WebElement Spree_dot_t__amount__;
  
  public WebElement getElementOfSpree_dot_t__amount__() {
    return Spree_dot_t__amount__;
  }
  
  public String getTextOfSpree_dot_t__amount__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_261") && matcher.group(2).equals("Spree_dot_t__amount__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_262']")
  private WebElement pretty_time_capture_event_dot_created_at__;
  
  public WebElement getElementOfPretty_time_capture_event_dot_created_at__() {
    return pretty_time_capture_event_dot_created_at__;
  }
  
  public String getTextOfPretty_time_capture_event_dot_created_at__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_262") && matcher.group(2).equals("pretty_time_capture_event_dot_created_at__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_263']")
  private WebElement capture_event_dot_display_amount_;
  
  public WebElement getElementOfCapture_event_dot_display_amount_() {
    return capture_event_dot_display_amount_;
  }
  
  public String getTextOfCapture_event_dot_display_amount_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_263") && matcher.group(2).equals("capture_event_dot_display_amount_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='<%= dom_id(capture_event) %>']")
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
      if (matcher.group(1).equals("<%= dom_id(capture_event) %>") && matcher.group(2).equals("cycle__odd____even__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='<%= dom_id(capture_event) %>']")
  private WebElement dom_id_capture_event__;
  
  public WebElement getElementOfDom_id_capture_event__() {
    return dom_id_capture_event__;
  }
  
  public String getAttributeOfIdOnDom_id_capture_event__() {
    return dom_id_capture_event__.getAttribute("id");
  }
  
  public String getTextOfDom_id_capture_event__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("<%= dom_id(capture_event) %>") && matcher.group(2).equals("dom_id_capture_event__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
