package com.example.learnmvi

import io.reactivex.Observable
import java.util.function.Consumer

interface MainView {
    /**
     * note : getActions - Intent에 subscribe할 수 있는 Observable을 리턴한다
     *        getConsumers - view가 변경됨을 알릴 수 있는 Model을 부를 수 있는 consumers를 리턴한다
     */
    fun getActions(): Map<String, Observable<Any>>
    fun getConsumers(): Map<String, Consumer<Any>>
}
