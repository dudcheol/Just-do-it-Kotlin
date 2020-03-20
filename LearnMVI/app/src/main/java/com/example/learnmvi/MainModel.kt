package com.example.learnmvi

import android.os.Build
import androidx.annotation.RequiresApi
import java.util.function.Consumer

@RequiresApi(Build.VERSION_CODES.N)
class MainModel(var consumers: Map<String, Consumer<Any>>) {
    private val defaultText: String = "Default Text"
    private lateinit var text: String

    init {
        resetText()
    }

    /**
     * note : MainIntent에서 불리는 메소드
     */
    fun changeText(text: String) {
        this.text = text
        try {
            consumers.get("TextView")?.accept(text)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    /**
     * note : MainIntent에서 불리는 메소드
     *  resetText가 불려지면 text를 defaultText로 업데이트하고
     *  consumers는 EditText에 text를 패스한다
     */
    fun resetText() {
        this.text = defaultText
        try {
            consumers.get("EditText")?.accept(text)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}
