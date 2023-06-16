package com.grjus.ghactions.myservice

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MessageServiceTest  {

    private val messageService:MessageService = MessageService()

    @Test
    fun `should return message`() {
        Assertions.assertTrue(messageService.greeting()==Message(value = "Hello from backend"))
    }

}