
// COMP2850 Portfolio: Week 3
// Tests for median()


import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    "Median when size=1" {
        median(listOf(6.0f)) shouldBe (6.0f plusOrMinus tolerance)
    }

    "Median when size=2" {
        median(listOf(9.0f, 2.0f)) shouldBe (5.5f plusOrMinus tolerance)
    }

    "Median when size=3" {
        median(listOf(7.0f, 1.0f, 4.0f)) shouldBe (4.0f plusOrMinus tolerance)
    }

    "Median when size=4" {
        median(listOf(8.0f, 3.0f, 6.0f, 1.0f)) shouldBe (4.5f plusOrMinus tolerance)
    }
})
