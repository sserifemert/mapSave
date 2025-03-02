package com.sevvalmert.kotlinmaps.roomdb

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.sevvalmert.kotlinmaps.model.Place

@Database(entities = [Place::class], version = 1)
    abstract class PlaceDatabase : RoomDatabase() {
        abstract fun placeDuo(): PlaceDao
    }
