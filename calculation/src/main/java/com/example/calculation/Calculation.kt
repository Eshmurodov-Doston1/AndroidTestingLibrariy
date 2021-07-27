package com.example.calculation

import android.content.Context
import android.widget.Toast

class Calculation {
    companion object {
        fun plus(context: Context,a: Int, b: Int): Int {
            Toast.makeText(context, "${a + b}", Toast.LENGTH_SHORT).show()
            return a + b
        }
        fun minus(a: Int, b: Int): Int {
            return a - b
        }
        fun divide(a: Int, b: Int): Int {
            require(b!=0){"Divide by zero Error"}
            return a / b
        }
        fun multiply(a: Int, b: Int): Int {
            return a * b
        }
    }
}