package ru.allaber.components.imagefromassets

import android.content.Context
import android.graphics.BitmapFactory
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.platform.LocalContext
import java.io.IOException

@Composable
fun ImageFromAssets(imageName: String) {
    val context = LocalContext.current

    val bitmap = loadBitmapFromAssets(context, imageName)

    bitmap?.let {
        Image(
            bitmap = it.asImageBitmap(),
            contentDescription = null,
            modifier = Modifier.fillMaxSize()
        )
    }
}

fun loadBitmapFromAssets(context: Context, imageName: String): android.graphics.Bitmap? {
    return try {
        val assetManager = context.assets
        val inputStream = assetManager.open(imageName)
        BitmapFactory.decodeStream(inputStream)
    } catch (e: IOException) {
        e.printStackTrace()
        null
    }
}
