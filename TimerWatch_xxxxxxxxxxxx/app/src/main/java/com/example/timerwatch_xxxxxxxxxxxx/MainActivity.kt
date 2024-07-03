package com.example.timerwatch_xxxxxxxxxxxx;

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.timerwatch_xxxxxxxxxxxx.wings.android.radio.R.*
import java.util.*
import java.util.Timer

class MainActivity : AppCompatActivity() {
    　　// Timer()のインスタンス生成
    val timer = Timer()
    private val timerTask = task()
    // scheduleAtFixedRateメソッドの引数
    private val delay: Long= 0L
    private val Long: Long = 5000L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        timer.scheduleAtFixedRate(timerTask, delay, Long)
    }
    class task :TimerTask() {
        override fun run() {
            // 繰り返したい処理
            println("hello")
        }
    }
    // Timer()の終了
    override fun onStop() {
        super.onStop()
        timer.cancel()
    }
}
