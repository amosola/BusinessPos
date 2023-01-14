package com.one0one.businesspos.room.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "customers_table")
data class Customers(
    @PrimaryKey
    val invoiceReceiptNo : String,
    val customerName : String
)
