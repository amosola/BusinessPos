package com.one0one.businesspos.room.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "invoice_table")
data class Invoice(
    @PrimaryKey
    val InvoiceNumber : String,
    val itemName : String,
    val customerName : String,
    val sellingPrice : Double,
    val amount : Double,
    val status : Boolean = false
)
