import static org.junit.jupiter.api.Assertions.assertTrue;
import java.time.Duration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
        // Espera implícita de 2 segundos
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");
        System.out.println("Ingresando usuario...");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
        System.out.println("Ingresando contrasena...");

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
        System.out.println("Haciendo clic en el boton de login...");

        // Espera implícita de 5 segundos
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement inventory = driver.findElement(By.className("inventory_list"));
        assertTrue(inventory.isDisplayed(), "El inventario debería estar visible después de login.");
        System.out.println("Verificando que el login fue exitoso verificando que el inventario este visible...");
    }

    @Test
    public void loginConEsperaExplicita() {
        System.out.println("Ejecutando login con Espera Explicita...");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Espera explícita: hasta localizar el campo de UserName
        WebElement username = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("user-name")));
        username.sendKeys("standard_user");

        // Espera explícita: hasta localizar el campo de Contraseña
        WebElement password = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("password")));
        password.sendKeys("secret_sauce");

        // Espera explícita: hasta localizar el Boton de Login
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
        loginButton.click();

        // Espera explícita: hasta que el inventario esté visible
        WebElement inventory = wait
                .until(ExpectedConditions.visibilityOfElementLocated(By.className("inventory_list")));
        assertTrue(inventory.isDisplayed(), "El inventario debería estar visible después de login.");
    }

    @Test
    public void loginConSleepParaDebug() throws InterruptedException {
        System.out.println("Ejecutando login con Sleep para Debug...");
        // Pausa forzada (Recomendado solo para debug)
        Thread.sleep(1000);

        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        // Pausa forzada (Recomendado solo para debug)
        Thread.sleep(5000);

        WebElement inventory = driver.findElement(By.className("inventory_list"));
        assertTrue(inventory.isDisplayed(), "El inventario debería estar visible después de login.");
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            System.out.println("Cerrando el navegador...");
        }
    }
}