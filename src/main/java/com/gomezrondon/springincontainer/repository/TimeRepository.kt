package com.gomezrondon.springincontainer.repository

import com.gomezrondon.springincontainer.entitie.TimeEntity
import org.springframework.data.jpa.repository.JpaRepository


interface  TimeRepository: JpaRepository<TimeEntity, Int> {
}