package com.yt.commoncode.base.activities

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.yt.commoncode.base.BaseActivity
import com.yt.commoncode.extension.launchActivity

class MainActivity  : BaseActivity() {

    @Composable
    override fun Content() {
        Button(onClick = {
            launchActivity<AnotherActivity>{
                putExtra("name","jayant")
            }
        }) {
            Text("Click here")
        }
    }

}