package com.guvnoh.stockmanagerxml.data

data class StockDisplay(
    var brand: String = "",
    var price: String = "",
    var openingStock: Double = 0.0,
    var closingStock: Double = 0.0,
)
data class Product(
    val productName: String = "",
    var productPrice: Double = 0.0,
    var category: String = ""
)