package com.one0one.businesspos.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.one0one.businesspos.room.data.Customers
import com.one0one.businesspos.room.data.Invoice
import com.one0one.businesspos.room.data.Receipt
import com.one0one.businesspos.room.data.Stoke
import kotlinx.coroutines.flow.Flow

@Dao
interface BusinessPosDao {
    @Insert
    suspend fun insertItem(stoke: Stoke)
    @Insert
    suspend fun insertReceipt( receipt: Receipt)
    @Insert
    suspend fun insertInvoice(invoice: Invoice)
    @Insert
    suspend fun insertCustomer( customers: Customers)

    @Delete
    suspend fun deleteItem(stoke: Stoke)
    @Delete
    suspend fun deleteReceipt( receipt: Receipt)
    @Delete
    suspend fun deleteInvoice(invoice: Invoice)
    @Delete
    suspend fun deleteCustomer( customers: Customers)

    @Query("SELECT * FROM stoke_table")
    fun getAllItems(): Flow<List<Stoke>>
    @Query("SELECT * FROM receipt_table")
    fun getAllReceipt(): Flow<List<Receipt>>
    @Query("SELECT * FROM invoice_table")
    fun getAllInvoice(): Flow<List<Invoice>>
    @Query("SELECT * FROM customers_table")
    fun getAllCustomers(): Flow<List<Customers>>



}