package com.example.testin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.testin.ui.theme.TESTINTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TESTINTheme {
                Box(modifier = Modifier.fillMaxSize()) {
                    BoxLayout(Modifier.padding(16.dp))
                }
            }
        }
    }
}

@Composable
fun BoxLayout(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LabeledBox(label = "Name")
        LabeledBox(label = "ID Number")
        LabeledBox(label = "Date")
        LabeledBox(label = "Time")
    }
}

@Composable
fun LabeledBox(label: String) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp),
        shape = RoundedCornerShape(8.dp),
        color = MaterialTheme.colorScheme.primary
    ) {
        Box(contentAlignment = Alignment.Center) {
            Text(text = label, color = Color.White)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BoxLayoutPreview() {
    TESTINTheme {
        BoxLayout()
    }
}
