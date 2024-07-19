package com.da_chelimo.generate.core.repo.local

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [LocalEntity::class], version = 1, exportSchema = true)
abstract class AppDatabase: RoomDatabase() {

    // DAOs


}