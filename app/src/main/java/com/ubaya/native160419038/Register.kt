package com.ubaya.native160419038

class Register(var username:String, var password:String, var firstName:String, var lastName:String) {
    override fun toString(): String {
        return "$firstName $lastName"
    }
}