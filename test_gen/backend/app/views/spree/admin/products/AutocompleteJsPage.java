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

public class AutocompleteJsPage extends AbstractPage {
  public AutocompleteJsPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='product_template']")
  private WebElement image_path__noimage_divide_small_dot_png___;
  
  public WebElement getElementOfImage_path__noimage_divide_small_dot_png___() {
    return image_path__noimage_divide_small_dot_png___;
  }
  
  public String getTextOfImage_path__noimage_divide_small_dot_png___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("product_template") && matcher.group(2).equals("image_path__noimage_divide_small_dot_png___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
