package test.backend.app.views.spree.admin.taxonomies;

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

public class EditPage extends AbstractPage {
  public EditPage(WebDriver driver) {
    super(driver);
    assertInvariant();
  }
  
  private void assertInvariant() {
  }
  
  /* ------------------- GENERATED CODE START ------------------- */
  private static Pattern commentPattern = Pattern.compile("<!--POGEN,([^,]*),([^,]*),(.*?)-->", Pattern.DOTALL);
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_742']")
  private WebElement button_link_to_Spree_dot_t__back_to_taxonomies_list___spree_dot_admin_taxonomies_path___icon_____icon_minus_arrow_minus_left__;
  
  public WebElement getElementOfButton_link_to_Spree_dot_t__back_to_taxonomies_list___spree_dot_admin_taxonomies_path___icon_____icon_minus_arrow_minus_left__() {
    return button_link_to_Spree_dot_t__back_to_taxonomies_list___spree_dot_admin_taxonomies_path___icon_____icon_minus_arrow_minus_left__;
  }
  
  public String getTextOfButton_link_to_Spree_dot_t__back_to_taxonomies_list___spree_dot_admin_taxonomies_path___icon_____icon_minus_arrow_minus_left__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_742") && matcher.group(2).equals("button_link_to_Spree_dot_t__back_to_taxonomies_list___spree_dot_admin_taxonomies_path___icon_____icon_minus_arrow_minus_left__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_745']")
  private WebElement stylesheet_path__jquery_dot_jstree_divide_themes_divide_apple_divide_style_dot_css___;
  
  public WebElement getElementOfStylesheet_path__jquery_dot_jstree_divide_themes_divide_apple_divide_style_dot_css___() {
    return stylesheet_path__jquery_dot_jstree_divide_themes_divide_apple_divide_style_dot_css___;
  }
  
  public String getTextOfStylesheet_path__jquery_dot_jstree_divide_themes_divide_apple_divide_style_dot_css___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_745") && matcher.group(2).equals("stylesheet_path__jquery_dot_jstree_divide_themes_divide_apple_divide_style_dot_css___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_745']")
  private WebElement spree_dot_admin_taxonomy_taxons_path__taxonomy__;
  
  public WebElement getElementOfSpree_dot_admin_taxonomy_taxons_path__taxonomy__() {
    return spree_dot_admin_taxonomy_taxons_path__taxonomy__;
  }
  
  public String getTextOfSpree_dot_admin_taxonomy_taxons_path__taxonomy__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_745") && matcher.group(2).equals("spree_dot_admin_taxonomy_taxons_path__taxonomy__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_745']")
  private WebElement spree_dot_api_taxonomy_taxons_path__taxonomy__;
  
  public WebElement getElementOfSpree_dot_api_taxonomy_taxons_path__taxonomy__() {
    return spree_dot_api_taxonomy_taxons_path__taxonomy__;
  }
  
  public String getTextOfSpree_dot_api_taxonomy_taxons_path__taxonomy__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_745") && matcher.group(2).equals("spree_dot_api_taxonomy_taxons_path__taxonomy__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_744']")
  private WebElement label_tag_nil__Spree_dot_t__tree__;
  
  public WebElement getElementOfLabel_tag_nil__Spree_dot_t__tree__() {
    return label_tag_nil__Spree_dot_t__tree__;
  }
  
  public String getTextOfLabel_tag_nil__Spree_dot_t__tree__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_744") && matcher.group(2).equals("label_tag_nil__Spree_dot_t__tree__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='progress']")
  private WebElement image_tag__select2_minus_spinner_dot_gif____title_____Spinner____style_____vertical_minus_align_bottom___;
  
  public WebElement getElementOfImage_tag__select2_minus_spinner_dot_gif____title_____Spinner____style_____vertical_minus_align_bottom___() {
    return image_tag__select2_minus_spinner_dot_gif____title_____Spinner____style_____vertical_minus_align_bottom___;
  }
  
  public String getTextOfImage_tag__select2_minus_spinner_dot_gif____title_____Spinner____style_____vertical_minus_align_bottom___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("progress") && matcher.group(2).equals("image_tag__select2_minus_spinner_dot_gif____title_____Spinner____style_____vertical_minus_align_bottom___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='progress']")
  private WebElement Spree_dot_t__updating__;
  
  public WebElement getElementOfSpree_dot_t__updating__() {
    return Spree_dot_t__updating__;
  }
  
  public String getTextOfSpree_dot_t__updating__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("progress") && matcher.group(2).equals("Spree_dot_t__updating__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_746']")
  private WebElement Spree_dot_t__taxonomy_tree_instruction__;
  
  public WebElement getElementOfSpree_dot_t__taxonomy_tree_instruction__() {
    return Spree_dot_t__taxonomy_tree_instruction__;
  }
  
  public String getTextOfSpree_dot_t__taxonomy_tree_instruction__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_746") && matcher.group(2).equals("Spree_dot_t__taxonomy_tree_instruction__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_748']")
  private WebElement Spree_dot_t__or__;
  
  public WebElement getElementOfSpree_dot_t__or__() {
    return Spree_dot_t__or__;
  }
  
  public String getTextOfSpree_dot_t__or__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_748") && matcher.group(2).equals("Spree_dot_t__or__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_747']")
  private WebElement button_Spree_dot_t__actions_dot_update_____icon_minus_refresh__;
  
  public WebElement getElementOfButton_Spree_dot_t__actions_dot_update_____icon_minus_refresh__() {
    return button_Spree_dot_t__actions_dot_update_____icon_minus_refresh__;
  }
  
  public String getTextOfButton_Spree_dot_t__actions_dot_update_____icon_minus_refresh__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_747") && matcher.group(2).equals("button_Spree_dot_t__actions_dot_update_____icon_minus_refresh__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_747']")
  private WebElement button_link_to_Spree_dot_t__actions_dot_cancel____admin_taxonomies_path___icon_____icon_minus_remove__;
  
  public WebElement getElementOfButton_link_to_Spree_dot_t__actions_dot_cancel____admin_taxonomies_path___icon_____icon_minus_remove__() {
    return button_link_to_Spree_dot_t__actions_dot_cancel____admin_taxonomies_path___icon_____icon_minus_remove__;
  }
  
  public String getTextOfButton_link_to_Spree_dot_t__actions_dot_cancel____admin_taxonomies_path___icon_____icon_minus_remove__() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_747") && matcher.group(2).equals("button_link_to_Spree_dot_t__actions_dot_cancel____admin_taxonomies_path___icon_____icon_minus_remove__")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  
  @FindBy(how = How.XPATH, using = "//*[@id='__pogen_743']")
  private WebElement render__partial_____form____locals_______f____f___;
  
  public WebElement getElementOfRender__partial_____form____locals_______f____f___() {
    return render__partial_____form____locals_______f____f___;
  }
  
  public String getTextOfRender__partial_____form____locals_______f____f___() {
    Matcher matcher = commentPattern.matcher(driver.getPageSource());
    while (matcher.find()) {
      if (matcher.group(1).equals("__pogen_743") && matcher.group(2).equals("render__partial_____form____locals_______f____f___")) {
        return matcher.group(3);
      }
    }
    return null;
  }
  /* -------------------- GENERATED CODE END -------------------- */
}
