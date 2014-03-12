package test.backend.app.views.spree.admin.mail_methods;

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

public class EditHtmlPage extends AbstractPage {
  public EditHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_108']")
  private WebElement button_Spree_dot_t__actions_dot_update_____icon_minus_refresh__;
  
  public WebElement getElementOfButton_Spree_dot_t__actions_dot_update_____icon_minus_refresh__() {
    return button_Spree_dot_t__actions_dot_update_____icon_minus_refresh__;
  }
  
  public String getTextOfButton_Spree_dot_t__actions_dot_update_____icon_minus_refresh__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_108") && matcher.group(2).equals("button_Spree_dot_t__actions_dot_update_____icon_minus_refresh__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_107']")
  private WebElement render__partial_____form____locals_______f____f___;
  
  public WebElement getElementOfRender__partial_____form____locals_______f____f___() {
    return render__partial_____form____locals_______f____f___;
  }
  
  public String getTextOfRender__partial_____form____locals_______f____f___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_107") && matcher.group(2).equals("render__partial_____form____locals_______f____f___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
