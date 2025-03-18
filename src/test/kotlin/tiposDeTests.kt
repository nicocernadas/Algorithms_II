import io.kotest.core.spec.style.DescribeSpec
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe

// Podemos definir cosas afuera para que sirvan para todos los tipos de tests

val colorPredeterminado = "naranja"

// Tipo DescribeSpec
class PrimerSpec: DescribeSpec({
    describe("Test de humo") {
        it("1 deberia ser 1") {
            1 shouldBe 1
        }
    }
    describe("Color predeterminado deberia ser naranja") {
        colorPredeterminado shouldBe "naranja"
    }
})

// Tipo StringSpec
class SegundoSpec: StringSpec({
    "Primer paso, 2 no deberia ser 1" {
        2 shouldNotBe 1
    }
    "Color predeterminado es 'naranja'" {
        colorPredeterminado shouldBe "naranja"
    }
})