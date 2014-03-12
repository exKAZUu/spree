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

public class IndexHtmlPage extends AbstractPage {
  public IndexHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_749']")
  private WebElement button_link_to_Spree_dot_t__new_taxonomy___spree_dot_new_admin_taxonomy_url___icon_____icon_minus_plus____id_____admin_new_taxonomy_link__;
  
  public WebElement getElementOfButton_link_to_Spree_dot_t__new_taxonomy___spree_dot_new_admin_taxonomy_url___icon_____icon_minus_plus____id_____admin_new_taxonomy_link__() {
    return button_link_to_Spree_dot_t__new_taxonomy___spree_dot_new_admin_taxonomy_url___icon_____icon_minus_plus____id_____admin_new_taxonomy_link__;
  }
  
  public String getTextOfButton_link_to_Spree_dot_t__new_taxonomy___spree_dot_new_admin_taxonomy_url___icon_____icon_minus_plus____id_____admin_new_taxonomy_link__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_749") && matcher.group(2).equals("button_link_to_Spree_dot_t__new_taxonomy___spree_dot_new_admin_taxonomy_url___icon_____icon_minus_plus____id_____admin_new_taxonomy_link__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='list-taxonomies']")
  private WebElement render__list__;
  
  public WebElement getElementOfRender__list__() {
    return render__list__;
  }
  
  public String getTextOfRender__list__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("list-taxonomies") && matcher.group(2).equals("render__list__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_750']")
  private WebElement link_to_Spree_dot_t__add_one___spree_dot_new_admin_taxonomy_path_;
  
  public WebElement getElementOfLink_to_Spree_dot_t__add_one___spree_dot_new_admin_taxonomy_path_() {
    return link_to_Spree_dot_t__add_one___spree_dot_new_admin_taxonomy_path_;
  }
  
  public String getTextOfLink_to_Spree_dot_t__add_one___spree_dot_new_admin_taxonomy_path_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_750") && matcher.group(2).equals("link_to_Spree_dot_t__add_one___spree_dot_new_admin_taxonomy_path_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_750']")
  private WebElement Spree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_taxonomy____;
  
  public WebElement getElementOfSpree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_taxonomy____() {
    return Spree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_taxonomy____;
  }
  
  public String getTextOfSpree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_taxonomy____() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_750") && matcher.group(2).equals("Spree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_taxonomy____")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
