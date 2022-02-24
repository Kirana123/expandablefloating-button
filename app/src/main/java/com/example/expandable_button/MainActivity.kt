package com.example.expandable_button

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.floatingactionbutton.FloatingActionButton
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton


class MainActivity : AppCompatActivity() {

    var isAllFabsVisible: Boolean? = null

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var mAddFab: ExtendedFloatingActionButton = findViewById(R.id.add_fab)
        var mAddAlarmFab: FloatingActionButton = findViewById(R.id.add_alarm_fab)
        var mAddPersonFab: FloatingActionButton = findViewById(R.id.add_person_fab)
        var mAddCardFab: FloatingActionButton = findViewById(R.id.add_card_fab)
        var mAddVerificationFab: FloatingActionButton = findViewById(R.id.add_privacy_fab)
        var mAddCallFab: FloatingActionButton = findViewById(R.id.add_call_fab)
        var addAlarmActionText: TextView = findViewById(R.id.add_alarm_action_text)
        var addPersonActionText: TextView = findViewById(R.id.add_person_action_text)
        var addCardActionText: TextView = findViewById(R.id.add_card)
        var addCallActionText: TextView = findViewById(R.id.add_privacy_action_text)
        var addVerficationActionText: TextView = findViewById(R.id.call_card)
        mAddAlarmFab.setVisibility(View.GONE);
        mAddCardFab.setVisibility(View.GONE);
        mAddPersonFab.setVisibility(View.GONE);
        mAddVerificationFab.setVisibility(View.GONE);
        mAddCallFab.setVisibility(View.GONE);
        addAlarmActionText.setVisibility(View.GONE);
        addPersonActionText.setVisibility(View.GONE);
        addCardActionText.setVisibility(View.GONE);
        addCallActionText.setVisibility(View.GONE);
        addVerficationActionText.setVisibility(View.GONE);
        isAllFabsVisible = false;
        mAddFab.shrink();

        mAddFab.setOnClickListener {
            isAllFabsVisible = if (!isAllFabsVisible!!) {
                mAddAlarmFab.show()
                mAddPersonFab.show()
                mAddCardFab.show()
                mAddVerificationFab.show()
                mAddCallFab.show()
                addAlarmActionText.setVisibility(View.VISIBLE)
                addPersonActionText.setVisibility(View.VISIBLE)
                addCardActionText.setVisibility(View.VISIBLE)
                addCallActionText.setVisibility(View.VISIBLE)
                addVerficationActionText.setVisibility(View.VISIBLE)
                mAddFab.extend()
                true
            } else {
                mAddAlarmFab.hide()
                mAddPersonFab.hide()
                mAddCardFab.hide()
                mAddVerificationFab.hide()
                mAddCallFab.hide()
                addAlarmActionText.setVisibility(View.GONE)
                addPersonActionText.setVisibility(View.GONE)
                addCardActionText.setVisibility(View.GONE)
                addCallActionText.setVisibility(View.GONE)
                addVerficationActionText.setVisibility(View.GONE)
                mAddFab.shrink()
                false
            }
        }
        mAddPersonFab.setOnClickListener {
            Toast.makeText(
                this@MainActivity,
                "Person Added.!",
                Toast.LENGTH_SHORT
            ).show()
        }


        mAddAlarmFab.setOnClickListener {
            Toast.makeText(
                this@MainActivity,
                "Alarm Added.!",
                Toast.LENGTH_SHORT
            ).show()
        }


        mAddCardFab.setOnClickListener {
            Toast.makeText(
                this@MainActivity,
                "Card Added.!",
                Toast.LENGTH_SHORT
            ).show()
        }

        mAddVerificationFab.setOnClickListener {
            Toast.makeText(
                this@MainActivity,
                "User Verified.!",
                Toast.LENGTH_SHORT
            ).show()
        }

        mAddCallFab.setOnClickListener {
            Toast.makeText(
                this@MainActivity,
                "Adding Call.!",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}