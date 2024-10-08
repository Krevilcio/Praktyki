package com.example.tas3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Triangle()
        }
    }
}

@Composable
fun Triangle() {
    var rotation by remember { mutableStateOf(0f) }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .pointerInput(Unit) {
                detectTapGestures {
                    rotation += 90f
                }
            }
    ) {
        Canvas(modifier = Modifier.fillMaxSize()) {
            val triangleSize = size.minDimension / 4
            val path = Path().apply {
                moveTo(size.width / 2, size.height / 2 - triangleSize)
                lineTo(size.width / 2 - triangleSize, size.height / 2 + triangleSize)
                lineTo(size.width / 2 + triangleSize, size.height / 2 + triangleSize)
                close()
            }

            rotate(degrees = rotation, pivot = Offset(size.width / 2, size.height / 2)) {
                drawPath(path, color = Color.Red)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TrianglePreview() {
    Triangle()
}
