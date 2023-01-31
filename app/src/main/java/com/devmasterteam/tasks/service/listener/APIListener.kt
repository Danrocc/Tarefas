package com.devmasterteam.tasks.service.listener

interface APIListener<T> {

    fun onSucess(result: Any?)

    fun onFailure(message: String)
}