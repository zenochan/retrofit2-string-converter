
```groovy
maven {url "http://maven.mjtown.cn/"}
compile zzeno
```kotlin
class StringConverterFactory private constructor() : Converter.Factory() {

    override fun responseBodyConverter(
        type: Type, annotations: Array<Annotation>, retrofit: Retrofit
    ): Converter<ResponseBody, *>? {
        return StringResponseBodyConverter()
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
