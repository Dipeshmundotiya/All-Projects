package com.example.alertdialog

import android.app.Dialog
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener(){
            val dialog = AlertDialog.Builder(this)
            dialog.setTitle("Delete Files")
            dialog.setMessage(R.string.Description)
            dialog.setIcon(R.drawable.baseline_auto_delete_24)

            dialog.setPositiveButton("Yes"){dialogInterface, which ->
               Toast.makeText(this,"yes clicked",Toast.LENGTH_LONG).show()}

                dialog.setNeutralButton("Cancel"){dialogInterface, which ->
                    Toast.makeText(this,"cancel clicked",Toast.LENGTH_LONG).show()}

                    dialog.setNegativeButton("No"){dialogInterface, which ->
                        Toast.makeText(this,"no clicked",Toast.LENGTH_LONG).show()}


                        val alertdialog :AlertDialog = dialog.create()
                        alertdialog.setCancelable(true)
                        alertdialog.show()
            }


    }
}