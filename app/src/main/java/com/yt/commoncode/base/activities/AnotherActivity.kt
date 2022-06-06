package com.yt.commoncode.base.activities

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.yt.commoncode.base.BaseActivity

class AnotherActivity : BaseActivity() {

    @Composable
    override fun Content() {
        val bundle = intent.extras
        Text(text = bundle?.getString("name")!!)
    }
}