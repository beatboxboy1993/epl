package com.example.epl02

data class CharacterTile(
    val id: String = "",
    val headerImageResId: Int = 0,
    val title: String = "",
    val shortDescription: String = "",
    val longDescription: String = "",
    val linkURL: String = "",
    var isFavorite: Boolean = false
)