package co.touchlab.stately.collections

expect fun <T> createCopyOnWriteList(collection:Collection<T>? = null):MutableList<T>

fun <T> Iterator<T>.toList():List<T>{
    val result = mutableListOf<T>()
    while (hasNext()) {result.add(next())}
    return result
}


expect val isNative:Boolean

