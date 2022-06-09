package org.d3if2024.pecovid.adapter

import android.content.Context
import android.service.autofill.Dataset
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.d3if2024.pecovid.R
import org.d3if2024.pecovid.model.definition.DefinitionModel
import org.d3if2024.pecovid.model.preventions.PreventionsModel

class DefinitionAdapter(
    private val context: Context,
    private val dataset: List<DefinitionModel>
) : RecyclerView.Adapter<DefinitionAdapter.ConvertViewHolder>(){

    class ConvertViewHolder(private val view: View): RecyclerView.ViewHolder(view){
        val imageView: ImageView = view.findViewById(R.id.item_image_preventions)
        val textView: TextView = view.findViewById(R.id.title_preventions)
        val textView2: TextView = view.findViewById(R.id.item_title_preventions)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ConvertViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_definition, parent, false)

        return ConvertViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ConvertViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringTitleId)
        holder.imageView.setImageResource(item.imageResourceId)
        holder.textView2.text = context.resources.getString(item.stringResourceId)
    }

    override fun getItemCount() = dataset.size

}