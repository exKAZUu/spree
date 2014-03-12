package test.backend.app.views.spree.admin.countries;

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

public class NewHtmlPage extends AbstractPage {
  public NewHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_39']")
  private WebElement link_to_with_icon__icon_minus_arrow_minus_left___Spree_dot_t__back_to_countries_list___admin_countries_path___class_____button__;
  
  public WebElement getElementOfLink_to_with_icon__icon_minus_arrow_minus_left___Spree_dot_t__back_to_countries_list___admin_countries_path___class_____button__() {
    return link_to_with_icon__icon_minus_arrow_minus_left___Spree_dot_t__back_to_countries_list___admin_countries_path___class_____button__;
  }
  
  public String getTextOfLink_to_with_icon__icon_minus_arrow_minus_left___Spree_dot_t__back_to_countries_list___admin_countries_path___class_____button__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_39") && matcher.group(2).equals("link_to_with_icon__icon_minus_arrow_minus_left___Spree_dot_t__back_to_countries_list___admin_countries_path___class_____button__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_40']")
  private WebElement render__partial_____form____locals_______f____f___;
  
  public WebElement getElementOfRender__partial_____form____locals_______f____f___() {
    return render__partial_____form____locals_______f____f___;
  }
  
  public String getTextOfRender__partial_____form____locals_______f____f___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_40") && matcher.group(2).equals("render__partial_____form____locals_______f____f___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_40']")
  private WebElement render__partial_____spree_divide_admin_divide_shared_divide_new_resource_links__;
  
  public WebElement getElementOfRender__partial_____spree_divide_admin_divide_shared_divide_new_resource_links__() {
    return render__partial_____spree_divide_admin_divide_shared_divide_new_resource_links__;
  }
  
  public String getTextOfRender__partial_____spree_divide_admin_divide_shared_divide_new_resource_links__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_40") && matcher.group(2).equals("render__partial_____spree_divide_admin_divide_shared_divide_new_resource_links__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
