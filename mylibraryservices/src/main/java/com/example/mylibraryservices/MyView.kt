package com.example.mylibraryservices

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MyView : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.myview)

        val buttonServiciesView = findViewById<Button>(R.id.services_btn)
        buttonServiciesView.setOnClickListener(this)
    }
    override fun onClick(view: View?) {
        when(view?.id){
            R.id.services_btn->{
                // Consultar servicio
                Toast.makeText(this, "Se llama servicio de consulta", Toast.LENGTH_SHORT).show()
            }
        }
    }

}