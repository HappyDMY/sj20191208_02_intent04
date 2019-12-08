package com.tjoeun.sj20191208_02_intent04

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dialBtn.setOnClickListener {
//            누구에게 전화를 걸지 정보를 제공
            val uri = Uri.parse("tel: 010-3310-1943")
//            어느 화면에 넘겨줄 지를 명시
            val intent = Intent(Intent.ACTION_DIAL, uri)
            startActivity(intent)

        }

        callBtn.setOnClickListener {
            val uri = Uri.parse("tel:01033101943")
            val intent = Intent(Intent.ACTION_CALL, uri)
            startActivity(intent)
        }

        smsBtn.setOnClickListener {
//            누구에세 문자를 보낸지 명시
            val uri = Uri.parse("smsto :${smsNumEdt.text.toString()}")
            val intent = Intent(Intent.ACTION_SENDTO, uri)
            intent.putExtra("sms_Body","광고문구 입력하자")
            startActivity(intent)
        }

        naverBtn.setOnClickListener {
            val uri = Uri.parse("https://naver.com")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }

        kakaoAppBtn.setOnClickListener {
//            중요 market://details?부터는 플레이 스토어 링크
            val uri = Uri.parse("market://details?id=com.kakao.talk&hl=ko")
            val intent = Intent(Intent.ACTION_VIEW,uri)
            startActivity(intent)
        }




    }
}
