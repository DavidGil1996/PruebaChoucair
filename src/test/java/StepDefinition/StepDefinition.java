package StepDefinition;

import io.cucumber.java.en.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class StepDefinition {

	WebDriver driver=null;

	@Given("Ingresar a la pagina {string}")
	public void ingresar_a_la_pagina(String strPaginaChoucair) {
		System.setProperty("webdriver.chrome.driver","src/test/resources/Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(strPaginaChoucair);
	}

	@And("seleccionar la opcion empleos")
	public void seleccionar_la_opcion_empleos() {
		driver.findElement(By.xpath("//*[@id=\'menu-item-550\']/a")).click();
	}

	@When("Buscar empleos disponibles cargo {string} y ciudad {string}")
	public void buscar_empleos_disponibles_cargo_y_ciudad(String strCargo, String strCiudad) {
	    driver.findElement(By.xpath("//*[@id=\'search_keywords\']")).sendKeys(strCargo);
	    driver.findElement(By.xpath("//*[@id=\'search_location\']")).sendKeys(strCiudad);
	    
	}
	
	@And("Seleccion de empleo")
	public void seleccion_de_empleo() {
		driver.findElement(By.xpath("//*[@id=\'content\']/div/div/div/div/div/section[8]/div/div/div/div/div/div[3]/div/div/div/ul/li[2]/a")).click();  
	}
	
	@And("Diligenciamiento formulario campo nombre")
	public void diligenciamiento_formulario_campo_nombre() {
		driver.findElement(By.xpath("//*[@id=\'post-10723\']/div/div[2]/div[2]/input")).click();
	}

}


