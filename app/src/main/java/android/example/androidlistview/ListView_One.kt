package android.example.androidlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class ListView_One : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view_one)

        var medicineArray = resources.getStringArray(R.array.MedicineName)
        var arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,medicineArray)
         var listView_1: ListView = findViewById(R.id.listView_1)
         listView_1.adapter = arrayAdapter
        listView_1.setOnItemClickListener { parent, view, position, id ->

            Toast.makeText(this, "Clicked item :",Toast.LENGTH_SHORT).show()     }

    }
}