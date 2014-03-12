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

public class AddStockFormHtmlPage extends AbstractPage {
  public AddStockFormHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_313']")
  private WebElement Spree_dot_t__add_stock_management__;
  
  public WebElement getElementOfSpree_dot_t__add_stock_management__() {
    return Spree_dot_t__add_stock_management__;
  }
  
  public String getTextOfSpree_dot_t__add_stock_management__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_313") && matcher.group(2).equals("Spree_dot_t__add_stock_management__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_314']")
  private WebElement f_dot_label__quantity__Spree_dot_t__quantity__;
  
  public WebElement getElementOfF_dot_label__quantity__Spree_dot_t__quantity__() {
    return f_dot_label__quantity__Spree_dot_t__quantity__;
  }
  
  public String getTextOfF_dot_label__quantity__Spree_dot_t__quantity__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_314") && matcher.group(2).equals("f_dot_label__quantity__Spree_dot_t__quantity__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_314']")
  private WebElement f_dot_number_field__quantity__class___fullwidth___value__1_;
  
  public WebElement getElementOfF_dot_number_field__quantity__class___fullwidth___value__1_() {
    return f_dot_number_field__quantity__class___fullwidth___value__1_;
  }
  
  public String getTextOfF_dot_number_field__quantity__class___fullwidth___value__1_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_314") && matcher.group(2).equals("f_dot_number_field__quantity__class___fullwidth___value__1_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_314']")
  private WebElement f_dot_field_container__quantity_do_;
  
  public WebElement getElementOfF_dot_field_container__quantity_do_() {
    return f_dot_field_container__quantity_do_;
  }
  
  public String getTextOfF_dot_field_container__quantity_do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_314") && matcher.group(2).equals("f_dot_field_container__quantity_do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_315']")
  private WebElement f_dot_field_container__stock_location_do_;
  
  public WebElement getElementOfF_dot_field_container__stock_location_do_() {
    return f_dot_field_container__stock_location_do_;
  }
  
  public String getTextOfF_dot_field_container__stock_location_do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_315") && matcher.group(2).equals("f_dot_field_container__stock_location_do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_315']")
  private WebElement label_tag__stock_location_id__Spree_dot_t__stock_location__;
  
  public WebElement getElementOfLabel_tag__stock_location_id__Spree_dot_t__stock_location__() {
    return label_tag__stock_location_id__Spree_dot_t__stock_location__;
  }
  
  public String getTextOfLabel_tag__stock_location_id__Spree_dot_t__stock_location__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_315") && matcher.group(2).equals("label_tag__stock_location_id__Spree_dot_t__stock_location__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_316']")
  private WebElement f_dot_field_container__variant_id_do_;
  
  public WebElement getElementOfF_dot_field_container__variant_id_do_() {
    return f_dot_field_container__variant_id_do_;
  }
  
  public String getTextOfF_dot_field_container__variant_id_do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_316") && matcher.group(2).equals("f_dot_field_container__variant_id_do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_316']")
  private WebElement label_tag__variant_id___Spree_dot_t__variant__;
  
  public WebElement getElementOfLabel_tag__variant_id___Spree_dot_t__variant__() {
    return label_tag__variant_id___Spree_dot_t__variant__;
  }
  
  public String getTextOfLabel_tag__variant_id___Spree_dot_t__variant__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_316") && matcher.group(2).equals("label_tag__variant_id___Spree_dot_t__variant__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_318']")
  private WebElement Spree_dot_t__or__;
  
  public WebElement getElementOfSpree_dot_t__or__() {
    return Spree_dot_t__or__;
  }
  
  public String getTextOfSpree_dot_t__or__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_318") && matcher.group(2).equals("Spree_dot_t__or__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_317']")
  private WebElement link_to_with_icon__icon_minus_remove___Spree_dot_t__actions_dot_cancel____collection_url___class_____button__;
  
  public WebElement getElementOfLink_to_with_icon__icon_minus_remove___Spree_dot_t__actions_dot_cancel____collection_url___class_____button__() {
    return link_to_with_icon__icon_minus_remove___Spree_dot_t__actions_dot_cancel____collection_url___class_____button__;
  }
  
  public String getTextOfLink_to_with_icon__icon_minus_remove___Spree_dot_t__actions_dot_cancel____collection_url___class_____button__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_317") && matcher.group(2).equals("link_to_with_icon__icon_minus_remove___Spree_dot_t__actions_dot_cancel____collection_url___class_____button__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_317']")
  private WebElement button_Spree_dot_t__add_stock____icon_minus_plus__;
  
  public WebElement getElementOfButton_Spree_dot_t__add_stock____icon_minus_plus__() {
    return button_Spree_dot_t__add_stock____icon_minus_plus__;
  }
  
  public String getTextOfButton_Spree_dot_t__add_stock____icon_minus_plus__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_317") && matcher.group(2).equals("button_Spree_dot_t__add_stock____icon_minus_plus__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
