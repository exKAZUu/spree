package test.backend.app.views.spree.admin.return_authorizations;

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
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_467']")
  private WebElement button_link_to_Spree_dot_t__receive___fire_admin_order_return_authorization_url__order___return_authorization___e_____receive_____method_____put___data_______confirm____Spree_dot_t__are_you_sure______icon_____icon_minus_download_minus_alt__;
  
  public WebElement getElementOfButton_link_to_Spree_dot_t__receive___fire_admin_order_return_authorization_url__order___return_authorization___e_____receive_____method_____put___data_______confirm____Spree_dot_t__are_you_sure______icon_____icon_minus_download_minus_alt__() {
    return button_link_to_Spree_dot_t__receive___fire_admin_order_return_authorization_url__order___return_authorization___e_____receive_____method_____put___data_______confirm____Spree_dot_t__are_you_sure______icon_____icon_minus_download_minus_alt__;
  }
  
  public String getTextOfButton_link_to_Spree_dot_t__receive___fire_admin_order_return_authorization_url__order___return_authorization___e_____receive_____method_____put___data_______confirm____Spree_dot_t__are_you_sure______icon_____icon_minus_download_minus_alt__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_467") && matcher.group(2).equals("button_link_to_Spree_dot_t__receive___fire_admin_order_return_authorization_url__order___return_authorization___e_____receive_____method_____put___data_______confirm____Spree_dot_t__are_you_sure______icon_____icon_minus_download_minus_alt__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_468']")
  private WebElement button_link_to_Spree_dot_t__actions_dot_cancel____fire_admin_order_return_authorization_url__order___return_authorization___e_____cancel_____method_____put___data_______confirm____Spree_dot_t__are_you_sure______icon_____icon_minus_remove__;
  
  public WebElement getElementOfButton_link_to_Spree_dot_t__actions_dot_cancel____fire_admin_order_return_authorization_url__order___return_authorization___e_____cancel_____method_____put___data_______confirm____Spree_dot_t__are_you_sure______icon_____icon_minus_remove__() {
    return button_link_to_Spree_dot_t__actions_dot_cancel____fire_admin_order_return_authorization_url__order___return_authorization___e_____cancel_____method_____put___data_______confirm____Spree_dot_t__are_you_sure______icon_____icon_minus_remove__;
  }
  
  public String getTextOfButton_link_to_Spree_dot_t__actions_dot_cancel____fire_admin_order_return_authorization_url__order___return_authorization___e_____cancel_____method_____put___data_______confirm____Spree_dot_t__are_you_sure______icon_____icon_minus_remove__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_468") && matcher.group(2).equals("button_link_to_Spree_dot_t__actions_dot_cancel____fire_admin_order_return_authorization_url__order___return_authorization___e_____cancel_____method_____put___data_______confirm____Spree_dot_t__are_you_sure______icon_____icon_minus_remove__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_471']")
  private WebElement Spree_dot_t__or__;
  
  public WebElement getElementOfSpree_dot_t__or__() {
    return Spree_dot_t__or__;
  }
  
  public String getTextOfSpree_dot_t__or__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_471") && matcher.group(2).equals("Spree_dot_t__or__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_470']")
  private WebElement button_link_to_Spree_dot_t__actions_dot_cancel____admin_order_return_authorizations_url__order____icon_____icon_minus_remove__;
  
  public WebElement getElementOfButton_link_to_Spree_dot_t__actions_dot_cancel____admin_order_return_authorizations_url__order____icon_____icon_minus_remove__() {
    return button_link_to_Spree_dot_t__actions_dot_cancel____admin_order_return_authorizations_url__order____icon_____icon_minus_remove__;
  }
  
  public String getTextOfButton_link_to_Spree_dot_t__actions_dot_cancel____admin_order_return_authorizations_url__order____icon_____icon_minus_remove__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_470") && matcher.group(2).equals("button_link_to_Spree_dot_t__actions_dot_cancel____admin_order_return_authorizations_url__order____icon_____icon_minus_remove__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_470']")
  private WebElement button_Spree_dot_t__actions_dot_update_____icon_minus_repeat__;
  
  public WebElement getElementOfButton_Spree_dot_t__actions_dot_update_____icon_minus_repeat__() {
    return button_Spree_dot_t__actions_dot_update_____icon_minus_repeat__;
  }
  
  public String getTextOfButton_Spree_dot_t__actions_dot_update_____icon_minus_repeat__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_470") && matcher.group(2).equals("button_Spree_dot_t__actions_dot_update_____icon_minus_repeat__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_469']")
  private WebElement render__partial_____form____locals_______f____f___;
  
  public WebElement getElementOfRender__partial_____form____locals_______f____f___() {
    return render__partial_____form____locals_______f____f___;
  }
  
  public String getTextOfRender__partial_____form____locals_______f____f___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_469") && matcher.group(2).equals("render__partial_____form____locals_______f____f___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
