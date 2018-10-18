package com.github.softeasyzhang.entity

/**
 * @author EasyZhang
 * @date 2018/10/18 -  17:33
 */
class DelayMessage{

    var topic : String = ""

    var body : String = ""
    //max is 2,100,000,000
    var delayTime : Int = -1

    constructor(topic:String, body:String){
        this.topic = topic
        this.body = body
    }

}