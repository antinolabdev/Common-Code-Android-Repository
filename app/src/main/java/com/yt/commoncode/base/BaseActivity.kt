package com.yt.commoncode.base

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import com.yt.commoncode.ui.theme.CommonCodeTheme

abstract class BaseActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CommonCodeTheme() {
               Surface{
                    Content()
                }
            }
        }
    }

    @Composable
    abstract fun Content()
}