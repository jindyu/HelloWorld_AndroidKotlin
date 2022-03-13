package com.heaven.a03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.heaven.a03.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.apply {
            clickButton.setOnClickListener {
                textView.text = "버튼을 눌렀습니다"
            }
        }
    }
}