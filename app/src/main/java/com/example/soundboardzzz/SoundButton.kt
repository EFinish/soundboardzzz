package com.example.soundboardzzz

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun SoundButton(imageResourceId: Int) {
    val image: Painter = painterResource(id = imageResourceId)
    Button(onClick = { /* Do something when button is clicked */ }) {
        Image(
            painter = image,
            contentDescription = "Button with Image",
            modifier = Modifier.size(24.dp)
        )
    }
}