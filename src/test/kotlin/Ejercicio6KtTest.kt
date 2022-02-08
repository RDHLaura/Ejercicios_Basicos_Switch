import junit.framework.TestCase
import org.junit.jupiter.api.Assertions

class Ejercicio6KtTest : TestCase() {

    fun testCalcularCaida() {

        var x= calcularCaida(7.0)
        Assertions.assertEquals(1.19, x)

        var x2= calcularCaida(15.0)
        Assertions.assertEquals(1.75, x2)

    }
}