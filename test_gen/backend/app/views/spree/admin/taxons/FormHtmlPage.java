package test.backend.app.views.spree.admin.taxons;

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
  
  @FindBy(how = How.XPATH, using = "//*[@id='permalink_part_display']")
  private WebElement _taxon_dot_permalink_dot_split___divide____0_dot__dot__dot__minus_1__dot_join___divide_____plus____divide___;
  
  public WebElement getElementOf_taxon_dot_permalink_dot_split___divide____0_dot__dot__dot__minus_1__dot_join___divide_____plus____divide___() {
    return _taxon_dot_permalink_dot_split___divide____0_dot__dot__dot__minus_1__dot_join___divide_____plus____divide___;
  }
  
  public String getTextOf_taxon_dot_permalink_dot_split___divide____0_dot__dot__dot__minus_1__dot_join___divide_____plus____divide___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("permalink_part_display") && matcher.group(2).equals("_taxon_dot_permalink_dot_split___divide____0_dot__dot__dot__minus_1__dot_join___divide_____plus____divide___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_753']")
  private WebElement text_field__taxon___name___class_____fullwidth__;
  
  public WebElement getElementOfText_field__taxon___name___class_____fullwidth__() {
    return text_field__taxon___name___class_____fullwidth__;
  }
  
  public String getTextOfText_field__taxon___name___class_____fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_753") && matcher.group(2).equals("text_field__taxon___name___class_____fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_753']")
  private WebElement f_dot_file_field__icon_;
  
  public WebElement getElementOfF_dot_file_field__icon_() {
    return f_dot_file_field__icon_;
  }
  
  public String getTextOfF_dot_file_field__icon_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_753") && matcher.group(2).equals("f_dot_file_field__icon_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_753']")
  private WebElement f_dot_label__name__Spree_dot_t__name__;
  
  public WebElement getElementOfF_dot_label__name__Spree_dot_t__name__() {
    return f_dot_label__name__Spree_dot_t__name__;
  }
  
  public String getTextOfF_dot_label__name__Spree_dot_t__name__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_753") && matcher.group(2).equals("f_dot_label__name__Spree_dot_t__name__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_753']")
  private WebElement f_dot_label__icon__Spree_dot_t__icon__;
  
  public WebElement getElementOfF_dot_label__icon__Spree_dot_t__icon__() {
    return f_dot_label__icon__Spree_dot_t__icon__;
  }
  
  public String getTextOfF_dot_label__icon__Spree_dot_t__icon__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_753") && matcher.group(2).equals("f_dot_label__icon__Spree_dot_t__icon__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_753']")
  private WebElement f_dot_label__permalink_part__Spree_dot_t__permalink__;
  
  public WebElement getElementOfF_dot_label__permalink_part__Spree_dot_t__permalink__() {
    return f_dot_label__permalink_part__Spree_dot_t__permalink__;
  }
  
  public String getTextOfF_dot_label__permalink_part__Spree_dot_t__permalink__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_753") && matcher.group(2).equals("f_dot_label__permalink_part__Spree_dot_t__permalink__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_753']")
  private WebElement error_message_on__taxon___name___class_____fullwidth_title__;
  
  public WebElement getElementOfError_message_on__taxon___name___class_____fullwidth_title__() {
    return error_message_on__taxon___name___class_____fullwidth_title__;
  }
  
  public String getTextOfError_message_on__taxon___name___class_____fullwidth_title__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_753") && matcher.group(2).equals("error_message_on__taxon___name___class_____fullwidth_title__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_753']")
  private WebElement f_dot_field_container__icon_do_;
  
  public WebElement getElementOfF_dot_field_container__icon_do_() {
    return f_dot_field_container__icon_do_;
  }
  
  public String getTextOfF_dot_field_container__icon_do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_753") && matcher.group(2).equals("f_dot_field_container__icon_do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_753']")
  private WebElement text_field_tag__permalink_part___permalink_part___class_____fullwidth__;
  
  public WebElement getElementOfText_field_tag__permalink_part___permalink_part___class_____fullwidth__() {
    return text_field_tag__permalink_part___permalink_part___class_____fullwidth__;
  }
  
  public String getTextOfText_field_tag__permalink_part___permalink_part___class_____fullwidth__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_753") && matcher.group(2).equals("text_field_tag__permalink_part___permalink_part___class_____fullwidth__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_753']")
  private WebElement f_dot_field_container__permalink_part_do_;
  
  public WebElement getElementOfF_dot_field_container__permalink_part_do_() {
    return f_dot_field_container__permalink_part_do_;
  }
  
  public String getTextOfF_dot_field_container__permalink_part_do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_753") && matcher.group(2).equals("f_dot_field_container__permalink_part_do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_753']")
  private WebElement f_dot_field_container__name_do_;
  
  public WebElement getElementOfF_dot_field_container__name_do_() {
    return f_dot_field_container__name_do_;
  }
  
  public String getTextOfF_dot_field_container__name_do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_753") && matcher.group(2).equals("f_dot_field_container__name_do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_754']")
  private WebElement f_dot_label__description__Spree_dot_t__description__;
  
  public WebElement getElementOfF_dot_label__description__Spree_dot_t__description__() {
    return f_dot_label__description__Spree_dot_t__description__;
  }
  
  public String getTextOfF_dot_label__description__Spree_dot_t__description__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_754") && matcher.group(2).equals("f_dot_label__description__Spree_dot_t__description__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_754']")
  private WebElement f_dot_text_area__description___class_____fullwidth____rows____6_;
  
  public WebElement getElementOfF_dot_text_area__description___class_____fullwidth____rows____6_() {
    return f_dot_text_area__description___class_____fullwidth____rows____6_;
  }
  
  public String getTextOfF_dot_text_area__description___class_____fullwidth____rows____6_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_754") && matcher.group(2).equals("f_dot_text_area__description___class_____fullwidth____rows____6_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_754']")
  private WebElement f_dot_field_container__description_do_;
  
  public WebElement getElementOfF_dot_field_container__description_do_() {
    return f_dot_field_container__description_do_;
  }
  
  public String getTextOfF_dot_field_container__description_do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_754") && matcher.group(2).equals("f_dot_field_container__description_do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_755']")
  private WebElement f_dot_field_container__meta_title_do_;
  
  public WebElement getElementOfF_dot_field_container__meta_title_do_() {
    return f_dot_field_container__meta_title_do_;
  }
  
  public String getTextOfF_dot_field_container__meta_title_do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_755") && matcher.group(2).equals("f_dot_field_container__meta_title_do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_755']")
  private WebElement f_dot_field_container__meta_description_do_;
  
  public WebElement getElementOfF_dot_field_container__meta_description_do_() {
    return f_dot_field_container__meta_description_do_;
  }
  
  public String getTextOfF_dot_field_container__meta_description_do_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_755") && matcher.group(2).equals("f_dot_field_container__meta_description_do_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_755']")
  private WebElement f_dot_label__meta_description__Spree_dot_t__meta_description__;
  
  public WebElement getElementOfF_dot_label__meta_description__Spree_dot_t__meta_description__() {
    return f_dot_label__meta_description__Spree_dot_t__meta_description__;
  }
  
  public String getTextOfF_dot_label__meta_description__Spree_dot_t__meta_description__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_755") && matcher.group(2).equals("f_dot_label__meta_description__Spree_dot_t__meta_description__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_755']")
  private WebElement f_dot_label__meta_title__Spree_dot_t__meta_title__;
  
  public WebElement getElementOfF_dot_label__meta_title__Spree_dot_t__meta_title__() {
    return f_dot_label__meta_title__Spree_dot_t__meta_title__;
  }
  
  public String getTextOfF_dot_label__meta_title__Spree_dot_t__meta_title__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_755") && matcher.group(2).equals("f_dot_label__meta_title__Spree_dot_t__meta_title__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_755']")
  private WebElement f_dot_text_field__meta_keywords___class_____fullwidth____rows____6_;
  
  public WebElement getElementOfF_dot_text_field__meta_keywords___class_____fullwidth____rows____6_() {
    return f_dot_text_field__meta_keywords___class_____fullwidth____rows____6_;
  }
  
  public String getTextOfF_dot_text_field__meta_keywords___class_____fullwidth____rows____6_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_755") && matcher.group(2).equals("f_dot_text_field__meta_keywords___class_____fullwidth____rows____6_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_755']")
  private WebElement f_dot_label__meta_keywords__Spree_dot_t__meta_keywords__;
  
  public WebElement getElementOfF_dot_label__meta_keywords__Spree_dot_t__meta_keywords__() {
    return f_dot_label__meta_keywords__Spree_dot_t__meta_keywords__;
  }
  
  public String getTextOfF_dot_label__meta_keywords__Spree_dot_t__meta_keywords__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_755") && matcher.group(2).equals("f_dot_label__meta_keywords__Spree_dot_t__meta_keywords__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_755']")
  private WebElement f_dot_text_field__meta_title___class_____fullwidth____rows____6_;
  
  public WebElement getElementOfF_dot_text_field__meta_title___class_____fullwidth____rows____6_() {
    return f_dot_text_field__meta_title___class_____fullwidth____rows____6_;
  }
  
  public String getTextOfF_dot_text_field__meta_title___class_____fullwidth____rows____6_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_755") && matcher.group(2).equals("f_dot_text_field__meta_title___class_____fullwidth____rows____6_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_755']")
  private WebElement f_dot_text_field__meta_description___class_____fullwidth____rows____6_;
  
  public WebElement getElementOfF_dot_text_field__meta_description___class_____fullwidth____rows____6_() {
    return f_dot_text_field__meta_description___class_____fullwidth____rows____6_;
  }
  
  public String getTextOfF_dot_text_field__meta_description___class_____fullwidth____rows____6_() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_755") && matcher.group(2).equals("f_dot_text_field__meta_description___class_____fullwidth____rows____6_")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
