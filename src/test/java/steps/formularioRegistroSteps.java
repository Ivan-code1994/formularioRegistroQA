package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FormularioRegistroBase;

public class formularioRegistroSteps {

    FormularioRegistroBase formularioRegistro = new FormularioRegistroBase();
    
    @When("^Entrar al formulario$")
    public void entrarAlFormulario(){
        formularioRegistro.mostrarFormulario();
    }
    @Then("^Registro de formulario$")
    public void formularioConDatos(){
        formularioRegistro.llenarNombre("miNombre");
        formularioRegistro.llenarApellidos("Paterno Materno");
        formularioRegistro.llenarCorreo("mail@mail.com");
        formularioRegistro.llenarDireccion("direccion1");
    }
    @And("^validar correo electronico$")
    public void mostrarFormularioCapturado(){
        formularioRegistro.clickBotonFormulario();
        formularioRegistro.mostrarTextoCapturado("mail@mail.com");
    }
}
