package test.backend.app.views.spree.admin.promotions.rules;

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

public class LandingPageHtmlPage extends AbstractPage {
  public LandingPageHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_408']")
  private WebElement Spree_dot_t__promotion_rule_types_dot_landing_page_dot_description___;
  
  public WebElement getElementOfSpree_dot_t__promotion_rule_types_dot_landing_page_dot_description___() {
    return Spree_dot_t__promotion_rule_types_dot_landing_page_dot_description___;
  }
  
  public String getTextOfSpree_dot_t__promotion_rule_types_dot_landing_page_dot_description___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_408") && matcher.group(2).equals("Spree_dot_t__promotion_rule_types_dot_landing_page_dot_description___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_409']")
  private WebElement Spree_dot_t__landing_page_rule_dot_must_have_visited_path___;
  
  public WebElement getElementOfSpree_dot_t__landing_page_rule_dot_must_have_visited_path___() {
    return Spree_dot_t__landing_page_rule_dot_must_have_visited_path___;
  }
  
  public String getTextOfSpree_dot_t__landing_page_rule_dot_must_have_visited_path___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_409") && matcher.group(2).equals("Spree_dot_t__landing_page_rule_dot_must_have_visited_path___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_407']")
  private WebElement text_field_tag____param_prefix__preferred_path____promotion_rule_dot_preferred_path___class_____fullwidth__;
  
  public WebElement getElementOfText_field_tag____param_prefix__preferred_path____promotion_rule_dot_preferred_path___class_____fullwidth__() {
    return text_field_tag____param_prefix__preferred_path____promotion_rule_dot_preferred_path___class_____fullwidth__;
  }
  
  public String getTextOfText_field_tag____param_prefix__preferred_path____promotion_rule_dot_preferred_path___class_____fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_407") && matcher.group(2).equals("text_field_tag____param_prefix__preferred_path____promotion_rule_dot_preferred_path___class_____fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
