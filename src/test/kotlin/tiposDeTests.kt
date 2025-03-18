import io.kotest.core.spec.style.DescribeSpec
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe


class TestDeHumo: DescribeSpec({
    describe("Test de humo") {
        it("1 deberia ser 1") {
            1 shouldBe 1
        }
    }
})

class TestDeHumo2: StringSpec({
    "Primer paso, 2 no deberia ser 1" {
        2 shouldNotBe 1
    }
})