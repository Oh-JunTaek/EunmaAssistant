package com.eunma.eunmaassistant

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CenterZoomLayoutManager(context: Context) : LinearLayoutManager(context) {

    override fun onLayoutCompleted(state: RecyclerView.State?) {
        super.onLayoutCompleted(state)
        // 가운데 아이템을 크게, 양 옆 아이템을 작게 처리하는 로직 구현
    }

    // 스크롤 이벤트 처리 등 추가 구현
}