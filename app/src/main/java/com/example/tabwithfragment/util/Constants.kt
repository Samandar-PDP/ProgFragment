package com.example.tabwithfragment.util

import com.example.tabwithfragment.R
import com.example.tabwithfragment.model.Language

object Constants {
    val titles = listOf(
        "Mobile",
        "Front",
        "Backend"
    )
    val icons = listOf(
        R.drawable.ic_baseline_phone_android_24,
        R.drawable.ic_baseline_code_24,
        R.drawable.ic_baseline_computer_24
    )

    fun mobileLanguages() = listOf(
        Language(
            name = "Kotlin",
            icon = R.drawable.img,
            description = "Kotlin is the best programming language",
            author = "Roman Elizarov"
        ),
        Language(
            name = "Java",
            icon = R.drawable.img_4,
            description = "Java is used for more development",
            author = "James Gosling"
        ),
        Language(
            name = "Swift",
            icon = R.drawable.img_3,
            description = "Swift is used for IOS development",
            author = "Chris Lattner"
        ),
        Language(
            name = "Dart",
            icon = R.drawable.img_2,
            description = "You can create android and ios apps using Dart programming language",
            author = "Lars Bak and Kasper Lund"
        ),
    )
}