package com.allaber.test.core.data.converters

import androidx.room.TypeConverter
import com.allaber.test.core.data.model.AnswerModel
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class Converters {

    @TypeConverter
    fun fromAnswerList(value: List<AnswerModel>?): String {
        return Gson().toJson(value)
    }

    @TypeConverter
    fun toAnswerList(value: String): List<AnswerModel>? {
        val listType = object : TypeToken<List<AnswerModel>>() {}.type
        return Gson().fromJson(value, listType)
    }
}
