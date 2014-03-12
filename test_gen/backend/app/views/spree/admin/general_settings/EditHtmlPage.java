package test.backend.app.views.spree.admin.general_settings;

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
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_41']")
  private WebElement label_tag_key__Spree_dot_t_key____plus__tag__br__if_type_____boolean_;
  
  public WebElement getElementOfLabel_tag_key__Spree_dot_t_key____plus__tag__br__if_type_____boolean_() {
    return label_tag_key__Spree_dot_t_key____plus__tag__br__if_type_____boolean_;
  }
  
  public String getTextOfLabel_tag_key__Spree_dot_t_key____plus__tag__br__if_type_____boolean_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_41") && matcher.group(2).equals("label_tag_key__Spree_dot_t_key____plus__tag__br__if_type_____boolean_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_41']")
  private WebElement label_tag_key__Spree_dot_t_key____plus__tag__br__if_type_____boolean__PO2;
  
  public WebElement getElementOfLabel_tag_key__Spree_dot_t_key____plus__tag__br__if_type_____boolean__PO2() {
    return label_tag_key__Spree_dot_t_key____plus__tag__br__if_type_____boolean__PO2;
  }
  
  public String getTextOfLabel_tag_key__Spree_dot_t_key____plus__tag__br__if_type_____boolean__PO2() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_41") && matcher.group(2).equals("label_tag_key__Spree_dot_t_key____plus__tag__br__if_type_____boolean_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_41']")
  private WebElement preference_field_tag_key__Spree__Config_key____type____type__;
  
  public WebElement getElementOfPreference_field_tag_key__Spree__Config_key____type____type__() {
    return preference_field_tag_key__Spree__Config_key____type____type__;
  }
  
  public String getTextOfPreference_field_tag_key__Spree__Config_key____type____type__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_41") && matcher.group(2).equals("preference_field_tag_key__Spree__Config_key____type____type__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_42']")
  private WebElement Spree_dot_t__security_settings_;
  
  public WebElement getElementOfSpree_dot_t__security_settings_() {
    return Spree_dot_t__security_settings_;
  }
  
  public String getTextOfSpree_dot_t__security_settings_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_42") && matcher.group(2).equals("Spree_dot_t__security_settings_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_43']")
  private WebElement label_tag_key__Spree_dot_t_key____plus__tag__br__if_type_____boolean__PO3;
  
  public WebElement getElementOfLabel_tag_key__Spree_dot_t_key____plus__tag__br__if_type_____boolean__PO3() {
    return label_tag_key__Spree_dot_t_key____plus__tag__br__if_type_____boolean__PO3;
  }
  
  public String getTextOfLabel_tag_key__Spree_dot_t_key____plus__tag__br__if_type_____boolean__PO3() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_43") && matcher.group(2).equals("label_tag_key__Spree_dot_t_key____plus__tag__br__if_type_____boolean_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_43']")
  private WebElement label_tag_key__Spree_dot_t_key____plus__tag__br__if_type_____boolean__PO4;
  
  public WebElement getElementOfLabel_tag_key__Spree_dot_t_key____plus__tag__br__if_type_____boolean__PO4() {
    return label_tag_key__Spree_dot_t_key____plus__tag__br__if_type_____boolean__PO4;
  }
  
  public String getTextOfLabel_tag_key__Spree_dot_t_key____plus__tag__br__if_type_____boolean__PO4() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_43") && matcher.group(2).equals("label_tag_key__Spree_dot_t_key____plus__tag__br__if_type_____boolean_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_43']")
  private WebElement preference_field_tag_key__Spree__Config_key____type____type___PO2;
  
  public WebElement getElementOfPreference_field_tag_key__Spree__Config_key____type____type___PO2() {
    return preference_field_tag_key__Spree__Config_key____type____type___PO2;
  }
  
  public String getTextOfPreference_field_tag_key__Spree__Config_key____type____type___PO2() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_43") && matcher.group(2).equals("preference_field_tag_key__Spree__Config_key____type____type__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_44']")
  private WebElement Spree_dot_t__currency_settings_;
  
  public WebElement getElementOfSpree_dot_t__currency_settings_() {
    return Spree_dot_t__currency_settings_;
  }
  
  public String getTextOfSpree_dot_t__currency_settings_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_44") && matcher.group(2).equals("Spree_dot_t__currency_settings_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_45']")
  private WebElement label_tag_key__Spree_dot_t_key____plus__tag__br__if_type_____boolean__PO5;
  
  public WebElement getElementOfLabel_tag_key__Spree_dot_t_key____plus__tag__br__if_type_____boolean__PO5() {
    return label_tag_key__Spree_dot_t_key____plus__tag__br__if_type_____boolean__PO5;
  }
  
  public String getTextOfLabel_tag_key__Spree_dot_t_key____plus__tag__br__if_type_____boolean__PO5() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_45") && matcher.group(2).equals("label_tag_key__Spree_dot_t_key____plus__tag__br__if_type_____boolean_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_45']")
  private WebElement label_tag_key__Spree_dot_t_key____plus__tag__br__if_type_____boolean__PO6;
  
  public WebElement getElementOfLabel_tag_key__Spree_dot_t_key____plus__tag__br__if_type_____boolean__PO6() {
    return label_tag_key__Spree_dot_t_key____plus__tag__br__if_type_____boolean__PO6;
  }
  
  public String getTextOfLabel_tag_key__Spree_dot_t_key____plus__tag__br__if_type_____boolean__PO6() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_45") && matcher.group(2).equals("label_tag_key__Spree_dot_t_key____plus__tag__br__if_type_____boolean_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_45']")
  private WebElement preference_field_tag_key__Spree__Config_key____type____type___PO3;
  
  public WebElement getElementOfPreference_field_tag_key__Spree__Config_key____type____type___PO3() {
    return preference_field_tag_key__Spree__Config_key____type____type___PO3;
  }
  
  public String getTextOfPreference_field_tag_key__Spree__Config_key____type____type___PO3() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_45") && matcher.group(2).equals("preference_field_tag_key__Spree__Config_key____type____type__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_46']")
  private WebElement label_tag__currency__Spree_dot_t__choose_currency__;
  
  public WebElement getElementOfLabel_tag__currency__Spree_dot_t__choose_currency__() {
    return label_tag__currency__Spree_dot_t__choose_currency__;
  }
  
  public String getTextOfLabel_tag__currency__Spree_dot_t__choose_currency__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_46") && matcher.group(2).equals("label_tag__currency__Spree_dot_t__choose_currency__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_46']")
  private WebElement select_tag__currency__currency_options___class_____fullwidth__;
  
  public WebElement getElementOfSelect_tag__currency__currency_options___class_____fullwidth__() {
    return select_tag__currency__currency_options___class_____fullwidth__;
  }
  
  public String getTextOfSelect_tag__currency__currency_options___class_____fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_46") && matcher.group(2).equals("select_tag__currency__currency_options___class_____fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_48']")
  private WebElement label_tag__currency_symbol_position_before__Spree__Money_dot_new_10___symbol_position_____before___;
  
  public WebElement getElementOfLabel_tag__currency_symbol_position_before__Spree__Money_dot_new_10___symbol_position_____before___() {
    return label_tag__currency_symbol_position_before__Spree__Money_dot_new_10___symbol_position_____before___;
  }
  
  public String getTextOfLabel_tag__currency_symbol_position_before__Spree__Money_dot_new_10___symbol_position_____before___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_48") && matcher.group(2).equals("label_tag__currency_symbol_position_before__Spree__Money_dot_new_10___symbol_position_____before___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_48']")
  private WebElement radio_button_tag__currency_symbol_position___before___Spree__Config__currency_symbol_position______before__;
  
  public WebElement getElementOfRadio_button_tag__currency_symbol_position___before___Spree__Config__currency_symbol_position______before__() {
    return radio_button_tag__currency_symbol_position___before___Spree__Config__currency_symbol_position______before__;
  }
  
  public String getTextOfRadio_button_tag__currency_symbol_position___before___Spree__Config__currency_symbol_position______before__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_48") && matcher.group(2).equals("radio_button_tag__currency_symbol_position___before___Spree__Config__currency_symbol_position______before__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_49']")
  private WebElement label_tag__currency_symbol_position_after__Spree__Money_dot_new_10___symbol_position_____after___;
  
  public WebElement getElementOfLabel_tag__currency_symbol_position_after__Spree__Money_dot_new_10___symbol_position_____after___() {
    return label_tag__currency_symbol_position_after__Spree__Money_dot_new_10___symbol_position_____after___;
  }
  
  public String getTextOfLabel_tag__currency_symbol_position_after__Spree__Money_dot_new_10___symbol_position_____after___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_49") && matcher.group(2).equals("label_tag__currency_symbol_position_after__Spree__Money_dot_new_10___symbol_position_____after___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_49']")
  private WebElement radio_button_tag__currency_symbol_position___after___Spree__Config__currency_symbol_position______after__;
  
  public WebElement getElementOfRadio_button_tag__currency_symbol_position___after___Spree__Config__currency_symbol_position______after__() {
    return radio_button_tag__currency_symbol_position___after___Spree__Config__currency_symbol_position______after__;
  }
  
  public String getTextOfRadio_button_tag__currency_symbol_position___after___Spree__Config__currency_symbol_position______after__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_49") && matcher.group(2).equals("radio_button_tag__currency_symbol_position___after___Spree__Config__currency_symbol_position______after__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_47']")
  private WebElement label_tag_Spree_dot_t__currency_symbol_position__;
  
  public WebElement getElementOfLabel_tag_Spree_dot_t__currency_symbol_position__() {
    return label_tag_Spree_dot_t__currency_symbol_position__;
  }
  
  public String getTextOfLabel_tag_Spree_dot_t__currency_symbol_position__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_47") && matcher.group(2).equals("label_tag_Spree_dot_t__currency_symbol_position__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_50']")
  private WebElement text_field_tag__currency_decimal_mark__Spree__Config__currency_decimal_mark____size____3_;
  
  public WebElement getElementOfText_field_tag__currency_decimal_mark__Spree__Config__currency_decimal_mark____size____3_() {
    return text_field_tag__currency_decimal_mark__Spree__Config__currency_decimal_mark____size____3_;
  }
  
  public String getTextOfText_field_tag__currency_decimal_mark__Spree__Config__currency_decimal_mark____size____3_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_50") && matcher.group(2).equals("text_field_tag__currency_decimal_mark__Spree__Config__currency_decimal_mark____size____3_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_50']")
  private WebElement label_tag__currency_decimal_mark__Spree_dot_t__currency_decimal_mark__;
  
  public WebElement getElementOfLabel_tag__currency_decimal_mark__Spree_dot_t__currency_decimal_mark__() {
    return label_tag__currency_decimal_mark__Spree_dot_t__currency_decimal_mark__;
  }
  
  public String getTextOfLabel_tag__currency_decimal_mark__Spree_dot_t__currency_decimal_mark__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_50") && matcher.group(2).equals("label_tag__currency_decimal_mark__Spree_dot_t__currency_decimal_mark__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_51']")
  private WebElement label_tag__currency_thousands_separator__Spree_dot_t__currency_thousands_separator__;
  
  public WebElement getElementOfLabel_tag__currency_thousands_separator__Spree_dot_t__currency_thousands_separator__() {
    return label_tag__currency_thousands_separator__Spree_dot_t__currency_thousands_separator__;
  }
  
  public String getTextOfLabel_tag__currency_thousands_separator__Spree_dot_t__currency_thousands_separator__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_51") && matcher.group(2).equals("label_tag__currency_thousands_separator__Spree_dot_t__currency_thousands_separator__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_51']")
  private WebElement text_field_tag__currency_thousands_separator__Spree__Config__currency_thousands_separator____size____3_;
  
  public WebElement getElementOfText_field_tag__currency_thousands_separator__Spree__Config__currency_thousands_separator____size____3_() {
    return text_field_tag__currency_thousands_separator__Spree__Config__currency_thousands_separator____size____3_;
  }
  
  public String getTextOfText_field_tag__currency_thousands_separator__Spree__Config__currency_thousands_separator____size____3_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_51") && matcher.group(2).equals("text_field_tag__currency_thousands_separator__Spree__Config__currency_thousands_separator____size____3_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_53']")
  private WebElement Spree_dot_t__or__;
  
  public WebElement getElementOfSpree_dot_t__or__() {
    return Spree_dot_t__or__;
  }
  
  public String getTextOfSpree_dot_t__or__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_53") && matcher.group(2).equals("Spree_dot_t__or__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_52']")
  private WebElement link_to_with_icon__icon_minus_remove___Spree_dot_t__actions_dot_cancel____edit_admin_general_settings_url___class_____button__;
  
  public WebElement getElementOfLink_to_with_icon__icon_minus_remove___Spree_dot_t__actions_dot_cancel____edit_admin_general_settings_url___class_____button__() {
    return link_to_with_icon__icon_minus_remove___Spree_dot_t__actions_dot_cancel____edit_admin_general_settings_url___class_____button__;
  }
  
  public String getTextOfLink_to_with_icon__icon_minus_remove___Spree_dot_t__actions_dot_cancel____edit_admin_general_settings_url___class_____button__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_52") && matcher.group(2).equals("link_to_with_icon__icon_minus_remove___Spree_dot_t__actions_dot_cancel____edit_admin_general_settings_url___class_____button__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_52']")
  private WebElement button_Spree_dot_t__actions_dot_update_____icon_minus_refresh__;
  
  public WebElement getElementOfButton_Spree_dot_t__actions_dot_update_____icon_minus_refresh__() {
    return button_Spree_dot_t__actions_dot_update_____icon_minus_refresh__;
  }
  
  public String getTextOfButton_Spree_dot_t__actions_dot_update_____icon_minus_refresh__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_52") && matcher.group(2).equals("button_Spree_dot_t__actions_dot_update_____icon_minus_refresh__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
