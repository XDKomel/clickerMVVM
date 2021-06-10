package com.camille.clicker

class Model (
    var number: Int = 0
) {
    fun increase(): Int {
        return ++number
    }
}