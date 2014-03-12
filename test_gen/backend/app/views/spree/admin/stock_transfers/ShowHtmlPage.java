package test.backend.app.views.spree.admin.stock_transfers;

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

public class ShowHtmlPage extends AbstractPage {
  public ShowHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_679']")
  private WebElement button_link_to_Spree_dot_t__back_to_stock_transfers_list___admin_stock_transfers_path___icon_____icon_minus_arrow_minus_left__;
  
  public WebElement getElementOfButton_link_to_Spree_dot_t__back_to_stock_transfers_list___admin_stock_transfers_path___icon_____icon_minus_arrow_minus_left__() {
    return button_link_to_Spree_dot_t__back_to_stock_transfers_list___admin_stock_transfers_path___icon_____icon_minus_arrow_minus_left__;
  }
  
  public String getTextOfButton_link_to_Spree_dot_t__back_to_stock_transfers_list___admin_stock_transfers_path___icon_____icon_minus_arrow_minus_left__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_679") && matcher.group(2).equals("button_link_to_Spree_dot_t__back_to_stock_transfers_list___admin_stock_transfers_path___icon_____icon_minus_arrow_minus_left__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_680']")
  private WebElement button_link_to_Spree_dot_t__new_stock_transfer___new_admin_stock_transfer_path_____icon_____icon_minus_forward____;
  
  public WebElement getElementOfButton_link_to_Spree_dot_t__new_stock_transfer___new_admin_stock_transfer_path_____icon_____icon_minus_forward____() {
    return button_link_to_Spree_dot_t__new_stock_transfer___new_admin_stock_transfer_path_____icon_____icon_minus_forward____;
  }
  
  public String getTextOfButton_link_to_Spree_dot_t__new_stock_transfer___new_admin_stock_transfer_path_____icon_____icon_minus_forward____() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_680") && matcher.group(2).equals("button_link_to_Spree_dot_t__new_stock_transfer___new_admin_stock_transfer_path_____icon_____icon_minus_forward____")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_681']")
  private WebElement Spree_dot_t__stock_transfer__;
  
  public WebElement getElementOfSpree_dot_t__stock_transfer__() {
    return Spree_dot_t__stock_transfer__;
  }
  
  public String getTextOfSpree_dot_t__stock_transfer__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_681") && matcher.group(2).equals("Spree_dot_t__stock_transfer__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_682']")
  private WebElement Spree_dot_t__reference__;
  
  public WebElement getElementOfSpree_dot_t__reference__() {
    return Spree_dot_t__reference__;
  }
  
  public String getTextOfSpree_dot_t__reference__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_682") && matcher.group(2).equals("Spree_dot_t__reference__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_683']")
  private WebElement _stock_transfer_dot_reference_;
  
  public WebElement getElementOf_stock_transfer_dot_reference_() {
    return _stock_transfer_dot_reference_;
  }
  
  public String getTextOf_stock_transfer_dot_reference_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_683") && matcher.group(2).equals("_stock_transfer_dot_reference_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_684']")
  private WebElement Spree_dot_t__created_at__;
  
  public WebElement getElementOfSpree_dot_t__created_at__() {
    return Spree_dot_t__created_at__;
  }
  
  public String getTextOfSpree_dot_t__created_at__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_684") && matcher.group(2).equals("Spree_dot_t__created_at__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_685']")
  private WebElement _stock_transfer_dot_created_at_;
  
  public WebElement getElementOf_stock_transfer_dot_created_at_() {
    return _stock_transfer_dot_created_at_;
  }
  
  public String getTextOf_stock_transfer_dot_created_at_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_685") && matcher.group(2).equals("_stock_transfer_dot_created_at_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='stock-location-source']")
  private WebElement _stock_transfer_dot_source_location_dot_name_;
  
  public WebElement getElementOf_stock_transfer_dot_source_location_dot_name_() {
    return _stock_transfer_dot_source_location_dot_name_;
  }
  
  public String getTextOf_stock_transfer_dot_source_location_dot_name_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("stock-location-source") && matcher.group(2).equals("_stock_transfer_dot_source_location_dot_name_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='stock-location-source']")
  private WebElement Spree_dot_t__source__;
  
  public WebElement getElementOfSpree_dot_t__source__() {
    return Spree_dot_t__source__;
  }
  
  public String getTextOfSpree_dot_t__source__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("stock-location-source") && matcher.group(2).equals("Spree_dot_t__source__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_686']")
  private WebElement render__partial_____stock_movements____object_____stock_transfer_dot_source_movements_;
  
  public WebElement getElementOfRender__partial_____stock_movements____object_____stock_transfer_dot_source_movements_() {
    return render__partial_____stock_movements____object_____stock_transfer_dot_source_movements_;
  }
  
  public String getTextOfRender__partial_____stock_movements____object_____stock_transfer_dot_source_movements_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_686") && matcher.group(2).equals("render__partial_____stock_movements____object_____stock_transfer_dot_source_movements_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='stock-location-destination']")
  private WebElement _stock_transfer_dot_destination_location_dot_name_;
  
  public WebElement getElementOf_stock_transfer_dot_destination_location_dot_name_() {
    return _stock_transfer_dot_destination_location_dot_name_;
  }
  
  public String getTextOf_stock_transfer_dot_destination_location_dot_name_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("stock-location-destination") && matcher.group(2).equals("_stock_transfer_dot_destination_location_dot_name_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='stock-location-destination']")
  private WebElement Spree_dot_t__destination__;
  
  public WebElement getElementOfSpree_dot_t__destination__() {
    return Spree_dot_t__destination__;
  }
  
  public String getTextOfSpree_dot_t__destination__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("stock-location-destination") && matcher.group(2).equals("Spree_dot_t__destination__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_687']")
  private WebElement render__partial_____stock_movements____object_____stock_transfer_dot_destination_movements_;
  
  public WebElement getElementOfRender__partial_____stock_movements____object_____stock_transfer_dot_destination_movements_() {
    return render__partial_____stock_movements____object_____stock_transfer_dot_destination_movements_;
  }
  
  public String getTextOfRender__partial_____stock_movements____object_____stock_transfer_dot_destination_movements_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_687") && matcher.group(2).equals("render__partial_____stock_movements____object_____stock_transfer_dot_destination_movements_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
