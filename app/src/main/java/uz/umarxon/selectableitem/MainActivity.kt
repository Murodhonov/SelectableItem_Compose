package uz.umarxon.selectableitem

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import uz.umarxon.selectableitem.ui.theme.SelectableItemTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SelectableItemTheme {
                var selected by remember { mutableStateOf(false) }
                var selected2 by remember { mutableStateOf(false) }

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(MaterialTheme.colors.background)
                        .padding(80.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    SelectableItem(
                        selected = selected,
                        title = "Hello world",
                        onClick = {
                            selected = !selected
                        })
                    Spacer(modifier = Modifier.height(12.dp))
                    SelectableItem(
                        selected = selected2,
                        title = "Hello world",
                        subtitle = "This is an example of create selectable item on jetpack compose by murodhonov",
                        onClick = {
                            selected2 = !selected2
                        })
                }
            }
        }
    }
}