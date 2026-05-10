package org.example;

import org.openqa.selenium.By;

import java.util.LinkedHashMap;
import java.util.Map;

import framework.config.SignupDataConfig;

public final class EdgeTestConfig {

    private EdgeTestConfig() {
    }

    public static final String BASE_URL = SignupDataConfig.get("base.url");
    public static final String SIGNUP_NAME = SignupDataConfig.get("signup.firstName");
    public static final String SIGNUP_EMAIL = SignupDataConfig.get("signup.email");

    public static final String PASSWORD = SignupDataConfig.get("signup.password");
    public static final String DAY_VALUE = "14";
    public static final int MONTH_INDEX = 10;
    public static final String YEAR_TEXT = "1998";

    public static final By SIGNUP_MENU_LINK = By.xpath("//*[@id='header']/div/div/div/div[2]/div/ul/li[4]/a");
    public static final By SIGNUP_NAME_INPUT = By.xpath("//input[@data-qa=\"signup-name\"]");
    public static final By SIGNUP_EMAIL_INPUT = By.xpath("(//input[contains(@placeholder,'Email Address')])[2]");
    public static final By SIGNUP_BUTTON = By.xpath("//button[contains(text(),\"Signup\")]");

    public static final By GENDER_MR_RADIO = By.xpath("//*[@id='id_gender1']");
    public static final By GENDER_MRS_RADIO = By.xpath("//*[@id='id_gender2']");
    public static final By PASSWORD_INPUT = By.xpath("//*[@id='password']");

    public static final By DAY_DROPDOWN = By.xpath("//*[@id='days']");
    public static final By MONTH_DROPDOWN = By.xpath("//*[@id='months']");
    public static final By YEAR_DROPDOWN = By.xpath("//*[@id='years']");

    public static final By NEWSLETTER_CHECKBOX = By.cssSelector("#newsletter");
    public static final By OPTIN_CHECKBOX = By.cssSelector("#optin");
    public static final By COUNTRY_DROPDOWN = By.xpath("//*[@id='country']");
    public static final By CREATE_ACCOUNT_BUTTON = By.xpath("//*[@id='form']/div/div/div/div/form/button");

    public static final Map<By, String> TEXT_FIELDS = buildTextFields();

    private static Map<By, String> buildTextFields() {
        Map<By, String> fields = new LinkedHashMap<>();
        fields.put(By.cssSelector("#first_name"), "Sadman");
        fields.put(By.cssSelector("#company"), "Habib");
        fields.put(By.xpath("//*[@id='address1']"), "123 Milkyway St");
        fields.put(By.xpath("//*[@id='address2']"), "Apt 2");
        fields.put(By.xpath("//*[@id='state']"), "New York");
        fields.put(By.xpath("//*[@id='city']"), "Brooklyn");
        fields.put(By.xpath("//*[@id='zipcode']"), "11456");
        fields.put(By.xpath("//*[@id='mobile_number']"), "3475780991");
        return fields;
    }
}
