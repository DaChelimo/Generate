package com.da_chelimo.generate.core.repo.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class LocalEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0
)
