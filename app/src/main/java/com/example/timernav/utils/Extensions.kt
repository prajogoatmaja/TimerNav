package com.example.timernav.utils

import java.text.SimpleDateFormat
import java.util.*

class Extensions {
    companion object {
        fun convertToTime(millisInString: String) : String {
            val date = Date(millisInString.toLong())
            val formatter = SimpleDateFormat("mm:ss:SSS")
            formatter.timeZone = TimeZone.getTimeZone("UTC")
            return formatter.format(date)
        }
        fun convertToTime(millisInLong: Long) : String {
            val date = Date(millisInLong)
            val formatter = SimpleDateFormat("mm:ss:SSS")
            formatter.timeZone = TimeZone.getTimeZone("UTC")
            return formatter.format(date)
        }
        fun convertToTime(millisInInt: Int) : String {
            val date = Date(millisInInt.toLong())
            val formatter = SimpleDateFormat("mm:ss:SSS")
            formatter.timeZone = TimeZone.getTimeZone("UTC")
            return formatter.format(date)
        }

        fun convertToStandardDate(date: String): String {
            val parser = SimpleDateFormat("dd-MMM-yyyy")
            val formatter = SimpleDateFormat("yyyy-MM-dd")
            return formatter.format(parser.parse(date))
        }
        fun convertToCustomDate(date: String): String {
            val parser = SimpleDateFormat("yyyy-MM-dd")
            val formatter = SimpleDateFormat("dd-MMM-yyyy")
            return formatter.format(parser.parse(date))
        }
    }
}