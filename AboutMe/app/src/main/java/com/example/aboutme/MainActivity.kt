package com.example.aboutme

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val myName : MyName = MyName("Dipesh")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()


//        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

binding.myName = myName

//        findViewById<Button>(R.id.nicknamebutton).setOnClickListener {
//            addNickName(it)
//        }
        binding.nicknamebutton.setOnClickListener {
            addNickName(it)
        }

    }

    private fun addNickName(view: View) {
        binding.apply {
//            nicknametext.text = binding.nickname.text
            myName?.nickname = nickname.text.toString()
            invalidateAll()
            nickname.visibility = View.GONE
            nicknamebutton.visibility = View.GONE
            nicknametext.visibility = View.VISIBLE
        }

        val imm = getSystemService(Context.INPUT_METHOD_SERVICE)as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken,0)

    }
}