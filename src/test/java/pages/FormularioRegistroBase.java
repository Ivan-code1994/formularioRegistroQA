package pages;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;

public class FormularioRegistroBase extends BasePage{

    private String Nombre = "//input[@id='nombre']";
    private String Apellidos = "//input[@id='apellidos']";
    private String Correo = "//input[@id='email']";
    private String Direccion = "//textarea[@id='direccion']";
    private String clickBoton = "//button[contains(text(),'Enviar')]";
    By Resultado = By.id("resultado");
    
    public FormularioRegistroBase(){
        super(driver);
    }
    
    public void mostrarFormulario(){
        navegarSitio("http://localhost/udemySelenium/formularioRegistroQA/file.html");
    }
    public void llenarNombre(String palabra){
        llenarDatos(Nombre, palabra);
        if(Nombre.isEmpty()){
            Assert.fail("El campo Nombre no funciona");
        }else{
            System.out.println("El campo Nombre no esta vacio");
            
        }
    }
    public void llenarApellidos(String palabra){
        llenarDatos(Apellidos, palabra);
        if(Apellidos.isEmpty()){
            Assert.fail("El campo Apellidos no funciona");
        }else{
            System.out.println("El campo Apellidos no esta vacio");
        }
    }
    public void llenarCorreo(String palabra){
        llenarDatos(Correo,palabra);
        if(Correo.isEmpty()){
            Assert.fail("El campo Correo no funciona");
        }else{
            System.out.println("El campo Correo no esta vacio");
        }
    }
    public void llenarDireccion(String palabra){
        llenarDatos(Direccion, palabra);
        if(Direccion.isEmpty()){
            Assert.fail("El campo Direccion no funciona");
        }else{
            System.out.println("El campo Direccion no esta vacio");
        }
    }
    public void clickBotonFormulario(){
        clickElemento(clickBoton);
    }
    public void mostrarTextoCapturado(String palabra){

        llenarDatos(Correo, palabra);
        String palabraCaptura = "Tu correo electrónico es: "+palabra;
        String ResultadoFinal = driver.findElement(Resultado).getText();
        System.out.println("resultado es "+ResultadoFinal);
        assertEquals(ResultadoFinal,palabraCaptura , "El correco es incorrecto");

    }
}
