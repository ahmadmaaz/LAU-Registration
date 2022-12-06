package com.example.lauregistration;

import javafx.scene.input.KeyEvent;

import java.util.HashMap;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class RegisterController {
    HashMap<String, String> crnDetails = new HashMap<String, String>();
    WebDriver driver;
    @FXML
    private TextField crn_id1;

    @FXML
    private TextField crn_id2;

    @FXML
    private TextField crn_id3;
    @FXML
    private TextField crn_id4;
    @FXML
    private TextField crn_id5;

    @FXML
    private TextField crn_id6;

    @FXML
    private TextField crn_id7;

    @FXML
    private TextField crn_id8;
    @FXML
    private TextField password;

    @FXML
    private TextField userName;

    @FXML
    void resgisterCourses(ActionEvent event) {

        driver.get("https://banweb.lau.edu.lb/prod/bwskfreg.P_AltPin");
        WebElement termButton = driver.findElement(By.xpath("//input[@type='submit' and @value='Submit']"));
        termButton.click();
        for (String i : crnDetails.keySet()){
            driver.findElement(By.id(i)).sendKeys(crnDetails.get(i));
        }
        WebElement bookCoursesButton = driver.findElement(By.xpath("//input[@type='submit' and @value='Submit Changes']"));
        bookCoursesButton.click();

    }
    @FXML
    void changeCRN(KeyEvent event) {
        TextField input = (TextField) event.getTarget();
        crnDetails.put(input.getId(),input.getText());
    }

    @FXML
    void logInToAccount(ActionEvent event) {
        System.setProperty("webdriver.chrome.driver", "src/main/java/chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://banweb.lau.edu.lb/prod/twbkwbis.P_GenMenu?name=bmenu.P_RegMnu");
        driver.findElement(By.id("username")).sendKeys(userName.getText());
        driver.findElement(By.id("password")).sendKeys(password.getText());
        WebElement logInButton = driver.findElement(By.xpath( "//input[@type = 'submit' and @value = 'Log In']"));
        logInButton.click();
    }


}
