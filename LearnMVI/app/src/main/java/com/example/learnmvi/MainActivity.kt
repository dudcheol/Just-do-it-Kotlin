package com.example.learnmvi

import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.jakewharton.rxbinding2.view.RxView
import com.jakewharton.rxbinding2.widget.RxTextView
import io.reactivex.Observable
import kotlinx.android.synthetic.main.activity_main.*
import java.util.function.Consumer

class MainActivity : AppCompatActivity(), MainView {

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MainIntent(this).start()
    }

    override fun getActions(): Map<String, Observable<Any>> {
        val actions = hashMapOf<String, Observable<Any>>()
        actions.put("Button", RxView.clicks(button))
        actions.put("EditText", RxTextView.textChanges(editText) as Observable<Any>)
        return actions
    }

    @RequiresApi(Build.VERSION_CODES.N)
    override fun getConsumers(): Map<String, Consumer<Any>> {
        val consumers = hashMapOf<String, Consumer<Any>>()
        consumers.put("TextView", RxTextView.text(textView) as Consumer<Any>)
        consumers.put("EditText", RxTextView.text(editText) as Consumer<Any>)
        return consumers
    }
}
