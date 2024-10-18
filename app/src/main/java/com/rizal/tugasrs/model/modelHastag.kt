package com.rizal.tugasrs.model

import android.widget.TextView
import com.rizal.tugasrs.R

data class modelHastag(
    val hastag : String
)

object MockList1{
    fun getModel() : List<modelHastag>{
        val itemModel1 = modelHastag(
            "#mounth"
        )

        val itemModel2 = modelHastag(
            "#eyes"
        )

        val itemModel3 = modelHastag(
            "#surgeon"
        )

        val itemModel4 = modelHastag(
            "#teeth"
        )

        val itemModel5 = modelHastag(
            "#heart"
        )

        val itemList : ArrayList<modelHastag> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)
        itemList.add(itemModel5)

        return itemList
    }
}