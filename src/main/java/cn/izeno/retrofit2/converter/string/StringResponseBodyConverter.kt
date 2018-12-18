package cn.izeno.retrofit2.converter.string

import okhttp3.ResponseBody
import retrofit2.Converter

class StringResponseBodyConverter : Converter<ResponseBody, String> {
    override fun convert(value: ResponseBody): String {
        value.use { return it.string() }
    }
}