package test.backend.app.views.spree.admin.taxonomies;

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
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_751']")
  private WebElement button_link_to_Spree_dot_t__back_to_taxonomies_list___spree_dot_admin_taxonomies_path___icon_____icon_minus_arrow_minus_left__;
  
  public WebElement getElementOfButton_link_to_Spree_dot_t__back_to_taxonomies_list___spree_dot_admin_taxonomies_path___icon_____icon_minus_arrow_minus_left__() {
    return button_link_to_Spree_dot_t__back_to_taxonomies_list___spree_dot_admin_taxonomies_path___icon_____icon_minus_arrow_minus_left__;
  }
  
  public String getTextOfButton_link_to_Spree_dot_t__back_to_taxonomies_list___spree_dot_admin_taxonomies_path___icon_____icon_minus_arrow_minus_left__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_751") && matcher.group(2).equals("button_link_to_Spree_dot_t__back_to_taxonomies_list___spree_dot_admin_taxonomies_path___icon_____icon_minus_arrow_minus_left__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_752']")
  private WebElement button_Spree_dot_t__create____icon_minus_ok__;
  
  public WebElement getElementOfButton_Spree_dot_t__create____icon_minus_ok__() {
    return button_Spree_dot_t__create____icon_minus_ok__;
  }
  
  public String getTextOfButton_Spree_dot_t__create____icon_minus_ok__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_752") && matcher.group(2).equals("button_Spree_dot_t__create____icon_minus_ok__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
