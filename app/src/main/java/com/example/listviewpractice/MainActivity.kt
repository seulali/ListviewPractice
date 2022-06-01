package com.example.listviewpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.listviewpractice.adapters.StudentAdapter
import com.example.listviewpractice.datas.Student
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mStudentList = ArrayList<Student>()
    lateinit var mAdapter: StudentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStudentList.add( Student("임슬아",1993))
        mStudentList.add( Student("김시은",1993))
        mStudentList.add( Student("서주영",1991))
        mStudentList.add( Student("정유석",1990))
        mStudentList.add( Student("박진",1992))
        mStudentList.add( Student("이주연",1993))
        mStudentList.add( Student("강선아",1993))

        mAdapter = StudentAdapter(this,R.layout.student_list_item,mStudentList)

        studentListView.adapter = mAdapter



    }
}