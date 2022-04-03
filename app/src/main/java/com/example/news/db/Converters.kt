package com.example.news.db

import androidx.room.ProvidedTypeConverter
import androidx.room.TypeConverter
import com.example.news.model.Source

@ProvidedTypeConverter
class Converters {

    @TypeConverter
    fun fromSource(source: Source): String {
        return source.name
    }

    @TypeConverter
    fun toSource(name: String): Source {
        return Source(name,name)
    }
}