package com.example.epl02

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CharacterTileAdapter(private val data: ArrayList<CharacterTile>, private val tileInterface: TileInterface): RecyclerView.Adapter<CharacterTileAdapter.CharacterTileViewHolder>() {

    inner class CharacterTileViewHolder(parent:ViewGroup): RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.view_holder_character_tile, parent, false)
    ) {
        private val headerImage: ImageView = itemView.findViewById(R.id.iv_headerImage)
        private val title: TextView = itemView.findViewById(R.id.tv_characterName)
        private val description: TextView = itemView.findViewById(R.id.tv_shortDescription)
        private val button: Button = itemView.findViewById(R.id.btn_learnMore)
        private val imageIsFavorite: ImageView = itemView.findViewById(R.id.iv_isFavorite)


        fun onBind(characterTile: CharacterTile, tileInterface: TileInterface) {
            headerImage.setImageResource(characterTile.headerImageResId)
            title.text = characterTile.title
            description.text = characterTile.shortDescription
            button.setOnClickListener {
                tileInterface.onLearnMorButtonClicked(adapterPosition)
            }
            val icon = if (characterTile.isFavorite) R.drawable.ic_favorite else R.drawable.ic_favorite_outline
            imageIsFavorite.setImageResource(icon)
            imageIsFavorite.setOnClickListener {
                tileInterface.onFavoriteClicked(adapterPosition)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterTileViewHolder {
        return CharacterTileViewHolder(parent)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: CharacterTileViewHolder, position: Int) {
        holder.onBind(data[position], tileInterface)
    }

}