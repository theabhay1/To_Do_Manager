package com.example.todomanager.data.models

import androidx.compose.ui.graphics.Color
import com.example.todomanager.ui.theme.HighPriorityColor
import com.example.todomanager.ui.theme.LowPriorityColor
import com.example.todomanager.ui.theme.MediumPriorityColor
import com.example.todomanager.ui.theme.NonePriorityColor

enum class Priority (color: Color){
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)

}