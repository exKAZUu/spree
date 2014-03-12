package test.backend.app.views.spree.admin.tax_settings;

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
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_735']")
  private WebElement hidden_field_tag__preferences_shipment_inc_vat_____0__;
  
  public WebElement getElementOfHidden_field_tag__preferences_shipment_inc_vat_____0__() {
    return hidden_field_tag__preferences_shipment_inc_vat_____0__;
  }
  
  public String getTextOfHidden_field_tag__preferences_shipment_inc_vat_____0__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_735") && matcher.group(2).equals("hidden_field_tag__preferences_shipment_inc_vat_____0__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_735']")
  private WebElement label_tag_nil__Spree_dot_t__shipment_inc_vat__;
  
  public WebElement getElementOfLabel_tag_nil__Spree_dot_t__shipment_inc_vat__() {
    return label_tag_nil__Spree_dot_t__shipment_inc_vat__;
  }
  
  public String getTextOfLabel_tag_nil__Spree_dot_t__shipment_inc_vat__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_735") && matcher.group(2).equals("label_tag_nil__Spree_dot_t__shipment_inc_vat__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_735']")
  private WebElement check_box_tag__preferences_shipment_inc_vat_____1____Spree__Config__shipment_inc_vat__;
  
  public WebElement getElementOfCheck_box_tag__preferences_shipment_inc_vat_____1____Spree__Config__shipment_inc_vat__() {
    return check_box_tag__preferences_shipment_inc_vat_____1____Spree__Config__shipment_inc_vat__;
  }
  
  public String getTextOfCheck_box_tag__preferences_shipment_inc_vat_____1____Spree__Config__shipment_inc_vat__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_735") && matcher.group(2).equals("check_box_tag__preferences_shipment_inc_vat_____1____Spree__Config__shipment_inc_vat__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_736']")
  private WebElement button_Spree_dot_t__actions_dot_update_____icon_minus_refresh__;
  
  public WebElement getElementOfButton_Spree_dot_t__actions_dot_update_____icon_minus_refresh__() {
    return button_Spree_dot_t__actions_dot_update_____icon_minus_refresh__;
  }
  
  public String getTextOfButton_Spree_dot_t__actions_dot_update_____icon_minus_refresh__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_736") && matcher.group(2).equals("button_Spree_dot_t__actions_dot_update_____icon_minus_refresh__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
