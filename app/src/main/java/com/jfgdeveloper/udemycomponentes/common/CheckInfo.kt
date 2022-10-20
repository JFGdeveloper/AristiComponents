package com.jfgdeveloper.udemycomponentes.common

data class CheckInfo(
    val title: String,
    var checked: Boolean,
    var onCheckedChange: (Boolean) ->Unit
)
