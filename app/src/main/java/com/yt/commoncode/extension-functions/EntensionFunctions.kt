package com.yt.commoncode.extension

import android.content.Context
import android.content.Intent
import android.os.Bundle


inline fun <reified T : Any> Context.launchActivity(
    noinline init: Intent.() -> Unit = {}
){
    val intent = createIntent<T>(this)
    intent.init()
    startActivity(intent)
}

inline fun <reified T : Any> createIntent(context: Context): Intent =

    Intent(context, T::class.java)

