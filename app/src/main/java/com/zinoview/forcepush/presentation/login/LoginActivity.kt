package com.zinoview.forcepush.presentation.login

import android.content.Intent
import android.os.Bundle
import com.zinoview.forcepush.databinding.ActivityLoginBinding
import com.zinoview.forcepush.presentation.core.BaseActivity
import com.zinoview.forcepush.presentation.main.MainActivity

class LoginActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewModel = viewModel(LoginViewModel::class.java, this)
        viewModel.observe(this) {
            if (it is LoginUi.Success) {
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            } else
                it.map(binding.errorTextView, binding.progressBar, binding.loginButton)
        }
        binding.loginButton.setOnClickListener { viewModel.login(LoginWrapper.Base(this)) }
        viewModel.init()
    }

}