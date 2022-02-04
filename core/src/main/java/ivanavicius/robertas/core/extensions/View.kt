package ivanavicius.robertas.core.extensions

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes

fun View.getLayoutInflater(): LayoutInflater =
    LayoutInflater.from(this.context)

fun ViewGroup.inflate(@LayoutRes layoutId: Int): View =
    getLayoutInflater().inflate(layoutId, this, false)