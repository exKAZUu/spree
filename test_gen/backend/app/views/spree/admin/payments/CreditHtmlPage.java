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

public class CreditHtmlPage extends AbstractPage {
  public CreditHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_277']")
  private WebElement Spree_dot_t__refund__;
  
  public WebElement getElementOfSpree_dot_t__refund__() {
    return Spree_dot_t__refund__;
  }
  
  public String getTextOfSpree_dot_t__refund__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_277") && matcher.group(2).equals("Spree_dot_t__refund__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_278']")
  private WebElement label_tag__amount__Spree_dot_t__amount__;
  
  public WebElement getElementOfLabel_tag__amount__Spree_dot_t__amount__() {
    return label_tag__amount__Spree_dot_t__amount__;
  }
  
  public String getTextOfLabel_tag__amount__Spree_dot_t__amount__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_278") && matcher.group(2).equals("label_tag__amount__Spree_dot_t__amount__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_278']")
  private WebElement text_field_tag__amount___payment_dot_amount_;
  
  public WebElement getElementOfText_field_tag__amount___payment_dot_amount_() {
    return text_field_tag__amount___payment_dot_amount_;
  }
  
  public String getTextOfText_field_tag__amount___payment_dot_amount_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_278") && matcher.group(2).equals("text_field_tag__amount___payment_dot_amount_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_279']")
  private WebElement button_Spree_dot_t__make_refund__;
  
  public WebElement getElementOfButton_Spree_dot_t__make_refund__() {
    return button_Spree_dot_t__make_refund__;
  }
  
  public String getTextOfButton_Spree_dot_t__make_refund__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_279") && matcher.group(2).equals("button_Spree_dot_t__make_refund__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
