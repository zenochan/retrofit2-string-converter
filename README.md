
```groovy
maven {url "http://maven.izeno.cn/"}
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

```

```kotlin
class StringResponseBodyConverter : Converter<ResponseBody, String> {
    override fun convert(value: ResponseBody): String {
        value.use { return it.string() }
    }
}
```

### THANKS
- [Retrofit自定义Converter之StringConverterFactory](https://blog.csdn.net/gengqiquan/article/details/52473334)
