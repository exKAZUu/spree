package test.backend.app.views.spree.admin.payments;

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

public class ListHtmlPage extends AbstractPage {
  public ListHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_268']")
  private WebElement ___Spree_dot_t__date____divide___Spree_dot_t__time_____;
  
  public WebElement getElementOf___Spree_dot_t__date____divide___Spree_dot_t__time_____() {
    return ___Spree_dot_t__date____divide___Spree_dot_t__time_____;
  }
  
  public String getTextOf___Spree_dot_t__date____divide___Spree_dot_t__time_____() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_268") && matcher.group(2).equals("___Spree_dot_t__date____divide___Spree_dot_t__time_____")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_269']")
  private WebElement Spree_dot_t__amount__;
  
  public WebElement getElementOfSpree_dot_t__amount__() {
    return Spree_dot_t__amount__;
  }
  
  public String getTextOfSpree_dot_t__amount__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_269") && matcher.group(2).equals("Spree_dot_t__amount__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_270']")
  private WebElement Spree_dot_t__payment_method__;
  
  public WebElement getElementOfSpree_dot_t__payment_method__() {
    return Spree_dot_t__payment_method__;
  }
  
  public String getTextOfSpree_dot_t__payment_method__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_270") && matcher.group(2).equals("Spree_dot_t__payment_method__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_271']")
  private WebElement Spree_dot_t__payment_state__;
  
  public WebElement getElementOfSpree_dot_t__payment_state__() {
    return Spree_dot_t__payment_state__;
  }
  
  public String getTextOfSpree_dot_t__payment_state__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_271") && matcher.group(2).equals("Spree_dot_t__payment_state__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_272']")
  private WebElement link_to_pretty_time_payment_dot_created_at___spree_dot_admin_order_payment_path__order__payment__;
  
  public WebElement getElementOfLink_to_pretty_time_payment_dot_created_at___spree_dot_admin_order_payment_path__order__payment__() {
    return link_to_pretty_time_payment_dot_created_at___spree_dot_admin_order_payment_path__order__payment__;
  }
  
  public String getTextOfLink_to_pretty_time_payment_dot_created_at___spree_dot_admin_order_payment_path__order__payment__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_272") && matcher.group(2).equals("link_to_pretty_time_payment_dot_created_at___spree_dot_admin_order_payment_path__order__payment__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_273']")
  private WebElement payment_dot_display_amount_dot_to_html_;
  
  public WebElement getElementOfPayment_dot_display_amount_dot_to_html_() {
    return payment_dot_display_amount_dot_to_html_;
  }
  
  public String getTextOfPayment_dot_display_amount_dot_to_html_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_273") && matcher.group(2).equals("payment_dot_display_amount_dot_to_html_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_274']")
  private WebElement payment_method_name_payment__;
  
  public WebElement getElementOfPayment_method_name_payment__() {
    return payment_method_name_payment__;
  }
  
  public String getTextOfPayment_method_name_payment__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_274") && matcher.group(2).equals("payment_method_name_payment__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_275']")
  private WebElement Spree_dot_t_payment_dot_state___scope_____payment_states___default____payment_dot_state_dot_capitalize__;
  
  public WebElement getElementOfSpree_dot_t_payment_dot_state___scope_____payment_states___default____payment_dot_state_dot_capitalize__() {
    return Spree_dot_t_payment_dot_state___scope_____payment_states___default____payment_dot_state_dot_capitalize__;
  }
  
  public String getTextOfSpree_dot_t_payment_dot_state___scope_____payment_states___default____payment_dot_state_dot_capitalize__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_275") && matcher.group(2).equals("Spree_dot_t_payment_dot_state___scope_____payment_states___default____payment_dot_state_dot_capitalize__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_275']")
  private WebElement payment_dot_state_;
  
  public WebElement getElementOfPayment_dot_state_() {
    return payment_dot_state_;
  }
  
  public String getAttributeOfClassOnPayment_dot_state_() {
    return payment_dot_state_.getAttribute("class");
  }
  
  public String getTextOfPayment_dot_state_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_275") && matcher.group(2).equals("payment_dot_state_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_276']")
  private WebElement link_to_with_icon__icon_minus___action____Spree_dot_t_action___fire_admin_order_payment_path__order__payment___e____action____method_____put___no_text____true___data______action____action__;
  
  public WebElement getElementOfLink_to_with_icon__icon_minus___action____Spree_dot_t_action___fire_admin_order_payment_path__order__payment___e____action____method_____put___no_text____true___data______action____action__() {
    return link_to_with_icon__icon_minus___action____Spree_dot_t_action___fire_admin_order_payment_path__order__payment___e____action____method_____put___no_text____true___data______action____action__;
  }
  
  public String getTextOfLink_to_with_icon__icon_minus___action____Spree_dot_t_action___fire_admin_order_payment_path__order__payment___e____action____method_____put___no_text____true___data______action____action__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_276") && matcher.group(2).equals("link_to_with_icon__icon_minus___action____Spree_dot_t_action___fire_admin_order_payment_path__order__payment___e____action____method_____put___no_text____true___data______action____action__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='<%= dom_id(payment) %>']")
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
      if (matcher.group(1).equals("<%= dom_id(payment) %>") && matcher.group(2).equals("cycle__odd____even__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='<%= dom_id(payment) %>']")
  private WebElement dom_id_payment__;
  
  public WebElement getElementOfDom_id_payment__() {
    return dom_id_payment__;
  }
  
  public String getAttributeOfIdOnDom_id_payment__() {
    return dom_id_payment__.getAttribute("id");
  }
  
  public String getTextOfDom_id_payment__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("<%= dom_id(payment) %>") && matcher.group(2).equals("dom_id_payment__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
