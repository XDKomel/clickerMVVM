package com.camille.clicker

import androidx.databinding.ObservableField

class ViewModel (
    val model: Model = Model(),
    val nameText: ObservableField<String> = ObservableField(model.name)
) {
    fun update(name: String) {
        model.submit(name)
        nameText.set("Здравствуйте, ${model.name}")
    }
}