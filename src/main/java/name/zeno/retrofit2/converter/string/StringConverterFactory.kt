package name.zeno.retrofit2.converter.string

import okhttp3.ResponseBody
import retrofit2.Converter
import retrofit2.Retrofit
import java.lang.reflect.Type


class StringConverterFactory private constructor() : Converter.Factory() {

    override fun responseBodyConverter(
        type: Type, annotations: Array<Annotation>, retrofit: Retrofit
    ): Converter<ResponseBody, *>? {
        return when (type) {
            String::class.java -> StringResponseBodyConverter()
            else -> super.responseBodyConverter(type, annotations, retrofit)
        }
    }

    companion object {
        fun create(): StringConverterFactory {
            return StringConverterFactory()
        }
    }

}
