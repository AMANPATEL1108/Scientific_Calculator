package com.example.scientificcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.math.sqrt
import kotlin.math.pow
import kotlin.math.sin
import kotlin.math.cos
import kotlin.math.tan
import kotlin.math.log10
import kotlin.math.ln

class MainActivity : AppCompatActivity() {
    lateinit var secondaryTV: TextView
    lateinit var primaryTV: TextView
    lateinit var acBtn: Button
    lateinit var cBtn: Button
    lateinit var braceBtn1: Button
    lateinit var braceBtn2: Button
    lateinit var sinBtn: Button
    lateinit var cosBtn: Button
    lateinit var tanBtn: Button
    lateinit var logBtn: Button
    lateinit var lnBtn: Button
    lateinit var factBtn: Button
    lateinit var squareBtn: Button
    lateinit var sqRootBtn: Button
    lateinit var invBtn: Button
    lateinit var btn7: Button
    lateinit var btn8: Button
    lateinit var btn9: Button
    lateinit var btn6: Button
    lateinit var btn5: Button
    lateinit var btn4: Button
    lateinit var btn3: Button
    lateinit var btn2: Button
    lateinit var btn1: Button
    lateinit var btn0: Button
    lateinit var btnpie: Button
    lateinit var btnPoint: Button
    lateinit var btnMul: Button
    lateinit var btnSub: Button
    lateinit var btnAdd: Button
    lateinit var btnEqual: Button
    lateinit var btnDiv: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        primaryTV = findViewById(R.id.idTVPrimary)
        secondaryTV = findViewById(R.id.idTVSecondary)
        acBtn = findViewById(R.id.idBtnAc)
        cBtn = findViewById(R.id.idBtnC)
        braceBtn1 = findViewById(R.id.idBtnBrac1)
        braceBtn2 = findViewById(R.id.idBtnBrac2)
        sinBtn = findViewById(R.id.idBtnSin)
        cosBtn = findViewById(R.id.idBtncos)
        tanBtn = findViewById(R.id.idBtntan)
        logBtn = findViewById(R.id.idBtnlog)
        lnBtn = findViewById(R.id.idBtnln)
        factBtn = findViewById(R.id.idBtnfact)
        squareBtn = findViewById(R.id.idBtnSquare)
        sqRootBtn = findViewById(R.id.idBtnSqRoot)
        invBtn = findViewById(R.id.idBtnInv)
        btnDiv = findViewById(R.id.idBtnDiv)
        btnMul = findViewById(R.id.idBtnMul)
        btnSub = findViewById(R.id.idBtnSub)
        btnAdd = findViewById(R.id.idBtnAdd)
        btnEqual = findViewById(R.id.idBtnEqual)
        btnpie = findViewById(R.id.idBtnPie)
        btnPoint = findViewById(R.id.idBtnDot)
        btn7 = findViewById(R.id.idBtn7)
        btn8 = findViewById(R.id.idBtn8)
        btn9 = findViewById(R.id.idBtn9)
        btn6 = findViewById(R.id.idBtn6)
        btn5 = findViewById(R.id.idBtn5)
        btn4 = findViewById(R.id.idBtn4)
        btn3 = findViewById(R.id.idBtn3)
        btn2 = findViewById(R.id.idBtn2)
        btn1 = findViewById(R.id.idBtn1)
        btn0 = findViewById(R.id.idBtn0)

        btn0.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + "0")
        }
        btn1.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + "1")
        }
        btn2.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + "2")
        }
        btn3.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + "3")
        }
        btn4.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + "4")
        }
        btn5.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + "5")
        }
        btn6.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + "6")
        }
        btn7.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + "7")
        }
        btn8.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + "8")
        }
        btn9.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + "9")
        }
        btnPoint.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + ".")
        }
        btnAdd.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + "+")
        }
        btnDiv.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + "/")
        }
        braceBtn1.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + "(")
        }
        braceBtn2.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + ")")
        }
        btnpie.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + "3.142")
        }
        sinBtn.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + "sin")
        }
        cosBtn.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + "cos")
        }
        tanBtn.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + "tan")
        }
        invBtn.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + "^" + "(-1)")
        }
        lnBtn.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + "ln")
        }
        logBtn.setOnClickListener {
            primaryTV.text = (primaryTV.text.toString() + "log")
        }

        btnSub.setOnClickListener {
            val str: String = primaryTV.text.toString()
            if (!str.endsWith("-")) {
                primaryTV.text = (primaryTV.text.toString() + "-")
            }
        }
        btnMul.setOnClickListener {
            val str: String = primaryTV.text.toString()
            if (!str.endsWith("*")) {
                primaryTV.text = (primaryTV.text.toString() + "*")
            }
        }
        sqRootBtn.setOnClickListener {
            if (primaryTV.text.toString().isEmpty()) {
                Toast.makeText(this, "Please enter a valid number!!", Toast.LENGTH_SHORT).show()
            } else {
                val str: String = primaryTV.text.toString()
                val r = sqrt(str.toDouble())
                val result = r.toString()
                primaryTV.text = result
            }
        }
        acBtn.setOnClickListener {
            primaryTV.text = ""
            secondaryTV.text = ""
        }
        cBtn.setOnClickListener {
            var str: String = primaryTV.text.toString()
            if (!str.equals("")) {
                str = str.substring(0, str.length - 1)
                primaryTV.text = str
            }
        }
        squareBtn.setOnClickListener {
            if (primaryTV.text.toString().isEmpty()) {
                Toast.makeText(this, "Please enter a valid number", Toast.LENGTH_SHORT).show()
            } else {
                val d: Double = primaryTV.text.toString().toDouble()
                val square = d * d
                secondaryTV.text = square.toString()
            }
        }
    }
}


//x!,=,√
