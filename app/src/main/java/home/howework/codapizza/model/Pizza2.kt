package home.howework.codapizza.model
import android.os.Parcelable
import kotlinx.parcelize.Parcelize
@Parcelize
data class Pizza2(
    val toppings: Map<Topping2, ToppingPlacement> = emptyMap()
) : Parcelable {
    val price: Double
        get() = 9.99 + toppings.asSequence()
            .sumOf { (_, toppingPlacement) ->
                when (toppingPlacement) {
                    ToppingPlacement.Left, ToppingPlacement.Right -> 0.5
                    ToppingPlacement.All -> 1.0
                }
            }

    fun withTopping(topping: Topping2, placement: ToppingPlacement?): Pizza2 {
        return copy(
            toppings = if (placement == null) {
                toppings - topping
            } else {
                toppings + (topping to placement)
            }
        )
    }
}