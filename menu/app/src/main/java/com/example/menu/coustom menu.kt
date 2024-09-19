package com.example.menu

import android.content.Context
import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.PopupMenu

class coustommenu{
    fun coutomMenu(context : Context,view:View) {
        val pop = PopupMenu(context,view)
        pop.inflate(R.menu.menu)

        pop.setOnMenuItemClickListener {
            when(it!!.itemId){
                R.id.edit -> {Toast.makeText(context,"it is edited",Toast.LENGTH_LONG).show()
                true
                }
                R.id.air -> {Toast.makeText(context,"it is air",Toast.LENGTH_LONG).show()
                    true
                }
                R.id.shop -> {Toast.makeText(context,"it is shop",Toast.LENGTH_LONG).show()
                    true
                }
                else -> false
            }

        }

       try {
            val fieldMpopup = PopupMenu::class.java.getDeclaredField("mPopup")
            fieldMpopup.isAccessible=true
           val mPopup = fieldMpopup.get(pop)
            mPopup.javaClass
                .getDeclaredMethod("setForceShowIcon",Boolean::class.java)
                .invoke(mPopup,true)
        }
        catch (e:Exception){

        }
        finally {
            pop.show()
        }
    }

}