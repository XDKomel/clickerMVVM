package com.camille.clicker

import androidx.databinding.ObservableField

class ViewModel (
    var model: Model = Model(),
    val numberString: ObservableField<String> = ObservableField("0")
) {
    fun update() {
        model.increase()
        numberString.set(model.number.toString())
    }
}