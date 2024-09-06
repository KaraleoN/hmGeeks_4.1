package com.geeks.hmgeeks_41.ui

import java.io.Serializable

data class User(
    val name: String,
    val email: String,
    val password: Int
): Serializable
