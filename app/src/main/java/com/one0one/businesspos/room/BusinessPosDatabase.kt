package com.one0one.businesspos.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.one0one.businesspos.room.data.Customers
import com.one0one.businesspos.room.data.Invoice
import com.one0one.businesspos.room.data.Receipt
import com.one0one.businesspos.room.data.Stoke

@Database(entities = [Stoke :: class, Receipt :: class, Invoice :: class, Customers :: class], version = 1)
abstract class BusinessPosDatabase : RoomDatabase() {
    abstract fun businessPosDao(): BusinessPosDao

    companion object{
        @Volatile
        private var INSTANCE : BusinessPosDatabase? =null
        fun getDatabase(context: Context): BusinessPosDatabase{
            val tempInstance = INSTANCE
            if (tempInstance != null){
                return tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    BusinessPosDatabase::class.java,
                    "converter_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }

}