package com.matsaf123.newsapiapp.db

import androidx.room.TypeConverter
import com.matsaf123.newsapiapp.models.Source

class Converters {

    //converter from Source to String for Room (DB)
    @TypeConverter
    fun fromSource(source : Source) : String {
        return source.name
    }

    @TypeConverter
    fun toSource(name : String) : Source {
        return Source(name, name)
    }


}