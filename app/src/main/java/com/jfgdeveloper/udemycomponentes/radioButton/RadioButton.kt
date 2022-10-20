package com.jfgdeveloper.udemycomponentes.radioButton

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.RadioButton
import androidx.compose.material.RadioButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun MyRadioButton() {
    RadioButton(selected = true, onClick = { /*TODO*/ }, enabled = true, colors = RadioButtonDefaults.colors(
            unselectedColor = Color.Green,
            selectedColor = Color.Red
    ))
}

@Composable
fun ListRadioButton(name: String, onSelecte: (String)-> Unit){
    Column {

        Row {
            RadioButton(selected = name == "Javi", onClick = { onSelecte("Javi")},
            )
            Text("Javi")
        }

        Row {
            RadioButton(selected = name == "Irene", onClick = { onSelecte("Irene") },
            )
            Text(text = "Irene")
        }

        Row {
            RadioButton(selected = name == "Noelia", onClick = { onSelecte("Noelia") },
            )

            Text(text = "Noelia")
        }

        Row {
            RadioButton(selected = name == "Susi", onClick = { onSelecte("Susi") },
            )
            Text(text = "Susi")
        }

    }
}