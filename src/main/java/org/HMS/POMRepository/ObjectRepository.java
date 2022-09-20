package org.HMS.POMRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ObjectRepository {
  @FindBy(xpath="//a[@href='hms/doctor/']")
  private WebElement clickOnDocModule;
  @FindBy(name="username")
  private WebElement docUserNameTextField;
  @FindBy(name="password")
  private WebElement docPasswordTextField;
  @FindBy(name="submit")
  private WebElement loginButton;
  @FindBy(xpath="//span[text()=' Patients ']")
  private WebElement clickOnPatientFeature;
  @FindBy(xpath="//span[text()=' Add Patient']")
  private WebElement clickOnAddPatInDocModule;
  @FindBy(name="patname")
  private WebElement patientNameInDoc;
  @FindBy(name="patcontact")
  private WebElement patientContactInDoc;
  @FindBy(xpath="//label[@for='rg-female']")
  private WebElement genderInDoc;
  @FindBy(name="pataddress")
  private WebElement patientAddressInDoc;
  @FindBy(name="patage")
  private WebElement patientAgeInDoc;
  @FindBy(name="medhis")
  private WebElement medicalHistoryInDoc;
  @FindBy(id="submit")
  private WebElement clickOnSubmitInDoc;
  @FindBy(xpath="//span[text()=' Search ']")
  private WebElement clickOnSearch;
  @FindBy(id="searchdata")
  private WebElement searchDataInDoc;
  @FindBy(id="submit")
  private WebElement clickOnSubmitInDoctor;
 // @FindBy(xpath="//td[.='""']")
private WebElement getTextOnSearchTextFieldInDoc;
}
