fun main() {
    val sumOfPurchase = 9000
    val discount100rub = 100
    val discount5 = 0.05
    val discountForMusicFan = 0.01
    val totalPrice = 1000
    val musicFan = true

    val finalPrice = if (musicFan) {
        if (sumOfPurchase in 1001..10_000) {
            (totalPrice - discount100rub) * (1 - discountForMusicFan)
        } else if (sumOfPurchase > 10_000) {
            totalPrice * (1 - discount5) * (1 - discountForMusicFan)
        } else {
            totalPrice
        }
    } else {
        if (sumOfPurchase in 1001..10000) {
            totalPrice - discount100rub
        } else if (sumOfPurchase > 10000) {
            totalPrice * (1 - discount5)
        } else {
            totalPrice
        }
    }

    println("Стоимость товара: $totalPrice, с учетом скидки: $finalPrice")
}