package com.github.satoshun.example

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class AppActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.app_act)

    findViewById<View>(R.id.dialog).setOnClickListener {
      startActivity(Intent(this@AppActivity, MainActivity::class.java))
    }

    findViewById<View>(R.id.navigation).setOnClickListener {
      startActivity(Intent(this@AppActivity, HideNavigationActivity::class.java))
    }

    findViewById<View>(R.id.navigation2).setOnClickListener {
      startActivity(Intent(this@AppActivity, LightNavigationActivity::class.java))
    }
  }
}
