package com.inspirecoding.navcompdemo.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.navGraphViewModels
import androidx.recyclerview.widget.LinearLayoutManager

import com.inspirecoding.navcompdemo.R
import com.inspirecoding.navcompdemo.adapter.ToDoAdapter
import com.inspirecoding.navcompdemo.model.ToDo
import kotlinx.android.synthetic.main.fragment_3.view.*

private const val TAG = "Fragment_3"
class Fragment_3 : Fragment()
{
    private lateinit var toDoAdapter: ToDoAdapter

    private var listOfToDos: MutableList<ToDo> = mutableListOf()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        val view = inflater.inflate(R.layout.fragment_3, container, false)

        toDoAdapter = ToDoAdapter(listOfToDos)
        view.rv_fragment_3.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = toDoAdapter
        }

        return view
    }
}

