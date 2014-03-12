package test.backend.app.views.spree.admin.promotions;

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
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_388']")
  private WebElement button_link_to_Spree_dot_t__new_promotion___spree_dot_new_admin_promotion_path___icon_____icon_minus_plus__;
  
  public WebElement getElementOfButton_link_to_Spree_dot_t__new_promotion___spree_dot_new_admin_promotion_path___icon_____icon_minus_plus__() {
    return button_link_to_Spree_dot_t__new_promotion___spree_dot_new_admin_promotion_path___icon_____icon_minus_plus__;
  }
  
  public String getTextOfButton_link_to_Spree_dot_t__new_promotion___spree_dot_new_admin_promotion_path___icon_____icon_minus_plus__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_388") && matcher.group(2).equals("button_link_to_Spree_dot_t__new_promotion___spree_dot_new_admin_promotion_path___icon_____icon_minus_plus__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_389']")
  private WebElement Spree_dot_t__name__;
  
  public WebElement getElementOfSpree_dot_t__name__() {
    return Spree_dot_t__name__;
  }
  
  public String getTextOfSpree_dot_t__name__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_389") && matcher.group(2).equals("Spree_dot_t__name__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_390']")
  private WebElement Spree_dot_t__code__;
  
  public WebElement getElementOfSpree_dot_t__code__() {
    return Spree_dot_t__code__;
  }
  
  public String getTextOfSpree_dot_t__code__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_390") && matcher.group(2).equals("Spree_dot_t__code__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_391']")
  private WebElement Spree_dot_t__description__;
  
  public WebElement getElementOfSpree_dot_t__description__() {
    return Spree_dot_t__description__;
  }
  
  public String getTextOfSpree_dot_t__description__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_391") && matcher.group(2).equals("Spree_dot_t__description__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_392']")
  private WebElement Spree_dot_t__usage_limit__;
  
  public WebElement getElementOfSpree_dot_t__usage_limit__() {
    return Spree_dot_t__usage_limit__;
  }
  
  public String getTextOfSpree_dot_t__usage_limit__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_392") && matcher.group(2).equals("Spree_dot_t__usage_limit__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_393']")
  private WebElement Spree_dot_t__promotion_uses__;
  
  public WebElement getElementOfSpree_dot_t__promotion_uses__() {
    return Spree_dot_t__promotion_uses__;
  }
  
  public String getTextOfSpree_dot_t__promotion_uses__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_393") && matcher.group(2).equals("Spree_dot_t__promotion_uses__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_394']")
  private WebElement Spree_dot_t__expiration__;
  
  public WebElement getElementOfSpree_dot_t__expiration__() {
    return Spree_dot_t__expiration__;
  }
  
  public String getTextOfSpree_dot_t__expiration__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_394") && matcher.group(2).equals("Spree_dot_t__expiration__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_395']")
  private WebElement promotion_dot_name_;
  
  public WebElement getElementOfPromotion_dot_name_() {
    return promotion_dot_name_;
  }
  
  public String getTextOfPromotion_dot_name_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_395") && matcher.group(2).equals("promotion_dot_name_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_396']")
  private WebElement promotion_dot_code_;
  
  public WebElement getElementOfPromotion_dot_code_() {
    return promotion_dot_code_;
  }
  
  public String getTextOfPromotion_dot_code_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_396") && matcher.group(2).equals("promotion_dot_code_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_397']")
  private WebElement promotion_dot_description_;
  
  public WebElement getElementOfPromotion_dot_description_() {
    return promotion_dot_description_;
  }
  
  public String getTextOfPromotion_dot_description_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_397") && matcher.group(2).equals("promotion_dot_description_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_398']")
  private WebElement promotion_dot_usage_limit_dot_nil__________promotion_dot_usage_limit__;
  
  public WebElement getElementOfPromotion_dot_usage_limit_dot_nil__________promotion_dot_usage_limit__() {
    return promotion_dot_usage_limit_dot_nil__________promotion_dot_usage_limit__;
  }
  
  public String getTextOfPromotion_dot_usage_limit_dot_nil__________promotion_dot_usage_limit__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_398") && matcher.group(2).equals("promotion_dot_usage_limit_dot_nil__________promotion_dot_usage_limit__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_399']")
  private WebElement Spree_dot_t__current_promotion_usage___count____promotion_dot_credits_count__;
  
  public WebElement getElementOfSpree_dot_t__current_promotion_usage___count____promotion_dot_credits_count__() {
    return Spree_dot_t__current_promotion_usage___count____promotion_dot_credits_count__;
  }
  
  public String getTextOfSpree_dot_t__current_promotion_usage___count____promotion_dot_credits_count__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_399") && matcher.group(2).equals("Spree_dot_t__current_promotion_usage___count____promotion_dot_credits_count__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_400']")
  private WebElement promotion_dot_expires_at_dot_to_date_dot_to_s__short_date__if_promotion_dot_expires_at_;
  
  public WebElement getElementOfPromotion_dot_expires_at_dot_to_date_dot_to_s__short_date__if_promotion_dot_expires_at_() {
    return promotion_dot_expires_at_dot_to_date_dot_to_s__short_date__if_promotion_dot_expires_at_;
  }
  
  public String getTextOfPromotion_dot_expires_at_dot_to_date_dot_to_s__short_date__if_promotion_dot_expires_at_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_400") && matcher.group(2).equals("promotion_dot_expires_at_dot_to_date_dot_to_s__short_date__if_promotion_dot_expires_at_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_401']")
  private WebElement link_to_delete_promotion___no_text____true_;
  
  public WebElement getElementOfLink_to_delete_promotion___no_text____true_() {
    return link_to_delete_promotion___no_text____true_;
  }
  
  public String getTextOfLink_to_delete_promotion___no_text____true_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_401") && matcher.group(2).equals("link_to_delete_promotion___no_text____true_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_401']")
  private WebElement link_to_edit_promotion___no_text____true_;
  
  public WebElement getElementOfLink_to_edit_promotion___no_text____true_() {
    return link_to_edit_promotion___no_text____true_;
  }
  
  public String getTextOfLink_to_edit_promotion___no_text____true_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_401") && matcher.group(2).equals("link_to_edit_promotion___no_text____true_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='<%= spree_dom_id promotion %>']")
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
      if (matcher.group(1).equals("<%= spree_dom_id promotion %>") && matcher.group(2).equals("cycle__odd____even__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='<%= spree_dom_id promotion %>']")
  private WebElement spree_dom_id_promotion_;
  
  public WebElement getElementOfSpree_dom_id_promotion_() {
    return spree_dom_id_promotion_;
  }
  
  public String getAttributeOfIdOnSpree_dom_id_promotion_() {
    return spree_dom_id_promotion_.getAttribute("id");
  }
  
  public String getTextOfSpree_dom_id_promotion_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("<%= spree_dom_id promotion %>") && matcher.group(2).equals("spree_dom_id_promotion_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_402']")
  private WebElement Spree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_promotion____;
  
  public WebElement getElementOfSpree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_promotion____() {
    return Spree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_promotion____;
  }
  
  public String getTextOfSpree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_promotion____() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_402") && matcher.group(2).equals("Spree_dot_t__no_resource_found__resource__I18n_dot_t__other__scope___activerecord_dot_models_dot_spree_divide_promotion____")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_402']")
  private WebElement link_to_Spree_dot_t__add_one___spree_dot_new_admin_promotion_path_;
  
  public WebElement getElementOfLink_to_Spree_dot_t__add_one___spree_dot_new_admin_promotion_path_() {
    return link_to_Spree_dot_t__add_one___spree_dot_new_admin_promotion_path_;
  }
  
  public String getTextOfLink_to_Spree_dot_t__add_one___spree_dot_new_admin_promotion_path_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_402") && matcher.group(2).equals("link_to_Spree_dot_t__add_one___spree_dot_new_admin_promotion_path_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
