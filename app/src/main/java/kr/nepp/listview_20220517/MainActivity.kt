package kr.nepp.listview_20220517

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kr.nepp.listview_20220517.adapters.StudentAdapter
import kr.nepp.listview_20220517.datas.StudentData

class MainActivity : AppCompatActivity() {

    val mStudentList = ArrayList<StudentData>()

    lateinit var mAdapter : StudentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStudentList.add( StudentData( "김철수", 1999, "서울시 종로구" ))
        mStudentList.add( StudentData( "이철수", 2000, "서울시 중구" ))
        mStudentList.add( StudentData( "박철수", 1991, "서울시 금천구" ))
        mStudentList.add( StudentData( "최철수", 1992, "서울시 구로구" ))
        mStudentList.add( StudentData( "임철수", 1993, "서울시 영등포구" ))
        mStudentList.add( StudentData( "임백산", 1994, "서울시 동작구" ))
        mStudentList.add( StudentData( "안철수", 1995, "서울시 노원구" ))
        mStudentList.add( StudentData( "정철수", 1996, "서울시 중랑구" ))
        mStudentList.add( StudentData( "삼철수", 1997, "서울시 강북구" ))
        mStudentList.add( StudentData( "사철수", 1998, "서울시 강서구" ))
        mStudentList.add( StudentData( "오철수", 2002, "서울시 강동구" ))
        mStudentList.add( StudentData( "윤철수", 2003, "서울시 양천구" ))
        mStudentList.add( StudentData( "장철수", 2004, "서울시 서대문구" ))
        mStudentList.add( StudentData( "예철수", 2005, "서울시 동대문구" ))
        mStudentList.add( StudentData( "명철수", 2006, "수원시 팔달구" ))

        mAdapter = StudentAdapter(this, R.layout.student_list_item, mStudentList)

        studentListView.adapter = mAdapter

    }
















}