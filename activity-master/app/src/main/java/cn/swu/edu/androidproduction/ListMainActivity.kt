package cn.swu.edu.androidproduction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListMainActivity : AppCompatActivity() {

    val thing = arrayListOf<Things>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_main)


        initData()
        val recycler = findViewById<RecyclerView>(R.id.recycler)
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = ThingsAdapter(thing)
    }
    private fun initData(){
        thing.add(Things().apply{
            name = "工装外套"
            description = "秋季日系ins潮牌工装外套男韩版宽松港风纯色复古休闲夹克bf上衣"
            avatar = R.mipmap.clothes1
        })
        thing.add(Things().apply{
            name = "卫衣"
            description = "卫衣男潮牌ins春秋高街宽松潮流连帽外套春季oversize小众设计感"
            avatar = R.mipmap.clothes2
        })
        thing.add(Things().apply{
            name = "春装"
            description = "圆领卫衣男潮牌百搭宽松高级感衣服春季男装潮流ins风"
            avatar = R.mipmap.clothes3
        })
    }



}