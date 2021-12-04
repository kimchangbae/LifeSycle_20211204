package com.example.lifesycle_20211204

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupEvents();
    }

    // 이벤트 처리 (버튼 클릭 등) 관련 코드를 모아두기 위한 함수
    private fun setupEvents() {
        btnMoveToOther.setOnClickListener {

        }
    }

    // UI 화면에 데이터를 보여주는 것에 관련된 코드 모음음
    fun setValues() {

    }
}