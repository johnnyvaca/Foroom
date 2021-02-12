package com.example.foroom.view

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ClickableSpan
import android.text.style.ForegroundColorSpan
import android.widget.TextView
import android.widget.Toast
import com.example.foroom.R
import com.klinker.android.link_builder.Link
import com.klinker.android.link_builder.applyLinkedText
import com.klinker.android.link_builder.applyLinks
import kotlinx.android.synthetic.main.activity_topics_activity.*

class topics_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_topics_activity)
        var topic1 = findViewById<TextView>(R.id.topic1)
        var topic2 = findViewById<TextView>(R.id.topic2)
        var topic3 = findViewById<TextView>(R.id.topic3)
        var topic4 = findViewById<TextView>(R.id.topic4)
        var topic5 = findViewById<TextView>(R.id.topic5)
        var topic6 = findViewById<TextView>(R.id.topic6)
        var topic7 = findViewById<TextView>(R.id.topic7)
        var topic8 = findViewById<TextView>(R.id.topic8)
        var topic9 = findViewById<TextView>(R.id.topic9)
        var topic10 = findViewById<TextView>(R.id.topic10)
        var topic11 = findViewById<TextView>(R.id.topic11)
        var topic12 = findViewById<TextView>(R.id.topic12)
        var topic13 = findViewById<TextView>(R.id.topic13)

        var str1 = "Mario est génail"
        var str2 = "Capcom vend des millions"
        var str3 = "le jeu vidéo évolue constamment"
        var str4 = "Le PC est la meilleur machine de jeu"
        var str5 = "Les jeux vidéo à choix"
        var str6 = "Xbox ou pS5"
        var str7 = "la ps5 est sortie"
        var str8 = "combien de consoles vous avez"
        var str9 = "les jeux nitendos sont nuls"
        var str10 = "vendre ma gameboy car cela ne sert à rien"
        var str11 = "nintendo sont des voleurs"
        var str12 = "jeux accidentaux ou japonais"
        var str13 = "free to play une mauvaise pratique"

        topic1.text = str1
        topic2.text = str2
        topic3.text = str3
        topic4.text = str4
        topic5.text = str5
        topic6.text = str6
        topic7.text = str7
        topic8.text = str8
        topic9.text = str9
        topic10.text = str10
        topic11.text = str11
        topic12.text = str12
        topic13.text = str13

        /*
        val spannable = SpannableString("Text styling")
        spannable.setSpan(
            ForegroundColorSpan(Color.BLUE),
            0, 4,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)

        topic1.text = spannable
*/

        linkSetup(topic1, str1)
        linkSetup(topic2, str2)
        linkSetup(topic3, str3)
        linkSetup(topic4, str4)
        linkSetup(topic5, str5)
        linkSetup(topic6, str6)
        linkSetup(topic7, str7)
        linkSetup(topic8, str8)
        linkSetup(topic9, str9)
        linkSetup(topic10, str10)
        linkSetup(topic11, str11)
        linkSetup(topic12, str12)
        linkSetup(topic13, str13)

    }

    private fun linkSetup(texteView: TextView, text : String) {
        val instagramlink = Link(text)
            .setTextColor(Color.BLUE)
            .setTextColorOfHighlightedLink(Color.GREEN)
            .setHighlightAlpha(.4f)
            .setUnderlined(true)
            .setBold(true)
            .setOnClickListener {
                Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
                val intentmessages: Intent = Intent(this, messages_activity::class.java)
                startActivity(intentmessages)
            }
        texteView.applyLinks(instagramlink)

    }


}