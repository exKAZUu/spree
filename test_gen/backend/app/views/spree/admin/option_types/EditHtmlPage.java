package test.backend.app.views.spree.admin.option_types;

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
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_111']")
  private WebElement _option_type_dot_name_;
  
  public WebElement getElementOf_option_type_dot_name_() {
    return _option_type_dot_name_;
  }
  
  public String getTextOf_option_type_dot_name_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_111") && matcher.group(2).equals("_option_type_dot_name_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='new_add_option_value']")
  private WebElement link_to_add_fields_Spree_dot_t__add_option_value____tbody_option_values____class_____button_icon_minus_plus__;
  
  public WebElement getElementOfLink_to_add_fields_Spree_dot_t__add_option_value____tbody_option_values____class_____button_icon_minus_plus__() {
    return link_to_add_fields_Spree_dot_t__add_option_value____tbody_option_values____class_____button_icon_minus_plus__;
  }
  
  public String getTextOfLink_to_add_fields_Spree_dot_t__add_option_value____tbody_option_values____class_____button_icon_minus_plus__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("new_add_option_value") && matcher.group(2).equals("link_to_add_fields_Spree_dot_t__add_option_value____tbody_option_values____class_____button_icon_minus_plus__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_112']")
  private WebElement button_link_to_Spree_dot_t__back_to_option_types_list___spree_dot_admin_option_types_path___icon_____icon_minus_arrow_minus_left__;
  
  public WebElement getElementOfButton_link_to_Spree_dot_t__back_to_option_types_list___spree_dot_admin_option_types_path___icon_____icon_minus_arrow_minus_left__() {
    return button_link_to_Spree_dot_t__back_to_option_types_list___spree_dot_admin_option_types_path___icon_____icon_minus_arrow_minus_left__;
  }
  
  public String getTextOfButton_link_to_Spree_dot_t__back_to_option_types_list___spree_dot_admin_option_types_path___icon_____icon_minus_arrow_minus_left__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_112") && matcher.group(2).equals("button_link_to_Spree_dot_t__back_to_option_types_list___spree_dot_admin_option_types_path___icon_____icon_minus_arrow_minus_left__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_114']")
  private WebElement Spree_dot_t__option_values__;
  
  public WebElement getElementOfSpree_dot_t__option_values__() {
    return Spree_dot_t__option_values__;
  }
  
  public String getTextOfSpree_dot_t__option_values__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_114") && matcher.group(2).equals("Spree_dot_t__option_values__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_116']")
  private WebElement Spree_dot_t__name__;
  
  public WebElement getElementOfSpree_dot_t__name__() {
    return Spree_dot_t__name__;
  }
  
  public String getTextOfSpree_dot_t__name__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_116") && matcher.group(2).equals("Spree_dot_t__name__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_117']")
  private WebElement Spree_dot_t__display__;
  
  public WebElement getElementOfSpree_dot_t__display__() {
    return Spree_dot_t__display__;
  }
  
  public String getTextOfSpree_dot_t__display__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_117") && matcher.group(2).equals("Spree_dot_t__display__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_118']")
  private WebElement Spree_dot_t__none__;
  
  public WebElement getElementOfSpree_dot_t__none__() {
    return Spree_dot_t__none__;
  }
  
  public String getTextOfSpree_dot_t__none__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_118") && matcher.group(2).equals("Spree_dot_t__none__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='none']")
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
      if (matcher.group(1).equals("none") && matcher.group(2).equals("cycle__odd____even__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='option_values']")
  private WebElement render__partial_____option_value_fields____locals_______f____option_value_form___;
  
  public WebElement getElementOfRender__partial_____option_value_fields____locals_______f____option_value_form___() {
    return render__partial_____option_value_fields____locals_______f____option_value_form___;
  }
  
  public String getTextOfRender__partial_____option_value_fields____locals_______f____option_value_form___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("option_values") && matcher.group(2).equals("render__partial_____option_value_fields____locals_______f____option_value_form___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='option_values']")
  private WebElement f_dot_fields_for__option_values_do__option_value_form__;
  
  public WebElement getElementOfF_dot_fields_for__option_values_do__option_value_form__() {
    return f_dot_fields_for__option_values_do__option_value_form__;
  }
  
  public String getTextOfF_dot_fields_for__option_values_do__option_value_form__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("option_values") && matcher.group(2).equals("f_dot_fields_for__option_values_do__option_value_form__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_115']")
  private WebElement update_values_positions_admin_option_types_url_;
  
  public WebElement getElementOfUpdate_values_positions_admin_option_types_url_() {
    return update_values_positions_admin_option_types_url_;
  }
  
  public String getAttributeOfData-sortable-linkOnUpdate_values_positions_admin_option_types_url_() {
    return update_values_positions_admin_option_types_url_.getAttribute("data-sortable-link");
  }
  
  public String getTextOfUpdate_values_positions_admin_option_types_url_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_115") && matcher.group(2).equals("update_values_positions_admin_option_types_url_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_113']")
  private WebElement render__partial_____form____locals_______f____f___;
  
  public WebElement getElementOfRender__partial_____form____locals_______f____f___() {
    return render__partial_____form____locals_______f____f___;
  }
  
  public String getTextOfRender__partial_____form____locals_______f____f___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_113") && matcher.group(2).equals("render__partial_____form____locals_______f____f___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_113']")
  private WebElement render__partial_____spree_divide_admin_divide_shared_divide_edit_resource_links__;
  
  public WebElement getElementOfRender__partial_____spree_divide_admin_divide_shared_divide_edit_resource_links__() {
    return render__partial_____spree_divide_admin_divide_shared_divide_edit_resource_links__;
  }
  
  public String getTextOfRender__partial_____spree_divide_admin_divide_shared_divide_edit_resource_links__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_113") && matcher.group(2).equals("render__partial_____spree_divide_admin_divide_shared_divide_edit_resource_links__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
