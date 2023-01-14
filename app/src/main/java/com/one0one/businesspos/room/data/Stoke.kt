package com.one0one.businesspos.room.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "stoke_table")
data class Stoke(
    @PrimaryKey(autoGenerate = true)
    val id : Int,
    val itemName : String,
    val quantity : Double,
    val buyingPrice : Double,
    val sellingPrice : Double
)
