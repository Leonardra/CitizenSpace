package com.inclutab.citizenspace.model

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName="citizen_entity")
data class Citizen(

    @PrimaryKey(autoGenerate= true)
    @NonNull
    val id:Long,
    val name: String,
    val address: String,
    val age: Int,
    val occupation: String,
    val maritalStatus: String
) {
}