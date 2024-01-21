package com.example.helloworldapp.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.example.helloworldapp.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class CalculatorActivity : AppCompatActivity() {

    private lateinit var btnZero: Button
    private lateinit var btnOne: FloatingActionButton
    private lateinit var btnTwo: FloatingActionButton
    private lateinit var btnThree: FloatingActionButton
    private lateinit var btnFour: FloatingActionButton
    private lateinit var btnFive: FloatingActionButton
    private lateinit var btnSix: FloatingActionButton
    private lateinit var btnSeven: FloatingActionButton
    private lateinit var btnEight: FloatingActionButton
    private lateinit var btnNine: FloatingActionButton
    private lateinit var btnEquals: FloatingActionButton
    private lateinit var btnMinus: FloatingActionButton
    private lateinit var btnPlus: FloatingActionButton
    private lateinit var btnTimes: FloatingActionButton
    private lateinit var btnDivide: FloatingActionButton
    private lateinit var btnPercent: FloatingActionButton
    private lateinit var btnMinusPlus: FloatingActionButton
    private lateinit var btnClear: FloatingActionButton
    private lateinit var tvDisplay: TextView

    private var currentNumber: Int = 0
    private var accumulateNumber: Int? = null
    private var currentNumberDisplay: String = ""
    private var isOperatorActive: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        initComponents()
        initListeners()
    }

    private fun initListeners() {
        var number: Int
        btnZero.setOnClickListener {
            number = 0
            concatenateDisplayNumber(currentNumberDisplay, number)
        }
        btnOne.setOnClickListener {
            number = 1
            concatenateDisplayNumber(currentNumberDisplay, number)
        }
        btnTwo.setOnClickListener {
            number = 2
            concatenateDisplayNumber(currentNumberDisplay, number)
        }
        btnThree.setOnClickListener {
            number = 3
            concatenateDisplayNumber(currentNumberDisplay, number)
        }
        btnFour.setOnClickListener {
            number = 4
            concatenateDisplayNumber(currentNumberDisplay, number)
        }
        btnFive.setOnClickListener {
            number = 5
            concatenateDisplayNumber(currentNumberDisplay, number)
        }
        btnSix.setOnClickListener {
            number = 6
            concatenateDisplayNumber(currentNumberDisplay, number)
        }
        btnSeven.setOnClickListener {
            number = 7
            concatenateDisplayNumber(currentNumberDisplay, number)
        }
        btnEight.setOnClickListener {
            number = 8
            concatenateDisplayNumber(currentNumberDisplay, number)
        }
        btnNine.setOnClickListener {
            number = 9
            concatenateDisplayNumber(currentNumberDisplay, number)
        }
        btnClear.setOnClickListener {
            accumulateNumber = null
            currentNumber = 0
            currentNumberDisplay = ""
            isOperatorActive = false
            tvDisplay.text = currentNumberDisplay
        }
        btnPlus.setOnClickListener {
            currentNumber = currentNumberDisplay.toInt()
            isOperatorActive = true
            if (accumulateNumber != null && isOperatorActive) {
                addNumbers(accumulateNumber!!, currentNumber)
            }else{
                accumulateNumber = currentNumber
                currentNumber = 0
                currentNumberDisplay = ""
            }
        }
        btnMinus.setOnClickListener {
            currentNumber = currentNumberDisplay.toInt()
            isOperatorActive = true
            if (accumulateNumber != null && isOperatorActive) {
                subtractNumbers(accumulateNumber!!, currentNumber)
            }else{
                accumulateNumber = currentNumber
                currentNumber = 0
                currentNumberDisplay = ""
            }
        }
    }

    private fun subtractNumbers(x: Int, y: Int) {
        val minus = x - y
        accumulateNumber = minus
        currentNumber = 0
        currentNumberDisplay = ""
        tvDisplay.text = minus.toString()
        Log.i("resta", "$x - $y = $minus")
    }

    private fun addNumbers(x: Int, y: Int) {
        val sum = x + y
        accumulateNumber = sum
        currentNumber = 0
        currentNumberDisplay = ""
        tvDisplay.text = sum.toString()
        Log.i("suma", "$x - $y = $sum")
    }

    private fun concatenateDisplayNumber(accNumber: String, num: Int) {
        isOperatorActive = false
        currentNumberDisplay = accNumber + num.toString()
        tvDisplay.text = currentNumberDisplay
    }

    private fun initComponents() {
        btnZero = findViewById(R.id.btnZero)
        btnOne = findViewById(R.id.btnOne)
        btnTwo = findViewById(R.id.btnTwo)
        btnThree = findViewById(R.id.btnThree)
        btnFour = findViewById(R.id.btnFour)
        btnFive = findViewById(R.id.btnFive)
        btnSix = findViewById(R.id.btnSix)
        btnSeven = findViewById(R.id.btnSeven)
        btnEight = findViewById(R.id.btnEight)
        btnNine = findViewById(R.id.btnNine)
        btnEquals = findViewById(R.id.btnEquals)
        btnMinus = findViewById(R.id.btnMinus)
        btnPlus = findViewById(R.id.btnPlus)
        btnTimes = findViewById(R.id.btnTimes)
        btnDivide = findViewById(R.id.btnDivide)
        btnPercent = findViewById(R.id.btnPercent)
        btnMinusPlus = findViewById(R.id.btnMinusPlus)
        btnClear = findViewById(R.id.btnClear)
        tvDisplay = findViewById(R.id.tvDisplay)
    }
}