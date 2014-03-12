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

public class IndexHtmlPage extends AbstractPage {
  public IndexHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_472']")
  private WebElement button_link_to_Spree_dot_t__new_return_authorization___new_admin_order_return_authorization_url__order____icon_____icon_minus_plus__;
  
  public WebElement getElementOfButton_link_to_Spree_dot_t__new_return_authorization___new_admin_order_return_authorization_url__order____icon_____icon_minus_plus__() {
    return button_link_to_Spree_dot_t__new_return_authorization___new_admin_order_return_authorization_url__order____icon_____icon_minus_plus__;
  }
  
  public String getTextOfButton_link_to_Spree_dot_t__new_return_authorization___new_admin_order_return_authorization_url__order____icon_____icon_minus_plus__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_472") && matcher.group(2).equals("button_link_to_Spree_dot_t__new_return_authorization___new_admin_order_return_authorization_url__order____icon_____icon_minus_plus__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_473']")
  private WebElement button_link_to_Spree_dot_t__back_to_orders_list___spree_dot_admin_orders_path___icon_____icon_minus_arrow_minus_left__;
  
  public WebElement getElementOfButton_link_to_Spree_dot_t__back_to_orders_list___spree_dot_admin_orders_path___icon_____icon_minus_arrow_minus_left__() {
    return button_link_to_Spree_dot_t__back_to_orders_list___spree_dot_admin_orders_path___icon_____icon_minus_arrow_minus_left__;
  }
  
  public String getTextOfButton_link_to_Spree_dot_t__back_to_orders_list___spree_dot_admin_orders_path___icon_____icon_minus_arrow_minus_left__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_473") && matcher.group(2).equals("button_link_to_Spree_dot_t__back_to_orders_list___spree_dot_admin_orders_path___icon_____icon_minus_arrow_minus_left__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_474']")
  private WebElement Spree_dot_t__rma_number__;
  
  public WebElement getElementOfSpree_dot_t__rma_number__() {
    return Spree_dot_t__rma_number__;
  }
  
  public String getTextOfSpree_dot_t__rma_number__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_474") && matcher.group(2).equals("Spree_dot_t__rma_number__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_475']")
  private WebElement Spree_dot_t__status__;
  
  public WebElement getElementOfSpree_dot_t__status__() {
    return Spree_dot_t__status__;
  }
  
  public String getTextOfSpree_dot_t__status__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_475") && matcher.group(2).equals("Spree_dot_t__status__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_476']")
  private WebElement Spree_dot_t__amount__;
  
  public WebElement getElementOfSpree_dot_t__amount__() {
    return Spree_dot_t__amount__;
  }
  
  public String getTextOfSpree_dot_t__amount__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_476") && matcher.group(2).equals("Spree_dot_t__amount__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_477']")
  private WebElement ___Spree_dot_t__date____divide___Spree_dot_t__time_____;
  
  public WebElement getElementOf___Spree_dot_t__date____divide___Spree_dot_t__time_____() {
    return ___Spree_dot_t__date____divide___Spree_dot_t__time_____;
  }
  
  public String getTextOf___Spree_dot_t__date____divide___Spree_dot_t__time_____() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_477") && matcher.group(2).equals("___Spree_dot_t__date____divide___Spree_dot_t__time_____")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_478']")
  private WebElement return_authorization_dot_number_;
  
  public WebElement getElementOfReturn_authorization_dot_number_() {
    return return_authorization_dot_number_;
  }
  
  public String getTextOfReturn_authorization_dot_number_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_478") && matcher.group(2).equals("return_authorization_dot_number_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_479']")
  private WebElement Spree_dot_t_return_authorization_dot_state_dot_downcase__;
  
  public WebElement getElementOfSpree_dot_t_return_authorization_dot_state_dot_downcase__() {
    return Spree_dot_t_return_authorization_dot_state_dot_downcase__;
  }
  
  public String getTextOfSpree_dot_t_return_authorization_dot_state_dot_downcase__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_479") && matcher.group(2).equals("Spree_dot_t_return_authorization_dot_state_dot_downcase__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_480']")
  private WebElement return_authorization_dot_display_amount_dot_to_html_;
  
  public WebElement getElementOfReturn_authorization_dot_display_amount_dot_to_html_() {
    return return_authorization_dot_display_amount_dot_to_html_;
  }
  
  public String getTextOfReturn_authorization_dot_display_amount_dot_to_html_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_480") && matcher.group(2).equals("return_authorization_dot_display_amount_dot_to_html_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_481']")
  private WebElement pretty_time_return_authorization_dot_created_at__;
  
  public WebElement getElementOfPretty_time_return_authorization_dot_created_at__() {
    return pretty_time_return_authorization_dot_created_at__;
  }
  
  public String getTextOfPretty_time_return_authorization_dot_created_at__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_481") && matcher.group(2).equals("pretty_time_return_authorization_dot_created_at__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_482']")
  private WebElement link_to_edit_return_authorization___no_text____true___class_____edit__;
  
  public WebElement getElementOfLink_to_edit_return_authorization___no_text____true___class_____edit__() {
    return link_to_edit_return_authorization___no_text____true___class_____edit__;
  }
  
  public String getTextOfLink_to_edit_return_authorization___no_text____true___class_____edit__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_482") && matcher.group(2).equals("link_to_edit_return_authorization___no_text____true___class_____edit__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_482']")
  private WebElement link_to_delete_return_authorization___no_text____true_;
  
  public WebElement getElementOfLink_to_delete_return_authorization___no_text____true_() {
    return link_to_delete_return_authorization___no_text____true_;
  }
  
  public String getTextOfLink_to_delete_return_authorization___no_text____true_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_482") && matcher.group(2).equals("link_to_delete_return_authorization___no_text____true_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='<%= spree_dom_id(return_authorization) %>']")
  private WebElement cycle__odd____even__;
  
  public WebElement getElementOfCycle__odd____even__() {
    return cycle__odd____even__;
  }
  
  public String getAttributeOfClassOnCycle__odd____even__() {
    return cycle__odd____even__.getAttribute("class");
  }
  
  public String getTextOfCycle__odd____even__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("<%= spree_dom_id(return_authorization) %>") && matcher.group(2).equals("cycle__odd____even__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='<%= spree_dom_id(return_authorization) %>']")
  private WebElement spree_dom_id_return_authorization__;
  
  public WebElement getElementOfSpree_dom_id_return_authorization__() {
    return spree_dom_id_return_authorization__;
  }
  
  public String getAttributeOfIdOnSpree_dom_id_return_authorization__() {
    return spree_dom_id_return_authorization__.getAttribute("id");
  }
  
  public String getTextOfSpree_dom_id_return_authorization__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("<%= spree_dom_id(return_authorization) %>") && matcher.group(2).equals("spree_dom_id_return_authorization__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_483']")
  private WebElement Spree_dot_t__cannot_create_returns__;
  
  public WebElement getElementOfSpree_dot_t__cannot_create_returns__() {
    return Spree_dot_t__cannot_create_returns__;
  }
  
  public String getTextOfSpree_dot_t__cannot_create_returns__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_483") && matcher.group(2).equals("Spree_dot_t__cannot_create_returns__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
