package com.example.helloworldapp.todoapp

import android.annotation.SuppressLint
import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.helloworldapp.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class TodoActivity : AppCompatActivity() {

    private val categories = listOf<TaskCategory>(
        TaskCategory.Personal,
        TaskCategory.Business,
        TaskCategory.Other
    )

    private val tasks = mutableListOf(
        Task("PruebaBusiness", TaskCategory.Business),
        Task("PruebaPersonal", TaskCategory.Personal),
        Task("PruebaOther", TaskCategory.Other)

    )

    private lateinit var rvCategories: RecyclerView
    private lateinit var categoriesAdapter: CategoriesAdapter

    private lateinit var rvTasks: RecyclerView
    private lateinit var taskAdapter: TaskAdapter

    private lateinit var fabAddTask: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_todo)

        initComponents()
        initUI()
        initListeners()
    }

    private fun initListeners() {
        fabAddTask.setOnClickListener {
            showDialog()
        }
    }

    private fun showDialog(){
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.dialog_task)

        val etTask: EditText = dialog.findViewById(R.id.etTask)
        val btnAddTask: Button = dialog.findViewById(R.id.btAddTask)
        val rgCategories: RadioGroup = dialog.findViewById(R.id.rgCategories)

        btnAddTask.setOnClickListener {

            val currentTask = etTask.text.toString()

            if (currentTask.isNotEmpty()){
                val selectedId = rgCategories.checkedRadioButtonId
                val selectedRadioButton = rgCategories.findViewById<RadioButton>(selectedId)

                val currentCategory: TaskCategory = when(selectedRadioButton.text){
                    getString(R.string.todo_dialog_category_bussiness) -> TaskCategory.Business
                    getString(R.string.todo_dialog_category_personal) -> TaskCategory.Personal
                    else -> TaskCategory.Other
                }

                tasks.add(
                    Task(currentTask,
                        currentCategory))
                updateTask()
                dialog.hide()
            }

        }

        dialog.show()
    }

    private fun initUI() {
        categoriesAdapter = CategoriesAdapter(categories) { updateCategories(it) }
        rvCategories.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvCategories.adapter = categoriesAdapter

        taskAdapter = TaskAdapter(tasks) { onItemSelected(it) }
        rvTasks.layoutManager = LinearLayoutManager(this)
        rvTasks.adapter = taskAdapter
    }

    private fun onItemSelected(position: Int){
        tasks[position].isSelected = !tasks[position].isSelected
        updateTask()
    }

    private fun initComponents() {
        rvCategories = findViewById(R.id.rvCategories)
        rvTasks = findViewById(R.id.rvTasks)
        fabAddTask = findViewById(R.id.fabAddTask)
    }

    private fun updateCategories(position: Int){
        categories[position].isSelected = !categories[position].isSelected
        categoriesAdapter.notifyItemChanged(position)
        updateTask()
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun updateTask() {
        val selectedCategories: List<TaskCategory> = categories.filter { it.isSelected }
        val newTask = tasks.filter { selectedCategories.contains(it.category) }
        taskAdapter.tasks = newTask
        taskAdapter.notifyDataSetChanged()
    }
}