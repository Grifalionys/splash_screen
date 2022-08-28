package grifalion.ru.splashscreen

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import grifalion.ru.splashscreen.databinding.MainLayoutBinding

class MainActivity: AppCompatActivity() {
        lateinit var binding: MainLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}