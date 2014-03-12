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

public class IndexHtmlPage extends AbstractPage {
  public IndexHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_654']")
  private WebElement button_link_to_Spree_dot_t__new_stock_transfer___new_admin_stock_transfer_path_____icon_____icon_minus_forward____;
  
  public WebElement getElementOfButton_link_to_Spree_dot_t__new_stock_transfer___new_admin_stock_transfer_path_____icon_____icon_minus_forward____() {
    return button_link_to_Spree_dot_t__new_stock_transfer___new_admin_stock_transfer_path_____icon_____icon_minus_forward____;
  }
  
  public String getTextOfButton_link_to_Spree_dot_t__new_stock_transfer___new_admin_stock_transfer_path_____icon_____icon_minus_forward____() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_654") && matcher.group(2).equals("button_link_to_Spree_dot_t__new_stock_transfer___new_admin_stock_transfer_path_____icon_____icon_minus_forward____")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_656']")
  private WebElement Spree_dot_t__search__;
  
  public WebElement getElementOfSpree_dot_t__search__() {
    return Spree_dot_t__search__;
  }
  
  public String getTextOfSpree_dot_t__search__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_656") && matcher.group(2).equals("Spree_dot_t__search__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_657']")
  private WebElement f_dot_text_field__reference_cont__class___fullwidth__;
  
  public WebElement getElementOfF_dot_text_field__reference_cont__class___fullwidth__() {
    return f_dot_text_field__reference_cont__class___fullwidth__;
  }
  
  public String getTextOfF_dot_text_field__reference_cont__class___fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_657") && matcher.group(2).equals("f_dot_text_field__reference_cont__class___fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_657']")
  private WebElement f_dot_label__reference_cont__Spree_dot_t__reference_cont__;
  
  public WebElement getElementOfF_dot_label__reference_cont__Spree_dot_t__reference_cont__() {
    return f_dot_label__reference_cont__Spree_dot_t__reference_cont__;
  }
  
  public String getTextOfF_dot_label__reference_cont__Spree_dot_t__reference_cont__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_657") && matcher.group(2).equals("f_dot_label__reference_cont__Spree_dot_t__reference_cont__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_658']")
  private WebElement f_dot_label__source_location__Spree_dot_t__source__;
  
  public WebElement getElementOfF_dot_label__source_location__Spree_dot_t__source__() {
    return f_dot_label__source_location__Spree_dot_t__source__;
  }
  
  public String getTextOfF_dot_label__source_location__Spree_dot_t__source__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_658") && matcher.group(2).equals("f_dot_label__source_location__Spree_dot_t__source__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_659']")
  private WebElement f_dot_label__destination_location__Spree_dot_t__destination__;
  
  public WebElement getElementOfF_dot_label__destination_location__Spree_dot_t__destination__() {
    return f_dot_label__destination_location__Spree_dot_t__destination__;
  }
  
  public String getTextOfF_dot_label__destination_location__Spree_dot_t__destination__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_659") && matcher.group(2).equals("f_dot_label__destination_location__Spree_dot_t__destination__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_660']")
  private WebElement button_Spree_dot_t__filter_results____icon_minus_search__;
  
  public WebElement getElementOfButton_Spree_dot_t__filter_results____icon_minus_search__() {
    return button_Spree_dot_t__filter_results____icon_minus_search__;
  }
  
  public String getTextOfButton_Spree_dot_t__filter_results____icon_minus_search__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_660") && matcher.group(2).equals("button_Spree_dot_t__filter_results____icon_minus_search__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_655']")
  private WebElement search_form_for__q___url____admin_stock_transfers_path_do__f__;
  
  public WebElement getElementOfSearch_form_for__q___url____admin_stock_transfers_path_do__f__() {
    return search_form_for__q___url____admin_stock_transfers_path_do__f__;
  }
  
  public String getTextOfSearch_form_for__q___url____admin_stock_transfers_path_do__f__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_655") && matcher.group(2).equals("search_form_for__q___url____admin_stock_transfers_path_do__f__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_661']")
  private WebElement Spree_dot_t__created_at__;
  
  public WebElement getElementOfSpree_dot_t__created_at__() {
    return Spree_dot_t__created_at__;
  }
  
  public String getTextOfSpree_dot_t__created_at__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_661") && matcher.group(2).equals("Spree_dot_t__created_at__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_662']")
  private WebElement Spree_dot_t__reference__;
  
  public WebElement getElementOfSpree_dot_t__reference__() {
    return Spree_dot_t__reference__;
  }
  
  public String getTextOfSpree_dot_t__reference__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_662") && matcher.group(2).equals("Spree_dot_t__reference__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_663']")
  private WebElement Spree_dot_t__source__;
  
  public WebElement getElementOfSpree_dot_t__source__() {
    return Spree_dot_t__source__;
  }
  
  public String getTextOfSpree_dot_t__source__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_663") && matcher.group(2).equals("Spree_dot_t__source__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_664']")
  private WebElement Spree_dot_t__destination__;
  
  public WebElement getElementOfSpree_dot_t__destination__() {
    return Spree_dot_t__destination__;
  }
  
  public String getTextOfSpree_dot_t__destination__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_664") && matcher.group(2).equals("Spree_dot_t__destination__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_665']")
  private WebElement stock_transfer_dot_created_at_;
  
  public WebElement getElementOfStock_transfer_dot_created_at_() {
    return stock_transfer_dot_created_at_;
  }
  
  public String getTextOfStock_transfer_dot_created_at_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_665") && matcher.group(2).equals("stock_transfer_dot_created_at_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_666']")
  private WebElement stock_transfer_dot_reference_;
  
  public WebElement getElementOfStock_transfer_dot_reference_() {
    return stock_transfer_dot_reference_;
  }
  
  public String getTextOfStock_transfer_dot_reference_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_666") && matcher.group(2).equals("stock_transfer_dot_reference_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_667']")
  private WebElement stock_transfer_dot_source_location_dot_try__name__;
  
  public WebElement getElementOfStock_transfer_dot_source_location_dot_try__name__() {
    return stock_transfer_dot_source_location_dot_try__name__;
  }
  
  public String getTextOfStock_transfer_dot_source_location_dot_try__name__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_667") && matcher.group(2).equals("stock_transfer_dot_source_location_dot_try__name__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_668']")
  private WebElement stock_transfer_dot_destination_location_dot_try__name__;
  
  public WebElement getElementOfStock_transfer_dot_destination_location_dot_try__name__() {
    return stock_transfer_dot_destination_location_dot_try__name__;
  }
  
  public String getTextOfStock_transfer_dot_destination_location_dot_try__name__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_668") && matcher.group(2).equals("stock_transfer_dot_destination_location_dot_try__name__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='<%= spree_dom_id stock_transfer %>']")
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
      if (matcher.group(1).equals("<%= spree_dom_id stock_transfer %>") && matcher.group(2).equals("cycle__odd____even__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='<%= spree_dom_id stock_transfer %>']")
  private WebElement spree_dom_id_stock_transfer_;
  
  public WebElement getElementOfSpree_dom_id_stock_transfer_() {
    return spree_dom_id_stock_transfer_;
  }
  
  public String getAttributeOfIdOnSpree_dom_id_stock_transfer_() {
    return spree_dom_id_stock_transfer_.getAttribute("id");
  }
  
  public String getTextOfSpree_dom_id_stock_transfer_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("<%= spree_dom_id stock_transfer %>") && matcher.group(2).equals("spree_dom_id_stock_transfer_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_669']")
  private WebElement Spree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_stock_transfer____;
  
  public WebElement getElementOfSpree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_stock_transfer____() {
    return Spree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_stock_transfer____;
  }
  
  public String getTextOfSpree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_stock_transfer____() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_669") && matcher.group(2).equals("Spree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_stock_transfer____")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_669']")
  private WebElement link_to_Spree_dot_t__add_one___spree_dot_new_admin_stock_transfer_path_;
  
  public WebElement getElementOfLink_to_Spree_dot_t__add_one___spree_dot_new_admin_stock_transfer_path_() {
    return link_to_Spree_dot_t__add_one___spree_dot_new_admin_stock_transfer_path_;
  }
  
  public String getTextOfLink_to_Spree_dot_t__add_one___spree_dot_new_admin_stock_transfer_path_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_669") && matcher.group(2).equals("link_to_Spree_dot_t__add_one___spree_dot_new_admin_stock_transfer_path_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
