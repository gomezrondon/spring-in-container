package com.gomezrondon.springincontainer.service

import com.gomezrondon.springincontainer.entitie.TimeEntity
import com.gomezrondon.springincontainer.repository.TimeRepository
import org.springframework.stereotype.Service


@Service
class TimeServiceImp(private val repo: TimeRepository) : TimeService {

    override fun saveTime(time: TimeEntity) {
        repo.save(time)
    }

    override fun findAll(): List<TimeEntity> {
       return repo.findAll()
    }

    override fun deleteAll() {
        repo.deleteAll()
    }
}