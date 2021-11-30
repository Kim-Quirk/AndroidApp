package com.example.tictactoe3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import android.view.View
import android.widget.Button
import android.widget.TextView

class TwoPlayer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two_player)

        val btnmenu = findViewById<Button>(R.id.btnmenu)

        btnmenu.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        var answers = arrayOf(" ", " ", " ", " ", " ", " ", " ", " ", " ")

        val button1 = findViewById<Button>(R.id.button_1)
        val button2 = findViewById<Button>(R.id.button_2)
        val button3 = findViewById<Button>(R.id.button_3)
        val button4 = findViewById<Button>(R.id.button_4)
        val button5 = findViewById<Button>(R.id.button_5)
        val button6 = findViewById<Button>(R.id.button_6)
        val button7 = findViewById<Button>(R.id.button_7)
        val button8 = findViewById<Button>(R.id.button_8)
        val button9 = findViewById<Button>(R.id.button_9)
        val buttons = arrayOf(button1, button2, button3, button4, button5, button6, button7, button8, button9)
        var win = false
        var player = 1

        button1.setOnClickListener {
            if (button1.isClickable) {
                if (player == 1) {
                    button1.text = "X"
                    player = 2
                    answers[0] = "X"
                } else {
                    button1.text = "O"
                    player = 1
                    answers[0] = "O"
                }
                button1.isClickable = false
                win = testWin(answers, buttons)
            }
        }
        button2.setOnClickListener {
            if (button2.isClickable) {
                if (player == 1) {
                    button2.text = "X"
                    player = 2
                    answers[1] = "X"
                } else {
                    button2.text = "O"
                    player = 1
                    answers[1] = "O"
                }
                button2.isClickable = false
                win = testWin(answers, buttons)
            }
        }
        button3.setOnClickListener {
            if (button3.isClickable) {
                if (player == 1) {
                    button3.text = "X"
                    player = 2
                    answers[2] = "X"
                } else {
                    button3.text = "O"
                    player = 1
                    answers[2] = "O"
                }
                button3.isClickable = false
                win = testWin(answers, buttons)
            }
        }
        button4.setOnClickListener {
            if (button4.isClickable) {
                if (player == 1) {
                    button4.text = "X"
                    player = 2
                    answers[3] = "X"
                } else {
                    button4.text = "O"
                    player = 1
                    answers[3] = "O"
                }
                button4.isClickable = false
                win = testWin(answers, buttons)
            }
        }
        button5.setOnClickListener {
            if (button5.isClickable) {
                if (player == 1) {
                    button5.text = "X"
                    player = 2
                    answers[4] = "X"
                } else {
                    button5.text = "O"
                    player = 1
                    answers[4] = "O"
                }
                button5.isClickable = false
                win = testWin(answers, buttons)
            }
        }
        button6.setOnClickListener {
            if (button6.isClickable) {
                if (player == 1) {
                    button6.text = "X"
                    player = 2
                    answers[5] = "X"
                } else {
                    button6.text = "O"
                    player = 1
                    answers[5] = "O"
                }
                button6.isClickable = false
                win = testWin(answers, buttons)
            }
        }
        button7.setOnClickListener {
            if (button7.isClickable) {
                if (player == 1) {
                    button7.text = "X"
                    player = 2
                    answers[6] = "X"
                } else {
                    button7.text = "O"
                    player = 1
                    answers[6] = "O"
                }
                button7.isClickable = false
                win = testWin(answers, buttons)
            }
        }
        button8.setOnClickListener {
            if (button8.isClickable) {
                if (player == 1) {
                    button8.text = "X"
                    player = 2
                    answers[7] = "X"
                } else {
                    button8.text = "O"
                    player = 1
                    answers[7] = "O"
                }
                button8.isClickable = false
                win = testWin(answers, buttons)
            }
        }
        button9.setOnClickListener {
            if (button9.isClickable) {
                if (player == 1) {
                    button9.text = "X"
                    player = 2
                    answers[8] = "X"
                } else {
                    button9.text = "O"
                    player = 1
                    answers[8] = "O"
                }
                button9.isClickable = false
                win = testWin(answers, buttons)
            }
        }
        if (win) {
            for (x in 0..8) {
                buttons[x].isClickable = false
            }
        }
    }

    //Tests all possible win conditions to see if someone has won tic-tac-toe.
    private fun testWin(answers: Array<String>, buttons: Array<Button>): Boolean {
        var win = false
        val winStatement = findViewById<TextView>(R.id.textWin)
        if (
            (answers[0] == "X" && answers[1] == "X" && answers[2] == "X") ||
            (answers[3] == "X" && answers[4] == "X" && answers[5] == "X") ||
            (answers[6] == "X" && answers[7] == "X" && answers[8] == "X") ||
            (answers[0] == "X" && answers[3] == "X" && answers[6] == "X") ||
            (answers[1] == "X" && answers[4] == "X" && answers[7] == "X") ||
            (answers[2] == "X" && answers[5] == "X" && answers[8] == "X") ||
            (answers[0] == "X" && answers[4] == "X" && answers[8] == "X") ||
            (answers[2] == "X" && answers[4] == "X" && answers[6] == "X")
        ) {
            win = true
            winStatement.text = "Player One wins! Go X's"
        }
        if (
            (answers[0] == "O" && answers[1] == "O" && answers[2] == "O") ||
            (answers[3] == "O" && answers[4] == "O" && answers[5] == "O") ||
            (answers[6] == "O" && answers[7] == "O" && answers[8] == "O") ||
            (answers[0] == "O" && answers[3] == "O" && answers[6] == "O") ||
            (answers[1] == "O" && answers[4] == "O" && answers[7] == "O") ||
            (answers[2] == "O" && answers[5] == "O" && answers[8] == "O") ||
            (answers[0] == "O" && answers[4] == "O" && answers[8] == "O") ||
            (answers[2] == "O" && answers[4] == "O" && answers[6] == "O")
        ) {
            win = true
            winStatement.text = "Player Two wins! Go O's."
        }
        if (!win) {
            var count = 0
            for (i in 0..8) {
                if (answers[i] != " ") {
                    count += 1
                }
            }
            if (count == 9) {
                win = true
                winStatement.text = "It's a tie. No one wins!"
            }
        }
        if (win) {
            for (x in 0..8) {
                buttons[x].isClickable = false
            }
        }
        return win
    }
}