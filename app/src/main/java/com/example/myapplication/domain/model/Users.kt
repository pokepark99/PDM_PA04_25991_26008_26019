package com.example.myapplication.domain.model

import java.util.Date

data class Users(
    val id: Int,
    val name: String,
    val dob: String,
    val countriesId: Int,
    val admin: Boolean,
    val state: Boolean,
    val photo: String,
    val city: String,
    val phoneNo: Int
) {
    companion object {
        fun addUser(
            list: MutableList<Users>,
            id: Int,
            name: String,
            dob: String,
            countriesId: Int,
            admin: Boolean,
            state: Boolean,
            photo: String,
            city: String,
            phoneNo: Int
        ) {
            val user = Users(id, name, dob,countriesId, admin, state, photo, city, phoneNo)
            list.add(user)
        }
    }
}