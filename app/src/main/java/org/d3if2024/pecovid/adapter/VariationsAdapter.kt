package org.d3if2024.pecovid.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.d3if2024.pecovid.R
import org.d3if2024.pecovid.model.variations.VariationsModel

class VariationsAdapter(
    private val context: Context,
    private val dataset: List<VariationsModel>
) : RecyclerView.Adapter<VariationsAdapter.ConvertViewHolder>() {

    class ConvertViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView1: TextView = view.findViewById(R.id.title)
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ConvertViewHolder {
        // create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_variations_page_1, parent, false)

        return ConvertViewHolder(adapterLayout)
    }

    /**
     * Replace the contents of a view (invoked by the layout manager)
     */
    override fun onBindViewHolder(holder: ConvertViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView1.text = context.resources.getString(item.stringTitleId)
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
    }

    /**
     * Return the size of your dataset (invoked by the layout manager)
     */
    override fun getItemCount() = dataset.size
}