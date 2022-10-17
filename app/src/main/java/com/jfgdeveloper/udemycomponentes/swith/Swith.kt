package com.jfgdeveloper.udemycomponentes.swith

import androidx.compose.material.Switch
import androidx.compose.material.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MySwitch() {
    var stateCheked by rememberSaveable { mutableStateOf(false)}
    Switch(
            checked = stateCheked,
            onCheckedChange = { stateCheked = !stateCheked },
            enabled = true,
            colors = SwitchDefaults.colors(
                    Color.Red
            )
    )

}