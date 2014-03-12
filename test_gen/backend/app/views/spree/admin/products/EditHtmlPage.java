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

public class EditHtmlPage extends AbstractPage {
  public EditHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_326']")
  private WebElement button_link_to_Spree_dot_t__back_to_products_list___session__return_to_____admin_products_url___icon_____icon_minus_arrow_minus_left__;
  
  public WebElement getElementOfButton_link_to_Spree_dot_t__back_to_products_list___session__return_to_____admin_products_url___icon_____icon_minus_arrow_minus_left__() {
    return button_link_to_Spree_dot_t__back_to_products_list___session__return_to_____admin_products_url___icon_____icon_minus_arrow_minus_left__;
  }
  
  public String getTextOfButton_link_to_Spree_dot_t__back_to_products_list___session__return_to_____admin_products_url___icon_____icon_minus_arrow_minus_left__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_326") && matcher.group(2).equals("button_link_to_Spree_dot_t__back_to_products_list___session__return_to_____admin_products_url___icon_____icon_minus_arrow_minus_left__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='new_product_link']")
  private WebElement button_link_to_Spree_dot_t__new_product___new_object_url_____icon_____icon_minus_plus____id_____admin_new_product____;
  
  public WebElement getElementOfButton_link_to_Spree_dot_t__new_product___new_object_url_____icon_____icon_minus_plus____id_____admin_new_product____() {
    return button_link_to_Spree_dot_t__new_product___new_object_url_____icon_____icon_minus_plus____id_____admin_new_product____;
  }
  
  public String getTextOfButton_link_to_Spree_dot_t__new_product___new_object_url_____icon_____icon_minus_plus____id_____admin_new_product____() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("new_product_link") && matcher.group(2).equals("button_link_to_Spree_dot_t__new_product___new_object_url_____icon_____icon_minus_plus____id_____admin_new_product____")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_327']")
  private WebElement render__partial_____form____locals_______f____f___;
  
  public WebElement getElementOfRender__partial_____form____locals_______f____f___() {
    return render__partial_____form____locals_______f____f___;
  }
  
  public String getTextOfRender__partial_____form____locals_______f____f___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_327") && matcher.group(2).equals("render__partial_____form____locals_______f____f___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_327']")
  private WebElement render__partial_____spree_divide_admin_divide_shared_divide_edit_resource_links__;
  
  public WebElement getElementOfRender__partial_____spree_divide_admin_divide_shared_divide_edit_resource_links__() {
    return render__partial_____spree_divide_admin_divide_shared_divide_edit_resource_links__;
  }
  
  public String getTextOfRender__partial_____spree_divide_admin_divide_shared_divide_edit_resource_links__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_327") && matcher.group(2).equals("render__partial_____spree_divide_admin_divide_shared_divide_edit_resource_links__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
