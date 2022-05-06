package edu.uw.ischool.talin16.lifecounter

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var p1: Int = 20
    var p2: Int = 20
    var p3: Int = 20
    var p4: Int = 20

    lateinit var pl1LifeCountTV: TextView
    lateinit var pl2LifeCountTV: TextView
    lateinit var pl3LifeCountTV: TextView
    lateinit var pl4LifeCountTV: TextView
    lateinit var gameOverText:TextView

    var isGameOn = true
    override fun onResume() {
        if (!isGameOn) {
            gameOverText=findViewById<TextView>(R.id.textViewGameOver)
            gameOverText.visibility = View.VISIBLE
            gameOverText.text = "Player 1 LOSES!"
        }
        super.onResume()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        isGameOn = true


        var gameOverText = findViewById<TextView>(R.id.textViewGameOver)
        pl1LifeCountTV = findViewById<TextView>(R.id.pl1LifeCountTV)
        pl1LifeCountTV.text = p1.toString()
        pl2LifeCountTV = findViewById<TextView>(R.id.pl2LifeCountTV)
        pl2LifeCountTV.text = p2.toString()
        pl3LifeCountTV = findViewById<TextView>(R.id.pl3LifeCountTV)
        pl3LifeCountTV.text = p3.toString()
        pl4LifeCountTV = findViewById<TextView>(R.id.pl4LifeCountTV)
        pl4LifeCountTV.text = p4.toString()


        var btn1p1 = findViewById<Button>(R.id.btn1_player1)
        var btn2p1 = findViewById<Button>(R.id.btn2_player1)
        var btn3p1 = findViewById<Button>(R.id.btn3_player1)
        var btn4p1 = findViewById<Button>(R.id.btn4_player1)
        var btn1p2 = findViewById<Button>(R.id.btn1_player2)
        var btn2p2 = findViewById<Button>(R.id.btn2_player2)
        var btn3p2 = findViewById<Button>(R.id.btn3_player2)
        var btn4p2 = findViewById<Button>(R.id.btn4_player2)
        var btn1p3 = findViewById<Button>(R.id.btn1_player3)
        var btn2p3 = findViewById<Button>(R.id.btn2_player3)
        var btn3p3 = findViewById<Button>(R.id.btn3_player3)
        var btn4p3 = findViewById<Button>(R.id.btn4_player3)
        var btn1p4 = findViewById<Button>(R.id.btn1_player4)
        var btn2p4 = findViewById<Button>(R.id.btn2_player4)
        var btn3p4 = findViewById<Button>(R.id.btn3_player4)
        var btn4p4 = findViewById<Button>(R.id.btn4_player4)

        btn1p1.setOnClickListener {
            if (isGameOn) {
                p1 += 1
                pl1LifeCountTV.text = p1.toString()
            }
        }
        btn2p1.setOnClickListener {
            if (isGameOn) {
                p1 -= 1
                pl1LifeCountTV.text = p1.toString()
            }
            if (p1 <= 0) {
                gameOverText.visibility = View.VISIBLE
                gameOverText.text = "Player 1 LOSES!"
                isGameOn = false
            }
        }
        btn3p1.setOnClickListener {
            if (isGameOn) {
                p1 += 5
                pl1LifeCountTV.text = p1.toString()
            }
        }
        btn4p1.setOnClickListener {
            if (isGameOn) {
                p1 -= 5
                pl1LifeCountTV.text = p1.toString()
            }
            if (p1 <= 0) {
                gameOverText.visibility = View.VISIBLE
                gameOverText.text = "Player 1 LOSES!"
                isGameOn = false
            }
        }

        btn1p2.setOnClickListener {
            if (isGameOn) {
                p2 += 1
                pl2LifeCountTV.text = p2.toString()
            }
        }
        btn2p2.setOnClickListener {
            if (isGameOn) {
                p2 -= 1
                pl2LifeCountTV.text = p2.toString()
            }
            if (p2 <= 0) {
                gameOverText.visibility = View.VISIBLE
                gameOverText.text = "Player 2 LOSES!"
                isGameOn = false
            }
        }
        btn3p2.setOnClickListener {
            if (isGameOn) {
                p2 += 5
                pl2LifeCountTV.text = p2.toString()
            }
        }
        btn4p2.setOnClickListener {
            if (isGameOn) {
                p2 -= 5
                pl2LifeCountTV.text = p2.toString()
            }
            if (p2 <= 0) {
                gameOverText.visibility = View.VISIBLE
                gameOverText.text = "Player 2 LOSES!"
                isGameOn = false
            }
        }

        btn1p3.setOnClickListener {
            if (isGameOn) {
                p3 += 1
                pl3LifeCountTV.text = p3.toString()
            }
        }
        btn2p3.setOnClickListener {
            if (isGameOn) {
                p3 -= 1
                pl3LifeCountTV.text = p3.toString()
            }
            if (p3 <= 0) {
                gameOverText.visibility = View.VISIBLE
                gameOverText.text = "Player 3 LOSES!"
                isGameOn = false
            }
        }
        btn3p3.setOnClickListener {
            if (isGameOn) {
                p3 += 5
                pl3LifeCountTV.text = p3.toString()
            }
        }
        btn4p3.setOnClickListener {
            if (isGameOn) {
                p3 -= 5
                pl3LifeCountTV.text = p3.toString()
            }
            if (p3 <= 0) {
                gameOverText.visibility = View.VISIBLE
                gameOverText.text = "Player 3 LOSES!"
                isGameOn = false
            }
        }


        btn1p4.setOnClickListener {
            if (isGameOn) {
                p4 += 1
                pl4LifeCountTV.text = p4.toString()
            }
        }
        btn2p4.setOnClickListener {
            if (isGameOn) {
                p4 -= 1
                pl4LifeCountTV.text = p4.toString()
            }
            if (p4 <= 0) {
                gameOverText.visibility = View.VISIBLE
                gameOverText.text = "Player 4 LOSES!"
                isGameOn = false
            }
        }
        btn3p4.setOnClickListener {
            if (isGameOn) {
                p4 += 5
                pl4LifeCountTV.text = p4.toString()
            }
        }
        btn4p4.setOnClickListener {
            if (isGameOn) {
                p4 -= 5
                pl4LifeCountTV.text = p4.toString()
            }
            if (p4 <= 0) {
                gameOverText.visibility = View.VISIBLE
                gameOverText.text = "Player 4 LOSES!"
                isGameOn = false
            }
        }


    }


    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("pl1", p1)
        outState.putInt("pl2", p2)
        outState.putInt("pl3", p3)
        outState.putInt("pl4", p4)
        outState.putBoolean("isGameOn", isGameOn)

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        p1 = savedInstanceState.getInt("pl1")
        pl1LifeCountTV.text = p1.toString()
        p2 = savedInstanceState.getInt("pl2")
        pl2LifeCountTV.text = p2.toString()
        p3 = savedInstanceState.getInt("pl3")
        pl3LifeCountTV.text = p3.toString()
        p4 = savedInstanceState.getInt("pl4")
        pl4LifeCountTV.text = p4.toString()
        isGameOn = savedInstanceState.getBoolean("isGameOn")
    }
}