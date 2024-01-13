package com.example.question_app

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.AlertDialogLayout
import com.example.question_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button1.setOnClickListener {
            val options= arrayOf("a","b","c","d")
            val builder1=android.app.AlertDialog.Builder(this)
            builder1.setTitle("Question")
            builder1.setMultiChoiceItems(options,null,DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->
                Toast.makeText(this,"Answer submitted",Toast.LENGTH_SHORT).show()

            })
            builder1.setPositiveButton("Done",DialogInterface.OnClickListener { dialog, which ->  })
            builder1.setNegativeButton("back",DialogInterface.OnClickListener { dialog, which ->  })
            builder1.show()

        }
        binding.button2.setOnClickListener {
            val options= arrayOf("a","b","c","d")
            val builder1=android.app.AlertDialog.Builder(this)
            builder1.setTitle("Question")
            builder1.setMultiChoiceItems(options,null,DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->
                Toast.makeText(this,"Answer submitted",Toast.LENGTH_SHORT).show()

            })
            builder1.setPositiveButton("Done",DialogInterface.OnClickListener { dialog, which ->  })
            builder1.setNegativeButton("back",DialogInterface.OnClickListener { dialog, which ->  })
            builder1.show()

        }
        binding.button3.setOnClickListener {
            val options= arrayOf("a","b","c","d")
            val builder1=android.app.AlertDialog.Builder(this)
            builder1.setTitle("Question")
            builder1.setMultiChoiceItems(options,null,DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->
                Toast.makeText(this,"Answer submitted",Toast.LENGTH_SHORT).show()

            })
            builder1.setPositiveButton("Done",DialogInterface.OnClickListener { dialog, which ->  })
            builder1.setNegativeButton("back",DialogInterface.OnClickListener { dialog, which ->  })
            builder1.show()

        }
        binding.button4.setOnClickListener {
            val options= arrayOf("a","b","c","d")
            val builder1=android.app.AlertDialog.Builder(this)
            builder1.setTitle("Question")
            builder1.setMultiChoiceItems(options,null,DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->
                Toast.makeText(this,"Answer submitted",Toast.LENGTH_SHORT).show()

            })
            builder1.setPositiveButton("Done",DialogInterface.OnClickListener { dialog, which ->  })
            builder1.setNegativeButton("back",DialogInterface.OnClickListener { dialog, which ->  })
            builder1.show()

        }
        binding.button5.setOnClickListener {
            val options= arrayOf("a","b","c","d")
            val builder1=android.app.AlertDialog.Builder(this)
            builder1.setTitle("Question")
            builder1.setMultiChoiceItems(options,null,DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->
                Toast.makeText(this,"Answer submitted",Toast.LENGTH_SHORT).show()

            })
            builder1.setPositiveButton("Done",DialogInterface.OnClickListener { dialog, which ->  })
            builder1.setNegativeButton("back",DialogInterface.OnClickListener { dialog, which ->  })
            builder1.show()

        }
        binding.button6.setOnClickListener {

            val builder2 = android.app.AlertDialog.Builder(this)
            builder2.setTitle("Are You Sure")
            builder2.setMessage("Do you want to submit?")
            builder2.setIcon(R.drawable.baseline_exit_to_app_24)
            builder2.setPositiveButton("yes", DialogInterface.OnClickListener { dialog, which ->
                intent = Intent(this, submit_page::class.java)
                startActivity(intent)


            })
            builder2.setNegativeButton("no",DialogInterface.OnClickListener { dialog, which ->
                finish()
            })
            builder2.show()
        }
    }
}