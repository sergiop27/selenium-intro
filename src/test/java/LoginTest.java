import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/v1/index.html");
        System.out.println("Navegando a la pagina de login...");
    }

    @Test
    public void loginExitoso() {
        // Ingresar usuario
        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");
        System.out.println("Ingresando usuario...");

        // Ingresar password
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
        System.out.println("Ingresando contrasena...");

        // Click en login
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
        System.out.println("Haciendo clic en el boton de login...");

        // Validar que entramos al inventario
        WebElement inventory = driver.findElement(By.className("inventory_list"));
        assertTrue(inventory.isDisplayed(), "El inventario debería estar visible después de login.");
        System.out.println("Verificando que el login fue exitoso verificando que el inventario este visible...");
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            System.out.println("Cerrando el navegador...");
        }
    }
}