package com.gomezrondon.springincontainer.entitie

import javax.persistence.*

data class Quote(var userName: String, var quote: String){
    var id: String=""
}

@Entity
@Table(name = "time", schema="test")
data class TimeEntity(
        var time:String="NO-TIME"
        ){
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id:Int=0
}