package test.backend.app.views.spree.admin.states;

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

public class IndexHtmlPage extends AbstractPage {
  public IndexHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='new_state_link']")
  private WebElement button_link_to_Spree_dot_t__new_state___new_admin_country_state_url__country______remote____true___icon_____icon_minus_plus____id_____new_state_link____;
  
  public WebElement getElementOfButton_link_to_Spree_dot_t__new_state___new_admin_country_state_url__country______remote____true___icon_____icon_minus_plus____id_____new_state_link____() {
    return button_link_to_Spree_dot_t__new_state___new_admin_country_state_url__country______remote____true___icon_____icon_minus_plus____id_____new_state_link____;
  }
  
  public String getTextOfButton_link_to_Spree_dot_t__new_state___new_admin_country_state_url__country______remote____true___icon_____icon_minus_plus____id_____new_state_link____() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("new_state_link") && matcher.group(2).equals("button_link_to_Spree_dot_t__new_state___new_admin_country_state_url__country______remote____true___icon_____icon_minus_plus____id_____new_state_link____")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='country']")
  private WebElement SELECT_country;
  
  public WebElement getElementOfSELECT_country() {
    return SELECT_country;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='country']")
  private WebElement options_from_collection_for_select__countries___id___name___country_dot_id__;
  
  public WebElement getElementOfOptions_from_collection_for_select__countries___id___name___country_dot_id__() {
    return options_from_collection_for_select__countries___id___name___country_dot_id__;
  }
  
  public String getTextOfOptions_from_collection_for_select__countries___id___name___country_dot_id__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("country") && matcher.group(2).equals("options_from_collection_for_select__countries___id___name___country_dot_id__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='country']")
  private WebElement admin_states_path__format_____js__;
  
  public WebElement getElementOfAdmin_states_path__format_____js__() {
    return admin_states_path__format_____js__;
  }
  
  public String getAttributeOfData-base-urlOnAdmin_states_path__format_____js__() {
    return admin_states_path__format_____js__.getAttribute("data-base-url");
  }
  
  public String getTextOfAdmin_states_path__format_____js__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("country") && matcher.group(2).equals("admin_states_path__format_____js__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_599']")
  private WebElement label_tag__country__Spree_dot_t__country__;
  
  public WebElement getElementOfLabel_tag__country__Spree_dot_t__country__() {
    return label_tag__country__Spree_dot_t__country__;
  }
  
  public String getTextOfLabel_tag__country__Spree_dot_t__country__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_599") && matcher.group(2).equals("label_tag__country__Spree_dot_t__country__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='state-list']")
  private WebElement render__partial_____state_list_;
  
  public WebElement getElementOfRender__partial_____state_list_() {
    return render__partial_____state_list_;
  }
  
  public String getTextOfRender__partial_____state_list_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("state-list") && matcher.group(2).equals("render__partial_____state_list_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
