package com.example.mvp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var presenterLogin: PresenterLogin? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenterLogin = PresenterLogin(this)

    }

    override fun onResume() {
        super.onResume()
        login.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {

            }
        })
    }

    fun usuarioembranco() {
        nome.setError("Email ou senha em branco")
    }

    fun autenticadocomsucesso() {
        val intent = Intent(baseContext, OrderActivity::class.java)
        startActivity(intent)
    }

    fun autenticadocomfalha() {

    }
}
