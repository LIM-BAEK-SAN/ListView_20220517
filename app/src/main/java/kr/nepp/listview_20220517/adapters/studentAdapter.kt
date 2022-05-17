package kr.nepp.listview_20220517.adapters

import android.content.Context
import android.widget.ArrayAdapter
import kr.nepp.listview_20220517.datas.studentData

class studentAdapter(val mContext: Context,
                     val resId: Int,
                     val mList: ArrayList<studentData>) : ArrayAdapter<studentData>(mContext, resId, mList) {

}

