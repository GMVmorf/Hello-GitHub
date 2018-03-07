package com.javasampleapproach.restcontrolleradvice.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

import com.javasampleapproach.restcontrolleradvice.exception.CustomNotFoundException
import com.javasampleapproach.restcontrolleradvice.model.Customer
import com.javasampleapproach.restcontrolleradvice.service.CustomerService

@RestController
class WebController {

@Autowired
internal var customerService:CustomerService? = null

@RequestMapping(value = "/customer/{name}")
 fun findCustomerByName(@PathVariable("name") name:String):Customer {

return customerService!!.findCustomerByName(name) ?: throw CustomNotFoundException("Not found customer with name is " + name)
}
}