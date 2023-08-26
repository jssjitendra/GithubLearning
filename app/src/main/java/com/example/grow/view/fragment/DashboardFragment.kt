package com.example.grow.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.grow.databinding.FragmentDashboardBinding
import com.example.grow.model.Plant
import com.example.grow.view.adapter.PlantAdapter
import com.example.grow.viewmodel.DashboardViewModel

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root


        val plantObjects : MutableList<Plant> = mutableListOf<Plant>()
        plantObjects.add(Plant("1st","First Plant"))
        plantObjects.add(Plant("1st","Second Plant"))
        plantObjects.add(Plant("1st","Third Plant"))
        plantObjects.add(Plant("1st","Fourth Plant"))

        binding.plantList.adapter = PlantAdapter(plantObjects)
        binding.plantList.layoutManager = LinearLayoutManager(this.activity)

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}