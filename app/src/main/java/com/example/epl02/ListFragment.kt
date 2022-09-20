package com.example.epl02

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView

class ListFragment: Fragment(R.layout.fragment_list) {

    private val characterTileList: ArrayList<CharacterTile>
    get() = (activity as MainActivity).characterTileList

    private lateinit var characterTileAdapter: CharacterTileAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (activity as MainActivity).supportActionBar?.apply {
            title = "Better Call Saul"
            setDisplayHomeAsUpEnabled(false)
        }

        val recyclerView = view.findViewById<RecyclerView>(R.id.rv_main)
        characterTileAdapter = CharacterTileAdapter(characterTileList, activity as MainActivity)
        recyclerView.adapter = characterTileAdapter

    }

    override fun onResume() {
        super.onResume()
        characterTileAdapter.notifyDataSetChanged()
    }

    fun onClickedFavorite(position: Int) {
        characterTileAdapter.notifyItemChanged(position)
    }

}