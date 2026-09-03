package com.example.petshop

class Evil(info: String): Mood(info) {
    override fun describe(): String {
        return "is evil"
    }
}