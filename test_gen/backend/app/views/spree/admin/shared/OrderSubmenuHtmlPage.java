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

public class OrderSubmenuHtmlPage extends AbstractPage {
  public OrderSubmenuHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_515']")
  private WebElement link_to_with_icon__icon_minus_edit___Spree_dot_t__order_details___edit_admin_order_url__order__;
  
  public WebElement getElementOfLink_to_with_icon__icon_minus_edit___Spree_dot_t__order_details___edit_admin_order_url__order__() {
    return link_to_with_icon__icon_minus_edit___Spree_dot_t__order_details___edit_admin_order_url__order__;
  }
  
  public String getTextOfLink_to_with_icon__icon_minus_edit___Spree_dot_t__order_details___edit_admin_order_url__order__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_515") && matcher.group(2).equals("link_to_with_icon__icon_minus_edit___Spree_dot_t__order_details___edit_admin_order_url__order__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_515']")
  private WebElement ____class__active___if_current_____Order_Details__;
  
  public WebElement getElementOf____class__active___if_current_____Order_Details__() {
    return ____class__active___if_current_____Order_Details__;
  }
  
  public String getTextOf____class__active___if_current_____Order_Details__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_515") && matcher.group(2).equals("____class__active___if_current_____Order_Details__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_516']")
  private WebElement ____class__active___if_current_____Customer_Details__;
  
  public WebElement getElementOf____class__active___if_current_____Customer_Details__() {
    return ____class__active___if_current_____Customer_Details__;
  }
  
  public String getTextOf____class__active___if_current_____Customer_Details__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_516") && matcher.group(2).equals("____class__active___if_current_____Customer_Details__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_516']")
  private WebElement link_to_with_icon__icon_minus_user___Spree_dot_t__customer_details___admin_order_customer_url__order__;
  
  public WebElement getElementOfLink_to_with_icon__icon_minus_user___Spree_dot_t__customer_details___admin_order_customer_url__order__() {
    return link_to_with_icon__icon_minus_user___Spree_dot_t__customer_details___admin_order_customer_url__order__;
  }
  
  public String getTextOfLink_to_with_icon__icon_minus_user___Spree_dot_t__customer_details___admin_order_customer_url__order__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_516") && matcher.group(2).equals("link_to_with_icon__icon_minus_user___Spree_dot_t__customer_details___admin_order_customer_url__order__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_517']")
  private WebElement ____class__active___if_current_____Adjustments__;
  
  public WebElement getElementOf____class__active___if_current_____Adjustments__() {
    return ____class__active___if_current_____Adjustments__;
  }
  
  public String getTextOf____class__active___if_current_____Adjustments__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_517") && matcher.group(2).equals("____class__active___if_current_____Adjustments__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_517']")
  private WebElement link_to_with_icon__icon_minus_cogs___Spree_dot_t__adjustments___admin_order_adjustments_url__order__;
  
  public WebElement getElementOfLink_to_with_icon__icon_minus_cogs___Spree_dot_t__adjustments___admin_order_adjustments_url__order__() {
    return link_to_with_icon__icon_minus_cogs___Spree_dot_t__adjustments___admin_order_adjustments_url__order__;
  }
  
  public String getTextOfLink_to_with_icon__icon_minus_cogs___Spree_dot_t__adjustments___admin_order_adjustments_url__order__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_517") && matcher.group(2).equals("link_to_with_icon__icon_minus_cogs___Spree_dot_t__adjustments___admin_order_adjustments_url__order__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_518']")
  private WebElement link_to_with_icon__icon_minus_credit_minus_card___Spree_dot_t__payments___admin_order_payments_url__order__;
  
  public WebElement getElementOfLink_to_with_icon__icon_minus_credit_minus_card___Spree_dot_t__payments___admin_order_payments_url__order__() {
    return link_to_with_icon__icon_minus_credit_minus_card___Spree_dot_t__payments___admin_order_payments_url__order__;
  }
  
  public String getTextOfLink_to_with_icon__icon_minus_credit_minus_card___Spree_dot_t__payments___admin_order_payments_url__order__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_518") && matcher.group(2).equals("link_to_with_icon__icon_minus_credit_minus_card___Spree_dot_t__payments___admin_order_payments_url__order__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_518']")
  private WebElement ____class__active___if_current_____Payments__;
  
  public WebElement getElementOf____class__active___if_current_____Payments__() {
    return ____class__active___if_current_____Payments__;
  }
  
  public String getTextOf____class__active___if_current_____Payments__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_518") && matcher.group(2).equals("____class__active___if_current_____Payments__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_519']")
  private WebElement link_to_with_icon__icon_minus_share_minus_alt___Spree_dot_t__return_authorizations___admin_order_return_authorizations_url__order__;
  
  public WebElement getElementOfLink_to_with_icon__icon_minus_share_minus_alt___Spree_dot_t__return_authorizations___admin_order_return_authorizations_url__order__() {
    return link_to_with_icon__icon_minus_share_minus_alt___Spree_dot_t__return_authorizations___admin_order_return_authorizations_url__order__;
  }
  
  public String getTextOfLink_to_with_icon__icon_minus_share_minus_alt___Spree_dot_t__return_authorizations___admin_order_return_authorizations_url__order__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_519") && matcher.group(2).equals("link_to_with_icon__icon_minus_share_minus_alt___Spree_dot_t__return_authorizations___admin_order_return_authorizations_url__order__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_519']")
  private WebElement ____class__active___if_current_____Return_Authorizations__;
  
  public WebElement getElementOf____class__active___if_current_____Return_Authorizations__() {
    return ____class__active___if_current_____Return_Authorizations__;
  }
  
  public String getTextOf____class__active___if_current_____Return_Authorizations__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_519") && matcher.group(2).equals("____class__active___if_current_____Return_Authorizations__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
