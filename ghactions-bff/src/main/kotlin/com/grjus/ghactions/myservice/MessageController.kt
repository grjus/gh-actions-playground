package com.grjus.ghactions.myservice

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api")
class MessageController(
        private val messageService: MessageService
) {

    @GetMapping("/greeting")
    fun greeting():Message {
        return messageService.greeting()
    }

}