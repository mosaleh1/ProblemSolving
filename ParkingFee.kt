package com.mohamedSaleh

public fun parkingFee() {
    var hours = readLine()!!.toInt()
    var total: Double = 0.0
    var days = (hours / 24)
    if (hours <= 5) {
        total = hours * 1.0
    } else if (hours in 6..23) {
        total = 5 + ((hours - 5) * 0.5)
    } else if (days >= 1) {
        total = (15 * days).toDouble() + (hours - (days * 24)) * 0.5
    }
    println(total)
}
