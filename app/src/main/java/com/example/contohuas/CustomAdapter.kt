package com.example.contohuas

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val context: Context) :
    RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    private val itemList = listOf(
        "Hitung Persen",
        "Ubah Persen",
        "Ubah Celcius",
        "Ubah Reamur",
        "Ubah Fahrenheit",
        "Ubah Kelvin"
    )
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = itemList[position]
        holder.textView.text = item

        holder.itemView.setOnClickListener {
            val intent = when (position) {
                0 -> Intent(context, FirstActivity::class.java)
                1 -> Intent(context, SecondActivity::class.java)
                2 -> Intent(context, ThirdActivity::class.java)
                3 -> Intent(context, FourthActivity::class.java)
                4 -> Intent(context, FifthActivity::class.java)
                5 -> Intent(context, SixthActivity::class.java)
                else -> null
            }
            intent?.let {
                context.startActivity(it)
            }
        }
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView: TextView = itemView.findViewById(R.id.textView)
    }
}


