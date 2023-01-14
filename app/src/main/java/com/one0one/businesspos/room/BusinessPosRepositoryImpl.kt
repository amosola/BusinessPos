package com.one0one.businesspos.room

import com.one0one.businesspos.room.data.Customers
import com.one0one.businesspos.room.data.Invoice
import com.one0one.businesspos.room.data.Receipt
import com.one0one.businesspos.room.data.Stoke
import kotlinx.coroutines.flow.Flow

class BusinessPosRepositoryImpl(private val dao: BusinessPosDao) : BusinessPosRepository {
    override suspend fun insertItem(stoke: Stoke) {
        dao.insertItem(stoke)
    }

    override suspend fun insertReceipt(receipt: Receipt) {
        dao.insertReceipt(receipt)
    }

    override suspend fun insertInvoice(invoice: Invoice) {
        dao.insertInvoice(invoice)
    }

    override suspend fun insertCustomer(customers: Customers) {
        dao.insertCustomer(customers)
    }

    override suspend fun deleteItem(stoke: Stoke) {
        dao.deleteItem(stoke)
    }

    override suspend fun deleteReceipt(receipt: Receipt) {
        dao.deleteReceipt(receipt)
    }

    override suspend fun deleteInvoice(invoice: Invoice) {
        dao.deleteInvoice(invoice)
    }

    override suspend fun deleteCustomer(customers: Customers) {
        dao.deleteCustomer(customers)
    }

    override fun getAllItems(): Flow<List<Stoke>> {
        return dao.getAllItems()
    }

    override fun getAllReceipt(): Flow<List<Receipt>> {
        return dao.getAllReceipt()
    }

    override fun getAllInvoice(): Flow<List<Invoice>> {
        return dao.getAllInvoice()
    }

    override fun getAllCustomers(): Flow<List<Customers>> {
        return dao.getAllCustomers()
    }
}