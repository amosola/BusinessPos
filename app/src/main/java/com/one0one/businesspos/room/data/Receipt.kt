package com.one0one.businesspos.room.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "receipt_table")
data class Receipt(
    @PrimaryKey
    val receiptNumber : String,
    val itemName : String,
    val customerName : String,
    val sellingPrice : Double,
    val amount : Double
)
