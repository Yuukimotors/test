import java.util.Timer
import kotlin.concurrent.timerTask

fun main() {
    val timer = Timer()
    val task = timerTask {
        println("タイマーが動作しました！")
    }

    timer.schedule(task, 2000)  // 2秒後にタスクを実行
}
