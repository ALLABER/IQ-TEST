package ru.allaber.utils.common

interface Mapper<SRC, DST> {
    fun transform(data: SRC): DST
}
