package test.backend.app.views.spree.admin.products;

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

public class PropertiesFormPage extends AbstractPage {
  public PropertiesFormPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_325']")
  private WebElement properties_form_dot_label__value__properties_form_dot_object_dot_property_dot_presentation_;
  
  public WebElement getElementOfProperties_form_dot_label__value__properties_form_dot_object_dot_property_dot_presentation_() {
    return properties_form_dot_label__value__properties_form_dot_object_dot_property_dot_presentation_;
  }
  
  public String getTextOfProperties_form_dot_label__value__properties_form_dot_object_dot_property_dot_presentation_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_325") && matcher.group(2).equals("properties_form_dot_label__value__properties_form_dot_object_dot_property_dot_presentation_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_325']")
  private WebElement properties_form_dot_text_field__value_;
  
  public WebElement getElementOfProperties_form_dot_text_field__value_() {
    return properties_form_dot_text_field__value_;
  }
  
  public String getTextOfProperties_form_dot_text_field__value_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_325") && matcher.group(2).equals("properties_form_dot_text_field__value_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
