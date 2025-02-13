

package edu.temple.simplerecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numbers = Array(100) { it + 1 }
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val displayTextView = findViewById<TextView>(R.id.displayTextView)
        recyclerView.layoutManager = GridLayoutManager(this, 4)


        // TODO (Step 2: Define lambda to modify displayTextView size)
        // Define lambda to modify displayTextView
        val callBack: (Int) -> Unit = { size ->
            displayTextView.textSize = size.toFloat()
            displayTextView.text = "Text Size: $size"
        }


        // Todo (Step 3: Pass lambda to adapter)
        // Pass lambda to adapter
        recyclerView.adapter = NumberDisplayAdapter(numbers, callBack)
    }
}
