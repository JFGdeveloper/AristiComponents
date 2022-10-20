package com.jfgdeveloper.udemycomponentes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.jfgdeveloper.udemycomponentes.chekbox.MyListCheckBox
import com.jfgdeveloper.udemycomponentes.chekbox.getCheckBox
import com.jfgdeveloper.udemycomponentes.radioButton.ListRadioButton
import com.jfgdeveloper.udemycomponentes.radioButton.MyRadioButton
import com.jfgdeveloper.udemycomponentes.ui.theme.UdemyComponentesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            val items = getCheckBox(titles = listOf("Mujer", "Hombre", "SD"))
            var status by remember { mutableStateOf("Javi")}

            UdemyComponentesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                        modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colors.background
                ) {

                    Column {
                        //MyColums()
                        //MyRows()
                        //Combinado()
                        //Estados()
                        //MyProgressBar()
                        //MySwitch()
                        //MyCheckbox()

                        Column {
                            items.forEach{
                                MyListCheckBox(checkInfo = it)
                            }
                        }

                        MyRadioButton()
                        ListRadioButton(name = status){
                            status = it
                        }
                    }



                }
            }
        }
    }
}



