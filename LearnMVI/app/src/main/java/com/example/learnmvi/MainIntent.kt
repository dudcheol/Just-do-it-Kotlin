package com.example.learnmvi

import android.annotation.SuppressLint
import android.os.Build
import androidx.annotation.RequiresApi
import io.reactivex.Observable;

@RequiresApi(Build.VERSION_CODES.N)
class MainIntent(mainView: MainView) {
    private val actions: Map<String, Observable<Any>> = mainView.getActions()
    private val mainModel: MainModel = MainModel(mainView.getConsumers())

    @SuppressLint("CheckResult")
    fun start() {
        actions.get("Button")!!.subscribe { next -> mainModel.resetText() }
        actions.get("EditText")!!.subscribe { changedText -> mainModel.changeText(changedText.toString()) }
    }
}