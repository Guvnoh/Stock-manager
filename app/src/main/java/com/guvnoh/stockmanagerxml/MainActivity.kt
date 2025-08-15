package com.guvnoh.stockmanagerxml

import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.guvnoh.stockmanagerxml.data.getSortedBrandData
import com.guvnoh.stockmanagerxml.data.nairaFormat
import com.guvnoh.stockmanagerxml.databinding.ActivityMainBinding
import com.guvnoh.stockmanagerxml.databinding.StockCardBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        loadDisplay()
    }

    private fun loadDisplay(){

        val container = binding.container
        container.removeAllViews()

        for (i in getSortedBrandData()){
            val cardBind = StockCardBinding.inflate(layoutInflater)
            with(cardBind){
                brand.text = i.productName
                price.text = nairaFormat(i.productPrice)
            }
            container.addView(cardBind.root)
        }
    }
}