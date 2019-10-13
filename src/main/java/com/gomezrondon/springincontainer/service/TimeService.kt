package com.gomezrondon.springincontainer.service

import com.gomezrondon.springincontainer.entitie.TimeEntity


interface TimeService {

    fun saveTime(time: TimeEntity)

    fun findAll(): List<TimeEntity>

    fun deleteAll()

}