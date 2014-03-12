package test.backend.app.views.spree.admin.orders;

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

public class AddProductHtmlPage extends AbstractPage {
  public AddProductHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_127']")
  private WebElement Spree_dot_t__add_product__;
  
  public WebElement getElementOfSpree_dot_t__add_product__() {
    return Spree_dot_t__add_product__;
  }
  
  public String getTextOfSpree_dot_t__add_product__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_127") && matcher.group(2).equals("Spree_dot_t__add_product__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_128']")
  private WebElement label_tag__add_variant_id__Spree_dot_t__name_or_sku__;
  
  public WebElement getElementOfLabel_tag__add_variant_id__Spree_dot_t__name_or_sku__() {
    return label_tag__add_variant_id__Spree_dot_t__name_or_sku__;
  }
  
  public String getTextOfLabel_tag__add_variant_id__Spree_dot_t__name_or_sku__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_128") && matcher.group(2).equals("label_tag__add_variant_id__Spree_dot_t__name_or_sku__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_128']")
  private WebElement hidden_field_tag__add_variant_id_______class_____variant_autocomplete_fullwidth__;
  
  public WebElement getElementOfHidden_field_tag__add_variant_id_______class_____variant_autocomplete_fullwidth__() {
    return hidden_field_tag__add_variant_id_______class_____variant_autocomplete_fullwidth__;
  }
  
  public String getTextOfHidden_field_tag__add_variant_id_______class_____variant_autocomplete_fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_128") && matcher.group(2).equals("hidden_field_tag__add_variant_id_______class_____variant_autocomplete_fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
