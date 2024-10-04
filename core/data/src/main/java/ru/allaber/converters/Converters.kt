package ru.allaber.converters

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import ru.allaber.model.AnswerModel

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
