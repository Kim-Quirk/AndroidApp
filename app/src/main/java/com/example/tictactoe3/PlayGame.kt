package com.example.tictactoe3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class PlayGame : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play_game)

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

        button1.setOnClickListener {
            if (button1.isClickable) {
                button1.text = "X"
                button1.isClickable = false
                answers[0] = "X"
                win = testWin(answers, buttons)
                answers = enemyMoves(answers, buttons)
            }
        }
        button2.setOnClickListener {
            if (button2.isClickable) {
                button2.text = "X"
                button2.isClickable = false
                answers[1] = "X"
                win = testWin(answers, buttons)
                answers = enemyMoves(answers, buttons)
            }
        }
        button3.setOnClickListener {
            if (button3.isClickable) {
                button3.text = "X"
                button3.isClickable = false
                answers[2] = "X"
                win = testWin(answers, buttons)
                answers = enemyMoves(answers, buttons)
            }
        }
        button4.setOnClickListener {
            if (button4.isClickable) {
                button4.text = "X"
                button4.isClickable = false
                answers[3] = "X"
                win = testWin(answers, buttons)
                answers = enemyMoves(answers, buttons)
            }
        }
        button5.setOnClickListener {
            if (button5.isClickable) {
                button5.text = "X"
                button5.isClickable = false
                answers[4] = "X"
                win = testWin(answers, buttons)
                answers = enemyMoves(answers, buttons)
            }
        }
        button6.setOnClickListener {
            if (button6.isClickable) {
                button6.text = "X"
                button6.isClickable = false
                answers[5] = "X"
                win = testWin(answers, buttons)
                answers = enemyMoves(answers, buttons)
            }
        }
        button7.setOnClickListener {
            if (button7.isClickable) {
                button7.text = "X"
                button7.isClickable = false
                answers[6] = "X"
                win = testWin(answers, buttons)
                answers = enemyMoves(answers, buttons)
            }
        }
        button8.setOnClickListener {
            if (button8.isClickable) {
                button8.text = "X"
                button8.isClickable = false
                answers[7] = "X"
                win = testWin(answers, buttons)
                answers = enemyMoves(answers, buttons)
            }
        }
        button9.setOnClickListener {
            if (button9.isClickable) {
                button9.text = "X"
                button9.isClickable = false
                answers[8] = "X"
                win = testWin(answers, buttons)
                answers = enemyMoves(answers, buttons)
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
            winStatement.text = "You win! Congrats!"
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
            winStatement.text = "The computer wins! Better luck next time."
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

    //The computer's turn. Basically the computer looks for an empty spot and randomly places an O down.
    private fun enemyMoves(answers: Array<String>, buttons: Array<Button>): Array<String> {
        var error = true
        var x = 0
        while (error) {
            x = (0..8).random()
            if (answers[x] == " ") {
                error = false
                buttons[x].text = "O"
                buttons[x].isClickable = false
            }
        }
        answers[x] = "O"
        return answers
    }
}