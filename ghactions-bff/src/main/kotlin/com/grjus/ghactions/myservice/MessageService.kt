package com.grjus.ghactions.myservice

import org.springframework.stereotype.Service

@Service
class MessageService {

    fun greeting():Message {
        return Message("Hello from backend")
    }

}

data class Message (
        val value:String
)