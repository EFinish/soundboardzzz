package com.example.soundboardzzz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.soundboardzzz.ui.theme.SoundboardzzzTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SoundboardzzzTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column {
                        Row {
                            Greeting("soundboardzzz")
                        }
                        Row(
                            horizontalArrangement = Arrangement.SpaceEvenly,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            SoundButton(imageResourceId = R.drawable.smile_emoji, soundResourceId = R.raw.giggle)
                            SoundButton(imageResourceId = R.drawable.joy_emoji, soundResourceId = R.raw.laughing)
                            SoundButton(imageResourceId = R.drawable.thinky_emoji, soundResourceId = R.raw.thinky)
                        }
                        Row(
                            horizontalArrangement = Arrangement.SpaceEvenly,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            SoundButton(imageResourceId = R.drawable.firetruck_emoji, soundResourceId = R.raw.firetruck)
                            SoundButton(imageResourceId = R.drawable.boat_emoji, soundResourceId = R.raw.boat)
                            SoundButton(imageResourceId = R.drawable.potato_emoji, soundResourceId = R.raw.farming)
                        }

                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SoundboardzzzTheme {
        Greeting("soundboardzzz")
    }
}