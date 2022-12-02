package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class test {
        WebDriver driver;

        @BeforeMethod
        void Encender(){
            driver = new ChromeDriver();
        }

        @AfterMethod
        void Apagar(){
         //   driver.quit();
        }


        @Test
        void Logg() throws InterruptedException {
            driver.get("http://localhost:3000/");
            WebElement Nombre= driver.findElement(By.xpath("/html/body/div/div/form/ul/li[1]/input"));
            WebElement Contra= driver.findElement(By.xpath("/html/body/div/div/form/ul/li[3]/input"));
            Nombre.sendKeys("admin");
            Contra.sendKeys("admin");
            WebElement Boton= driver.findElement(By.xpath("/html/body/div/div/form/ul/li[5]/button"));
            Boton.click();
            WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/a[1]")));
            String result = driver.getCurrentUrl();
            Assert.assertEquals(result, "http://localhost:3000/menu");

        }
    @Test
    void LoggFail() {
        driver.get("http://localhost:3000/");
        WebElement Nombre= driver.findElement(By.xpath("/html/body/div/div/form/ul/li[1]/input"));
        WebElement Contra= driver.findElement(By.xpath("/html/body/div/div/form/ul/li[3]/input"));
        Nombre.sendKeys("Nombre Inventado");
        Contra.sendKeys("Contraseña Inventado");
        WebElement Boton= driver.findElement(By.xpath("/html/body/div/div/form/ul/li[5]/button"));
        Boton.click();
        WebElement Error1= driver.findElement(By.xpath("/html/body/div/div/form/ul/li[2]/p"));
        WebElement Error2= driver.findElement(By.xpath("/html/body/div/div/form/ul/li[4]/p"));
        Assert.assertEquals(Error1.getText(), "Usuario o contraseña equivocadas");
        Assert.assertEquals(Error2.getText(), "Usuario o contraseña equivocadas");
    }
    @Test
    void VerCLientes() throws InterruptedException {
        driver.get("http://localhost:3000/");
        WebElement Nombre= driver.findElement(By.xpath("/html/body/div/div/form/ul/li[1]/input"));
        WebElement Contra= driver.findElement(By.xpath("/html/body/div/div/form/ul/li[3]/input"));
        Nombre.sendKeys("admin");
        Contra.sendKeys("admin");
        WebElement Boton= driver.findElement(By.xpath("/html/body/div/div/form/ul/li[5]/button"));
        Boton.click();
        WebElement fResult = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/a[1]")));
        WebElement BotonMenu= driver.findElement(By.xpath("/html/body/div/div/a[1]"));
        BotonMenu.click();
        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/a")));
        String result = driver.getCurrentUrl();
        Assert.assertEquals(result, "http://localhost:3000/clients");
    }
    @Test
    void CrearOportunidad() throws InterruptedException {
        driver.get("http://localhost:3000/");
        WebElement Nombre= driver.findElement(By.xpath("/html/body/div/div/form/ul/li[1]/input"));
        WebElement Contra= driver.findElement(By.xpath("/html/body/div/div/form/ul/li[3]/input"));
        Nombre.sendKeys("admin");
        Contra.sendKeys("admin");
        WebElement Boton= driver.findElement(By.xpath("/html/body/div/div/form/ul/li[5]/button"));
        Boton.click();
        WebElement fResult = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/a[3]")));
        WebElement BotonMenu= driver.findElement(By.xpath("/html/body/div/div/a[3]"));
        BotonMenu.click();
        WebElement fResult2 = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/form/ul/li[1]/input")));
        String result = driver.getCurrentUrl();
        Assert.assertEquals(result, "http://localhost:3000/formOp");
        WebElement fResult3 = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/form/ul/li[1]/input")));
        WebElement desc= driver.findElement(By.xpath("/html/body/div/div/form/ul/li[1]/input"));
        desc.sendKeys("Descripcion");
        WebElement dia= driver.findElement(By.xpath("/html/body/div/div/form/ul/li[3]/input[1]"));
        dia.sendKeys("01");
        WebElement año= driver.findElement(By.xpath("/html/body/div/div/form/ul/li[3]/input[2]"));
        año.sendKeys("01");
        WebElement mes= driver.findElement(By.xpath("/html/body/div/div/form/ul/li[3]/input[3]"));
        mes.sendKeys("01");
        WebElement id= driver.findElement(By.xpath("        /html/body/div/div/form/ul/li[5]/input"));
        id.sendKeys("17");
        WebElement boton= driver.findElement(By.xpath("/html/body/div/div/form/ul/li[6]/button"));
        boton.click();

    }
    @Test
    void VerOportunitycrearConctactoYConvertirACliente() throws InterruptedException {
        driver.get("http://localhost:3000/");
        WebElement Nombre= driver.findElement(By.xpath("/html/body/div/div/form/ul/li[1]/input"));
        WebElement Contra= driver.findElement(By.xpath("/html/body/div/div/form/ul/li[3]/input"));
        Nombre.sendKeys("admin");
        Contra.sendKeys("admin");
        WebElement Boton= driver.findElement(By.xpath("/html/body/div/div/form/ul/li[5]/button"));
        Boton.click();
        WebElement fResult = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/a[2]")));
        WebElement BotonMenu= driver.findElement(By.xpath("/html/body/div/div/a[2]"));
        BotonMenu.click();
        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[3]/button")));
        String result = driver.getCurrentUrl();
        Assert.assertEquals(result, "http://localhost:3000/oportunity");
        WebElement BotonConvertir= driver.findElement(By.xpath("/html/body/div/div/div[3]/button"));
        BotonConvertir.click();

    }
    }

