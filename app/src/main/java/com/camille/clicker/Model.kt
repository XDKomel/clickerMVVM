package com.camille.clicker

class Model (
    var name: String = "Имя"
) {
    fun submit(newName: String) {
        this.name = newName
    }
}