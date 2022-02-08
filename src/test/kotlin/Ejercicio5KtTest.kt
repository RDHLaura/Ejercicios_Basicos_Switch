import org.junit.Test
import org.junit.jupiter.api.Assertions.*

internal class Ejercicio5KtTest {

    @Test
    fun testEcuacion() {

        var x= ecuacion(1.0,2.0,7.0)
        assertEquals(5.0,x)

        var x2=ecuacion(1.0, 3.0,5.0)
        assertEquals(2.0, x2)

    }
}