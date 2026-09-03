package com.example.petshop

class Content (info: String): Mood(info) {
    override fun describe(): String {
        return "is content"
    }
}
