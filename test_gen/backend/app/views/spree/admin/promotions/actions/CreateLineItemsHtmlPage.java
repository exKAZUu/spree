package test.backend.app.views.spree.admin.promotions.actions;

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

public class CreateLineItemsHtmlPage extends AbstractPage {
  public CreateLineItemsHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_383']")
  private WebElement item_dot_variant_dot_product_dot_name_;
  
  public WebElement getElementOfItem_dot_variant_dot_product_dot_name_() {
    return item_dot_variant_dot_product_dot_name_;
  }
  
  public String getTextOfItem_dot_variant_dot_product_dot_name_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_383") && matcher.group(2).equals("item_dot_variant_dot_product_dot_name_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_383']")
  private WebElement item_dot_quantity_;
  
  public WebElement getElementOfItem_dot_quantity_() {
    return item_dot_quantity_;
  }
  
  public String getTextOfItem_dot_quantity_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_383") && matcher.group(2).equals("item_dot_quantity_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_384']")
  private WebElement hidden_field_tag____line_item_prefix__variant_id____line_item_dot_variant_id___class_____variant_autocomplete_fullwidth__;
  
  public WebElement getElementOfHidden_field_tag____line_item_prefix__variant_id____line_item_dot_variant_id___class_____variant_autocomplete_fullwidth__() {
    return hidden_field_tag____line_item_prefix__variant_id____line_item_dot_variant_id___class_____variant_autocomplete_fullwidth__;
  }
  
  public String getTextOfHidden_field_tag____line_item_prefix__variant_id____line_item_dot_variant_id___class_____variant_autocomplete_fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_384") && matcher.group(2).equals("hidden_field_tag____line_item_prefix__variant_id____line_item_dot_variant_id___class_____variant_autocomplete_fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_385']")
  private WebElement number_field_tag____line_item_prefix__quantity____line_item_dot_quantity___min____1___class_____fullwidth__;
  
  public WebElement getElementOfNumber_field_tag____line_item_prefix__quantity____line_item_dot_quantity___min____1___class_____fullwidth__() {
    return number_field_tag____line_item_prefix__quantity____line_item_dot_quantity___min____1___class_____fullwidth__;
  }
  
  public String getTextOfNumber_field_tag____line_item_prefix__quantity____line_item_dot_quantity___min____1___class_____fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_385") && matcher.group(2).equals("number_field_tag____line_item_prefix__quantity____line_item_dot_quantity___min____1___class_____fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
