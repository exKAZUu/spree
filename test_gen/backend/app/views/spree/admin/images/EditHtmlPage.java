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

public class EditHtmlPage extends AbstractPage {
  public EditHtmlPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_57']")
  private WebElement button_link_to_Spree_dot_t__back_to_images_list___admin_product_images_url__product____icon_____icon_minus_arrow_minus_left__;
  
  public WebElement getElementOfButton_link_to_Spree_dot_t__back_to_images_list___admin_product_images_url__product____icon_____icon_minus_arrow_minus_left__() {
    return button_link_to_Spree_dot_t__back_to_images_list___admin_product_images_url__product____icon_____icon_minus_arrow_minus_left__;
  }
  
  public String getTextOfButton_link_to_Spree_dot_t__back_to_images_list___admin_product_images_url__product____icon_____icon_minus_arrow_minus_left__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_57") && matcher.group(2).equals("button_link_to_Spree_dot_t__back_to_images_list___admin_product_images_url__product____icon_____icon_minus_arrow_minus_left__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_58']")
  private WebElement _image_dot_attachment_file_name;
  
  public WebElement getElementOf_image_dot_attachment_file_name() {
    return _image_dot_attachment_file_name;
  }
  
  public String getTextOf_image_dot_attachment_file_name() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_58") && matcher.group(2).equals("_image_dot_attachment_file_name")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_59']")
  private WebElement link_to_image_tag__image_dot_attachment_dot_url__small_____image_dot_attachment_dot_url__product__;
  
  public WebElement getElementOfLink_to_image_tag__image_dot_attachment_dot_url__small_____image_dot_attachment_dot_url__product__() {
    return link_to_image_tag__image_dot_attachment_dot_url__small_____image_dot_attachment_dot_url__product__;
  }
  
  public String getTextOfLink_to_image_tag__image_dot_attachment_dot_url__small_____image_dot_attachment_dot_url__product__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_59") && matcher.group(2).equals("link_to_image_tag__image_dot_attachment_dot_url__small_____image_dot_attachment_dot_url__product__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_59']")
  private WebElement f_dot_label_Spree_dot_t__thumbnail__;
  
  public WebElement getElementOfF_dot_label_Spree_dot_t__thumbnail__() {
    return f_dot_label_Spree_dot_t__thumbnail__;
  }
  
  public String getTextOfF_dot_label_Spree_dot_t__thumbnail__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_59") && matcher.group(2).equals("f_dot_label_Spree_dot_t__thumbnail__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_60']")
  private WebElement render__partial_____form____locals_______f____f___;
  
  public WebElement getElementOfRender__partial_____form____locals_______f____f___() {
    return render__partial_____form____locals_______f____f___;
  }
  
  public String getTextOfRender__partial_____form____locals_______f____f___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_60") && matcher.group(2).equals("render__partial_____form____locals_______f____f___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_62']")
  private WebElement Spree_dot_t__or__;
  
  public WebElement getElementOfSpree_dot_t__or__() {
    return Spree_dot_t__or__;
  }
  
  public String getTextOfSpree_dot_t__or__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_62") && matcher.group(2).equals("Spree_dot_t__or__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_61']")
  private WebElement button_Spree_dot_t__actions_dot_update_____icon_minus_refresh__;
  
  public WebElement getElementOfButton_Spree_dot_t__actions_dot_update_____icon_minus_refresh__() {
    return button_Spree_dot_t__actions_dot_update_____icon_minus_refresh__;
  }
  
  public String getTextOfButton_Spree_dot_t__actions_dot_update_____icon_minus_refresh__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_61") && matcher.group(2).equals("button_Spree_dot_t__actions_dot_update_____icon_minus_refresh__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_61']")
  private WebElement link_to_Spree_dot_t__actions_dot_cancel____admin_product_images_url__product____id_____cancel_link____class_____button_icon_minus_remove__;
  
  public WebElement getElementOfLink_to_Spree_dot_t__actions_dot_cancel____admin_product_images_url__product____id_____cancel_link____class_____button_icon_minus_remove__() {
    return link_to_Spree_dot_t__actions_dot_cancel____admin_product_images_url__product____id_____cancel_link____class_____button_icon_minus_remove__;
  }
  
  public String getTextOfLink_to_Spree_dot_t__actions_dot_cancel____admin_product_images_url__product____id_____cancel_link____class_____button_icon_minus_remove__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_61") && matcher.group(2).equals("link_to_Spree_dot_t__actions_dot_cancel____admin_product_images_url__product____id_____cancel_link____class_____button_icon_minus_remove__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
