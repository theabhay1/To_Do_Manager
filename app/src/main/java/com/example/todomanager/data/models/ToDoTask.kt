package com.example.todomanager.data.models

import android.app.ActivityManager.TaskDescription
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.todomanager.util.Constants.DATABASE_TABLE

@Entity(tableName = DATABASE_TABLE)
data class ToDoTask (
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val description: String,
    val priority: Priority
)