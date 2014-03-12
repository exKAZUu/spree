package test.backend.app.views.spree.admin.mail_methods;

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

public class FormHtmlPage extends AbstractPage {
  public FormHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_91']")
  private WebElement Spree_dot_t__general__;
  
  public WebElement getElementOfSpree_dot_t__general__() {
    return Spree_dot_t__general__;
  }
  
  public String getTextOfSpree_dot_t__general__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_91") && matcher.group(2).equals("Spree_dot_t__general__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_92']")
  private WebElement preference_field_tag__enable_mail_delivery___Spree__Config__enable_mail_delivery____type_____boolean__;
  
  public WebElement getElementOfPreference_field_tag__enable_mail_delivery___Spree__Config__enable_mail_delivery____type_____boolean__() {
    return preference_field_tag__enable_mail_delivery___Spree__Config__enable_mail_delivery____type_____boolean__;
  }
  
  public String getTextOfPreference_field_tag__enable_mail_delivery___Spree__Config__enable_mail_delivery____type_____boolean__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_92") && matcher.group(2).equals("preference_field_tag__enable_mail_delivery___Spree__Config__enable_mail_delivery____type_____boolean__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_92']")
  private WebElement label_tag__enable_mail_delivery__Spree_dot_t__enable_mail_delivery__;
  
  public WebElement getElementOfLabel_tag__enable_mail_delivery__Spree_dot_t__enable_mail_delivery__() {
    return label_tag__enable_mail_delivery__Spree_dot_t__enable_mail_delivery__;
  }
  
  public String getTextOfLabel_tag__enable_mail_delivery__Spree_dot_t__enable_mail_delivery__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_92") && matcher.group(2).equals("label_tag__enable_mail_delivery__Spree_dot_t__enable_mail_delivery__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_94']")
  private WebElement Spree_dot_t__smtp_send_all_emails_as_from_following_address__;
  
  public WebElement getElementOfSpree_dot_t__smtp_send_all_emails_as_from_following_address__() {
    return Spree_dot_t__smtp_send_all_emails_as_from_following_address__;
  }
  
  public String getTextOfSpree_dot_t__smtp_send_all_emails_as_from_following_address__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_94") && matcher.group(2).equals("Spree_dot_t__smtp_send_all_emails_as_from_following_address__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_93']")
  private WebElement text_field_tag__mails_from__Spree__Config__mails_from____maxlength____256___class_____fullwidth__;
  
  public WebElement getElementOfText_field_tag__mails_from__Spree__Config__mails_from____maxlength____256___class_____fullwidth__() {
    return text_field_tag__mails_from__Spree__Config__mails_from____maxlength____256___class_____fullwidth__;
  }
  
  public String getTextOfText_field_tag__mails_from__Spree__Config__mails_from____maxlength____256___class_____fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_93") && matcher.group(2).equals("text_field_tag__mails_from__Spree__Config__mails_from____maxlength____256___class_____fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_93']")
  private WebElement label_tag__mails_from__Spree_dot_t__send_mails_as__;
  
  public WebElement getElementOfLabel_tag__mails_from__Spree_dot_t__send_mails_as__() {
    return label_tag__mails_from__Spree_dot_t__send_mails_as__;
  }
  
  public String getTextOfLabel_tag__mails_from__Spree_dot_t__send_mails_as__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_93") && matcher.group(2).equals("label_tag__mails_from__Spree_dot_t__send_mails_as__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_96']")
  private WebElement Spree_dot_t__smtp_send_copy_to_this_addresses__;
  
  public WebElement getElementOfSpree_dot_t__smtp_send_copy_to_this_addresses__() {
    return Spree_dot_t__smtp_send_copy_to_this_addresses__;
  }
  
  public String getTextOfSpree_dot_t__smtp_send_copy_to_this_addresses__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_96") && matcher.group(2).equals("Spree_dot_t__smtp_send_copy_to_this_addresses__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_95']")
  private WebElement label_tag__mail_bcc__Spree_dot_t__send_copy_of_all_mails_to__;
  
  public WebElement getElementOfLabel_tag__mail_bcc__Spree_dot_t__send_copy_of_all_mails_to__() {
    return label_tag__mail_bcc__Spree_dot_t__send_copy_of_all_mails_to__;
  }
  
  public String getTextOfLabel_tag__mail_bcc__Spree_dot_t__send_copy_of_all_mails_to__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_95") && matcher.group(2).equals("label_tag__mail_bcc__Spree_dot_t__send_copy_of_all_mails_to__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_95']")
  private WebElement text_field_tag__mail_bcc__Spree__Config__mail_bcc____maxlength____256___class_____fullwidth__;
  
  public WebElement getElementOfText_field_tag__mail_bcc__Spree__Config__mail_bcc____maxlength____256___class_____fullwidth__() {
    return text_field_tag__mail_bcc__Spree__Config__mail_bcc____maxlength____256___class_____fullwidth__;
  }
  
  public String getTextOfText_field_tag__mail_bcc__Spree__Config__mail_bcc____maxlength____256___class_____fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_95") && matcher.group(2).equals("text_field_tag__mail_bcc__Spree__Config__mail_bcc____maxlength____256___class_____fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_98']")
  private WebElement Spree_dot_t__intercept_email_instructions__;
  
  public WebElement getElementOfSpree_dot_t__intercept_email_instructions__() {
    return Spree_dot_t__intercept_email_instructions__;
  }
  
  public String getTextOfSpree_dot_t__intercept_email_instructions__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_98") && matcher.group(2).equals("Spree_dot_t__intercept_email_instructions__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_97']")
  private WebElement text_field_tag__intercept_email__Spree__Config__intercept_email____maxlength____256___class_____fullwidth__;
  
  public WebElement getElementOfText_field_tag__intercept_email__Spree__Config__intercept_email____maxlength____256___class_____fullwidth__() {
    return text_field_tag__intercept_email__Spree__Config__intercept_email____maxlength____256___class_____fullwidth__;
  }
  
  public String getTextOfText_field_tag__intercept_email__Spree__Config__intercept_email____maxlength____256___class_____fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_97") && matcher.group(2).equals("text_field_tag__intercept_email__Spree__Config__intercept_email____maxlength____256___class_____fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_97']")
  private WebElement label_tag__intercept_email__Spree_dot_t__intercept_email_address__;
  
  public WebElement getElementOfLabel_tag__intercept_email__Spree_dot_t__intercept_email_address__() {
    return label_tag__intercept_email__Spree_dot_t__intercept_email_address__;
  }
  
  public String getTextOfLabel_tag__intercept_email__Spree_dot_t__intercept_email_address__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_97") && matcher.group(2).equals("label_tag__intercept_email__Spree_dot_t__intercept_email_address__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_99']")
  private WebElement Spree_dot_t__smtp__;
  
  public WebElement getElementOfSpree_dot_t__smtp__() {
    return Spree_dot_t__smtp__;
  }
  
  public String getTextOfSpree_dot_t__smtp__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_99") && matcher.group(2).equals("Spree_dot_t__smtp__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_100']")
  private WebElement text_field_tag__mail_domain__Spree__Config__mail_domain____class_____fullwidth__;
  
  public WebElement getElementOfText_field_tag__mail_domain__Spree__Config__mail_domain____class_____fullwidth__() {
    return text_field_tag__mail_domain__Spree__Config__mail_domain____class_____fullwidth__;
  }
  
  public String getTextOfText_field_tag__mail_domain__Spree__Config__mail_domain____class_____fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_100") && matcher.group(2).equals("text_field_tag__mail_domain__Spree__Config__mail_domain____class_____fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_100']")
  private WebElement label_tag__mail_domain__Spree_dot_t__smtp_domain__;
  
  public WebElement getElementOfLabel_tag__mail_domain__Spree_dot_t__smtp_domain__() {
    return label_tag__mail_domain__Spree_dot_t__smtp_domain__;
  }
  
  public String getTextOfLabel_tag__mail_domain__Spree_dot_t__smtp_domain__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_100") && matcher.group(2).equals("label_tag__mail_domain__Spree_dot_t__smtp_domain__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_101']")
  private WebElement label_tag__mail_host__Spree_dot_t__smtp_mail_host__;
  
  public WebElement getElementOfLabel_tag__mail_host__Spree_dot_t__smtp_mail_host__() {
    return label_tag__mail_host__Spree_dot_t__smtp_mail_host__;
  }
  
  public String getTextOfLabel_tag__mail_host__Spree_dot_t__smtp_mail_host__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_101") && matcher.group(2).equals("label_tag__mail_host__Spree_dot_t__smtp_mail_host__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_101']")
  private WebElement text_field_tag__mail_host__Spree__Config__mail_host____class_____fullwidth__;
  
  public WebElement getElementOfText_field_tag__mail_host__Spree__Config__mail_host____class_____fullwidth__() {
    return text_field_tag__mail_host__Spree__Config__mail_host____class_____fullwidth__;
  }
  
  public String getTextOfText_field_tag__mail_host__Spree__Config__mail_host____class_____fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_101") && matcher.group(2).equals("text_field_tag__mail_host__Spree__Config__mail_host____class_____fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_102']")
  private WebElement label_tag__mail_port__Spree_dot_t__smtp_port__;
  
  public WebElement getElementOfLabel_tag__mail_port__Spree_dot_t__smtp_port__() {
    return label_tag__mail_port__Spree_dot_t__smtp_port__;
  }
  
  public String getTextOfLabel_tag__mail_port__Spree_dot_t__smtp_port__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_102") && matcher.group(2).equals("label_tag__mail_port__Spree_dot_t__smtp_port__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_102']")
  private WebElement text_field_tag__mail_port__Spree__Config__mail_port____class_____fullwidth__;
  
  public WebElement getElementOfText_field_tag__mail_port__Spree__Config__mail_port____class_____fullwidth__() {
    return text_field_tag__mail_port__Spree__Config__mail_port____class_____fullwidth__;
  }
  
  public String getTextOfText_field_tag__mail_port__Spree__Config__mail_port____class_____fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_102") && matcher.group(2).equals("text_field_tag__mail_port__Spree__Config__mail_port____class_____fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_103']")
  private WebElement label_tag__secure_connection_type__Spree_dot_t__secure_connection_type__;
  
  public WebElement getElementOfLabel_tag__secure_connection_type__Spree_dot_t__secure_connection_type__() {
    return label_tag__secure_connection_type__Spree_dot_t__secure_connection_type__;
  }
  
  public String getTextOfLabel_tag__secure_connection_type__Spree_dot_t__secure_connection_type__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_103") && matcher.group(2).equals("label_tag__secure_connection_type__Spree_dot_t__secure_connection_type__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_104']")
  private WebElement label_tag__mail_auth_type__Spree_dot_t__smtp_authentication_type__;
  
  public WebElement getElementOfLabel_tag__mail_auth_type__Spree_dot_t__smtp_authentication_type__() {
    return label_tag__mail_auth_type__Spree_dot_t__smtp_authentication_type__;
  }
  
  public String getTextOfLabel_tag__mail_auth_type__Spree_dot_t__smtp_authentication_type__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_104") && matcher.group(2).equals("label_tag__mail_auth_type__Spree_dot_t__smtp_authentication_type__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_105']")
  private WebElement label_tag__smtp_username__Spree_dot_t__smtp_username__;
  
  public WebElement getElementOfLabel_tag__smtp_username__Spree_dot_t__smtp_username__() {
    return label_tag__smtp_username__Spree_dot_t__smtp_username__;
  }
  
  public String getTextOfLabel_tag__smtp_username__Spree_dot_t__smtp_username__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_105") && matcher.group(2).equals("label_tag__smtp_username__Spree_dot_t__smtp_username__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_105']")
  private WebElement text_field_tag__smtp_username__Spree__Config__smtp_username____class_____fullwidth____autocomplete_____off__;
  
  public WebElement getElementOfText_field_tag__smtp_username__Spree__Config__smtp_username____class_____fullwidth____autocomplete_____off__() {
    return text_field_tag__smtp_username__Spree__Config__smtp_username____class_____fullwidth____autocomplete_____off__;
  }
  
  public String getTextOfText_field_tag__smtp_username__Spree__Config__smtp_username____class_____fullwidth____autocomplete_____off__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_105") && matcher.group(2).equals("text_field_tag__smtp_username__Spree__Config__smtp_username____class_____fullwidth____autocomplete_____off__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_106']")
  private WebElement password_field_tag__smtp_password__Spree__Config__smtp_password____class_____fullwidth____autocomplete_____off__;
  
  public WebElement getElementOfPassword_field_tag__smtp_password__Spree__Config__smtp_password____class_____fullwidth____autocomplete_____off__() {
    return password_field_tag__smtp_password__Spree__Config__smtp_password____class_____fullwidth____autocomplete_____off__;
  }
  
  public String getTextOfPassword_field_tag__smtp_password__Spree__Config__smtp_password____class_____fullwidth____autocomplete_____off__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_106") && matcher.group(2).equals("password_field_tag__smtp_password__Spree__Config__smtp_password____class_____fullwidth____autocomplete_____off__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_106']")
  private WebElement label_tag__preferred_smtp_password__Spree_dot_t__smtp_password__;
  
  public WebElement getElementOfLabel_tag__preferred_smtp_password__Spree_dot_t__smtp_password__() {
    return label_tag__preferred_smtp_password__Spree_dot_t__smtp_password__;
  }
  
  public String getTextOfLabel_tag__preferred_smtp_password__Spree_dot_t__smtp_password__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_106") && matcher.group(2).equals("label_tag__preferred_smtp_password__Spree_dot_t__smtp_password__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
