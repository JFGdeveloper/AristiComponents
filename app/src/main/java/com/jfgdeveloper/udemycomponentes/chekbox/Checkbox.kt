package com.jfgdeveloper.udemycomponentes.chekbox

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Checkbox
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jfgdeveloper.udemycomponentes.common.CheckInfo

@Preview(showSystemUi = true)
@Composable
fun MyCheckbox() {
    var status by rememberSaveable{ mutableStateOf(false) }

    Row( verticalAlignment = Alignment.CenterVertically) {

        Checkbox(checked = status, onCheckedChange = { status = it })
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = "MUJER")
    }
}

@Composable
fun MyListCheckBox(checkInfo: CheckInfo) {
    Row( verticalAlignment = Alignment.CenterVertically) {

        Checkbox(checked = checkInfo.checked, onCheckedChange = { checkInfo.onCheckedChange(it) })
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = checkInfo.title)
    }


}


@Composable
fun getCheckBox(titles: List<String>): List<CheckInfo> {

    return titles.map {
        var status = rememberSaveable{ mutableStateOf(false)}
        CheckInfo(
                title = it,
                checked = status.value,
                onCheckedChange = {status.value = it}
        )
    }

}
