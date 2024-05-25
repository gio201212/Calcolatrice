/*
 * Copyright 2024 GIOGUIZYA
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */



package com.example.calcolatrice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var prova = '0'
        var a= ""
        var c =""
        val sche = findViewById<TextView>(R.id.Schermo)
        var add = '0'
        var sott = '0'
        var molt = '0'
        var div = '0'
        var risultato = ""

        val addizione = findViewById<Button>(R.id.nadd)
        val sottrazione = findViewById<Button>(R.id.nsott)
        val moltiplicazione = findViewById<Button>(R.id.nmol)
        val divisione = findViewById<Button>(R.id.ndiv)
        val uguale = findViewById<Button>(R.id.nugu)
        val cancella = findViewById<Button>(R.id.nac)
        val radice = findViewById<Button>(R.id.Radice)

        val numero0 = findViewById<Button>(R.id.n0)
        val numero1 = findViewById<Button>(R.id.n1)
        val numero2 = findViewById<Button>(R.id.n2)
        val numero3 = findViewById<Button>(R.id.n3)
        val numero4 = findViewById<Button>(R.id.n4)
        val numero5 = findViewById<Button>(R.id.n5)
        val numero6 = findViewById<Button>(R.id.n6)
        val numero7 = findViewById<Button>(R.id.n7)
        val numero8 = findViewById<Button>(R.id.n8)
        val numero9 = findViewById<Button>(R.id.n9)
        val punto = findViewById<Button>(R.id.npunt)

        numero0.setOnClickListener(){

            a = a.plus('0')
            sche.text = a

        }

        numero1.setOnClickListener(){

            a = a.plus('1')
            sche.text = a

        }

        numero2.setOnClickListener(){

            a = a.plus('2')
            sche.text = a

        }

        numero3.setOnClickListener(){

            a = a.plus('3')
            sche.text = a

        }

        numero4.setOnClickListener(){

            a = a.plus('4')
            sche.text = a

        }

        numero5.setOnClickListener(){

            a = a.plus('5')
            sche.text = a

        }

        numero6.setOnClickListener() {

            a = a.plus('6')
            sche.text = a

        }

        numero7.setOnClickListener(){

            a = a.plus('7')
            sche.text = a

        }

        numero8.setOnClickListener(){

            a = a.plus('8')
            sche.text = a

        }

        numero9.setOnClickListener(){

            a = a.plus('9')
            sche.text = a

        }

        punto.setOnClickListener(){



            if (prova == '0' ){

                a = a.plus('.')
                sche.text = a
                prova = '1'

            }

        }

        radice.setOnClickListener(){

            sche.text= (sqrt(a.toDouble())).toString()
            a = ""

        }

        addizione.setOnClickListener(){


            c = a
            sche.text = a
            a = ""
            add = '1'

        }

        sottrazione.setOnClickListener(){


            c = a
            sche.text = a
            a = ""
            sott = '1'


        }

        moltiplicazione.setOnClickListener(){


            c = a
            sche.text = a
            a = ""
            molt = '1'

        }

        divisione.setOnClickListener(){


            c = a
            sche.text = a
            a = ""
            div = '1'

        }

        cancella.setOnClickListener(){

            a = ""
            c = ""
            sche.text = a
            add = '0'
            sott = '0'
            molt = '0'
            div = '0'

        }

        uguale.setOnClickListener(){

            if( add == '1'){

                if(a == ""){

                    risultato = (c.toDouble()+c.toDouble()).toString()
                    sche.text = risultato
                    a = ""
                    c = ""
                    add = '0'

                }else {
                    risultato = (a.toDouble() + c.toDouble()).toString()
                    sche.text = risultato
                    a = ""
                    c = ""
                    add = '0'
                }

            }

            if( sott == '1') {

                if(a == ""){

                    risultato = (c.toDouble() - c.toDouble()).toString()
                    sche.text = risultato
                    a = ""
                    c = ""
                    add = '0'

                }else{

                risultato = (c.toDouble() - a.toDouble()).toString()
                sche.text = risultato
                a = ""
                c = ""
                add = '0'

                }

            }

            if( molt == '1') {

                if(a == ""){

                    risultato = (c.toDouble() * c.toDouble()).toString()
                    sche.text = risultato
                    a = ""
                    c = ""
                    molt = '0'

                }else {

                    risultato = (c.toDouble() * a.toDouble()).toString()
                    sche.text = risultato
                    a = ""
                    c = ""
                    molt = '0'

                }

            }

            if( div == '1') {

                if(a == ""){

                    risultato = (c.toDouble() / c.toDouble()).toString()
                    sche.text = risultato
                    a = ""
                    c = ""
                    div = '0'

                }else {

                    risultato = (c.toDouble() / a.toDouble()).toString()
                    sche.text = risultato
                    a = ""
                    c = ""
                    div = '0'

                }

            }

        }


        findViewById<Button>(R.id.Info).setOnClickListener {

            startActivity(
                Intent(
                    this, MainActivity3::class.java
                ).apply {
                    putExtra("key", "value")
                }
            )

        }


    }


}
