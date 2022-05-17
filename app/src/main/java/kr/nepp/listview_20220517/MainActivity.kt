package kr.nepp.listview_20220517

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
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

        studentListView.setOnItemClickListener { adapterView, view, position, l ->

            val clickedStudent = mStudentList[position]

            Toast.makeText(this, "${clickedStudent.name} 클릭 됨", Toast.LENGTH_SHORT).show()

        }
        
        studentListView.setOnItemLongClickListener { adapterView, view, position, l -> 
            val student = mStudentList[position]

//          진짜 해당 학생을 지울건지, 물어보자. (Alert)

            AlertDialog.Builder(this)
                .setTitle("학생 삭제 확인")
                .setMessage(" 정말 ${student.name} 학생을 삭제 하시겠습니까?")
                .setPositiveButton("확인", DialogInterface.OnClickListener { dialogInterface, i ->

//                  확인 버튼 누르면 실행할 코드
//                  학생 목록에서, 길게 눌린 학생은 제거.

                    mStudentList.remove(student)

//                  어댑터의 변경 사항 감지 처리
                    mAdapter.notifyDataSetChanged()

                    Toast.makeText(this, "${student.name} 학생이 삭제 됨", Toast.LENGTH_SHORT).show()
                }
                )
                .setNegativeButton("취소", null)
                .show()


            
            return@setOnItemLongClickListener true
        }

    }
















}