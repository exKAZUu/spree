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

public class TableFilterHtmlPage extends AbstractPage {
  public TableFilterHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_546']")
  private WebElement yield__table_filter_title_;
  
  public WebElement getElementOfYield__table_filter_title_() {
    return yield__table_filter_title_;
  }
  
  public String getTextOfYield__table_filter_title_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_546") && matcher.group(2).equals("yield__table_filter_title_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_545']")
  private WebElement yield__table_filter_;
  
  public WebElement getElementOfYield__table_filter_() {
    return yield__table_filter_;
  }
  
  public String getTextOfYield__table_filter_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_545") && matcher.group(2).equals("yield__table_filter_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='table-filter']")
  private WebElement if_content_for___sidebar__then__twelve__else__sixteen__end_;
  
  public WebElement getElementOfIf_content_for___sidebar__then__twelve__else__sixteen__end_() {
    return if_content_for___sidebar__then__twelve__else__sixteen__end_;
  }
  
  public String getAttributeOfClassOnIf_content_for___sidebar__then__twelve__else__sixteen__end_() {
    return if_content_for___sidebar__then__twelve__else__sixteen__end_.getAttribute("class");
  }
  
  public String getTextOfIf_content_for___sidebar__then__twelve__else__sixteen__end_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("table-filter") && matcher.group(2).equals("if_content_for___sidebar__then__twelve__else__sixteen__end_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
