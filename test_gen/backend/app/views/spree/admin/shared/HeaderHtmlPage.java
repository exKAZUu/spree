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

public class HeaderHtmlPage extends AbstractPage {
  public HeaderHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_511']")
  private WebElement link_to_image_tag_Spree__Config__admin_interface_logo____id_____logo____spree_dot_admin_path_;
  
  public WebElement getElementOfLink_to_image_tag_Spree__Config__admin_interface_logo____id_____logo____spree_dot_admin_path_() {
    return link_to_image_tag_Spree__Config__admin_interface_logo____id_____logo____spree_dot_admin_path_;
  }
  
  public String getTextOfLink_to_image_tag_Spree__Config__admin_interface_logo____id_____logo____spree_dot_admin_path_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_511") && matcher.group(2).equals("link_to_image_tag_Spree__Config__admin_interface_logo____id_____logo____spree_dot_admin_path_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
