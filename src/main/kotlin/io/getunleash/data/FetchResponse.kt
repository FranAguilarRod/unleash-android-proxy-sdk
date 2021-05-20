package io.getunleash.data

class FetchResponse(val status: Status, val config: ProxyResponse? = null) {
    fun isFetched() = status == Status.FETCHED
    fun isNotModified() = status == Status.NOTMODIFIED
    fun isFailed() = status == Status.FAILED
}

class ToggleResponse(val status: Status, val toggles: Map<String, Toggle> = emptyMap()) {
    fun isFetched() = status == Status.FETCHED
    fun isNotModified() = status == Status.NOTMODIFIED
    fun isFailed() = status == Status.FAILED
}
enum class Status {
    FETCHED,
    NOTMODIFIED,
    FAILED
}