package com.guvnoh.stockmanagerxml.data

fun getSortedBrandData(): MutableList<Product>{
    val sortedbrandList = mutableListOf<Product>()
    sortedbrandList.addAll(cocacolaBottles.sortedBy { it.productName.lowercase() })
    sortedbrandList.addAll(hero.sortedBy { it.productName.lowercase() })
    sortedbrandList.addAll(nbl.sortedBy { it.productName.lowercase() })
    sortedbrandList.addAll(guinness.sortedBy { it.productName.lowercase() })
    sortedbrandList.addAll(pets.sortedBy { it.productName.lowercase() })
    sortedbrandList.addAll(cans.sortedBy { it.productName.lowercase() })
    return sortedbrandList
}
val cocacolaBottles = mutableListOf(
    //coca cola
    Product("35cl", 3800.0, "Coca-cola"),
    Product("50cl", 6300.0, "Coca-cola"),
)

val hero = mutableListOf(
    //international breweries
    Product("Budweiser", 10400.0, "Hero"),
    Product("Castle Lite", 8500.0, category = "Hero"),
    Product("Flying fish", 13000.0, "Hero"),
    Product("Hero", 9000.0, "Hero"),
    Product("Trophy", 9000.0, "Hero"),
    Product("Trophy Stout", 8500.0, category = "Hero"),
)

val nbl = mutableListOf(
    //NBL
    Product("Amstel", 13500.0, "Nbl"),
    Product("Desperados", 16600.0, "Nbl"),
    Product("Gulder", 10800.0, "Nbl"),
    Product("Heineken", 11900.0, "Nbl"),
    Product("Legend(big)", 11200.0, "Nbl"),
    Product("Life", 9200.0,"Nbl"),
    Product("Maltina", 13000.0,"Nbl"),
    Product("Radler", 13000.0,"Nbl"),
    Product("Star", 10500.0,"Nbl"),
    Product("Tiger", 15000.0,"Nbl"),
)

val guinness = mutableListOf(
    //Guinness
    Product("Medium stout", 17500.0,"Guinness"),
    Product("Small stout", 19000.0,"Guinness"),
)
val cans = mutableListOf(
    Product("Beta Malt", 10700.0,"Cans"),
    Product("Grand Malt", 10700.0,"Cans"),
    Product("Amstel can", 13000.0,"Cans"),
    Product("Life can", 15000.0,"Cans"),
    Product("Star can", 12000.0,"Cans"),
    Product("Hero can", 10500.0,"Cans"),
    Product("Trophy can", 10500.0,"Cans"),
    Product("Heineken can", 15500.0,"Cans"),
    Product("Guinness can", 25000.0,"Cans"),

    )
val pets = mutableListOf(
    //Pets
    Product("Bigger boy", 4600.0,"Pets"),
    Product("Predator", 5400.0,"Pets"),
    Product("Fearless", 5000.0,"Pets"),
    Product("Eva water (Big)", 3900.0,"Pets"),
    Product("Eva water (75cl)", 2900.0,"Pets"),
    Product("Rex water (75cl)", 2900.0,"Pets"),
    Product("Aquafina", 2400.0,"Pets"),
    Product("Nutri Milk", 6400.0,"Pets"),
    Product("Nutri Yo", 7000.0,"Pets"),
    Product("Pop cola (big)", 3600.0,"Pets"),
    Product("Pop cola (small)", 2600.0,"Pets"),
    Product("Pepsi", 4500.0,"Pets"),
)