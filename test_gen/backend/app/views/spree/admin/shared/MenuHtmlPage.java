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

public class MenuHtmlPage extends AbstractPage {
  public MenuHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_512']")
  private WebElement render__partial_____spree_divide_admin_divide_shared_divide_tabs__;
  
  public WebElement getElementOfRender__partial_____spree_divide_admin_divide_shared_divide_tabs__() {
    return render__partial_____spree_divide_admin_divide_shared_divide_tabs__;
  }
  
  public String getTextOfRender__partial_____spree_divide_admin_divide_shared_divide_tabs__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_512") && matcher.group(2).equals("render__partial_____spree_divide_admin_divide_shared_divide_tabs__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
