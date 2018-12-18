package cn.izeno.retrofit2.converter.string

import okhttp3.RequestBody
import retrofit2.Converter

class StringRequestBodyConverter : Converter<String, RequestBody> {
    override fun convert(value: String): RequestBody {
        return RequestBody.create(null, value)
    }
}