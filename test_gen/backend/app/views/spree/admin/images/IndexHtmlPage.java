package test.backend.app.views.spree.admin.images;

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
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_63']")
  private WebElement link_to_with_icon__icon_minus_plus___Spree_dot_t__new_image___new_admin_product_image_url__product____id_____new_image_link____class_____button___;
  
  public WebElement getElementOfLink_to_with_icon__icon_minus_plus___Spree_dot_t__new_image___new_admin_product_image_url__product____id_____new_image_link____class_____button___() {
    return link_to_with_icon__icon_minus_plus___Spree_dot_t__new_image___new_admin_product_image_url__product____id_____new_image_link____class_____button___;
  }
  
  public String getTextOfLink_to_with_icon__icon_minus_plus___Spree_dot_t__new_image___new_admin_product_image_url__product____id_____new_image_link____class_____button___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_63") && matcher.group(2).equals("link_to_with_icon__icon_minus_plus___Spree_dot_t__new_image___new_admin_product_image_url__product____id_____new_image_link____class_____button___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_64']")
  private WebElement Spree_dot_t__no_images_found__;
  
  public WebElement getElementOfSpree_dot_t__no_images_found__() {
    return Spree_dot_t__no_images_found__;
  }
  
  public String getTextOfSpree_dot_t__no_images_found__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_64") && matcher.group(2).equals("Spree_dot_t__no_images_found__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_66']")
  private WebElement Spree_dot_t__thumbnail__;
  
  public WebElement getElementOfSpree_dot_t__thumbnail__() {
    return Spree_dot_t__thumbnail__;
  }
  
  public String getTextOfSpree_dot_t__thumbnail__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_66") && matcher.group(2).equals("Spree_dot_t__thumbnail__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_67']")
  private WebElement Spree__Variant_dot_model_name_dot_human_;
  
  public WebElement getElementOfSpree__Variant_dot_model_name_dot_human_() {
    return Spree__Variant_dot_model_name_dot_human_;
  }
  
  public String getTextOfSpree__Variant_dot_model_name_dot_human_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_67") && matcher.group(2).equals("Spree__Variant_dot_model_name_dot_human_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_68']")
  private WebElement Spree_dot_t__alt_text__;
  
  public WebElement getElementOfSpree_dot_t__alt_text__() {
    return Spree_dot_t__alt_text__;
  }
  
  public String getTextOfSpree_dot_t__alt_text__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_68") && matcher.group(2).equals("Spree_dot_t__alt_text__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_69']")
  private WebElement link_to_image_tag_image_dot_attachment_dot_url__mini____image_dot_attachment_dot_url__product__;
  
  public WebElement getElementOfLink_to_image_tag_image_dot_attachment_dot_url__mini____image_dot_attachment_dot_url__product__() {
    return link_to_image_tag_image_dot_attachment_dot_url__mini____image_dot_attachment_dot_url__product__;
  }
  
  public String getTextOfLink_to_image_tag_image_dot_attachment_dot_url__mini____image_dot_attachment_dot_url__product__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_69") && matcher.group(2).equals("link_to_image_tag_image_dot_attachment_dot_url__mini____image_dot_attachment_dot_url__product__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_70']")
  private WebElement options_text_for_image__;
  
  public WebElement getElementOfOptions_text_for_image__() {
    return options_text_for_image__;
  }
  
  public String getTextOfOptions_text_for_image__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_70") && matcher.group(2).equals("options_text_for_image__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_71']")
  private WebElement image_dot_alt_;
  
  public WebElement getElementOfImage_dot_alt_() {
    return image_dot_alt_;
  }
  
  public String getTextOfImage_dot_alt_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_71") && matcher.group(2).equals("image_dot_alt_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_72']")
  private WebElement link_to_with_icon__icon_minus_edit___Spree_dot_t__edit___edit_admin_product_image_url__product__image____no_text____true___data______action_____edit___;
  
  public WebElement getElementOfLink_to_with_icon__icon_minus_edit___Spree_dot_t__edit___edit_admin_product_image_url__product__image____no_text____true___data______action_____edit___() {
    return link_to_with_icon__icon_minus_edit___Spree_dot_t__edit___edit_admin_product_image_url__product__image____no_text____true___data______action_____edit___;
  }
  
  public String getTextOfLink_to_with_icon__icon_minus_edit___Spree_dot_t__edit___edit_admin_product_image_url__product__image____no_text____true___data______action_____edit___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_72") && matcher.group(2).equals("link_to_with_icon__icon_minus_edit___Spree_dot_t__edit___edit_admin_product_image_url__product__image____no_text____true___data______action_____edit___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_72']")
  private WebElement link_to_delete_image_____url____admin_product_image_url__product__image____no_text____true___;
  
  public WebElement getElementOfLink_to_delete_image_____url____admin_product_image_url__product__image____no_text____true___() {
    return link_to_delete_image_____url____admin_product_image_url__product__image____no_text____true___;
  }
  
  public String getTextOfLink_to_delete_image_____url____admin_product_image_url__product__image____no_text____true___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_72") && matcher.group(2).equals("link_to_delete_image_____url____admin_product_image_url__product__image____no_text____true___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='<%= spree_dom_id image %>']")
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
      if (matcher.group(1).equals("<%= spree_dom_id image %>") && matcher.group(2).equals("cycle__odd____even__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='<%= spree_dom_id image %>']")
  private WebElement spree_dom_id_image_;
  
  public WebElement getElementOfSpree_dom_id_image_() {
    return spree_dom_id_image_;
  }
  
  public String getAttributeOfIdOnSpree_dom_id_image_() {
    return spree_dom_id_image_.getAttribute("id");
  }
  
  public String getTextOfSpree_dom_id_image_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("<%= spree_dom_id image %>") && matcher.group(2).equals("spree_dom_id_image_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_65']")
  private WebElement update_positions_admin_product_images_url__product__;
  
  public WebElement getElementOfUpdate_positions_admin_product_images_url__product__() {
    return update_positions_admin_product_images_url__product__;
  }
  
  public String getAttributeOfData-sortable-linkOnUpdate_positions_admin_product_images_url__product__() {
    return update_positions_admin_product_images_url__product__.getAttribute("data-sortable-link");
  }
  
  public String getTextOfUpdate_positions_admin_product_images_url__product__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_65") && matcher.group(2).equals("update_positions_admin_product_images_url__product__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
