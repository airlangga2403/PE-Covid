package org.d3if2024.pecovid.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.d3if2024.pecovid.R
import org.d3if2024.pecovid.model.recovery.RecoveryModel

class RecoveryAdapter(
    private val context: Context,
    private val dataSet: List<RecoveryModel>
) : RecyclerView.Adapter<RecoveryAdapter.ConvertViewHolder>() {

    class ConvertViewHolder(private val view: View) : RecyclerView.ViewHolder(view){
        val textView1: TextView = view.findViewById(R.id.title_recovery)
        val textView: TextView = view.findViewById(R.id.item_title_recovery)
        val imageView: ImageView = view.findViewById(R.id.item_image_recovery)
        val contentItem: TextView = view.findViewById(R.id.item_content_recovery)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ConvertViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_recovery_page, parent, false)
        return ConvertViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ConvertViewHolder, position: Int) {
        val item = dataSet[position]
        holder.textView1.text = context.resources.getString(item.stringTitleId)
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
        holder.contentItem.text = context.resources.getString(item.stringContentRecovery)
    }
    override fun getItemCount() = dataSet.size
}