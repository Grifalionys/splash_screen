package grifalion.ru.splashscreen

import android.animation.ObjectAnimator
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import grifalion.ru.splashscreen.databinding.MainLayoutBinding
import grifalion.ru.splashscreen.databinding.SplashLayoutBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashActivity:AppCompatActivity() {
    lateinit var binding: SplashLayoutBinding

    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        binding = SplashLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        CoroutineScope(Dispatchers.Main).launch {
            binding.progressBar.max = 1000
            val value = 1000
            ObjectAnimator.ofInt(binding.progressBar,"progress",value).setDuration(2000).start()
            delay(2000)
            startActivity(Intent(this@SplashActivity,MainActivity::class.java))
        }
    }
}