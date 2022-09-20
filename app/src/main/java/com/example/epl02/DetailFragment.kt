package com.example.epl02

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment

class DetailFragment : Fragment(R.layout.fragment_detail) {

    private val characterTile: CharacterTile by lazy {
        (activity as MainActivity).characterTileList.find {
            it.id == requireArguments().getString("characterTileId")
        } ?: CharacterTile(
            title = "Whoops",
            longDescription = "Wrong Text Fucking Shit"
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setHasOptionsMenu(true)

        (activity as MainActivity).supportActionBar?.apply {
            title = "Details"
            setDisplayHomeAsUpEnabled(true)
        }

        val headerImage: ImageView = view.findViewById(R.id.iv_headerImage)
        val title: TextView = view.findViewById(R.id.tv_characterName)
        val description: TextView = view.findViewById(R.id.tv_shortDescription)
        val longDescription: TextView = view.findViewById(R.id.tv_longDescription)
//        val imageIsFavorite: ImageView = view.findViewById(R.id.iv_isFavorite)

        headerImage.setImageResource(characterTile.headerImageResId)
        title.text = characterTile.title
        description.text = characterTile.shortDescription
        longDescription.text = characterTile.longDescription
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)

        inflater.inflate(R.menu.menu_details, menu)

        if (characterTile.isFavorite) {
            menu.findItem(R.id.itm_isFavorite).setIcon(R.drawable.ic_favorite)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                (activity as MainActivity).supportFragmentManager.popBackStack()
                true
                }
            R.id.itm_isFavorite -> {
                val isCurrentlyFavorite = characterTile.isFavorite
                if (isCurrentlyFavorite) {
                    item.setIcon(R.drawable.ic_favorite_outline)
                }else item.setIcon(R.drawable.ic_favorite)
                characterTile.isFavorite = !isCurrentlyFavorite
                true
            }
            R.id.itm_link -> {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(characterTile.linkURL))
                startActivity(intent)
                true
            } else -> onOptionsItemSelected(item)
        }
    }

}
