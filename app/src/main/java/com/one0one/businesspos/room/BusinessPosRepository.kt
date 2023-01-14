package com.one0one.businesspos.room

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.one0one.businesspos.room.data.Customers
import com.one0one.businesspos.room.data.Invoice
import com.one0one.businesspos.room.data.Receipt
import com.one0one.businesspos.room.data.Stoke
import kotlinx.coroutines.flow.Flow

interface BusinessPosRepository {

    suspend fun insertItem(stoke : Stoke)
    suspend fun insertReceipt( receipt: Receipt)
    suspend fun insertInvoice(invoice: Invoice)
    suspend fun insertCustomer( customers: Customers)


    suspend fun deleteItem(stoke: Stoke)
    suspend fun deleteReceipt( receipt: Receipt)
    suspend fun deleteInvoice(invoice: Invoice)
    suspend fun deleteCustomer( customers: Customers)


    fun getAllItems(): Flow<List<Stoke>>
    fun getAllReceipt(): Flow<List<Receipt>>
    fun getAllInvoice(): Flow<List<Invoice>>
    fun getAllCustomers(): Flow<List<Customers>>
}