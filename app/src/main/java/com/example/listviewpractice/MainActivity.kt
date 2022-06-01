package com.example.listviewpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listviewpractice.datas.Student

class MainActivity : AppCompatActivity() {

    val mStudentList = ArrayList<Student>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStudentList.add.(Student("임슬아",1993))
        mStudentList.add.(Student("김시은",1993))
        mStudentList.add.(Student("서주영",1993))
        mStudentList.add.(Student("정유석",1993))
        mStudentList.add.(Student("박진",1993))
        mStudentList.add.(Student("이주연",1993))
        mStudentList.add.(Student("강선아",1993))


    }
}