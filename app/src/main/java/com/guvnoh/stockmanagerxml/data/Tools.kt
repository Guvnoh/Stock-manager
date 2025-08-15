package com.guvnoh.stockmanagerxml.data

import android.icu.text.DecimalFormat

val formatter = DecimalFormat("#,###")

fun nairaFormat(input: Double): String{
    val formattedInput = "₦${formatter.format(input)}"
    return formattedInput
}

fun nairaFormat(input: Int): String{
    val formattedInput = "₦${formatter.format(input)}"
    return formattedInput
}